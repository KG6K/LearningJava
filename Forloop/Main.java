package Java.ForLoop;

import Java.ForLoop.Patient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    System.out.println("Learning forloop");

    // forloops can be used to itrate(read) collection (Array,ArrayList,Set)
    String[] names = {"Ashiq", "Alim", "Faizan"};

    for (int i = 0; i < names.length; i++) {

      if (names[i] == "Alim") {

        System.out.println("Found " + names[i] + " at " + i);
      }
    }
    // forloops can be used to find something from collection
    // forloops can be to put or take multiple objects at once
    String[] students = new String[3];

    Scanner scanner = new Scanner(System.in);
    String input;

    for (int x = 0; x < students.length; x++) {
      System.out.println("Enter the names of students");

      input = scanner.next();
      students[x] = input;
    }
    System.out.println(Arrays.toString(students));

    ArrayList<String> colour = new ArrayList<>();
    colour.add("Red");
    colour.add("Blue");
    colour.add("Green");

    for (String x : colour) {

      System.out.println(x);
      if (x.equals("Blue")) {
        break;
      }
    }

    ArrayList<Patient> patients = new ArrayList<>();
    patients.add(new Patient("Tom", 26));
    patients.add(new Patient("Dick", 73));

    System.out.println("Search Patient by Name :");

    input = scanner.next();
    // searching in Array of Object

    boolean found = false;

    if (!found) {

      for (Patient p : patients) {

        if (p.getName().equals(input)) {

          found = true;
        }
      }
    } else {

      found = false;
    }

    if (found) {

      System.out.println("Found " + input);
    } else {

      System.out.println("There is no " + input);
    }
  }
}
