package demo;

import java.util.Random;

public class CreateArrays {
  void run() {

    // Create array

    int number; // This is NOT an array :)
    int[] numbers;
    int[] moreNumbers = new int[4];

    Random random = new Random();
    for (int i = 0; i < moreNumbers.length; i++) {
      moreNumbers[i] = random.nextInt(); // Assign value to element number i
    }

    for (int i = 0; i < moreNumbers.length; i++)
      System.out.println(moreNumbers[i]); // Print element number i

    // Count number of occurencies

    int[] handyNumbers = new int[100];
    for (int i = 0; i < handyNumbers.length; i++) {
      handyNumbers[i] = random.nextInt(10) + 1;
    }

    System.out.println("Occurencies of 5:");
    for (int i = 0; i < handyNumbers.length; i++) {
      if (handyNumbers[i] == 5) {
        System.out.println(i);
      }
    }

    System.out.println("First occurence of 5:");
    boolean firstFound = false;
    for (int i = 0; i < handyNumbers.length; i++) {
      if (!firstFound) {
        if (handyNumbers[i] == 5) {
          System.out.println(i);
          firstFound = true;
        }
      }
    }

    System.out.println("Last occurence of 5:");
    boolean lastFound = false;
    for (int i = handyNumbers.length - 1; i >= 0; i--) {
      if (!lastFound) {
        if (handyNumbers[i] == 5) {
          System.out.println(i);
          lastFound = true;
        }
      }
    }


    System.out.println("The whole thing:");
    for (int i = 0; i < handyNumbers.length; i++) {
      System.out.println("Index " + i + ": " + handyNumbers[i]);
    }
  }

  public static void main(String[] args) {
    new CreateArrays().run();
  }
}
