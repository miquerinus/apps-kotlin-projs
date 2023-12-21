fun stepsToCalories(numSteps: Int): Double {

    val caloriesBurnedForEachSteps: Double = 0.04
    val totalCaloriesBurned: Double = numSteps * caloriesBurnedForEachSteps
    return totalCaloriesBurned 
}


fun main() {

    val steps: Int = 4000
    val caloriesBurned: Double = stepsToCalories(steps) 
   
    println()
    println("=> Walking $steps burns $caloriesBurned calories")
    println()
}