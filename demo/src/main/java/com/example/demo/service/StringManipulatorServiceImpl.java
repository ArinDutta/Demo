package com.example.demo.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class StringManipulatorServiceImpl implements StringManipulator {

	@Override
	public String manipulate(String inputString) {
		if(null != inputString) {
	        int length=inputString.length();
	        int splittingIndex=(int)Math.ceil(length/2f);
	        log.info("Splitting Index:"+splittingIndex);
	        String fristManipulatedString=inputString.substring(0,splittingIndex);
	        String secoundManipuString=inputString.substring(splittingIndex, length);
			String reverseString=reverseString(secoundManipuString);
			log.info("Reverse String:"+reverseString);
			log.info("Result String:"+reverseString+fristManipulatedString);
			return reverseString+fristManipulatedString;
		}
		return null;
		
	}
	
	private String reverseString(String inputString) {
		char[] chars= inputString.toCharArray();
		char[] output=new char[chars.length];
		for(int i=chars.length-1,j=0;i>=0;i--,j++ ) {
			output[j]=chars[i];
		}
		return String.valueOf(output);
	}

}