package com.example.spring_tutorial.controller

import com.example.spring_tutorial.model.Bank
import com.example.spring_tutorial.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BankController(private val bankService: BankService) {

    @GetMapping("/api/v1/banks")
    fun getBanks(): Collection<Bank> {
        return bankService.getBanks()
    }
}