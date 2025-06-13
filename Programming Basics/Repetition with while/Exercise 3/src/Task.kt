// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
  var result :Int=0;
  var i:Int=n;
  var counter :Int=0;
  while(counter <=n){
    if(i%2==0 || i%2==2){
      result+=i;
    }
    counter++;
    i--;
  }
  return result;
}

fun main() {
  println(sumOfEven(10))  // 30
}