package com.springboot.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityStudent {
	
	//provide datasource to spring security
	@Bean
	public UserDetailsManager userDetailsManager(DataSource dataSource) {
		return new JdbcUserDetailsManager(dataSource);
	}
	
	//users and authorities are fixed name. but we can change that also.
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.authorizeHttpRequests(configurer->
								configurer
										.requestMatchers(HttpMethod.GET,"/interview/students").hasRole("MEMBER")
										.requestMatchers(HttpMethod.PUT,"/interview/students").hasRole("ADMIN")
				
				);
		//use http basic authentication
    	http.httpBasic(Customizer.withDefaults());
    	
    	//CSRF disbled
    	http.csrf(csrf->csrf.disable());
    	return http.build();
	}

}
