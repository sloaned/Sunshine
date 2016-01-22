package com.example.catalyst.sunshine.app;

/**
 * Created by dsloane on 1/21/2016.
 */
public class UriBuilder {

    UriBuilder(){}

    public String getUrl(String postcode, String format, String units, String dayCount){
        String baseUrl = "http://api.openweathermap.org/data/2.5/forecast/daily?q=";

        String url = baseUrl + postcode;

        url += "&mode=" + format;
        url += "&units=" + units;
        url += "&cnt=" + dayCount;
        url += "&appid=44db6a862fba0b067b1930da0d769e98";

        return url;

    }
}
