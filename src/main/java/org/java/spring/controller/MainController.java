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
	@GetMapping("/movies")
	public String showBestMovies(Model model) {
		List<Movie> movieTitles = getBestMovies();
		model.addAttribute("movies", movieTitles);
		return "movies";
	}
	
	@GetMapping("/songs")
    public String showBestSongs(Model model) {
        List<Song> bestSongs = getBestSongs();
        model.addAttribute("songs", bestSongs);
        return "songs";
    }
	
	private List<Movie> getBestMovies() {
		return List.of(
				new Movie(1, "Film 1"),
				new Movie(2, "Film 2"),
				new Movie(3, "Film 3"),
				new Movie(4, "Film 4")
				);
		
	}
	private List<Song> getBestSongs() {
		return List.of(
				new Song(1, "Canzone 1"),
				new Song(2, "Canzone 2"),
				new Song(3, "Canzone 3"),
				new Song(4, "Canzone 4")
				);
		
	}
}
