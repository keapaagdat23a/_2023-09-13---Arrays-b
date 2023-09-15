/*
Opret et array af tre kommatal. Læg tilfældige kommatal mellem 0 og 10 ind på pladserne.
Udskriv dernæst værdierne og summen af værdierne.
 */

import java.util.Random;

public class Opgave2a {
  public static void main(String[] args) {
    new Opgave2a().run();
  }

  private void run() {
    double[] numbers = new double[3];
    Random random = new Random();

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextDouble(10);
    }

    double sum = 0;
    for (int i = 0; i < numbers.length; i++)
      sum += numbers[i];
    System.out.printf("%nThe sum of %f, %f and %f is %f.%n", numbers[0], numbers[1], numbers[2], sum);
  }
}
