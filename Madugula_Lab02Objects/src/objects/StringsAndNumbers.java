/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;
//import static java.lang;

import java.util.Random;


/**
 *
 * @author Abhiram, Madugula
 */
public class  StringsAndNumbers{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1  = "   Why";
        String string2 = " choose ";
        String string3 = "   Northwest  ";
        String string4 = "among";
        String string5 = " other     ";
        String string6 = " Universities ";
        String space = " ";
        System.out.println("The length of the concatenated string is: " + string1.concat(string2.concat(string3.concat(string4.concat(string5.concat(string6))))).length());
        String concatinatedStringWithSingleSpace = string1.trim().concat(space).concat(string2.trim()).concat(space).concat(string3.trim()).concat(space).concat(string4.trim()).concat(space).concat(string5.trim().concat(space).concat(string6.trim()));
        System.out.println("Whole sentence: " + concatinatedStringWithSingleSpace + "?");
        System.out.println("The length of the trimmed string: " + concatinatedStringWithSingleSpace.length());
        System.out.println("Index of first 'e' in Universities is: " + concatinatedStringWithSingleSpace.substring(concatinatedStringWithSingleSpace.indexOf("U")).indexOf("e"));
        String string7 = "onceabearcatalwaysabearcat";
        //String toupper = string7.substring(0, 4);//.charAt(0).toUppercase();
        //toupper.charAt(0)
        System.out.println(string7.substring(0, 1).toUpperCase().concat(string7.substring(1, 4)).concat(space).concat(string7.substring(4, 5)).concat(space).concat(string7.substring(5, 6).toUpperCase().concat(string7.substring(6, 12)).concat(",").concat(space)).concat(string7.substring(12, 13).toUpperCase().concat(string7.substring(13, 18))).concat(space).concat(string7.substring(18, 19)).concat(space).concat(string7.substring(19, 20).toUpperCase()).concat(string7.substring(20)).concat("!"));
        String string8 = "computer Applied science Applied Computer science science Applied computer Appleid computer Science Applied computer Applied";
        System.out.println(string8);
        System.out.println("The first occurrence of word Computer is: " + string8.indexOf("Computer"));
        System.out.println("String of strings: "+ string3.trim().concat(space).concat("is one ").concat(string4).concat(" the ").concat(string6.trim()).concat(" which provides ").concat(string8.substring(25, 42)).concat(string8.substring(92, 99)));
        
        //3
        
        int value1 = 27;
        int value2 = 4;
        System.out.println("27 power 4 is: " + Math.pow(value1, value2));
        System.out.println("Secant of 27 is: " + Math.round(1/Math.cos(value1)));
        double myNumber = 43.35;
        System.out.println("Square root of 43.35 is: " + Math.sqrt(myNumber));
        System.out.println("Ceil Value of 43.35 is: " + Math.ceil(myNumber));
        System.out.println("Floor value of 43.35 is: " + Math.floor(myNumber));
        System.out.println("The theoretical value of Tan(90) is: " + Math.tan(90));
        System.out.println("Square root for |Tan of 90| is: " + Math.sqrt(Math.abs(Math.tan(90))));
        System.out.println("The theoritical value of tan(90) is negative and square root of abosulte value of tan(90) is around 1.4");
        System.out.println("The Sine(50) is: " + Math.sin(50));
        System.out.println("The Cosine(50) is: " + Math.cos(50));
        System.out.println("Minimum value in Sin of 50 and Cos of 50 is: sin(50): " + Math.min(Math.sin(50), Math.cos(50)));
        
        int myNumber1 = 30;
        int myNumber2 = 60;        
        System.out.println("Cos(30)-rounded: " + Math.round(Math.cos(myNumber1)));
        System.out.println("Cos(60)-rounded: " + Math.round(Math.cos(myNumber2)));
        System.out.println("Tan(30)-rounded: " + Math.round(Math.tan(myNumber1)));
        System.out.println("Tan(60)-rounded: " + Math.round(Math.tan(myNumber2)));
        
        System.out.println("Trigonometry: " + Math.ceil(Math.abs(4 / Math.tan(value1)) * Math.pow(3, 2) / Math.sqrt(Math.pow(4, 2) + 5 * 3 * 2 + 3)));

        
        //Random Class
        Random gen = new Random();
        System.out.println("First Random value: " + gen.nextInt(300) + "\nSecond Random value: " + gen.nextInt(300) + "\nThird Random value: " + gen.nextInt(300) + "\nFourth Random value:" + gen.nextInt(300) + "\nFifth Random value: " + gen.nextInt() + "\nSixth Random value: " + gen.nextInt() + "\nSeventh Random value: " + gen.nextInt());
        //4b
        System.out.println("I am getting different output for each execution of the program");
        //System.out.println(generator.nextDouble(300));
        Random seedgen = new Random(10L);
        System.out.println("First Random value: " + seedgen.nextInt(300) + "\nSecond Random value: " + seedgen.nextInt(300) + "\nThird Random value: " + seedgen.nextInt(300) + "\nFourth Random value:" + seedgen.nextInt(300) + "\nFifth Random value: " + seedgen.nextInt() + "\nSixth Random value: " + seedgen.nextInt() + "\nSeventh Random value: " + seedgen.nextInt());
        //4d
        System.out.println("I am getting same output each time after running the progrm multiple times");
        //4e
        System.out.println("When seed is used, we are getting the same sequence of random numbers each time we run the program, but without seed we are getting different outputs");
        
        
        
                
        
        
        
        
        
        
    }
    
}
