import java.util.Arrays;
import java.util.Random;

/*
Opret et array af 10 tilfældige heltal mellem 1 og 100.
Brug en for-løkke til at udskrive alle tal mellem 40 og 49.
 */
public class Opgave1f {
  public static void main(String[] args) {
    new Opgave1f().run();
  }

  private void run() {
    int[] numbers = new int[10];
    Random random = new Random();

    for (int i = 0; i < numbers.length; i++)
      numbers[i] = random.nextInt(100) + 1;

    System.out.println(Arrays.toString(numbers));
  }
}
