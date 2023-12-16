/*
fun uloha1() {
    val n = readln().toInt()
    var counter = 0
    for (i in 0..<n) {
        val input = readln()
        if (input.length != 9) {
            print("Zlá ŠPZ")
            return
        }
        if (input.substring(0, 2) == "IL") {
            counter++
        }
    }
    println("$counter ${100 / n.toDouble() * counter.toDouble()} %")
}

fun uloha2() {
    val n = readln().toInt()
    var counter = 0
    for (i in 0..<n) {
        val input = readln()
        val code = input.substringBefore(' ')
        if (code.length == 13 && input.substring(0, 3) == "977") {
            for (j in 3..<code.length - 3) {
                counter += code[j].digitToInt()
            }
            println(counter)
            counter = 0
        } else {
            println("NIE JE ISSN")
        }
    }

}

/*fun uloha3() {
    var input = readln()
    var number = input.length-1
    for (i in 1..< number) {
        if (input[i] == '/' && input[i - 1] == '/') {
            print(" ")
        }
        print(
            when (input.substringBefore('/')) {
                "•••" -> "S"
                "–––" -> "O"
                "••••" -> "H"
                "•" -> "E"
                "•–••" -> "L"
                "//" -> " "
                "•––" -> "W"
                "•–•" -> "R"
                "–••" -> "D"
                else -> ""
            }
        )
        input = input.removeRange(0, input.indexOf('/'))
        if(input.substringBefore('/').length == 3){
            number -= 3
        } else if(input.substringBefore('/').length == 4){
            number -= 4
        } else if(input.substringBefore('/').length == 2){
            number -= 2
        } else if(input.substringBefore('/').length == 1){
            number -= 1
        }
    }
}*/

fun main() {
//    uloha1()
//    uloha2()
//    uloha3() //nefunguje
}
*/