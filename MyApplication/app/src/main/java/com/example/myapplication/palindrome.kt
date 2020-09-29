package com.example.myapplication

import java.util.*

fun isPalindromeString(inputStr: String): Boolean {
    val sb = StringBuilder(inputStr)

    //reverse the string
    val reverseStr = sb.reverse().toString()

    //compare reversed string with input string
    return inputStr.equals(reverseStr, ignoreCase = true)
}
fun main(args: Array<String>) {
    //Input Stream
    val sc = Scanner(System.`in`)
    //Input String Value
    println("masukkan kata : ")
    var inString: String = sc.nextLine()

    //Call function to check String
    inString = inString.replace("\\s+".toRegex(), "")
    val regex = Regex("[^\\w]")
    val result = regex.replace(inString, "")

    print(result)

    if (isPalindromeString(result)) {
        println("$result is a Palindrome String")
    } else {
        println("$result is not a Palindrome String")
    }


}