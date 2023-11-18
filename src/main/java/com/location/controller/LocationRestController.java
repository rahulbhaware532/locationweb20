package com.location.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location.entities.Location;
import com.location.repository.LocationRepository;

@RestController
public class LocationRestController {
	@Autowired
	private LocationRepository locationRepo;

	@RequestMapping("/location/{id}")
	public Location getLocation(@PathVariable long id) {
		if (id == 0) {
			throw new LocationNotFound();
		}

		Optional<Location> findById = locationRepo.findById(id);
		Location location = findById.get();
		return location;
	}

}
