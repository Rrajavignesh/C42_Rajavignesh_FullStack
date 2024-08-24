package com.tnsif.day3;


//It is partially works in abstraction
//We cannot create object
//abstract class ------> abstract method---->public abstract 

abstract class value1
{
	abstract void one();
}

class value2 extends value1
{
	public void one () {
		System.out.println("Abstract method in abstract class");
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		value2 val = new value2();
		val.one();
	}

}
