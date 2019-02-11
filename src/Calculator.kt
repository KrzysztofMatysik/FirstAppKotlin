fun main(args:Array<String>){

    var number1 : Double?
    var number2 : Double?

    println("Please input first number1: ")
    number1 = readLine()!!.toDouble()

    println("Please input first number2: ")
    number2 = readLine()!!.toDouble()

    println("Addition: "+ (number1+number2))

    println("Subtraction: " + (number1-number2))
    println("Multiplication: " + (number1*number2))
    println("Division: " + (number1/number2))
}