package com.example.spring_tutorial.controller

import com.example.spring_tutorial.model.Bank
import com.example.spring_tutorial.service.BankService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1/banks/")
@RestController
class BankController(private val bankService: BankService) {

    @ExceptionHandler(NoSuchElementException::class)
    fun exceptionHandler(e: NoSuchElementException): ResponseEntity<String> {
        return ResponseEntity(e.message, HttpStatus.NOT_FOUND)
    }

    @GetMapping
    fun getBanks(): Collection<Bank> {
        return bankService.getBanks()
    }

    @GetMapping("{accountNumber}")
    fun getBank(@PathVariable accountNumber: String): Bank {
        return bankService.getBank(accountNumber)
    }
}