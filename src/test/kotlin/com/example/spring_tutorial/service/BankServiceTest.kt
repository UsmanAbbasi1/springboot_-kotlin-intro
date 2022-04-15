package com.example.spring_tutorial.service

import com.example.spring_tutorial.mock.MockBankDataSource
import com.example.spring_tutorial.model.Bank
import com.nhaarman.mockitokotlin2.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito
import com.nhaarman.mockitokotlin2.mock

internal class BankServiceTest {

    private var mockDataSource = mock<MockBankDataSource>()

    @Test
    fun `test data service called`() {

        val bankService = BankService(mockDataSource)
        bankService.getBanks()

        verify(mockDataSource, Mockito.times(1)).retrieveBanks()
    }
}