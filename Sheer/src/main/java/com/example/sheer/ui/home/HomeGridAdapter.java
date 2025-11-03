package com.example.sheer.ui.home;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.sheer.R;

public class HomeGridAdapter extends BaseAdapter {

    private final Context context;
    private final int[] imagens;
    private final MediaPlayer mediaPlayer;

    public HomeGridAdapter(Context context, int[] imagens) {
        this.context = context;
        this.imagens = imagens;
        mediaPlayer = MediaPlayer.create(context, R.raw.portugues);
    }

    @Override
    public int getCount() {
        return imagens.length;
    }

    @Override
    public Object getItem(int position) {
        return imagens[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        }

        ImageView imagem = convertView.findViewById(R.id.imagemItem);
        imagem.setImageResource(imagens[position]);

        imagem.setOnClickListener(v -> {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                mediaPlayer.seekTo(0);
            }
            mediaPlayer.start();
        });

        return convertView;
    }
}
