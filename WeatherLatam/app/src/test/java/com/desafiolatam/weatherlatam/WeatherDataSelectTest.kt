package com.weatherlatam.db

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertInstanceOf
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class WeatherDataSelectTest {
    @Test
    fun testGetAllWeatherData() {
        val data = getAllWeatherData()
        assertInstanceOf(List::class.java, data)
        assertTrue(data.isNotEmpty())
        assertTrue(data.first().containsKey("temperature"))
        assertTrue(data.first().containsKey("humidity"))
        assertTrue(data.first().containsKey("location"))
    }

    @Test
    fun testGetWeatherDataByLocation() {
        val data = getWeatherDataByLocation("Bogotá")
        assertInstanceOf(List::class.java, data)
        assertTrue(data.isNotEmpty())
        data.forEach { assertTrue(it["location"] == "Bogotá") }
    }

    @Test
    fun testGetWeatherDataByTemperature() {
        val data = getWeatherDataByTemperature(20)
        assertInstanceOf(List::class.java, data)
        assertTrue(data.isNotEmpty())
        data.forEach { assertTrue(it["temperature"] == 20) }
    }
}