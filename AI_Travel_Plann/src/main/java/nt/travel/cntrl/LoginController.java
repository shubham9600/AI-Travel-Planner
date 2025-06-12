package nt.travel.cntrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nt.travel.entity.Generatetrip;
import nt.travel.service.GenerateTrip;

@Controller
public class LoginController {

	@Autowired
	private GenerateTrip trip;

	@GetMapping("login")
	public String login() {
		return "login";
	}

	@GetMapping("form")
	public String form() {
		return "form";
	}

	@PostMapping("/generateTrip")
	public String trip(@ModelAttribute Generatetrip gt, Model model) {
		String responce = trip.generateTrip(gt);
		String formatString = formatString(responce);
//		String formattedTripPlan = responce
//			    .replace("**", "<br>")  // Replace new lines with <br>
//			    .replace("*", "<li>")    // Replace * with <li>
//			    .replace("Day", "<h2>Day")  // Optionally format days with <h2>
//			    .replace("Budget Breakdown", "<h2>Budget Breakdown</h2>");
		model.addAttribute("YourTravelPlan", formatString);
		return "landingPage";

	}

	public String formatString(String travelPlan) {
		travelPlan = travelPlan.replaceAll("\\*\\*(.*?)\\*\\*", "<b>$1</b>");
		travelPlan = travelPlan.replaceAll("\\*(.*?)\\*", "<i>$1</i>");
		travelPlan = travelPlan.replaceAll("\n", "<br>");
		travelPlan = travelPlan.replaceAll("\\*\\s", "&bull; "); // Bullet points
		travelPlan = travelPlan.replaceAll("\\+\\s", "&bull; "); // Alternate bullet format

		return travelPlan;

	}
}
