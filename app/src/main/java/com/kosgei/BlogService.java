package com.kosgei;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class BlogService {
    private List<Blog> blogs = new ArrayList<Blog>();

    public BlogService() {
        blogs.add(new Blog("Blog One", "One", "Victor"));
        blogs.add(new Blog("Blog Two", "Two", "Kosgei"));
        blogs.add(new Blog("Blog Three", "Three", "Kipruto"));
        blogs.add(new Blog("Blog Four", "Four", "Benjamin"));
        blogs.add(new Blog("Blog Five", "Five", "Victor"));

    }

    public String blogJSON() {
        Gson gson = new Gson();
        return gson.toJson(blogs);
    }

    public List<Blog> getBlogs() {
        return blogs;
    }
}
