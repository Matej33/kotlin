fun powers() {
    val n = readln().toInt();
    for (i in 0..<n) {
        val x = readln().toInt();
        println(x * x);
    }
}

fun benford() {
    val n = readln().toInt();
    var counter = 0;
    for (i in 0..<n) {
        val x = readln();
        if (x[0] == '5') {
            counter++;
        }
    }
    println("$counter ${100 / n.toDouble() * counter.toDouble()} %")
}

fun void() {
    var x = 5;
    var y = 5;
    while (true) {
        val input = readln();
        if (input == "L") {
            x--;
        } else if (input == "R") {
            x++;
        } else if (input == "D") {
            y++;
        } else if (input == "U") {
            y--;
        } else {
            break;
        }
    }
    println("$x $y")
}

fun world() {
    var x = 1;
    var y = 1;
    while (true) {
        val input = readln();
        if (input == "L") {
            if (x > 0) {
                x--;
            }
        } else if (input == "R") {
            if (x < 9) {
                x++;
            }
        } else if (input == "D") {
            if (y < 9) {
                y++;
            }
        } else if (input == "U") {
            if (y > 0) {
                y--;
            }
        } else {
            break;
        }
    }
    println("$x $y")
}

fun iban() {
    val input = readln();
    println(when (input.subSequence(4, 8)) {
        "7500" -> "CSOB"
        "8360" -> "mBank"
        "1100" -> "Tatra"
        "0200" -> "VUB"
        else -> "Error"

    })
}

fun cardNumber() {
    val number = readln()
    if (number.length != 16) {
        println("Error")
        return
    }
    if (number[0] == '4') {
        println("VISA")
    } else if (number.substring(0, 4).toInt() in 2221..2720 || number.substring(0, 2).toInt() in 51..55) {
        println("MasterCard")
    } else {
        println("Error")
    }
}

fun identificationNumber() {
    val number = readln()

    if (number.substring(2, 4).toInt() > 62 || number.substring(4, 6).toInt() > 31) {
        println("Error")
        return
    }

    val day = if (number.substring(4, 6).toInt() >= 10) {
        number.substring(4, 6)
    } else {
        number.substring(5, 6)
    }

    val month = if (number.substring(2, 4).toInt() > 50) {
        number.substring(2, 4).toInt() - 50
    } else if (number.substring(2, 4).toInt() >= 10) {
        number.substring(2, 4)
    } else {
        number.substring(3, 4)
    }

    val year = if (number.substring(0, 2).toInt() > 23) {
        number.substring(0, 2).toInt() + 1900
    } else {
        number.substring(0, 2).toInt() + 2000
    }

    val gender = if (number.substring(2, 4).toInt() > 50) {
        "feminine"
    } else {
        "masculine"
    }

    println("$day.$month.$year - $gender")
}

fun isbn() {
    val number = readln()
    var counter = 0
    if (number.length != 13) {
        println("invalid")
        return
    }
    for (i in 0..<13) {
        if (i % 2 != 0) {
            counter += number[i].digitToInt() * 3
        } else {
            counter += number[i].digitToInt()
        }
    }
    if (counter % 10 == 0) {
        println("valid")
    } else {
        println("invalid")
    }
}

fun buttonPhone() {
    val input = readln()
    var counter = 1

    for (i in 0 ..< input.length) {
            if (input[i] == '0') {
                print(" ")
            } else if(i == input.length-1 && input[i] == input[i-1]){
                when (input[i]) {
                    '2' -> print((96 + counter).toChar())
                    '3' -> print((99 + counter).toChar())
                    '4' -> print((102 + counter).toChar())
                    '5' -> print((105 + counter).toChar())
                    '6' -> print((108 + counter).toChar())
                    '7' -> print((111 + counter).toChar())
                    '8' -> print((115 + counter).toChar())
                    '9' -> print((118 + counter).toChar())
                }
            } else if (input[i] == input[i + 1]) {
                counter++
            } else {
                when (input[i]) {
                    '2' -> print((96 + counter).toChar())
                    '3' -> print((99 + counter).toChar())
                    '4' -> print((102 + counter).toChar())
                    '5' -> print((105 + counter).toChar())
                    '6' -> print((108 + counter).toChar())
                    '7' -> print((111 + counter).toChar())
                    '8' -> print((115 + counter).toChar())
                    '9' -> print((118 + counter).toChar())
                }
                counter = 1
            }
    }
}

fun horse(){
    val x = readln().toInt()
    val y = readln().toInt()
    var counter = 0
    if(x + 1 <= 8 && y + 2 <= 8){
        println("x: ${x+1} y: ${y+2}")
        counter++
    }
    if(x + 2 <= 8 && y + 1 <= 8){
        println("x: ${x+2} y:${y+1}")
        counter++
    }
    if(x + 1 <= 8 && y - 2 > 0){
        println("x: ${x+1} y:${y-2}")
        counter++
    }
    if(x + 2 <= 8 && y - 1 > 0){
        println("x: ${x+2} y:${y-1}")
        counter++
    }
    if(x - 2 > 0 && y + 1 <= 8){
        println("x: ${x-2} y:${y+1}")
        counter++
    }
    if(x - 2 > 0 && y - 1 > 0){
        println("x: ${x-2} y:${y-1}")
        counter++
    }
    if(x - 1 > 0 && y + 2 <= 8){
        println("x: ${x-1} y:${y+2}")
        counter++
    }
    if(x - 1 > 0 && y - 2 > 0){
        println("x: ${x-1} y:${y-2}")
        counter++
    }
    if(counter == 0){
        println("Error")
    }
}

fun main() {
buttonPhone()
}