package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private Integer likes = 0;
    private Date creationDate;

    public Post() {
    }

    public Post(Long id, final String text, final Date creationDate)
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
