/**
 * 
 */
package com.cgi.mis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mahesh
 *
 */
@RestController
@RequestMapping
public class HomeController {

	@GetMapping("/")
	String hello() {
		return "Hello Spring Boot";
	}
}
