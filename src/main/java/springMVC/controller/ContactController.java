/*package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.model.User;

//import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void method_name(Model model){
		model.addAttribute("heading", "Spring framework");
		model.addAttribute("text", "Learning is going on");
	}

	@RequestMapping("/Form")
	public String showForm() {
		return "Form";
	}

//	OLD METHOD 
//	@RequestMapping(path="/Process", method=RequestMethod.POST)
//	public String handleForm(HttpServletRequest request) {
//		String str = request.getParameter("email");
//		System.out.println("user email: "+str);
//		return "";
//	}

//	NEW METHOD:

//	A) Using @RequestParam("field_name")

//	@RequestMapping(path="/Process", method=RequestMethod.POST)
//	public String handleForm(@RequestParam("email") String UserEmail, @RequestParam("name") String UserName, @RequestParam("password") String UserPassword, Model model) {
//		System.out.println("User name: "+ UserName);
//		System.out.println("User email: "+ UserEmail);
//		System.out.println("User password: "+ UserPassword);
//		model.addAttribute("name", UserName);
//		model.addAttribute("email", UserEmail);
//		model.addAttribute("password", UserPassword);
//		return "success";
//	}

//	B) Using ModelAttribute(): 

//		type-1) Using Model inside method:
//	@RequestMapping(path = "/Process", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("email") String UserEmail, @RequestParam("name") String UserName,
//			@RequestParam("password") String UserPassword, Model model) {
//
//		User user = new User();
//		user.setEmail(UserEmail);
//		user.setUsername(UserName);
//		user.setPassword(UserPassword);
//		System.out.println(user);
//
//		model.addAttribute("user", user);
//		return "success";
//	} 
	
	
//		type-2) Using @ModelAttribute inside method parameter:  -> Syntax: @ModelAttribute Class_name Class_calling_name
	@RequestMapping(path = "/Process", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		return "success";
	}
}*/


package springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVC.model.User;
import springMVC.service.UserService;

@Controller
@Component
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void method_name(Model model){
		model.addAttribute("heading", "Spring framework");
		model.addAttribute("text", "Learning is going on");
	}

	@RequestMapping("/Form")
	public String showForm() {
		return "Form";
	}

	
	@RequestMapping(path = "/Process", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println("First: "+user);
		int x = this.userService.createUser(user);
		System.out.println(x);
		model.addAttribute("msg", "User succesfully register and id is"+x);
		return "success";
	}
}








