// InKeyword/Task3.kt
package theInKeywordExercise3

fun isLowerCase(ch: Char): Boolean = if(ch in 'a'..'z') true else false;

fun main() {
  println(isLowerCase('A'))  // false
  println(isLowerCase('b'))  // true
}