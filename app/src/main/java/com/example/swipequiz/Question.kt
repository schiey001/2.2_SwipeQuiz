package com.example.swipequiz

data class Question (
    var question: String,
    var answer: String
) {
    companion object {
        val QUESTIONS = arrayOf(
            "Grass is green",
            "Milk is white",
            "Cat says miauw",
            "Dog says miauw",
            "Cow says moooh",
            "Chicken says tok tok",
            "Pig says tok tok",
            "Water is purple",
            "Snow is red",
            "Snow is white",
            "Grass is green",
            "Milk is white",
            "Cat says miauw",
            "Dog says miauw",
            "Cow says moooh",
            "Chicken says tok tok",
            "Pig says tok tok",
            "Water is purple",
            "Snow is red",
            "Snow is white"
        )

        val ANSWERS = arrayOf(
            "True",
            "True",
            "True",
            "False",
            "True",
            "True",
            "False",
            "False",
            "False",
            "True",
            "True",
            "True",
            "True",
            "False",
            "True",
            "True",
            "False",
            "False",
            "False",
            "True"
        )
    }
}
