package com.demo.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.demo.config.WebConfig;
import com.demo.web.controller.ViewController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=WebConfig.class)
@WebAppConfiguration
public class ViewControllerTest {

	@BeforeClass
	public static void init(){

		PropertyConfigurator.configure("resources/config/properties/log4j.properties");

	}

	@Test
	public void testHomePage(){
		ViewController controller = new ViewController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

		try {

			mockMvc.perform(get("index.do")).andExpect(view().name("index"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
