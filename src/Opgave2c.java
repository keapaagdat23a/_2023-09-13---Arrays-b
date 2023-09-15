/*
Opret et array af 10 tilfældige heltal mellem 100 og 999.
Udskriv først tallene og dernæst største og mindste tal samt gennemsnittet. Brug en for-løkke til dette.
 */

import java.util.Random;

public class Opgave2c {
  public static void main(String[] args) {
    new Opgave2c().run();
  }

  private void run() {
    int[] numbers = new int[10];
    Random random = new Random();
    int sum = 0;
    double average = 0;

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(999 - 100 + 1) + 100;
      sum += numbers[i];
    }

    average = (double) sum / numbers.length;
    System.out.printf("%nSum: %d.%nAverage: %.1f.%n", sum, average);
  }
}
