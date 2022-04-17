package com.example.spring_tutorial.datasource

import com.example.spring_tutorial.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
}