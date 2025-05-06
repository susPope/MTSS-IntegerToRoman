////////////////////////////////////////////////////////////////////
// Alessandro Frison 2111932
// Riccardo Graziani 2101054
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
  public static String convert(int number) {
    // Definizione delle lettere romane e 
    // dei loro valori corrispondenti
    String[] romanLetters = {"D", "CD", "C", "XC", "L", 
                             "XL", "X", "IX", "V", "IV", 
                             "I"};
    int[] values = {500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    StringBuilder romanNumber = new StringBuilder();

    // Itera attraverso i valori romani e 
    // aggiungi le lettere corrispondenti
    for (int i = 0; i < values.length; i++) {
      while (number >= values[i]) {
        number -= values[i];
        romanNumber.append(romanLetters[i]);
      }
    }

    return romanNumber.toString();
  }
}
