////////////////////////////////////////////////////////////////////
// Alessandro Frison 2111932
// Riccardo Graziani 2101054
////////////////////////////////////////////////////////////////////

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
        "   _____ ",  // C
        "  _      ",  // L
        " __   __",  // X
        " __      __",  // V
        "  _____ " // I
      },

      {// Riga2
        "  / ____|", // C
        " | |     ",  // L
        " \\ \\ / /",  // X
        " \\ \\    / /",  // V
        " |_   _|" // I
      },

      {// Riga3
        " | |     ",  // C
        " | |     ",  // L
        "  \\ V / ",  // X
        "  \\ \\  / / ",  // V
        "   | |  " // I
      },

      {// Riga4
        " | |     ", // C
        " | |     ", // L
        "   > <  ", // X
        "   \\ \\/ /  ", // V
        "   | |  " // I
      },
      
      {// Riga5
        " | |____ ", // C
        " | |____ ", // L
        "  / . \\ ", // X
        "    \\  /   ", // V
        "  _| |_ " // I
      },
      
      {// Riga6
        "  \\_____|", // C
        " |______|", // L
        " /_/ \\_\\", // X
        "     \\/    ", // V
        " |_____|" // I
      },
    };
    
    String supportedLetters = "CLXVI";
    
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
