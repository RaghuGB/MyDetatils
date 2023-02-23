package mydetails.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import mydetails.model.UserDetails;

@Controller
public class UserController {
/*
	@RequestMapping("/hello")
    public String helloWorld(ModelMap model) {
		 UserDetails ud = new UserDetails();
		 model.addAttribute("userDetails",ud);
		 return "loginPage";            
}
	*/
	 @RequestMapping("/hello")  
	    public String display(ModelMap m)  
	    {  
		 UserDetails userDetails=new UserDetails();
		 userDetails.setEmail("");
		 userDetails.setPhone("");
		 userDetails.setUser("");
		 userDetails.setBlog("");
	        m.addAttribute("userDetails", userDetails);  
	        return "loginPage";  
	    } 
	 
    @RequestMapping("/login")
    public String loginCheck(@Validated UserDetails userDetails, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "loginPage";
        } else {
            model.addAttribute("lfobj", userDetails);
            return "success";
        }
    }
	
	
	
	
	
	
	
	
}
