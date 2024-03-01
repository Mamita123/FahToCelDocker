package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class KelvinToFahrenheitTest extends TestCase {
    @Test
    public void testKelvinToFahrenheit() {
        // Test case with 300.1 Kelvin
        double kelvinTemperature = 300.1;
        double expectedFahrenheitTemperature = 80.5;
        double actualFahrenheitTemperature = KelvinToFahrenheit.kelvinToFahrenheit(kelvinTemperature);
        assertEquals(expectedFahrenheitTemperature, actualFahrenheitTemperature,0.1);
    }

}