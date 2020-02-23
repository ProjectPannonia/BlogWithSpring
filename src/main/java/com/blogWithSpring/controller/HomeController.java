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
		model.addAttribute("pageTitle", "My Blog");
		model.addAttribute("stories", getAllStories());
		return "index";
	}

	private Object getAllStories() {
		ArrayList<Post> stories = new ArrayList<>();

		Post firstStory = new Post("Első történet", "Letenyei Ádám");
		firstStory.setContent(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vehicula gravida dapibus. Vivamus tincidunt tortor orci, nec fermentum arcu convallis eu. Donec interdum vel purus a consequat. Phasellus molestie diam neque, eget consectetur ligula vulputate eu. Praesent volutpat enim sapien, non feugiat tortor faucibus at. Etiam at urna luctus massa.");
		Post secondStory = new Post("Második történet", "Kovács Béla");
		secondStory.setContent(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse et blandit tellus. Suspendisse potenti. Praesent volutpat felis non aliquet varius. Sed id tincidunt nunc. In imperdiet eu nibh ac placerat. Pellentesque egestas eros eget enim dignissim maximus. Vivamus tempus dui commodo eros tempor scelerisque. Quisque posuere condimentum quam venenatis vestibulum. Nullam at neque in turpis pharetra pretium sed et urna. Integer vitae tincidunt tellus, et gravida nibh. Curabitur blandit metus id aliquet cursus. Nulla facilisi. Morbi pellentesque, sem iaculis laoreet.");
		stories.add(firstStory);
		stories.add(secondStory);

		return stories;
	}

}
