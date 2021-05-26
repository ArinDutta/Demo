package com.example.demo.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StringManipulator;

@RestController
public class DemoController {

	@Autowired
	private StringManipulator stringManipulator;

	@GetMapping(path = "/manipulate",produces = "application/json")
	public ResponseEntity<Map> generetaeReverseString(
			@RequestParam(name = "str", required = true) String inputString) {
		Map<String, String> maps = new HashMap<>();
		maps.put("result", stringManipulator.manipulate(inputString));
		return new ResponseEntity<>(maps, HttpStatus.OK);

	}

}
