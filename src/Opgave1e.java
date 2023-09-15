import java.util.Arrays;
import java.util.Random;

/*
Opret et array af 10 tilfældige kommatal mellem 1 og 10.
Udskriv dernæst summen og gennemsnittet af værdierne.
 */
public class Opgave1e {
  public static void main(String[] args) {
    new Opgave1e().run();
  }

  private void run() {
    double[] numbers = new double[10];
    Random random = new Random();

    for (int i = 0; i < numbers.length; i++)
      numbers[i] = random.nextDouble(10) + 1;

    System.out.print(Arrays.toString(numbers));
  }
}
