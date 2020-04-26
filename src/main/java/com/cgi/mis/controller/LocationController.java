/**
 * 
 */
package com.cgi.mis.controller;

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

import com.cgi.mis.model.Location;
import com.cgi.mis.service.LocationService;

/**
 * @author Mahesh
 *
 */
@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	LocationService locationService;
	
	@GetMapping(value = "/all")
	List<Location> getAll(){
		return locationService.getAll();
	}
	
	@GetMapping(value = "/get/{id}")
	Location getLocation(@PathVariable("id")Integer locationId) {
		return locationService.get(locationId);
	}
	
	@PostMapping(value = "/add")
	Location add(@RequestBody Location location) {
		return locationService.save(location);
	}

	@PutMapping(value = "/edit")
	Location edit(@RequestBody Location location) {
		return locationService.save(location);
	}
	
	@DeleteMapping("/delete/{id}")
	void delete(@PathVariable("id") Integer locationId) {
		 locationService.delete(locationId);
		
	}
	
}
