package shape;

import java.util.Arrays;

public class Assignment {
	public static void main(String args[]){  
	String[] str = {"omprakash", "pooja", "rishi", "mahesh", "maharshi", " john", "virat", "dhoni", "sachin", "jayprakash", "ganesh"};  
	int size = str.length;  
	for(int i = 0; i<size-1; i++){  
	for (int j = i+1; j<str.length; j++){  
	if(str[i].compareTo(str[j])>0){ 
	String temp = str[i];  
	str[i] = str[j];  
	str[j] = temp;  
	}  
	}  
	}  
	
	

	System.out.println(Arrays.toString(str));  
	System.out.println("It will assign it in order");
	}  
	}  


