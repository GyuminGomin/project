package com.gls.ppldv.configuration.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Configuration
public class AuthenticationDeniedHandler implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException, ServletException {
		
		response.sendRedirect("/errors?message=loginPlease");
		
		System.out.println("----------------------------------");
		System.out.println(authException.getClass());
		System.out.println("----------------------------------");
	}
}
