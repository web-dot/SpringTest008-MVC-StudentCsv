package com.spring.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.ui.Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class HomeControllerTest {

	@Test
	@Disabled
	public void testGetAllStudents() {
		
		HomeController hc = new HomeController();
		List<String> expected = new ArrayList<>(Arrays.asList("John Doe", "Jane Smith", "Sarah Thomas", "Frank Brown", "Mike Davis", "Jennifer Wilson", "Jessica Garcia", "Fred Clark", "Bob Lopez"));
		Assertions.assertEquals(expected, hc.getAllStudents(Model model));
		
	}

}
