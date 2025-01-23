/*
class Person(private val firstName: String, private var lastName: String){
    private fun validate(): Boolean{
        return true
    }
    fun printName() {
        println("$firstName $lastName")
    }
    fun marry(lastName: String){
        this.lastName = lastName
        validate()
    }
}


open class Slon(private var weight: Int = 1500){
    protected fun grow(){
        weight + 100
    }
    fun makeGrow(){
        grow()
    }
}
class AfrickySlon() : Slon() {
    fun doAfricanThing(){
        grow()
    }
}


class Card(
    val number: String,
    val cvv: Int,
    val expiratonDate: String,
    private val ownerName: String,
    private val pin: Int,
    private var balance: Double
) {
    fun getBalance(pin: Int): Double? {
        if (this.pin == pin) {
            return this.balance
        }
        return null
    }
}

fun main() {
    val a = Card("45958221430000001234", 233, "26/12", "Jozo Mrkva", 1588, 263785.54)
    println(a.getBalance(1588))
    println(a.getBalance(2588))
}
*/
