package com.example.demo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;




@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
@EnableAutoConfiguration
public class ReadingPropertiesTest {

	@Value("${profile.name}")
	private String propertyOne;

	@Test
	public void givenDefaultTPS_whenVariableRetrieved_thenDefaultFileReturned() {
		System.out.println(propertyOne);

	}
}