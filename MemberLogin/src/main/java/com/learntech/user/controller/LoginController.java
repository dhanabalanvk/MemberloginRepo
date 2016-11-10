/**
 * 
 */
package com.learntech.user.controller;


import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author UthirNew
 *
 */
@RestController
public class LoginController {
	
	@RequestMapping(value="/lerantech/user/validate",method=RequestMethod.GET)
	public String isValidUser(@RequestParam(name="username",required=true) String userName){
		
		if(StringUtils.hasText(userName) && "validuser".equalsIgnoreCase(userName)){
			return userName;
		}
		return "InValid User";
	}

}
