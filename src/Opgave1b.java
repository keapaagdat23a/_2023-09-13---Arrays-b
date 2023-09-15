import java.util.Arrays;
import java.util.Random;

/*
Opret et array af 10 heltal og læg tilfældige tal mellem 1 og 100 ind på alle pladserne.
Udskriv dernæst værdierne.
 */
public class Opgave1b {
  public static void main(String[] args) {
    new Opgave1b().run();
  }

  private void run() {
    Random random = new Random();
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(100) + 1;
    }

    System.out.println(Arrays.toString(numbers));
  }
}
