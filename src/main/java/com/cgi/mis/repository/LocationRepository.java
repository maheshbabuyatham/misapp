/**
 * 
 */
package com.cgi.mis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.mis.model.Location;

/**
 * @author Mahesh
 *
 */
public interface LocationRepository extends JpaRepository<Location,Integer> {

}
