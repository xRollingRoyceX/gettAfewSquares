/*
 * @author root
 */
import java.util.Scanner;
        public class metaD{
public static void main(String args[]){
    int y= 0;
    int x = 0;
    int input;
   
    Scanner keys = new Scanner(System.in);
    
    System.out.println("enter a number to get it squared.");
    input = keys.nextInt();
    
    y = input* input;
    x = input;
    for(input = 0; input < 1; input++)
    {
        System.out.println(x + " | " + y +" | "+ y*y +" | " + y*y*y );
    }
}}

