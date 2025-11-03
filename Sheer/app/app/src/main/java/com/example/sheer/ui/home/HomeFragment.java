package com.example.sheer.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sheer.R;

public class HomeFragment extends Fragment {

    private GridView gridView;

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

        gridView = root.findViewById(R.id.meuGrid);
        HomeGridAdapter adapter = new HomeGridAdapter(getContext(), imagens);
        gridView.setAdapter(adapter);

        return root;
    }
}
