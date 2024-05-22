package com.candidate.candidateapp.infrastructure.api.controller;

import com.candidate.candidateapp.infrastructure.security.JwtTokenUtil;
import com.candidate.candidateapp.infrastructure.security.model.JwtRequest;
import com.candidate.candidateapp.infrastructure.security.model.JwtResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AuthenticationController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDetailsService jwtInMemoryUserDetailsService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createToken(@RequestBody JwtRequest authenticationRequest)
			throws Exception {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
				authenticationRequest.getUsername(),
				authenticationRequest.getPassword()));
		String token = jwtTokenUtil.generateToken(
				jwtInMemoryUserDetailsService.loadUserByUsername(authenticationRequest.getUsername()));

		return ResponseEntity.ok(new JwtResponse(token));
	}
}