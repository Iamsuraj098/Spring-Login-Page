package springMVC.controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/next")
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
//		data gose to index.jsp file
		System.out.println("This is controller");
		model.addAttribute("Name", "Ram");
		model.addAttribute("id", 1256);
		
		List<String> name = new ArrayList<String>();
		name.add("Radha");
		name.add("Yashoda");
		name.add("Raja");
		name.add("rahul");
		model.addAttribute("name", name);
		return "index";	
	}

	@RequestMapping("/play")
	public ModelAndView play() {
//		data goes to play.jsp
		ModelAndView modelAndView = new ModelAndView();
		
//		setting the data
		modelAndView.addObject("name", "Shayama");
		modelAndView.addObject("rollno", 102);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		modelAndView.setViewName("play");
		return modelAndView;
	}
	
	@RequestMapping("/joker")
	public String joker(Model model) {
//		data goes to joker.jsp file
		model.addAttribute("name", "Ram");
		model.addAttribute("dob", "02/03/2105");
		
//		passing list:
		List<Integer> marks = new ArrayList<>();
		marks.add(125);
		marks.add(124);
		marks.add(123);
		marks.add(122);
		marks.add(121);
		model.addAttribute("marks", marks);
		return "joker";
	}
}
