import java.util.Random;

/*
Opret et array af 10 chars. Læg bogstaverne ’a’-’j’ ind på pladserne. Udskriv dernæst værdierne.
 */
public class Opgave1c {
  public static void main(String[] args) {
    new Opgave1c().run();
  }

  private void run() {
    char[] chars = new char[10];
    Random random = new Random();

    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char)(random.nextInt(10) + 'a');
    }

    System.out.println(chars);
  }
}
