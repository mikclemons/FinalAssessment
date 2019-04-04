package com.detroitlabs.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterUrl {

    private String characterUrl;

    @JsonProperty("characters")
    public String getCharacterUrl() {
        return characterUrl;
    }

    @JsonProperty("characters")
    public void setCharacterUrl(String characterUrl) {
        this.characterUrl = characterUrl;
    }
}
