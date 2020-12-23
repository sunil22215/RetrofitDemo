package com.example.retrofitdemo;

import com.google.gson.annotations.SerializedName;

public class Post {
    private Integer id;
    private int userId;
    private String title;
    @SerializedName("body")
    private String text;

    public Post(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
