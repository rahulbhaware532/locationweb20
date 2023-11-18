package com.location.controller;
//web services layer 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entities.Location;
import com.location.repository.LocationRepository;

@RestController
@RequestMapping("/location")
public class LocationRestController1 {

	@Autowired
	private LocationRepository locationRepo;

	@GetMapping
	public List<Location> getLocations() {
		List<Location> locations = locationRepo.findAll();
		return locations;
	}

	@PostMapping
	public void saveLocation(@RequestBody Location location) {
		locationRepo.save(location);
	}

	@PutMapping
	public void updateLocation(@RequestBody Location location) {
		locationRepo.save(location);
	}

	@DeleteMapping("delete/{id}")
	public void deleteLocation(@PathVariable Long id) {
		locationRepo.deleteById(id);
	}
}
