package com.javaintro;

public class Kphb {
	
	public void car(){
		System.out.println("car");
		car1();
	
		}
	
	public void car1(){
		System.out.println("NannoCar");
		bike();
		
		}

	
	 static void bike(){
		System.out.println("Bike");
		bike1();
		
	}

	 static void bike1(){
			System.out.println("SuperBike");
			
		}


	public static void main(String[] args) {
		Kphb t = new Kphb();
		t.car();
		

	}
	

}
