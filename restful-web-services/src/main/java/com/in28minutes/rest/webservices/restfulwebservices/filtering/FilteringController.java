package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public List<SomeBean> retrieveSomeBean() {
		return Arrays.asList(new SomeBean("value1", "value2", "value3"), new SomeBean("value11", "value12", "value13"));
	}
}
