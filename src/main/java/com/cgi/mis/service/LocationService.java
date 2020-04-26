/**
 * 
 */
package com.cgi.mis.service;

import java.util.List;

import com.cgi.mis.model.Location;

/**
 * @author Mahesh
 *
 */
public interface LocationService {

	List<Location> getAll();
	Location get(Integer locationId);
	Location save(Location location);
	void delete(Integer id);
	Location update(Location location);
}
