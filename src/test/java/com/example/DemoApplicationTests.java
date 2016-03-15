package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rottblink.backend.config.BackendStarter;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=BackendStarter.class)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
