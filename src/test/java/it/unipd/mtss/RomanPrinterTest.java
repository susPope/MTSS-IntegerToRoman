////////////////////////////////////////////////////////////////////
// Alessandro Frison 2111932
// Riccardo Graziani 2101054
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanPrinterTest {

  @Test
  public void testPrintingExpectedOutput() {
    assertEquals(
      "  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", 
      RomanPrinter.print(1)
    );
    assertEquals(
      "  _____   _____ \n |_   _| |_   _|\n   | |     | |  \n   | |     | |  \n  _| |_   _| |_ \n |_____| |_____|\n",
      RomanPrinter.print(2)
    );
    assertEquals(
      "  _____   _____   _____ \n |_   _| |_   _| |_   _|\n   | |     | |     | |  \n   | |     | |     | |  \n  _| |_   _| |_   _| |_ \n |_____| |_____| |_____|\n",
      RomanPrinter.print(3)
    );
  }
}
