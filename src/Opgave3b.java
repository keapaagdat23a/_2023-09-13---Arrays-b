import java.util.Random;

public class Opgave3b {
  /*
  Opret et array med 100 tilfældige tal mellem 1 og 10. Udskriv index for den første og sidste forekomst af tallet 5.
  Udskriv arrayet (index og værdi for alle 100 elementer) og kontrollér ved selvsyn rigtigheden.
   */
  public static void main(String[] args) {
    new Opgave3b().run();
  }

  private void run() {
    int[] numbers = new int[10];
    Random random = new Random();

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = random.nextInt(10) + 1;
    }

    int firstOccurence = -1;
    int lastOccurence = -1;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 5 && firstOccurence == -1)
        firstOccurence = i;
      if (numbers[i] == 5)
        lastOccurence = i;
    }
    System.out.printf("First occurence of 5: Index %s.%n", firstOccurence == -1 ? "N/A" : firstOccurence);
    System.out.printf("Last occurence of 5: Index %s.%n", lastOccurence == -1 ? "N/A" : lastOccurence);

    System.out.println("\nThe whole array:");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(i + ": " + numbers[i]);
    }
  }
}
