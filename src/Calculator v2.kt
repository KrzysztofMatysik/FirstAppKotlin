import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>) {

    var firstNum: Double? = null
    var secNum: Double? = null
    var counter: Int = 0
    var text = arrayOf("first", "secound")

//    println(text[0] + " --- " +  text.size)
//    println(text[1] + " --- " +  text.size)
//    println(text[2] + " --- " +  text.size)
//    text[0] = "first"
//    text[1] = "secound"
//    text[2] = "third"
//
//    println(text[0])
//    println(text[1])
//    println(text[2])
//
//    var secArray = emptyArray<String>()
//    println(secArray.size)
//    secArray = arrayOf("a","v","s")
//    println(secArray[2] + " --- " +  secArray.size)
//    secArray[2] = "Bla"
//    println(secArray[2] + " --- " +  secArray.size)

    do {
        print("Enter " + text[counter] + " number: ")
        var number = readLine()!!.toDoubleOrNull()
        if (number is Double) {

            if (counter == 0) {
                firstNum = number
                counter++
            } else if (counter == 1) {
                secNum = number
                counter++
            }

        } else {
            println("This is not Double number!!! Please try again!")
        }
    } while (counter < 2)


    println("Do exit. Number 1: $firstNum  Number 2: $secNum")

    println("1. Adding")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")
    var chooseOption: Int? = null;
    do {
        var option = readLine()!!.toIntOrNull()
        if (option !is Int) {
            println("You did not choose numbers. Try again!!")
        } else {
            chooseOption = option
        }
    } while ((option !is Int || (option != null && (option < 1 || option > 4))))
// false
    when (chooseOption) {
        1 -> if (firstNum != null && secNum != null) {
            print(firstNum + secNum)
        }
        2 -> if (firstNum != null && secNum != null) {
            print(firstNum - secNum)
        }
        3 -> if (firstNum != null && secNum != null) {
            print(firstNum * secNum)
        }
        4 -> if (firstNum != null && secNum != null) {
            print(firstNum / secNum)
        }
        else -> print("Something Wrong! ")
    }

}