package com.example.fibonaccirestservice;

import java.io.Serializable;

//This class allows us to parse the json input
public class Input implements Serializable {

	private Integer elements;

	public Integer getElements() {
		if (elements > 0 && elements <= 100)
		return elements;
		else return null;
	}

	public void setElements(Integer elements) {
		this.elements = elements;
	}
	
	
}
