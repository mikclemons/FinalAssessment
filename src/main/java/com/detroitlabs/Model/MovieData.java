package com.detroitlabs.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieData {

    private String title;
    private String episodeId;
    private String opening_Crawl;
    private String director;
    private String producer;
    private String releaseDate;
    private List<String> characterListUrlWrapper;

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("episode_id")
    public String getEpisodeId() {
        return episodeId;
    }

    @JsonProperty("episode_id")
    public void setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
    }

    @JsonProperty("opening_crawl")
    public String getOpening_Crawl() {
        return opening_Crawl;
    }

    @JsonProperty("opening_crawl")
    public void setOpening_Crawl(String opening_Crawl) {
        this.opening_Crawl = opening_Crawl;
    }

    @JsonProperty("director")
    public String getDirector() {
        return director;
    }

    @JsonProperty("director")
    public void setDirector(String director) {
        this.director = director;
    }

    @JsonProperty("producer")
    public String getProducer() {
        return producer;
    }

    @JsonProperty("producer")
    public void setProducer(String producer) {
        this.producer = producer;
    }

    @JsonProperty("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @JsonProperty("characters")
    public List<String> getCharacterListUrlWrapper() {
        return characterListUrlWrapper;
    }

    @JsonProperty("characters")
    public void setCharacterListUrlWrapper(List<String> characterListUrlWrapper) {
        this.characterListUrlWrapper = characterListUrlWrapper;
    }
}
