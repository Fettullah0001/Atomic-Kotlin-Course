// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  var i:Int =1
  var result :Long=1;
  for(i in 1..n ){
    result*=i
  }
  return result;
}

fun main() {
  println(factorial(10))  // 3628800
}