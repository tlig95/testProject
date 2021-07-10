package com.example.demo;

import com.example.demo.controller.DemandsController;
import com.example.demo.controller.UserController;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.DemandRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.DemandService;
import com.example.demo.service.UserService;
import org.hibernate.query.criteria.internal.expression.SimpleCaseExpression;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class DemandsControllerTest {
    @MockBean
    UserService userService;

    @MockBean
    UserRepository userRepository;
    @Autowired
    MockMvc mockMvc;
    @Test
    public void setupMockMvc(){
        when(userRepository.findAll()).thenReturn(Stream.of(new UserEntity(1,"name","gender",new Date())).collect(Collectors.toList()));
        Assert.assertEquals(1,userService.findAll().size());
    }
    @Test
    public void testMockMvc() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user/get/").accept(MediaType.APPLICATION_JSON)).andReturn();
        Assert.assertNotNull(mvcResult);
    }

}
