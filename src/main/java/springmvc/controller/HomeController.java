package springmvc.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("This is home url");
		model.addAttribute("Name","chetan jaiswal");
		model.addAttribute("id",101);
		List<String> students=new ArrayList<String>();
		students.add("Rohit");
		students.add("Ravin");
		students.add("vinod");
		model.addAttribute("studentss",students);
		return "index";
	}
	
	@RequestMapping("/about")
	public ModelAndView about() 
	{
		System.out.println("This is about url");
		
		ModelAndView modelAndView=new ModelAndView();
		
		//setting data into modelandview
		modelAndView.addObject("name","Rohit Patil");
		modelAndView.addObject("id",7);
		
		Set<String>address=new HashSet<String>();
		address.add("Khandwa");
		address.add("Badwani");
		address.add("Khandwa");
		
		modelAndView.addObject("address",address);
		//setting view into modelandview
		modelAndView.setViewName("about");
		
		return modelAndView;
	}
}
