package com.projectfront.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ProjectBack.dao.CategoryDAO;
import com.ProjectBack.dao.ProductDAO;
import com.ProjectBack.dao.UserDetailsDAO;
import com.ProjectBack.model.UserDetails;



@Controller
public class PageController {
@Autowired
CategoryDAO categoryDAO;
@Autowired
ProductDAO productDAO;
	@Autowired
	UserDetailsDAO userDetailsDAO;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/register")
	public String registerd(){
		return "register";
	}
	@RequestMapping("/header")
	public String header(){
		return "header";
	}
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	@RequestMapping("/login_success")
	public String login_success(HttpSession session){
		session.setAttribute("loggedin", true);
		session.setAttribute("catList", categoryDAO.getAllCategory());
		return "redirect:/";
	}
	
	@RequestMapping("/admin")
	public String admin(){
		return "admin";
	}
	
	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	public String adduser(@RequestParam Map<String,String>data){
		UserDetails userDetails=new UserDetails();
		userDetails.setUsername(data.get("username"));
		userDetails.setEmail(data.get("email"));
		userDetails.setAddress(data.get("add"));
		userDetails.setMobile(Long.parseLong(data.get("tel")));
		userDetails.setRole("ROLE_USER");
		userDetails.setName(data.get("name"));
		userDetails.setEnabled(true);
		userDetails.setPassword(data.get("pass"));
		userDetailsDAO.addUserDetailsDAO(userDetails);
		return "redirect:login";
	}
	@RequestMapping("/viewProductByCategory/{c_id}")
	public ModelAndView updateProduct(@PathVariable int c_id){
		ModelAndView m=new ModelAndView("viewProductByCategory");
		m.addObject("proList",productDAO.getProductsByCategory(c_id));
		return m;
	}
}
