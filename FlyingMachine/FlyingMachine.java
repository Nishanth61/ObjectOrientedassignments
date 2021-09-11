package com.flyingmachine.factory;

/**
 *
 * FlyingMachine class
 *
 */
public abstract class FlyingMachine {

	int capacity;
	String name;
	String type;
	int businessSeats;
	int economicSeats;
	String engine;

	public void design() {

		System.out.println(" Design :" + this.name + " : " + this.type + " : " + this.engine + " : " + this.capacity
				+ " : " + this.businessSeats + " : " + this.economicSeats);

	}

}
