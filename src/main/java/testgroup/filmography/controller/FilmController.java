package testgroup.filmography.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import testgroup.filmography.model.Film;

@Controller
public class FilmController {

    // test film object, temporary
    private static Film film;

    static {
        film = new Film();
        film.setTitle("Inception");
        film.setYear(2010);
        film.setGenre("sci-fi");
        film.setWatched(true);
    }

    @GetMapping(value = "/")
    public ModelAndView allFilms() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("films");
        modelAndView.addObject("film", film);
        return modelAndView;
    }

    @GetMapping(value = "/edit")
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }
}