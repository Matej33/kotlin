/*
import kotlin.math.sqrt

fun uloha1(prvyVstup: String, druhyVstup: String) {
    val (bodAa, bodAb) = prvyVstup.split(" ").map { it.toDouble() };
    val (bodBa, bodBb) = druhyVstup.split(" ").map { it.toDouble() };
    val bod = Bod(0.0, 0.0);
    val bodList = bod.assign(bodAa, bodAb, bodBa, bodBb)
    val usecka = Usecka(bodList)
    println(usecka.ans())
}

class Bod(var bodAa: Double, var bodAb: Double) {
    val bodList: MutableList<Bod> = mutableListOf()
    fun assign(bodAa: Double, bodAb: Double, bodBa: Double, bodBb: Double): MutableList<Bod> {
        bodList.add(Bod(bodAa, bodAb))
        bodList.add(Bod(bodBa, bodBb))
        return bodList
    }
}

class Usecka(bodList: MutableList<Bod>) {
    val vec = Bod(0.0, 0.0)

    init {
        vec.bodAa = bodList[1].bodAa - bodList[0].bodAa
        vec.bodAb = bodList[1].bodAb - bodList[0].bodAb
    }

    fun ans(): Double {
        return sqrt(Math.pow(vec.bodAa, 2.0) + Math.pow(vec.bodAb, 2.0))
    }

}

fun main() {
    val prvyVstup: String = readln();
    val druhyVstup: String = readln();
    uloha1(prvyVstup, druhyVstup);
}
*/