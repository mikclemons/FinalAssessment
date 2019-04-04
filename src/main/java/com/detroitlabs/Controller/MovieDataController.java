package com.detroitlabs.Controller;

import com.detroitlabs.Model.CharacterInfo;
import com.detroitlabs.Model.CharacterUrl;
import com.detroitlabs.Model.MovieData;
import com.detroitlabs.Services.MovieDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieDataController {

    @Autowired
    private MovieDataService movieService;


    @RequestMapping("/")
    public String displayMovieData(ModelMap modelMap, ModelMap modelMap1) {
        MovieData movieData = movieService.fetchMovieData();
        List<String> characterUrl = movieData.getCharacterListUrlWrapper();

        ArrayList<CharacterInfo> characterInfo = new ArrayList<>();
        for (String url : characterUrl) {

            CharacterInfo characterDetails = movieService.fetchCharacterData(url);
            characterInfo.add(characterDetails);

        }

        modelMap.put("movieData", movieData);
        modelMap1.put("characterInfo",characterInfo);

        return "index";


    }

    @RequestMapping("/people")
    public CharacterInfo displayCharacterInfo(ModelMap modelMap) {
        MovieData movieData = movieService.fetchMovieData();
        String characterUrl = movieData.getCharacterListUrlWrapper().get(0);
        CharacterInfo characterInfo = movieService.fetchCharacterData(characterUrl);
        return "characterDetails";

    }
}
