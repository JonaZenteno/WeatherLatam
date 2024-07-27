package com.weatherlatam.db

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class WeatherDataInsertTest {
    @Test
    fun testInsertNewWeatherData() {
        val newData = mapOf(
            "temperature" to 25,
            "humidity" to 60,
            "location" to "Medellín"
        )
        val result = insertWeatherData(newData)
        assertTrue(result)
    }

    @Test
    fun testInsertWeatherDataWithMissingField() {
        val newData = mapOf(
            "temperature" to 25,
            "location" to "Cali"
        )
        val result = insertWeatherData(newData)
        assertFalse(result)
    }

    @Test
    fun testInsertWeatherDataWithInvalidValue() {
        val newData = mapOf(
            "temperature" to "invalid",
            "humidity" to 60,
            "location" to "Barranquilla"
        )
        val result = insertWeatherData(newData)
        assertFalse(result)
    }
}