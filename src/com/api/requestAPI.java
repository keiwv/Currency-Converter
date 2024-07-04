package com.api;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;

public class requestAPI {

    public String getURL(String currency) {
        String URL = "https://v6.exchangerate-api.com/v6/4432d57a6d000bbaac622062/latest/";
        return URL + currency;
    }

    public Double getCurrency(String baseCurrency, String targetCurrency, float amount) {
        String URL = getURL(baseCurrency);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL)).GET().build();
        HttpResponse<String> response;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            ExchangeRateResponse exchangeRateResponse = gson.fromJson(response.body(), ExchangeRateResponse.class);

            return exchangeRateResponse.getTargetCurrency(targetCurrency, amount);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
