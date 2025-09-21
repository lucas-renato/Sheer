package com.example.sheer.ui.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sheer.R;

public class ChatFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_chat, container, false);

        ListView listView = root.findViewById(R.id.listViewMessages);

        String[] mensagens = {
                "Karen Castillo - Áudio de 0:14",
                "Martha Craig - 📷 Photo",
                "Tabitha Potter - Actually I wanted to check...",
                "Maisy Humphrey - Welcome, to make design..."
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireContext(),
                android.R.layout.simple_list_item_1,
                mensagens
        );

        listView.setAdapter(adapter);

        return root;
    }
}
