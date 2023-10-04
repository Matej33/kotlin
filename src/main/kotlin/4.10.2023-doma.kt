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

fun main() {
    biggerChess();
}
