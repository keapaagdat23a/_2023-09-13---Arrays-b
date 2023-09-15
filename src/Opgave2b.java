/*
Opret et array af 10 tilfældige heltal mellem 1 og 100. Brug en for-løkke til at beregne gennemsnittet af tallene.
 */

import java.util.Random;

public class Opgave2b {
  public static void main(String[] args) {
    new Opgave2b().run();
  }

  private void run() {
    Random random = new Random();
    int[] numbers = new int[10];
    int sum = 0;
    double average;

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100) + 1;
      sum += numbers[i];
    }

    average = (double) (sum) / numbers.length;
    System.out.print("Average: " + average);
  }
}
