package org.nucleus.bbl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nucleus.bbl.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author naveen.reddy
 *
 */

@Controller
public class TilesController {
	
	
	
	
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView loginPage(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView model = new ModelAndView("DefaultTemplate");
		
		return model;
	}
	
	 @RequestMapping(value="index")
	    public String index() {
	        return "index";
	    }
	    @RequestMapping(value="viewPeson")
	    public ModelAndView viewPersons(Model model) {
	        Map<String, List<Person>> persons =
	                new HashMap<String, List<Person>>();
	        persons.put("persons", Person.createPersons());
	        return new ModelAndView("personList", persons);
	    }

}
