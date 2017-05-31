package com.spring.learning;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
    
	@InitBinder
	public void initBinder(WebDataBinder binder){
		
		//binder.setDisallowedFields(new String[] {"phone"});
		SimpleDateFormat sf = new SimpleDateFormat("yyyy**mm**dd");
		binder.registerCustomEditor(Date.class,"dob",new CustomDateEditor(sf,false));
		binder.registerCustomEditor(String.class,"name",new StudentNameEditor());
	}
	
	
	@RequestMapping(value="admissionForm.html", method=RequestMethod.GET)
	protected ModelAndView getAdmission(){
		
		ModelAndView model = new ModelAndView("AdmissionForm");
	
	
		return model;
	}
	
	@ModelAttribute
	public void addCommonObjects(Model model){
		model.addAttribute("welcome","Welcome");
	}
	
	
	@RequestMapping(value="submitAdmissionForm.html", method=RequestMethod.POST)
	protected ModelAndView submitAdmission(@Valid @ModelAttribute("student") Student student,BindingResult result){
	    if(result.hasErrors()){
	    	return new ModelAndView("AdmissionForm");
	    }
		ModelAndView model= new ModelAndView("AdmissionSuccess");
		//System.out.println(student.getSkills());
		model.addObject("student",student);
		//System.out.println(student.getHobbies().length());
		Configuration cfg = new Configuration();
		cfg.configure();
		Session session = cfg.buildSessionFactory().openSession();
		

		session.beginTransaction();
		

		session.save(student.getAddress());
		session.getTransaction().commit();
		return model;
	}
}
