import java.util.Arrays;
import java.util.Scanner;

/*
Opret et array af tre Strings.
Brug en while eller do-while til at bede brugeren om tre navne, der skal ind på de tre pladser i arrayet.
Udskriv dernæst værdierne.
 */
public class Opgave1g {
  public static void main(String[] args) {
    new Opgave1g().run();
  }

  private void run() {
    String[] names = new String[3];
    for (int i = 0; i < names.length; i++) {
      names[i] = askName(i);
    }

    for (int i = 0; i < names.length; i++)
      System.out.print(names[i] + (i == names.length - 1 ? "." : ", "));
  }

  private String askName(int i) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter name #" + (i + 1) + ": ");
    String name = in.nextLine();
    return name;
  }
}
