package com.fakesitewoopasdf.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class Routes {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model m){
        List<Album> albums = albumRepository.findAll();
        m.addAttribute("Albums",albums);
        return "albums";
    }
    @GetMapping("/hello")
    public String helloWorld() {
        System.out.println("somebody got the root");
        // needs to match exactly the filename of a template in resources/templates
        return "helloworld";
    }
    @GetMapping("/capitalize/{word}")
    public String cap(@PathVariable String word, Model m){
        m.addAttribute("word",word.toUpperCase());
        return "cap";
    }
    @GetMapping("/reverse")
    public String rev (@RequestParam(required = false, defaultValue = "reverse->a->word") String word,Model m){
        Helpers helper = new Helpers();
        m.addAttribute("word", helper.reverseString(word));
        return "cap";
    }


}
