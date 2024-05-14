package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Recontroller {
	
//	About Redirect: 
	/*@RequestMapping(path="/one")
	public String one() {
		System.out.println("this is our One handler");
		return "redirect:/two";
	}
	
	@RequestMapping(path="/two")
	public String two() {
		System.out.println("this is our two handler");
		return "redirect:/Form";
	}*/
	
//	About RedirectView: 
	@RequestMapping(path="/one")
	public RedirectView one() {
		System.out.println("this is our One handler");
		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl("two");
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
	
	@RequestMapping(path="/two")
	public String two() {
		System.out.println("this is our two handler");
		return "redirect:/Form";
	}
}
