package com.flyingmachine.factory;

/**
 *
 * This is the factory Demo of FlyingMachine.
 * 
 *
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {

		FlyingMachineFactory factory = new FlyingMachineFactory();

		FlyingMachine boeingFlyingMachine = factory.getFlyingMachineByManufacturer("boeing");

		boeingFlyingMachine.design();

		FlyingMachine airbusFlyingMachine = factory.getFlyingMachineByManufacturer("airbus");

		airbusFlyingMachine.design();

		FlyingMachine bombardierFlyingMachine = factory.getFlyingMachineByManufacturer("bombardier");

		bombardierFlyingMachine.design();

	}

}
