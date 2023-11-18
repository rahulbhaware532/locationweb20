package com.location.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.entities.Location;
import com.location.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository locationRepo;

	@Override
	public void saveLocation(Location location) {
		locationRepo.save(location);
	}

	@Override
	public List<Location> getAllLocations() {
		List<Location> location = locationRepo.findAll();

		return location;
	}

	@Override
	public void deleteLocationById(long id) {
		locationRepo.deleteById(id);

	}

	@Override
	public Location getLocationById(long id) {
		Optional<Location> findAll = locationRepo.findById(id);
		Location location = findAll.get();
		return location;
	}

}
