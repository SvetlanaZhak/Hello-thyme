package fi.haagahelia.hellothyme.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController {
	@RequestMapping("/hello")
	public String hello(Model model) {
		String myName = "Juha";
		model.addAttribute("name", myName);
		return "hello";
	}
}
