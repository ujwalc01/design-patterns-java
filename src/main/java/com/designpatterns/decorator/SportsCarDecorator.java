package com.designpatterns.decorator;

public class SportsCarDecorator implements Car {

	  private final Car car;

	  public SportsCarDecorator(Car car) {
	        this.car = car;
	  }
	
	@Override
	public void assemble() {
		
		car.assemble();
        System.out.println("Adding features of Sports Car");
	}

}
