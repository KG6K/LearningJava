package Java.NastedStatement;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    System.out.println("Which job do you want ?");
    Scanner scanner = new Scanner(System.in);
    int input;
    System.out.println("\t1.Packer" + "\n\t2.Core" + "\n\t3.Non-Core" + "\n\t4.Cashier");

    input = scanner.nextInt();

    if (input == 1) {

      System.out.println("\t1.Full Time" + "\n\t2.Part Time");

      input = scanner.nextInt();

      if (input == 1) {

        System.out.println("You can join from tomorrow");

      } else {
        System.out.println("Part time isn't available ");
      }
    }
    if (input == 2) {

      System.out.println("\t1.Full Time" + "\n\t2.Part Time");

      input = scanner.nextInt();

      if (input == 1) {

        System.out.println("You can join from tomorrow");
      } else {

        System.out.println("Part time isn't available ");
      }
    }
    if (input==3) {

      System.out.println("\t1.Full Time" + "\n\t2.Part Time");

      input = scanner.nextInt();

      if (input == 1) {

        System.out.println("You can join from tomorrow");

      } else {
        System.out.println("Part time isn't available ");
      }
    }
    if (input == 4) {

      System.out.println("\t1.Full Time" + "\n\t2.Part Time");

      input = scanner.nextInt();

      if (input == 1) {

        System.out.println("You can join from tomorrow");

      } else {
        System.out.println("Part time isn't available ");
      }
    }
    scanner.close();
  }
}
