package com.cas.strinh;
public class Test3 {
    public static void main(String[] args)
    {
        Thread t = new Thread();
        Object o = new Object();
        String s = new String("GEEKS");
 
        System.out.println(t == o);
        System.out.println(o == s);
 
       // Uncomment to see error
     //  System.out.println(t==s);
    }
    
}

/*
 * Both s1 and s2 refer to same objects. When we use the == operator for s1 and
 * s2 comparison, the result is true as both have the same addresses in the
 * string constant pool. Using equals, the result is true because it’s only
 * comparing the values given in s1 and s2
 */