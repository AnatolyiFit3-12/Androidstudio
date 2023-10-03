package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    open class Animal(val name: String, val age: Int) {
        open fun makeSound() {
            println("Тварина виробляє звук")
        }

        open fun move() {
            println("Тварина рухається")
        }
    }
    class Dog(name: String, age: Int) : Animal(name, age) {
        override fun makeSound() {
            println("$name гавкає")
        }

        fun fetch() {
            println("$name принесла м'яч")
        }
    }
    class Bird(name: String, age: Int) : Animal(name, age) {
        override fun makeSound() {
            println("$name співає")
        }

        fun fly() {
            println("$name летить")
        }
    }
    class Fish(name: String, age: Int) : Animal(name, age) {
        override fun move() {
            println("$name плаває")
        }

        fun breatheUnderwater() {
            println("$name дихає під водою")
        }
    }

    fun main() {
        val dog = Dog("Рекс", 3)
        val bird = Bird("Попугай", 2)
        val fish = Fish("Золота рибка", 1)

        dog.makeSound()
        dog.fetch()

        bird.makeSound()
        bird.fly()

        fish.move()
        fish.breatheUnderwater()
    }

}