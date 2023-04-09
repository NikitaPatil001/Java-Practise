package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Investment;

@RestController
@RequestMapping("/investment")
public class InvestmentController {

	@PostMapping("/addDetails")

	public ResponseEntity<?> add(@RequestBody Investment invest) {
		return new ResponseEntity<>("Login success", HttpStatus.OK);

	}
}
