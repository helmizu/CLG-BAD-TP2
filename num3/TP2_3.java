import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class TP2_3 {
    public static void main(String args[]) {
      int in1, in2, in3;
      Scanner input = new Scanner(System.in);
      try {
        System.out.print("Bilangan Ke-1: ");
        if (input.hasNextInt()) {
            in1 = input.nextInt();
        } else {
            throw new NumberFormatException();
        }
        
        System.out.print("Bilangan Ke-2: ");
        if (input.hasNextInt()) {
            in2 = input.nextInt();
        } else {
            throw new NumberFormatException();
        }
     
        System.out.print("Bilangan Ke-3: ");
        if (input.hasNextInt()) {
            in3 = input.nextInt();
        } else {
            throw new NumberFormatException();
        }
        
        Integer[] cols = { in1, in2, in3 };
        int min = Collections.min(Arrays.asList(cols));
        int max = Collections.max(Arrays.asList(cols));
        System.out.println("Nilai Minimum: " + min);
        System.out.println("Nilai Maximum: " + max);
        
      } catch (NumberFormatException e) {
        System.out.println("Harus Bilangan");
      }
    }
}