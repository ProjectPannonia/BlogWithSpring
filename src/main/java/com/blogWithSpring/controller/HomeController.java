package com.blogWithSpring.controller;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blogWithSpring.domain.Post;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String stories(Model model) {
		model.addAttribute("stories",getAllStories());
		return "stories";
	}

	private Object getAllStories() {
		ArrayList<Post> stories = new ArrayList<>();
		
		Post firstStory = new Post("Első történet","Ez egy elég rövid sztory.","Letenyei Ádám");
		Post secondStory = new Post("Második történet", "Hát ez se lessz sokkal hosszabb.", "Kovács Béla");
		
		stories.add(firstStory);
		stories.add(secondStory);
		
		return stories;
	}
}
