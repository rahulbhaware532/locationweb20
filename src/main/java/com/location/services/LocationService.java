package com.location.services;

import java.util.List;

import com.location.entities.Location;

public interface LocationService {

	public void saveLocation(Location location);

	public List<Location> getAllLocations();

	public void deleteLocationById(long id);

	public Location getLocationById(long id);
}
