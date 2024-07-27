
package com.weatherlatam.utils

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TemperatureConversionTest {
    @Test
    fun testCelsiusToFahrenheit() {
        assertEquals(32.0, celsiusToFahrenheit(0.0))
        assertEquals(50.0, celsiusToFahrenheit(10.0))
        assertEquals(68.0, celsiusToFahrenheit(20.0))
    }

    @Test
    fun testFahrenheitToCelsius() {
        assertEquals(0.0, fahrenheitToCelsius(32.0))
        assertEquals(10.0, fahrenheitToCelsius(50.0))
        assertEquals(20.0, fahrenheitToCelsius(68.0))
    }
}