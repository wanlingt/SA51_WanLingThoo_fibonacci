package com.example.fibonaccirestservice;

import java.io.Serializable;

//This class allows us to parse the json input
public class Input implements Serializable {

	private Integer elements;

	public Integer getElements() {
		return elements;
	}

	public void setElements(Integer elements) {
		this.elements = elements;
	}
	
	
}
