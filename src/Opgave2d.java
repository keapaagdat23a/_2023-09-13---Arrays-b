/*
Opret et array med 5 chars. Læg tilfældige chars mellem ’A’ og ’Z’ ind på pladserne.
Udskriv arrayet på én linje. Udskriv det igen på én linje, denne gang bagfra.
 */

import java.util.Random;

public class Opgave2d {
  public static void main(String[] args) {
    new Opgave2d().run();
  }

  private void run() {
    Random random = new Random();
    char[] chars = new char[5];

    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char) (random.nextInt('Z' - 'A' + 1) + 'A');
    }

    for (int i = 0; i < chars.length; i++) {
      System.out.print(chars[i]);
    }
    System.out.println();

    for (int i = chars.length - 1; i >= 0; i--) {
      System.out.print(chars[i]);
    }
    System.out.println();
  }
}
