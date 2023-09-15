/*
Opret et array af 3 Strings. Læg værdierne ”Rip”, ”Rap” og ”Rup” ind på pladserne. Udskriv dernæst værdierne.
 */
public class Opgave1d {
  public static void main(String[] args) {
    new Opgave1d().run();
  }

  private void run() {
    String[] strings = new String[3];
    strings[0] = "Rip";
    strings[1] = "Rap";
    strings[2] = "Rup";

    for (int i = 0; i < strings.length; i++) {
      System.out.println(strings[i]);
    }
  }
}
