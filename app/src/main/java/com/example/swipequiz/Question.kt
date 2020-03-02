package com.example.swipequiz

data class Question (
    var question: String,
    var answer: String
) {
    companion object {
        val QUESTIONS = arrayOf(
            "Test 1",
            "Test 2",
            "Test 3",
            "Test 4"
        )

        val ANSWERS = arrayOf(
            "True",
            "True",
            "True",
            "False"
        )
    }
}
