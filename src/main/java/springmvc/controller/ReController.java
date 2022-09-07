package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("one");
		RedirectView redirectView= new RedirectView();
		redirectView.setUrl("https://www.google.com");
		return redirectView;
	}
	
	
	/*public String one() {
		System.out.println("one");
		return "redirect:/two";
		
	}*/
	
	@RequestMapping("/two")
	public String two()
	{
		System.out.println("using redirect view two");
		return "";
	}
}
 