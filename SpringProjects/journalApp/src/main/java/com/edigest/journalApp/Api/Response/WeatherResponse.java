package com.edigest.journalApp.Api.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class WeatherResponse {


    private Current Current;

    @Getter
    @Setter
    public class Current{
        public int temperature;

        @JsonProperty("weather_descriptions")
        public ArrayList<String> weather_descriptions;

        public int feelslike;

    }




}
