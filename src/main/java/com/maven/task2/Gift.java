package com.maven.task2;

import java.util.*;
public class Gift {
	public static void main( String[] args )
    { 
        int total_weight = 0,quantity = 0,weight = 0,totalbox_wt = 0,total_candies = 0;
        char n1;
        sweets collect;
        Boolean n=true;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the sweets from below : ");
        while(n) {
        System.out.println("1.dairymilk");
        System.out.println("2.kitkat");
        System.out.println("3.luvit");
        System.out.println("4.candies");
        System.out.println("5.Mothichur");
        System.out.println("6.Rasmalai");
        System.out.println("Enter an item(1-6)");
        
        try {
        	
        switch(sc.next().charAt(0))
        {
        case '1':
        	   System.out.println("Enter the quantity");
        	   quantity=sc.nextInt();
        	   System.out.println("Enter the weight in grams");
        	   weight=sc.nextInt();
        	   collect= new perk();
        	   total_weight=collect.calculateweight( quantity, weight);
        	   totalbox_wt=totalbox_wt+total_weight;
        	   System.out.println("total weight of dairymilk : "+total_weight+"grams");
        	   System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
               
        	   System.out.println("do you need another one (y/n)");
        	   n1=sc.next().charAt(0);
        	      if(n1=='y'|| n1=='Y')
        	        { 
        	    	  n=true;
        	          break;
        	        }
        	     else
        		    {
        	    	 n=false;
                     System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
                     System.out.println("Total number of candies in the giftbox : "+total_candies);
                     break;
                    }
        case '2':
        	   System.out.println("Enter the quantity");
        	   quantity=sc.nextInt();
        	   System.out.println("Enter the weight in grams");
        	   weight=sc.nextInt();
        	   collect=new bounty();
        	   total_weight=collect.calculateweight(quantity, weight);
        	   totalbox_wt=totalbox_wt+total_weight;

        	   System.out.println("Total weight of bounty : "+total_weight+"grams");
        	   System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        	   System.out.println("do you need another one (y/n)");
        	   n1=sc.next().charAt(0);
        	      if(n1=='y'|| n1=='Y')
        	        { 
        	    	  n=true;
        	          break; 
        	        }
        	      else
        		    {
        	    	  n=false;
        	          System.out.println("Total gift box weight : "+totalbox_wt+"grams");
        	          System.out.println("Total number of candies in the giftbox : "+total_candies);
        	          break;
        	        }
        case '3':
        	System.out.println("Enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("Enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new luvit();
        	total_weight=collect.calculateweight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of luvit : "+total_weight+"grams");
        	System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        	System.out.println("do you need another one (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        		System.out.println("Total number of candies in the giftbox : "+total_candies);
        	break;}
        case '4':
        	System.out.println("Enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("Enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new candies();
        	total_weight=collect.calculateweight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;
        	total_candies=total_candies+quantity;

        	System.out.println("Total weight of candies : "+total_weight+"grams");
        	System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        	System.out.println("do you need another one (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
                System.out.println("Total number of candies in the giftbox : "+total_candies);
                
        	break;}
        case '5':
        	System.out.println("Enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("Enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new mothichur();
        	total_weight=collect.calculateweight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of mothichur : "+total_weight+"grams");
        	System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        	System.out.println("do you need another one (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        		System.out.println("Total number of candies in the giftbox : "+total_candies);
        	break;}
        case '6':
        	System.out.println("Enter the quantity");
        	quantity=sc.nextInt();
        	System.out.println("Enter the weight in grams");
        	weight=sc.nextInt();
        	collect=new Rasmalai();
        	total_weight=collect.calculateweight(quantity, weight);
        	totalbox_wt=totalbox_wt+total_weight;

        	System.out.println("Total weight of Rasmalai : "+total_weight+"grams");
        	System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        	System.out.println("do you need another one (y/n)");
        	n1=sc.next().charAt(0);
        	if(n1=='y'|| n1=='Y')
        	    {n=true;
        	    
        	break;}
        	else
        		{n=false;
        		System.out.println("Total weight of gift box : "+totalbox_wt+"grams");
        		System.out.println("Total number of candies in the giftbox : "+total_candies);
        	break;}
        
 
        }}
        catch(Exception e)
        {
        	System.out.println("Select from 1-6 choices only");
            
        
        
    }}
        sc.close();
}
}
