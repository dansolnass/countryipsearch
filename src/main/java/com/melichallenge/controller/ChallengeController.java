package com.melichallenge.controller;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class ChallengeController {
	
	private static final Logger LOG = Logger.getLogger(ChallengeController.class.getName());
	
	@PostMapping("/findInfo")
    public ResponseEntity findInfo(@RequestBody @Valid String body) {



		return new ResponseEntity<String>("", HttpStatus.OK);
	}

}