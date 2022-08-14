package ua.kyiv.sehal.springhello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	
	@Bean
	public PersonBean person() {
		return new PersonBean("Anatolii", 42);
	}

}
