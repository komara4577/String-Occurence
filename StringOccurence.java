import java.io.*;
import java.util.Scanner;

public class StringOccurence{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
      String str = "", word = "";
      
      System.out.println("Enter a sentence to check for String occurences: ");
      str = input.nextLine();
      
      System.out.println("Enter the word to check for: ");
      word = input.nextLine();
      
      System.out.println("The term " + word + " occurs " + countOccurence(str, word) + " time(s).");
   }
   
   public static int countOccurence(String str, String word){
      String a[] = str.split(" ");
      
      int count = 0;
      for(int i = 0; i < a.length; i++){
         if(word.equals(a[i]))
            count++;
      }
      
      return count;
   }
}