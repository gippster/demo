package com.example.demo.service;
import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService
{
    private Long nextId = 0L;
    private final List<Post> posts = new ArrayList<>();

    public List<Post> listAllPosts()
    {
        return posts;
    }
    public void create(String text) {
        Long newId = nextId++;
        posts.add(new Post(newId, text, new Date()));
    }

}
