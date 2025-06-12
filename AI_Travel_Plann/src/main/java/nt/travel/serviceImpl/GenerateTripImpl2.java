package nt.travel.serviceImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import nt.travel.entity.Generatetrip;
import nt.travel.service.GenerateTrip;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
//import org.json.JSONObject;

@Service
public class GenerateTripImpl2 {

//    @Value("${openai.api.key}")
//    private String openAiApiKey;
//
//    @Override
//    public String generateTrip(Generatetrip gt) {
//        // Create RestTemplate for HTTP requests
//        RestTemplate restTemplate = new RestTemplate();
//
//        // Set up OpenAI API URL
//        String openAiApiUrl = "https://api.openai.com/v1/completions";
//
//        // Create HTTP Headers and add OpenAI API Key
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", "Bearer " + openAiApiKey);
//        headers.add("Content-Type", "application/json");
//
//        // Create request body for the OpenAI API request
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("model", "text-davinci-003");  // Use any model you prefer
//        requestBody.put("prompt", buildPrompt(gt));    // You can customize this
//        requestBody.put("max_tokens", 500);            // Customize the max tokens
//
//        // Create HTTP Entity with headers and body
//        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody.toString(), headers);
//
//        // Send POST request to OpenAI API
//        ResponseEntity<String> responseEntity = restTemplate.exchange(
//            openAiApiUrl,
//            HttpMethod.POST,
//            requestEntity,
//            String.class
//        );
//
//        // Parse and return the response from OpenAI
//        JSONObject responseJson = new JSONObject(responseEntity.getBody());
//        return responseJson.getJSONArray("choices").getJSONObject(0).getString("text");
//    }
//
//    // Helper method to build a prompt for OpenAI based on the Generatetrip object
//    private String buildPrompt(Generatetrip gt) {
//        return "Generate a travel plan by point wise based on the following details:\n" +
//                "Destination: " + gt.getLocation() + "\n" +
//                "Total Days: " + gt.getDays() + "\n" +
//                "Budget: " + gt.getBuget() + "\n" +
//                "Number of People: " + gt.getPeople() + "\n" +
//                "Travelling with: " + gt.getPartner() + "\n" +
//                "Generate a trip that fits within this budget and includes key attractions.";
//    }
}
