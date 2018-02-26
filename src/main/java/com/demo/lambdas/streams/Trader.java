package com.demo.lambdas.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public  class Trader{
	
	private String name;
	private String city;

	@Override
	public String toString(){
		return "Trader:"+this.name + " in " + this.city;
	}
}