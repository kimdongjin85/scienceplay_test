package kr.co.msk.controller;

import kr.co.msk.domain.Users;
import kr.co.msk.service.UsersService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	private static final Logger logger = LoggerFactory.getLogger(UsersController.class);
	
	@Autowired UsersService service;

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView getList(@ModelAttribute("form") Users form){
		logger.info("/users/list");
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",service.getList());
		mav.setViewName("users/list"); 
		mav.setViewName("tiles/users/list");
		logger.info("/users/list : end");
		return mav;
		//test1112
	}
	
	
	 
}
