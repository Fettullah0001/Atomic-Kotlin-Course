// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(s:String) {
    val length = s.length;
    var counter = 0
    while (length  !=counter){
        println(s[counter])
        counter++;
    }
}

fun main() {
displayContent("abc")
}
/* Expected output:
a
b
c
*/