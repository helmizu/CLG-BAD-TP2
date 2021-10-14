import java.util.Scanner;

public class TP2_1 {
    public static void main(String args[]) {
      int length, height, width, volume;
      Scanner input = new Scanner(System.in);
      try {
        System.out.print("Panjang = ");
        length = input.nextInt();
        if (length < 0) {
            throw new IllegalArgumentException();
        }
        
        System.out.print("Lebar = ");
        width = input.nextInt();
        if (width < 0) {
            throw new IllegalArgumentException();
        }
        
        System.out.print("Tinggi = ");
        height = input.nextInt();
        if (height < 0) {
            throw new IllegalArgumentException();
        }
        
        volume = length * height * width;
        System.out.println("Volumenya adalah = " + volume);
      } catch (IllegalArgumentException e) {
        System.out.println("Bilangan yang dimasukan harus positif");
      }
    }
}