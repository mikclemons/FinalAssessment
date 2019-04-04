package com.detroitlabs.Controller;

import com.detroitlabs.Model.CharacterInfo;
import com.detroitlabs.Model.MovieData;
import com.detroitlabs.Services.MovieDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieDataController {

    @Autowired
    private MovieDataService movieService;

    @ResponseBody
    @RequestMapping("/")
    public String displayMovieData(){
        MovieData movieData = movieService.fetchMovieData();
        return movieData.getTitle() + movieData.getEpisodeId() +
                movieData.getOpening_Crawl() +
                movieData.getDirector() +
                movieData.getProducer() +
                movieData.getReleaseDate();

    }

    @ResponseBody
    @RequestMapping("/people")
    public CharacterInfo displayCharacterInfo(){
        MovieData movieData = movieService.fetchMovieData();
        String characterUrl = movieData.getCharacterListUrlWrapper().get(0);
        CharacterInfo characterInfo = movieService.fetchCharacterData(characterUrl);
        return characterInfo;

    }
}
