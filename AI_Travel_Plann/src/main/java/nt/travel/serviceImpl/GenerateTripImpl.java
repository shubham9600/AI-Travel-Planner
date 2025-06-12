package nt.travel.serviceImpl;

import java.util.Arrays;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import nt.travel.entity.Generatetrip;
import nt.travel.service.GenerateTrip;

@Service
public class GenerateTripImpl implements GenerateTrip {

	public String generateTrip(Generatetrip gt) {

		RestTemplate template = new RestTemplate();
		String prompt = createTripPrompt(gt);
		String url = "http://localhost:8083/prompt/generate/" + prompt;
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>("body", headers);

		try {
//			ResponseEntity<String> result = template.exchange(url, HttpMethod.POST, req, String.class);
			ParameterizedTypeReference<String> responseType = new ParameterizedTypeReference<String>() {
			};
			ResponseEntity<String> result = template.exchange(url, HttpMethod.GET, entity, responseType);
			return result.getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	private String createTripPrompt(Generatetrip gt) {
		return "Generate a travel plan based on the following details:\n" + "Destination: "
				+ gt.getLocation() + "\n" + "Total Days: " + gt.getDays() + "\n" + "Budget: " + gt.getBuget() + "\n"
				+ "Number of People: " + gt.getPeople() + "\n" + "Travelling with: " + gt.getPartner() + "\n"
				+ "Generate a trip that fits within this budget and includes key attractions also add \n";
	}
}
