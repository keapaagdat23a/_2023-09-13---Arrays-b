import java.util.Arrays;

// NEW

public class Opgave4a {
  int[] numbersA = new int[10];
  int[] numbersB = new int[10];

  public static void main(String[] args) {
    new Opgave4a().run();
  }

  void initArrays() {
    for (int i = 0; i < numbersA.length; i++) {
      numbersA[i] = 1;
      numbersB[i] = 2;
    }
  }

  private void run() {
    initArrays();
    printArrays("FIRST ROUND", numbersA, numbersB);

    // Uncomment ONE of the following lines at a time:
    // numbersB = numbersA;
    // numbersB = numbersA.clone();
    // numbersB = Arrays.copyOf(numbersA, numbersB.length);
    // System.arraycopy(numbersA, 0, numbersB, 0, numbersA.length);

    numbersA[5] = 3;
    numbersB[5] = 4;

    printArrays("SECOND ROUND", numbersA, numbersB);
  }

  private void printArrays(String s, int[] a, int[] b) {
    System.out.println(s);
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }
  }
}
