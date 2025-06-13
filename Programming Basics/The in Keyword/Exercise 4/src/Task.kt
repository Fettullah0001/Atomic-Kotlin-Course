// InKeyword/Task4.kt
package theInKeywordExercise4

fun isValidCharacter (ch: Char): Boolean{
  if(ch in 'a'..'z'||ch in 'A'..'Z'||ch in '0'..'9' || ch =='_'){return true}else return false
}

fun isValidIdentifier(s: String): Boolean {
  if(s.isEmpty()){return false}
  else if(s[0] in '0'..'9'){return false}
  else {
    for (c in s){
      if(!isValidCharacter(c)){
        return false;
      }
    }
    return true;
  }

}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}