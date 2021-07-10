package com.example.demo;

import com.example.demo.controller.DemandsController;
import com.example.demo.entity.DemandEntity;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Date;
import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@WebMvcTest(value = DemandsController.class)
class DemoApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@Test
	void testAddDemandsWithoutUser() throws Exception {
		DemandEntity demand = new DemandEntity();
		demand.setPickUpLocation("PickUpLocation");
		demand.setDropOffLocation("dropOffLocation");
		demand.setCurrentLocation("CurrentLocation");
		demand.setEarlistPickUp(new Timestamp(new Date().getTime()));
		demand.setLatestPickUp(new Timestamp(new Date().getTime()));
		demand.setEngine("Engine");
		demand.setInfotaSystem("InfotaSystem");
		demand.setInteriorDesign("InteriorDesign");
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/demands/save/")
				.accept(MediaType.APPLICATION_JSON).content(String.valueOf(demand))
				.contentType(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();

		Assert.assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());
	}

}
