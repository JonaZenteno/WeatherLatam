package com.weatherlatam.db

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class WeatherDataDeleteTest {
    @Test
    fun testDeleteWeatherDataByLocation() {
        val result = deleteWeatherDataByLocation("Medellín")
        assertTrue(result)
    }

    @Test
    fun testDeleteWeatherDataByTemperature() {
        val result = deleteWeatherDataByTemperature(25)
        assertTrue(result)
    }

    @Test
    fun testDeleteWeatherDataWithNonExistentData() {
        val result = deleteWeatherDataByLocation("Non-existent City")
        assertFalse(result)
    }
}