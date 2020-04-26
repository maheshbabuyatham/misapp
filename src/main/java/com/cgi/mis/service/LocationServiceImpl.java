/**
 * 
 */
package com.cgi.mis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.mis.model.Location;
import com.cgi.mis.repository.LocationRepository;

/**
 * @author Mahesh
 *
 */
@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	LocationRepository locationRepository;

	@Override
	public List<Location> getAll() {
		return locationRepository.findAll();
	}

	@Override
	public Location save(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location get(Integer locationId) {
		return locationRepository.findById(locationId).get();
	}

	@Override
	public Location update(Location location) {
		return locationRepository.save(location);
	}
	
	@Override
	public void delete(Integer locationId) {
		locationRepository.deleteById(locationId);
		
	}
}
