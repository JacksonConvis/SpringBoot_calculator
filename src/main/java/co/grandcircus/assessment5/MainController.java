package co.grandcircus.assessment5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController{
	
	@RequestMapping("/")
	public String Home() {
		return "home";
	
	}
	@RequestMapping("/calculator")
	public String calculator() {
		return "calculator";
	}
	
	@RequestMapping("/result")
	public String result(Model model, @RequestParam int num_one, @RequestParam int num_two, @RequestParam String operation) {
		double mathResult=0;
		if(operation.equals("plus")) {
			mathResult = num_one+num_two;
		}else if(operation.equals("minus")) {
			mathResult = num_one-num_two;
		}else if(operation.equals("multiply")) {
			mathResult = num_one*num_two;
		}else if(operation.equals("divide")) {
			mathResult = num_one/num_two;
		}
		model.addAttribute("mathResult", mathResult);
		model.addAttribute("operation", operation);
		return "result";
		
	}
}