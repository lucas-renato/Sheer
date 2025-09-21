package com.example.sheer.ui.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.widget.ArrayAdapter;

import com.example.sheer.R;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<Message> {

    public MessageAdapter(Context context, List<Message> messages) {
        super(context, 0, messages);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_message, parent, false);
        }

        Message message = getItem(position);

        ImageView image = convertView.findViewById(R.id.imageProfile);
        TextView name = convertView.findViewById(R.id.textName);
        TextView lastMessage = convertView.findViewById(R.id.textLastMessage);
        TextView date = convertView.findViewById(R.id.textDate);

        if (message != null) {
            image.setImageResource(message.getImageResId());
            name.setText(message.getName());
            lastMessage.setText(message.getLastMessage());
            date.setText(message.getDate());
        }

        return convertView;
    }
}
