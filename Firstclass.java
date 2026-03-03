package com.javaintro;


public class Firstclass {
   static int CountryId;
   static String Countryname;
   
   int jersyNo;
   String playername;
   
	public static void main(String[] args) {
	
		CountryId=91;
		Countryname="india";
		
		Firstclass virat=new Firstclass();
		virat.jersyNo=18;
		virat.playername="kinguuuuuuuuuuuu";
	            System.out.println(CountryId);
		        System.out.println(Countryname);
		       System.out.println(virat.jersyNo);
		       System.out.println(virat.playername);
		

	}

}
