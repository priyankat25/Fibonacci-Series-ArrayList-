package com.kodnest.fibonacci;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fibonacci {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(0);
		al.add(1);
		
		int n1 = 0;
		int n2 = 0;
		for(int i=0; i<al.size()-1; i++) {
			n1 = al.get(i);
			n2 = al.get(i+1);
		}
		
		int n3;
		for(int i=2; i<=5; i++) {
			n3 = n1 + n2;
			al.add(n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println(al);	
	}
}