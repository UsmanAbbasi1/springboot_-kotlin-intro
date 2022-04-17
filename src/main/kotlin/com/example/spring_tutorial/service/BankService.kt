package com.example.spring_tutorial.service

import com.example.spring_tutorial.mock.MockBankDataSource
import com.example.spring_tutorial.model.Bank
import org.springframework.stereotype.Service


@Service
class BankService constructor(val bankDataSource: MockBankDataSource) {

    fun getBanks(): Collection<Bank> = bankDataSource.retrieveBanks()

    fun getBank(accountNumber: String): Bank = bankDataSource.retrieveBank(accountNumber)
}