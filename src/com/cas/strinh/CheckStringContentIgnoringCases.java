package com.cas.strinh;

public class CheckStringContentIgnoringCases {
 
    public static void main(String[] args) {
        String firstString ="NARENDRA!";
        String secondString = "my name is gaurav!";
        String thirdstring ="NARENDRA!";
 
   //     System.out.println("checking using equals() method" + firstString == secondString);
        System.out.println("checking using == method : " + firstString == thirdstring);
 
        // Case 1
        // Check if the strings are same using the simple equals() method
        System.out.println("checking using equals() method : " + firstString.equals(secondString));
 
        // Case 2
        // Check if the strings are same using the equalsIgnoreCase() method
        System.out.println("checking using equalsIgnoreCase() method : " + firstString.equalsIgnoreCase(secondString))
        ;
       
    }
 
}