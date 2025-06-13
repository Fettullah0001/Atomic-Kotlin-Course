// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Long, minutes: Long, seconds: Long): Long =
  (((hours*60+minutes)*60+seconds)*1000L)

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}