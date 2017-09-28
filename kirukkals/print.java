import java.util.Scanner;
public class print {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a small number: ");
    byte number = scanner.nextByte();
    System.out.println("The number is: " + number);
  }
}
