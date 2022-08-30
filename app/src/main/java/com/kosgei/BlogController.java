package com.kosgei;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @GetMapping("/api/v1/blog")
    public byte[] testOne() {
        /*
         * Allow tight couplign for now.
         */
        BlogService blogService = new BlogService();

        return blogService.blogJSON().getBytes();
    }
}
