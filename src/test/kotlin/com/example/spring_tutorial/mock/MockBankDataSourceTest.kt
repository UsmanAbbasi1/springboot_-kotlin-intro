package com.example.spring_tutorial.mock

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest{
    private val mockBankDataSource = MockBankDataSource()

    @Test
    fun `should provide collection of banks`(){
        val banks = mockBankDataSource.retrieveBanks()
        assertNotNull(banks)

    }
}