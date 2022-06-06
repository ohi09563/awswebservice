package com.ohi.book.springboot.web;

import com.ohi.book.springboot.service.posts.PostsService;
import com.ohi.book.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class indexController {

    private final PostsService postsService;


    @GetMapping("/")
    public String index(Model model){


        model.addAttribute("posts",postsService.findAllDesc());

        return "index";
    }



    @GetMapping("/posts/save")
    public String postsSave(){

        return "posts-save";
    }


    @GetMapping("/posts/update/{id}")
    public String postUpdate(@PathVariable Long id, Model model)
    {

        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post",dto);

        return "posts-update";
    }


}
