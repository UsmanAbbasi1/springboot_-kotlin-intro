package com.example.spring_tutorial.controller

import com.example.spring_tutorial.model.Bank
import com.example.spring_tutorial.service.BankService
import com.nhaarman.mockitokotlin2.mock
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito

class BankControllerTest {

    private lateinit var controller: BankController

    @Mock
    private var bankService = mock<BankService>()

    @BeforeEach
    fun setUp(){
        this.controller = BankController(bankService)
    }

    @Test
    fun `test controller returns data`(){
        Mockito.`when`(bankService.getBanks()).thenReturn(
            listOf(
                Bank("1234", 12.0, 10)
            )
        )

        var banks = controller.getBanks()
//        TODO("Add assertions")
    }
}