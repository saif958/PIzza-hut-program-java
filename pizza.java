package pizza;

import java.util.Scanner; 
public class pizza{ 
private String size; 
private int chesetopping; 
private int hamtoppings; 
private int peperonitopping; 
public pizza (String size,int chesetopping,int hamtoppings,int peperonitopping 
){ 
this.size=size; 
this.chesetopping=chesetopping; 
this.hamtoppings=hamtoppings; 
this.peperonitopping=peperonitopping; 
} 
public String getsize(){ 
return size; 
} 
public void setsize(){ 
this.size=size; 
} public int getchesetopping(){ 
	  return chesetopping ; 
	 } 
	 public void setchesetopping(){ 
	  this.chesetopping=chesetopping; 
	 } 
	 public int gethamtoppings(){ 
	  return hamtoppings; 
	 } 
	 public void sethamtoppings(){ 
	  this.hamtoppings=hamtoppings; 
	 } 
	 public int getpeperonitopping(){ 
	  return peperonitopping; 
	 } 
	 public void setpeperonitopping(){ 
	  this.peperonitopping=peperonitopping; 
	 } 
	 public double calcost(){ 
	  double cost; 
	  cost = 0; 
	  switch (size){ 
	  case "small": 
	   cost = 500 + 20 *(chesetopping+hamtoppings+peperonitopping); 
	   break; 
	  case "medium": 
	   cost = 1200 + 200 *(chesetopping+hamtoppings+peperonitopping); 
	   break; 
	  case "large": 
	    
	   cost = 1400 + 2 *(chesetopping+hamtoppings+peperonitopping); 
	   break; 
	  } 
	  return cost; 
	 } 
	 public String getdescription(){ 
	  return ":size:"+ size +":chesse toppings:"+chesetopping+ 
	    ":ham toppings:"+hamtoppings+":pepperoni topping:"+peperonitopping; 
	 } 
	 public static void main(String []args){ 
	  Scanner scanner = new Scanner(System.in); 
	  System.out.println("Dominos Pizza Cafe\n Welcome:"); 
	  System.out.println("pizza size . small,medium,large:"); 
	     String size= scanner.nextLine(); 
	     System.out.println("chese toppings choice:"); 
	     int chesetoppings = scanner.nextInt(); 
	     System.out.println("ham toppings choice:"); 
	     int hamtoppings = scanner.nextInt(); 
	     System.out.println("pepperoni toppings choice:"); 
	     int pepperonitopping = scanner.nextInt(); 
	     pizza ob1 = new pizza(size, pepperonitopping, pepperonitopping, 
	pepperonitopping); 
	     System.out.println("dominos cafe pizza:"); 
	  System.out.println(ob1.getdescription()); 
	  System.out.println("total cost:Pkr" + ob1.calcost()); 
	 } 
}