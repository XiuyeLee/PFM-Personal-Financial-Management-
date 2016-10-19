package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.bean.CompactDisc;
import com.demo.config.TrackCounterConfig;
import com.demo.config.aspect.TrackCounter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TrackCounterConfig.class })
public class TrackCounterTest {

	@Autowired
	private CompactDisc cd;

	@Autowired
	private TrackCounter counter;

	@BeforeClass
	public static void init() {
		PropertyConfigurator.configure("resources/config/properties/log4j.properties");
	}

	@Test
	public void testTrackCounter() {

		cd.playTrack(1);
		cd.playTrack(1);
		cd.playTrack(1);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(7);
		cd.playTrack(7);

		assertEquals(3, counter.getPlayCount(1));
		assertEquals(6, counter.getPlayCount(3));
		assertEquals(2, counter.getPlayCount(7));
		assertEquals(0, counter.getPlayCount(5));

	}

}
