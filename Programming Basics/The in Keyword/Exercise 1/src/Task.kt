// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var result:String=""
  for(ch in 'a'..'z'){
    result +=ch
  }
  return result
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}