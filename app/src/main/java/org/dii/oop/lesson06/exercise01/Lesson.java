package org.dii.oop.lesson06.exercise01;

import java.util.Scanner;
import java.util.ArrayList; //this exercise MUST use arrayList

public class Lesson {
    public static void run() {

        //HINT1: usage arraylist with Shape class to store all of your shapes, check how to use arrayList by yourself

        //HINT2: you may want to declare your arrayList around here

        Scanner in = new Scanner(System.in);

        do {
            System.out.println();
            //print menu as instructed in MD file

            String choice = in.nextLine().trim();

            // TODO: write your code here

            if ("1".equals(choice)) {
                System.out.print("Enter radius: ");
                String strRadius = in.nextLine();
                
                //store to arrayList
            }
            if ("2".equals(choice)) {
                System.out.print("Enter width: ");
                String strWidth = in.nextLine();
                System.out.print("Enter height: ");
                String strHeight = in.nextLine();
                
                //store to arrayList
            }
            if ("3".equals(choice)) {
                System.out.print("Enter side: ");
                String strSide = in.nextLine();
                
                //store to arrayList
            }
            if ("4".equals(choice)) {
                System.out.print("List all shape: ");
                
                //print data as instructed
                //check how to iterate through arrayList

                //HINT3: you can use getClass() function of arrayList to get the name of class. It might be useful : )
            }
            if ("5".equals(choice)) {
                 break;
            }
           
        } while(true);

        in.close();
    }
}