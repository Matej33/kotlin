/*
import kotlin.random.Random
import java.text.DecimalFormat

fun border() {
    val w: Int = readln().toInt();
    val h: Int = readln().toInt();
    val a: String = readln();
    val b: String = readln();
    val c: String = readln();
    for (i in 0..<h) {
        for (n in 0..<w) {
            if (i == 0 || i == h - 1) {
                if (n == 0 || n == w - 1) {
                    print(a);
                } else {
                    print(b);
                }
            } else {
                if (n == 0 || n == w - 1) {
                    print(c);
                } else {
                    print(' ');
                }
            }
        }
        println();
    }
}

fun chess() {
    val w = readln().toInt();
    val h = readln().toInt();
    for (i in 0..<h) {
        for (n in 0..<w) {
            if (i % 2 != 0) {
                if (n % 2 != 0) {
                    print('#');
                } else {
                    print('.');
                }
            } else {
                if (n % 2 == 0) {
                    print('#');
                } else {
                    print('.');
                }
            }
        }
        println();
    }
}

fun biggerChess() {
    val w = readln().toInt()
    val h = readln().toInt()
    val s = readln().toInt()
    for (i in 0..<h) {
        for (j in 0..<s) {
            for (n in 0..<w) {
                for (x in 0..<s) {
                    print(if ((i + n) % 2 == 0) "#" else ".")
                }
            }
            println()
        }
    }

}

fun numbers() {
    for (i in 1..<11) {
        for (j in 1..<11) {
            if (i * j < 10) {
                print("   ${i * j}")
            } else if (i * j < 100) {
                print("  ${i * j}")
            } else {
                print(" ${i * j}")
            }
        }
        println()
    }
}

fun rand() {
    val from = readln().toInt();
    val to = readln().toInt();
    val rand1 = Random.nextDouble(from.toDouble(), to.toDouble());
    val rand2 = Random.nextInt(from, to);
    val rand3 = DecimalFormat("#.##").format(rand1)

    println(rand3);
    println(rand2);
}

fun piApproximation() {
    for (i in 1..<1000) {
        for (j in 1..<1000) {
            val x = i.toDouble() / j
            if (x > Math.PI - 0.00001 && x < Math.PI + 0.00001)
                println("$i $j")
        }
    }
}

fun pictureBorder() {
    val x = readln().toInt()
    val y = readln().toInt()

    print("#".repeat(y + 4))
    println()
    print("#".repeat(y + 4))
    println()
    for (i in 0..<x) {
        val input = readln()
        println("##$input##")
    }
    print("#".repeat(y + 4))
    println()
    print("#".repeat(y + 4))
}


fun main() {
//()
}
*/