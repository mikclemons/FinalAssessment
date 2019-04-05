package com.detroitlabs.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CharacterInfo {

    private String name;
    private String birthYear;
    private String gender;
    private List<String> homeworldUrlWrapper;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("birth_year")
    public String getBirthYear() {
        return birthYear;
    }

    @JsonProperty("birth_year")
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("homeworldUrlWrapper")
    public List<String> getHomeworldUrlWrapper() {
        return homeworldUrlWrapper;
    }

    @JsonProperty("homeworldUrlWrapper")
    public void setHomeworldUrlWrapper(List<String> homeworldUrlWrapper) {
        this.homeworldUrlWrapper = homeworldUrlWrapper;
    }
}
