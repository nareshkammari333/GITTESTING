package com.nareshsw.spring_bootexample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String s="naresh Kammari kumar";
        String temp="";
        int count=0;
        String s1[]=s.split(" ");
        
    //    System.out.println(s.substring(1,s.indexOf(0)+1));
        
      //  System.out.println(s.indexOf(2));
        for(String s4:s1) {
            System.out.println(s4.length());

        	temp=s4.substring(0,s4.length());
        	
        //	System.out.println(s4.length());
        	//System.out.println(s4.indexOf(2));
        //	String h=s4.substring(0,s4.indexOf(0));
        	//System.out.println(h);
        	//temp=temp+" "+s4.charAt(0);
        	//count++;
        }
        
       // System.out.println(count);
        System.out.println(temp);
        	for(Character s2:s.toCharArray()) {
        		//System.out.println(s2);
        	}	
    }
}
