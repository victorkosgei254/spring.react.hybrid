package com.kosgei;

public class Blog {
    private String blogTitle, blogNumber, blogAuthor;

    public String getBlogTitle() {
        return blogTitle;
    }

    public String getBlogNumber() {
        return blogNumber;
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public void setBlogNumber(String blogNumber) {
        this.blogNumber = blogNumber;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor;
    }

    public Blog() {
    }

    public Blog(String bTitle, String bNum, String bAuthor) {
        blogAuthor = bAuthor;
        blogNumber = bNum;
        blogTitle = bTitle;
    }
}
