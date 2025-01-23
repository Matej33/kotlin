enum class radio(val url: String) {
    Devin("http://live.slovakradio.sk:8000/Devin_32.mp3"),
    FunRadio("https://stream.funradio.sk:8000/fun128.mp3"),
    RadioFM(" http://live.slovakradio.sk:8000/FM_32.mp3"),
    RadioJemne("https://stream.bauermedia.sk/melody-hi.mp3")
}


abstract class Sorting {
    abstract fun sort(array: IntArray): IntArray
}

class SystemSort(array: IntArray) : Sorting() {
    override fun sort(array: IntArray): IntArray {
        return array.sortedArray()
    }
}

class BubbleSort(array: IntArray) : Sorting() {
    override fun sort(array: IntArray): IntArray {
        val n = array.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (array[j] > array[j + 1]) {
                    val temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
                }
            }
        }
        return array
    }
}


fun main() {
    //prva uloha
    /*
    var x = true

    while(x) {
        val s = readln()
        when (s) {
            "Devin" -> {
                println(radio.Devin.url)
                x = false
            }
            "FunRadio" -> {
                println(radio.FunRadio.url)
                x = false
            }
            "RadioFM" -> {
                println(radio.RadioFM.url)
                x = false
            }
            "RadioJemne" -> {
                println(radio.RadioJemne.url)
                x = false
            }
            else -> {
                println("Error")
            }
        }
    }
     */

    //druha uloha

    val array = IntArray(10)
    println("daj 10 cisel:")
    for (i in 0 until 10) {
        array[i] = readLine()!!.toInt()
    }

    val bubbleSort = BubbleSort(array).sort(array.copyOf())
    val systemSort = SystemSort(array).sort(array.copyOf())

    println("bubble: ${bubbleSort.joinToString()}")
    println("system: ${systemSort.joinToString()}")
}