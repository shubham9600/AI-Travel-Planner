package ai.travel.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.travel.entity.Generatetrip;

@RestController
public class Prompt_Controller {

//	@PostMapping("/message")
//	public String callAi() {
//		
//		return null;
//
//	}
	private String createTripPrompt(Generatetrip gt) {
		return "Generate a travel plan by point wise based on the following details:\n" + "Destination: "
				+ gt.getLocation() + "\n" + "Total Days: " + gt.getDays() + "\n" + "Budget: " + gt.getBuget() + "\n"
				+ "Number of People: " + gt.getPeople() + "\n" + "Travelling with: " + gt.getPartner() + "\n"
				+ "Generate a trip that fits within this budget and includes key attractions.";
	}
}
