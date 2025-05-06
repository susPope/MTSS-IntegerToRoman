//////////////////////////////////////////////////////////////////
// Alessandro Frison 2111932
// Riccardo Graziani 2101054
//////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

  public static String print(int num) {
    return printAsciiArt(IntegerToRoman.convert(num));
  }

  private static String printAsciiArt(String romanNumber) {
    StringBuilder asciiArt = new StringBuilder();

    // Definisce la rappresentazione ASCII art 
    // orizzontale per ogni lettera romana
    String[][] asciiLetters = {
      {// Riga1
        "  _____ " // I
      },

      {// Riga2
        " |_   _|" // I
      },

      {// Riga3
        "   | |  " // I
      },

      {// Riga4
        "   | |  " // I
      },
      
      {// Riga5
        "  _| |_ " // I
      },
      
      {// Riga6
        " |_____|" // I
      },
    };
    
    String supportedLetters = "I";
    
    for (int z = 0; z < asciiLetters.length; z++) {
      for (char c : romanNumber.toCharArray()) {
        // Aggiunge la rappresentazione ASCII art 
        // orizzontale della lettera corrente
        asciiArt.append(
            asciiLetters[z][supportedLetters.indexOf(c)]
        );
      }
      asciiArt.append("\n");
    }
    return asciiArt.toString();
  }
}
