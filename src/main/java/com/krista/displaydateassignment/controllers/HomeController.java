package com.krista.displaydateassignment.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



@Controller

public class HomeController {
		@RequestMapping("/")
		public String index(){
			return "index";
		}
		
		@RequestMapping("/date")
		public String day(Model model){

			String current = "";
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE - MMMM d, y");
			current = dateFormat.format(date).toString();
			model.addAttribute("current",current);

			return"display";
		}
		
		@RequestMapping("/time")
		public String clock(Model model){
			
			String current = "";
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm a");
			current = dateFormat.format(date).toString();
			model.addAttribute("current",current);
			
			return "display";
		}


}
