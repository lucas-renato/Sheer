package com.example.sheer.ui.home;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sheer.R;

public class HomeFragment extends Fragment {

    private GridView gridView;
    private ImageButton btnLike, btnDislike;
    private MediaPlayer likeSound, dislikeSound;

    // Coloque 4 itens (todos usando bandeira)
    private int[] imagens = {
            R.drawable.bandeira,
            R.drawable.bandeira,
            R.drawable.bandeira,
            R.drawable.bandeira
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        // Grid
        gridView = root.findViewById(R.id.meuGrid);
        HomeGridAdapter adapter = new HomeGridAdapter(getContext(), imagens);
        gridView.setAdapter(adapter);

        // Botões
        btnLike = root.findViewById(R.id.btnLike);
        btnDislike = root.findViewById(R.id.btnDislike);

        // Sons
        likeSound = MediaPlayer.create(getContext(), R.raw.like);
        dislikeSound = MediaPlayer.create(getContext(), R.raw.delike);

        // Clique no botão Like
        btnLike.setOnClickListener(v -> {
            if (likeSound != null) {
                likeSound.start();
            }
        });

        // Clique no botão Dislike
        btnDislike.setOnClickListener(v -> {
            if (dislikeSound != null) {
                dislikeSound.start();
            }
        });

        return root;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (likeSound != null) {
            likeSound.release();
            likeSound = null;
        }
        if (dislikeSound != null) {
            dislikeSound.release();
            dislikeSound = null;
        }
    }
}
