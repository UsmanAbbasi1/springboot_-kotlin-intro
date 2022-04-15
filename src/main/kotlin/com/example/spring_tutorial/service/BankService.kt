package com.example.spring_tutorial.service

import com.example.spring_tutorial.mock.MockBankDataSource
import com.example.spring_tutorial.model.Bank

class BankService(val bankDataSource: MockBankDataSource) {

    fun getBanks(): Collection<Bank> = bankDataSource.retrieveBanks()
}