package com.javaintro;

public class Statebank {
       static int accountno=123450;{
    	   accountno++;
		
	}
 
     String name;
     long phone;
     float balance;
     
	public static void main(String[] args) {
		System.out.println("Account Holder Details" );
		{
		Statebank t = new Statebank();
		 t.name = "Balaji";
		 t.phone = 9393667293l;
		 t.balance = 1000.00f;
		 System.out.println("Fist User*******************");
		 System.out.println("Name="+t.name);
		 System.out.println("Name="+t.phone);
		 System.out.println("Name="+t.balance);
		 System.out.println(accountno);
		}
		
			
	}}	 

		 


	


