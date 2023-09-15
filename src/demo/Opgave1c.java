package demo;

import java.util.Random;

/*
Opret et array med 100 tilfældige tal mellem 1 og 10. Udskriv hvor mange gange tallet 5 forekommer i arrayet.
Udskriv arrayet, så du kan kontrollere rigtigheden.
 */
public class Opgave1c {
  public static void main(String[] args) {
    new Opgave1c().run();
  }

  private void run() {
    int[] numbers = new int[100];
    Random random = new Random();

    for (int i = 0; i < 100; i++)
      numbers[i] = random.nextInt(10) + 1;

    int occurenciesOfFive = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 5)
        occurenciesOfFive++;
      System.out.println(numbers[i]);
    }
    System.out.printf("%nThe number 5 appears %d times in the list.%n", occurenciesOfFive);
  }
}
