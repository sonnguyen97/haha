package com.lge;
import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ResourceBundleMessageSource;
import java.util.Locale;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {
	public static void main(String[] args) {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("lang/messages");
		messageSource.setDefaultEncoding("UTF-8");
    	System.out.println(messageSource.getMessage("hello", null, Locale.KOREA));
		SpringApplication.run(SpringBootApplication.class, args);
	}

}
