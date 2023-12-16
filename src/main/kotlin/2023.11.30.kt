/*
import kotlin.math.sqrt

class Bod(val x: Double, val y: Double) {
    fun print(){
        println("[$x, $y]");
    }
}

class Usecka(val bodA: Bod, val bodB: Bod) {
    fun print(){
        println("[${bodA.x}, ${bodA.y}], [${bodB.x}, ${bodB.y}]")
    }
    fun printLenghth(){
        println("Length: ${sqrt(Math.pow(bodB.x - bodA.x, 2.0) + Math.pow(bodB.y - bodA.y, 2.0))}");
    }
}

fun main() {
    var input  = readln().split(" ").map { it.toDouble() };
    val bodA = Bod(input[0], input[1])
    input  = readln().split(" ").map { it.toDouble() };
    val bodB = Bod(input[0], input[1])
    val usecka = Usecka(bodA, bodB)
    bodA.print()
    bodB.print()
    usecka.print()
    usecka.printLenghth()
}
*/

/*
class suradnice(){

}
fun main(){
    println("Prajete si duplicitne zaznamy prepisat? Y/N")
    val replace = readln() == "Y"

    val zaznamy = mutableMapOf<String, String>()

    val n = readln().toInt()
    for(i in 1..n){
        val line = readln()
        val mesto = line.split(" ").dropLast(2).joinToString(" ")
        val suradnice = line.split(" ").takeLast(2).joinToString(" ")

        if(!zaznamy.containsKey(mesto) || replace){
            zaznamy += mesto to suradnice;
        }
    }
    for(item in zaznamy){
        println(item)
    }
}
*/