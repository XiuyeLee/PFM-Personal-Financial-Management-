package com.demo.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.demo.bean.BlankDisc;
import com.demo.bean.CompactDisc;
import com.demo.config.aspect.TrackCounter;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan({ "com.demo.config.aspect" })//不起作用的
// @ImportResource("classpath:config/xml/applicationContext.xml")
public class TrackCounterConfig {

	@Bean
	public CompactDisc sgtPeppers() {
		BlankDisc cd = new BlankDisc();
		cd.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
		cd.setArtlist("The Beatles");
		List<String> tracks = new ArrayList<String>();
		tracks.add("123456");
		tracks.add("hello world!");
		tracks.add("every day!");
		tracks.add("hi,god!");
		tracks.add("double tree");

		cd.setTracks(tracks);

		return cd;

	}

	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}

}
