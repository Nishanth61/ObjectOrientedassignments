package com.flyingmachine.factory;

/**
 *
 * Boeing FlyingMachine
 *
 */
public class BoeingFlyingMachie extends FlyingMachine {

	public BoeingFlyingMachie() {
		this.name = "Boeing";
		this.engine = "GE90";
		this.capacity = 1000;
		this.businessSeats = 100;
		this.economicSeats = 900;
		this.type = "International";
	}

}
