package springmvc.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;


@Controller
public class ContactController 
{
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contacts";
	}
	
//	@RequestMapping(path = "/processForm",method = RequestMethod.POST)
//	public String handleForm(HttpServletRequest httpServletRequest)
//	{
//		System.out.println(httpServletRequest.getParameter("email"));
//		return "";
//	}
	
//Now in spring we use @RequestParam for getting values
	
/*	
	@RequestMapping(path = "/processForm",method = RequestMethod.POST)
	public String handleForm(@RequestParam("name") String userName, @RequestParam("email") String useremail, @RequestParam("password") String password ,Model model )
	{
		System.out.println(userName);
		System.out.println(useremail);
		System.out.println(password);
		
//		model.addAttribute("name", userName);
//		model.addAttribute("useremail", useremail);
//		model.addAttribute("password", password);
		
		User user= new User();
		user.setName(userName);
		user.setEmail(useremail);
		user.setPassword(password);
		
		System.out.println(user); 
		
		model.addAttribute("user", user);
		
		return "success";
	}
	
*/
	
	//see the difference betweenb model attribute in above code and this code 
	
	@RequestMapping(path = "/processForm",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model)
	{
		
		System.out.println(user); 
		if(user.getName().isBlank()&& user.getEmail().isBlank() && user.getPassword().isBlank() )
		{
		  return "redirect:/contact";
		}
		
		this.userService.createUser(user);
		model.addAttribute("success","User Saved successfully");
		return "success";
	} 
	
}
