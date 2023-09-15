import java.util.Arrays;
import java.util.Random;

/*
Opret et array af 10 heltal. Giv elementerne værdierne 0-9, så element nr. 0 har værdien 0,
element nr. 1 har værdien 1 osv. Det klarer du nemt med en enkel for-løkke. Udskriv dernæst værdierne.
 */
public class Opgave1a {
  public static void main(String[] args) {
    new Opgave1a().run();
  }

  private void run() {
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++)
      numbers[i] = i;

    System.out.println(Arrays.toString(numbers));
  }
}
