package com.spring.webapplication.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.webapplication.validation.ValidationService;

@Controller
//@RestController
//@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	ValidationService service;
	
	@RequestMapping(value="/index",method =RequestMethod.GET)
	@ResponseBody
	public String index() {
//		JSONObject obj=new JSONObject();
//		obj.getJSONObject("HELLO");
		return "Login";
	}
	
	@RequestMapping("/load")
	public ModelAndView loadLoginPage() {
		return new ModelAndView("Login");
	}
	
	@RequestMapping(value="/load2",method=RequestMethod.POST)
	public ModelAndView loadWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap modelMap) {
		String status = service.doValidation(name, password);
		if(status!=null&&status.contains("Error")) {
			modelMap.put("errorMessage", "Invalid Credentials");
			return new ModelAndView("Login",modelMap);	
		}else {
			modelMap.put("name", name);
			modelMap.put("sanjay", "SanjayKumar A");
			return new ModelAndView("welcome",modelMap);
		}
		
	}

}
