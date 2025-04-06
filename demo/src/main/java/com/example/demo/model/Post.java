package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Long id;
    private Integer likes = 0;
    private Date creationDate;

    public Post(final Long id, final String text, final Date creationDate)
    {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }

    public Long getId()
    {
        return id;
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
    public void setLikes(Integer likes)
    {
        this.likes = likes;
    }
}
