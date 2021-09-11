package com.flyingmachine.factory;

/**
 * 
 * This is the FlyingMachine Factory where we are instantiating the
 * FlyingMachine
 *
 */
public class FlyingMachineFactory {

	public FlyingMachine getFlyingMachineByManufacturer(String manufacturer) {
		FlyingMachine flyingMachine = null;
		if (manufacturer.equalsIgnoreCase("boeing")) {
			flyingMachine = new BoeingFlyingMachie();
		} else if (manufacturer.equalsIgnoreCase("airbus")) {
			flyingMachine = new AirBusFlyingMachine();
		} else if (manufacturer.equalsIgnoreCase("bombardier")) {
			flyingMachine = new BombardierFlyingMachine();
		}
		return flyingMachine;
	}

}
