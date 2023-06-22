package com.jsp.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.CustomerDto;
import com.jsp.dto.Destination;
import com.jsp.dto.VisitorDto;
import com.jsp.repository.DestinationRep;
import com.jsp.repository.DestinationRepImp;


@Controller
public class ApplicationController {
	
	@RequestMapping("/display")
	public String display() {
		System.out.println("This is display method");
		return "display.jsp";
	}
	
	@RequestMapping("/message")
	public ModelAndView getMessage(String message) {
		ModelAndView view = new ModelAndView("display.jsp");
		view.addObject("message",message);
		System.out.println(message);
		return view;
	}
	@RequestMapping("/customer")
	public ModelAndView getCustomerDetails(CustomerDto dto) {
		System.out.println(dto);
		ModelAndView view = new ModelAndView();
		view.setViewName("customerDetails.jsp");
		view.addObject("customer",dto);
		return view;
	}
	@RequestMapping("/visitor")
	public ModelAndView getVisitorDetails(VisitorDto dto) {
		System.out.println(dto);
		ModelAndView view = new ModelAndView("customerDetails.jsp");
		view.addObject("visitor",dto);
		return view;
	}
	@RequestMapping("/destinationSave")
	public ModelAndView saveVisitor(Destination destination) {
		System.out.println(destination);
		ModelAndView view = new ModelAndView("DestinationSavePage.jsp");
		DestinationRepImp imp = new DestinationRepImp();
		String save = imp.save(destination);
		view.addObject("saveMessage",save);
		return view;
	}
	@RequestMapping("/updateDestinate")
	public ModelAndView updateDestination(Destination destination) {
		System.out.println(destination);
		ModelAndView view = new ModelAndView("DestinationSavePage.jsp");
		DestinationRepImp imp = new DestinationRepImp();
		String save = imp.update(destination);
		view.addObject("saveMessage",save);
		return view;
	}
	@RequestMapping("/deleteDestinate")
	public ModelAndView deleteDestination(int id) {
		System.out.println(id);
		ModelAndView view = new ModelAndView("DestinationSavePage.jsp");
		DestinationRepImp imp = new DestinationRepImp();
		String save = imp.delete(id);
		view.addObject("saveMessage",save);
		return view;
	}
	@RequestMapping("/getById")
	public ModelAndView getByID(int id) {
		System.out.println(id);
		ModelAndView view = new ModelAndView("DestinationSavePage.jsp");
		DestinationRepImp imp = new DestinationRepImp();
		Destination save = imp.getById(id);
		view.addObject("saveMessage",save);
		return view;
	}
	@RequestMapping("/getByName")
	public ModelAndView getByName(String name) {
		System.out.println(name);
		ModelAndView view = new ModelAndView("DestinationSavePage.jsp");
		DestinationRepImp imp = new DestinationRepImp();
		List<Destination> save = imp.getByName(name);
		view.addObject("saveMessage",save);
		return view;
	}
	@RequestMapping("/getAll")
	public ModelAndView getAll() {
		ModelAndView view = new ModelAndView("DestinationSavePage.jsp");
		DestinationRep imp = new DestinationRepImp();
		List<Destination> list = imp.getAll();
		view.addObject("saveMessage",list);
		return view;
	}
}