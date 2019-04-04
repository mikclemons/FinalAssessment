package com.detroitlabs.Services;

import com.detroitlabs.Model.CharacterUrl;
import com.detroitlabs.Model.MovieData;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.CharacterData;

@Component
public class MovieDataService {

    public MovieData fetchMovieData(){
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Spring");

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<MovieData> responseEntity =
                restTemplate.exchange("https://swapi.co/api/films/2" ,HttpMethod.GET, httpEntity,  MovieData.class);

        return responseEntity.getBody();
    }


    }



