package org.java.spring.controller;

import java.util.List;

import org.java.spring.Movie;
import org.java.spring.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	@GetMapping("/")
	public String homepage(Model model) {
		String name = "Patric";
		String last_name = "Tobola";
		model.addAttribute("name", name);
		model.addAttribute("last_name", last_name);
		
		
		
		return "home";
	}
	private List<Movie> getBestMovies() {
		return null;
		
	}
	private List<Song> getBestSongs() {
		return null;
		
	}
}
