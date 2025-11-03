package com.example.sheer.ui.chat;

public class Message {
    private final String name;
    private final String lastMessage;
    private final String date;
    private final int imageResId;

    public Message(String name, String lastMessage, String date, int imageResId) {
        this.name = name;
        this.lastMessage = lastMessage;
        this.date = date;
        this.imageResId = imageResId;
    }

    public String getName() { return name; }
    public String getLastMessage() { return lastMessage; }
    public String getDate() { return date; }
    public int getImageResId() { return imageResId; }
}
