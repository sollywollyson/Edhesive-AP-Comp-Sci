/*
 * Lesson 3 - Unit 1 - User Input and Variables 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class t1_lesson03_template{


     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
 
          String snack;
 
          System.out.println("What is your favorite snack?");
          snack = scan.nextLine();
          System.out.println( snack + ", that sounds delicious!");
      
          

     }

}


