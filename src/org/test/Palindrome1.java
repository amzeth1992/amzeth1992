package org.test;

public class Palindrome1 {
	
	public static void main(String[] args) {
	
	
	for(int k=1;k<=500;k++){
		int a=k, i=0,j=0,temp=a;
		while(a>0){
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		
		if(temp==j) {
			System.out.println(j);
		}
		
	}
	}

}
