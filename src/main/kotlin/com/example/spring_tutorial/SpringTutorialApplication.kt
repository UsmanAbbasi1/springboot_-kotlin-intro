package com.example.spring_tutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringTutorialApplication

fun main(args: Array<String>) {
    runApplication<SpringTutorialApplication>(*args)
}


@RestController
class MessageResource {
    //	@GetMapping
//	fun index(): List<Message> = listOf(
//		Message(1,"hello 1"),
//		Message(2,"hello 2"),
//	)
    @GetMapping
    fun index(): List<Message> {
        return listOf(
            Message(1, "hello 1"),
            Message(2, "hello 2"),
            Message(3, "hello 3"),
        )
    }
}



data class Message(val id: Int, val text: String)