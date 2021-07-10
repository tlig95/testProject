package com.example.demo;

import com.example.demo.controller.DemandsController;
import com.example.demo.entity.DemandEntity;
import com.example.demo.service.DemandService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.util.Date;
import java.sql.Timestamp;

@WebMvcTest(DemandsController.class)
class DemoApplicationTests {
	@MockBean
	DemandService demandService;
	@Autowired
	private WebApplicationContext webApplicationContext;
	@Autowired
	MockMvc  mockMvc;
	@Test
	public void testMockMvc(){
		Assert.assertNotNull(mockMvc);
	}
	void testAddDemandsWithoutUser() {
		DemandEntity demand = new DemandEntity();
		demand.setPickUpLocation("PickUpLocation");
		demand.setDropOffLocation("dropOffLocation");
		demand.setCurrentLocation("CurrentLocation");
		demand.setEarlistPickUp(new Timestamp(new Date().getTime()));
		demand.setLatestPickUp(new Timestamp(new Date().getTime()));
		demand.setEngine("Engine");
		demand.setInfotaSystem("InfotaSystem");
		demand.setInteriorDesign("InteriorDesign");
//		RequestBuilder requestBuilder = MockMvcRequestBuilders
//				.post("/students/Student1/courses")
//				.accept(MediaType.APPLICATION_JSON).content(exampleCourseJson)
//				.contentType(MediaType.APPLICATION_JSON);
	}

}
