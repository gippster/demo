package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes = 0;
    private Date creationDate;

    public Post(String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }
    public Date getCreationDate()
    {
        return creationDate;
    }
    public Integer getLikes()
    {
        return likes;
    }
}
