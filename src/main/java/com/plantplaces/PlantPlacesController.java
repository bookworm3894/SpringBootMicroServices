package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 *	Handle the /start endpoint
 *	@return
 */
@Controller
public class PlantPlacesController {
	
	
	
	@RequestMapping("/start")
	public String Start() {
		
		return "start";
	}
	
	@RequestMapping("/index")
	public String Index() {
		
		return "index";
	}

}
