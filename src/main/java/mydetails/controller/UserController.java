package mydetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import mydetails.model.UserDetails;
import mydetails.services.UserDetailsServices;

@Controller
public class UserController {

	
	@Autowired(required=true)
	UserDetailsServices userDetailsServices;
	
	 @RequestMapping("/hello")  
	    public String display(ModelMap m)  
	    {  
		 System.out.println("hello");
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
       /* if (result.hasErrors()) {
            return "loginPage";
        } else {*/
        	 userDetailsServices.save(userDetails);
            model.addAttribute("lfobj", userDetails);
            return "success";
        }
    }
	
	
