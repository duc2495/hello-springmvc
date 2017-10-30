package hrs.training.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotSupportController {

	@RequestMapping("/notsupport")
	public String notsupport(Model model) {
		model.addAttribute("warning", "Sorry! The web not support Chrome browser!");
		return "notsupportChrome";
	}
}
