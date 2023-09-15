import java.util.Random;

/*
Skriv en metode, der simulerer et terningkast og returnerer værdien.
Skriv en ny metode, der opretter et array med 6 heltal.
Hver plads skal indeholde summen af hvor mange 1’ere, 2’ere osv. du får ved et terningkast.
Kast terningen 1000 gange og udskriv hvor mange 1’ere og 2’ere osv. du har slået.
 */

public class Opgave3d {

  public static void main(String[] args) {
    new Opgave3d().run();
  }

  int rollDice() {
    Random random = new Random();
    return random.nextInt(6) + 1;
  }

  private void run() {
    int[] numbers = new int[1000];
    int[] occurencies = new int[6];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rollDice();
      occurencies[numbers[i] - 1]++;
      }

    for (int i = 0; i < occurencies.length; i++) {
      System.out.printf("%d's: %d.%n", i + 1, occurencies[i]);
    }
  }
}
