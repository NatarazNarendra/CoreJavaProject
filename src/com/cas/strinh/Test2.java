package com.cas.strinh;

// Java program to understand
// the concept of == operator

public class Test2 {
	public static void main(String[] args)
	{
		String s1 = "HELLO MY NAME IS NARENDRA";
		String s2 = "HELLO MY NAME IS NARENDRA";
		String s3 = new String("HELLO MY NAME IS NARENDRA");

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s2 == s3); // false
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true
	}
}
