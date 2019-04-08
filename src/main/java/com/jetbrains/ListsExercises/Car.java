package com.jetbrains.ListsExercises;

public class Car {
	public String brand;
	public String numerPlate;
	public int noOfDoors;

	public Car(String brand, String numerPlate, int noOfDoors) {
		this.brand = brand;
		this.numerPlate = numerPlate;
		this.noOfDoors = noOfDoors;
	}

	@Override
	public String toString(){
		return "["+brand+"] o numerach: ["+numerPlate+"] posiada "+noOfDoors+" drzwi.";

	}
}
