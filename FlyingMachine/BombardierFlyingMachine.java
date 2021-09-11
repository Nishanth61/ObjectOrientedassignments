package com.flyingmachine.factory;

/**
 *
 * Bombardier FlyingMachine
 *
 */
public class BombardierFlyingMachine extends FlyingMachine {

	public BombardierFlyingMachine() {
		this.name = "Bombardier";
		this.engine = " Rotax";
		this.capacity = 300;
		this.businessSeats = 20;
		this.economicSeats = 280;
		this.type = "Domestic";
	}

}
