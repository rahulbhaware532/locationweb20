package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.dto.SaveLocation;
import com.location.entities.Location;
import com.location.services.LocationService;
import com.location.util.EmailUtil;

@Controller
public class LocationController {

	@Autowired
	private LocationService locationService;

	@Autowired
	private EmailUtil emailUtil;

	@RequestMapping("/showLocation")
	public String showLocation() {
		return "saveLocation";
	}

	@RequestMapping("/saveLocation")
	public String saveLocationInfo(@ModelAttribute("location") Location location, ModelMap modelMap) {
		locationService.saveLocation(location);
		emailUtil.sendEmail("rahulbhaware532@gmail.com", "Test Email", "Record Is Saved");
		modelMap.addAttribute("msg", "Record is saaved!!");
		return "saveLocation";
	}

//	@RequestMapping("/saveLocation")
//	public String saveLocationInfo(@RequestParam("id") long id, @RequestParam("code") String code,
//			@RequestParam("name") String name, @RequestParam("type") String type, ModelMap modelMap) {
//		Location location = new Location();
//
//		location.setId(id);
//		location.setCode(code);
//		location.setName(name);
//		location.setType(type);
//
//		locationService.saveLocation(location);
//		modelMap.addAttribute("msg", "Record is saaved!!");
//		return "saveLocation";
//	}

	// dto
//	@RequestMapping("/saveLocation")
//	public String saveLocationInfo(SaveLocation saveLocation, ModelMap modelMap) {
//		Location location = new Location();
//
//		location.setId(saveLocation.getId());
//		location.setCode(saveLocation.getCode());
//		location.setName(saveLocation.getName());
//		location.setType(saveLocation.getType());
//
//		locationService.saveLocation(location);
//		modelMap.addAttribute("msg", "Record is saaved!!");
//		return "saveLocation";
//	}
	@RequestMapping("/getLocations")
	public String getLocations(ModelMap modelMap) {
		List<Location> locations = locationService.getAllLocations();

		modelMap.addAttribute("locations", locations);

		return "searchResult";
	}

	@RequestMapping("/delete")
	public String deletLocation(@RequestParam("id") long id, ModelMap modelMap) {
		locationService.deleteLocationById(id);

		List<Location> locations = locationService.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "searchResult";
	}

	@RequestMapping("/update")
	public String updateLocation(@RequestParam("id") long id, ModelMap modelMap) {
		Location location = locationService.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "updateLocationInfo";
	}

	@RequestMapping("/updateLoc")
	public String updateLocationDetails(SaveLocation saveLocation, ModelMap modelMap) {

		Location location = new Location();
		location.setId(saveLocation.getId());
		location.setCode(saveLocation.getCode());
		location.setName(saveLocation.getName());
		location.setType(saveLocation.getType());
		locationService.saveLocation(location);

		List<Location> locations = locationService.getAllLocations();
		modelMap.addAttribute("locations", locations);
		return "searchResult";
	}
}
