package com.example.spring_tutorial.mock

import com.example.spring_tutorial.datasource.BankDataSource
import com.example.spring_tutorial.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    var banks = listOf(
        Bank("1234", 1.0, 10),
        Bank("1235", 1.0, 5)
    )

    override fun retrieveBanks(): Collection<Bank> {
        return banks
    }

    override fun retrieveBank(accountNumber: String): Bank {
        return banks.first { it.accountNumber == accountNumber }
    }

}