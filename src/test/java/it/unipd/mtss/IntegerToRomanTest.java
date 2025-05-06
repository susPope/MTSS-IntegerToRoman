////////////////////////////////////////////////////////////////////
// Alessandro Frison 2111932
// Riccardo Graziani 2101054
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {

  @Test
  public void testConversionArabToRoman() {
    assertEquals("I", IntegerToRoman.convert(1));
    assertEquals("II", IntegerToRoman.convert(2));
    assertEquals("III", IntegerToRoman.convert(3));
    assertEquals("IV", IntegerToRoman.convert(4));
    assertEquals("V", IntegerToRoman.convert(5));
    assertEquals("VI", IntegerToRoman.convert(6));
    assertEquals("VII", IntegerToRoman.convert(7));
    assertEquals("VIII", IntegerToRoman.convert(8));
    assertEquals("IX", IntegerToRoman.convert(9));
    assertEquals("X", IntegerToRoman.convert(10));
    assertEquals("XV", IntegerToRoman.convert(15));
    assertEquals("XIX", IntegerToRoman.convert(19));
    assertEquals("XX", IntegerToRoman.convert(20));
  }
}
