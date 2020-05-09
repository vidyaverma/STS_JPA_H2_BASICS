package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.alien;

@Controller
public class Aliencontroller {
	@Autowired
	AlienRepo repo;
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(alien alien1) 
	{
		repo.save(alien1);
		return "home.jsp";
	}
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) 
	{
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		alien alien1 = repo.findById(aid).orElse(new alien());
		System.out.println(repo.findBytech("blockch ain"));
		mv.addObject(alien1);
		return mv;
	}
}
