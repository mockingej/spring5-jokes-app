package eg.springframework.jokes.jokeapp.controller;

import eg.springframework.jokes.jokeapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(value = {"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
