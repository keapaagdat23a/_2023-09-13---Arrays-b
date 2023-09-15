import java.util.Random;

public class Opgave3a {
  /*
  Opret et array med 10 tilfældige heltal mellem 0 og 100. Brug en for-løkke til at finde indexet for arrayets
  mindste og største tal. Udskriv både index og tallene (fx ”Største tal er 87 på index 14.
  Mindste tal er 4 med index 24.”)
   */

  public static void main(String[] args) {
    new Opgave3a().run();
  }

  private void run() {
    int[] numbers = new int[100];
    Random random = new Random();

    // Init elements
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(101);
    }

    // Find greatest number
    int greatestNumber = 0;
    int greatestNumberIndex = -1;
    for (int i = 0; i < numbers.length; i++)
      if (numbers[i] > greatestNumber) {
        greatestNumber = numbers[i];
        greatestNumberIndex = i;
      }
    System.out.printf("The greatest number is %d at index %d.%n", greatestNumber, greatestNumberIndex);

    // Find smallest number
    int smallestNumber = 100;
    int smallestNumberIndex = -1;
    for (int i = 0; i < numbers.length; i++)
      if (numbers[i] < smallestNumber) {
        smallestNumber = numbers[i];
        smallestNumberIndex = i;
      }
    System.out.printf("The smallest number is %d at index %d.%n", smallestNumber, smallestNumberIndex);
  }
}
