package com.example.core.entity;

import java.io.Serializable;

public class CountryLanguage implements Serializable {
    private String countrycode;

    private String language;

    private String isofficial;

    private Float percentage;

    private static final long serialVersionUID = 1L;

    public CountryLanguage(String countrycode, String language, String isofficial, Float percentage) {
        this.countrycode = countrycode;
        this.language = language;
        this.isofficial = isofficial;
        this.percentage = percentage;
    }

    public CountryLanguage() {
        super();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getIsofficial() {
        return isofficial;
    }

    public void setIsofficial(String isofficial) {
        this.isofficial = isofficial == null ? null : isofficial.trim();
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}