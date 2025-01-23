<<<<<<< HEAD
/*
=======
>>>>>>> af83667768ba8a69c9d68fd44772fae88ab81e90
import java.io.*
import java.util.*

private val scanner = Scanner(System.`in`)

fun main() {

    println("Menu")
    println("- [N]ew Game")
    println("- [L]oad Game")
    println("- [E]xit")

    while (true) {
        when (scanner.next()) {
            "E" -> break
            else -> println("Unknown command")
        }
    }
}

private fun readFile(file: File = File("saved.gm")): List<String> {
    System.err.println(file.absolutePath)
    return if (file.exists()) {
        file.readLines()
    } else {
        emptyList()
    }
}

private fun playGame() {
    var player = 0
    var matches = 15
    while (true) {
        println("Hrac ${player+1}")
        println("Zostava ti $matches zapaliek - tiahni [1], [2], alebo [3] zapalky")

        val pick = scanner.next().toIntOrNull()

        if (pick == null || pick !in 0..3) {
            println("Nerozumiem, zadaj cislo [1], [2] alebo [3]")
            continue
        }

        matches -= pick

        player = (player + 1) % 2
    }
}
<<<<<<< HEAD
*/
=======
>>>>>>> af83667768ba8a69c9d68fd44772fae88ab81e90
