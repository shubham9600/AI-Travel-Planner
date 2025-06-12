package ai.travel.controller;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.travel.entity.Generatetrip;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/prompt")
public class Main_Controller {

	private final OllamaChatModel chatModel;

	public Main_Controller(OllamaChatModel chatModel) {

		this.chatModel = chatModel;
	}

	@GetMapping("/generate/{prompt}")
	public String promptgeneration(@PathVariable String prompt) {
		return chatModel.call(prompt);
	}

	
}
