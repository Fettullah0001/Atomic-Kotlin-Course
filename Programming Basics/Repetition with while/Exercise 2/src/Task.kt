// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var i: Int = number;
  var result :Int=0;
  var counter :Int=0;
  while(counter<=number){
    result+=i;
    i--;
    counter++;
  }
  return result;
}

fun main() {
  println(sum(10))  // 55
}