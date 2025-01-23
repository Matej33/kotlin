/*
// tlacitkova pevna linka
open class Phone(val number: String) {
    init {
        if(!number.startsWith("+421")) {
            throw IllegalArgumentException("Not slovak number")
        }
    }
    fun call(recipient: String) {
        println("Calling from $number to $recipient")
    }
}
class Item()

class Mobile(cislo: String) : Phone(cislo){

    val phoneList: MutableList<Item> = mutableListOf()

    fun sms(recipient: String) {
        println("Sending sms from $number to $recipient")
    }
}

fun main() {
    val phone = Phone("+421 901 234 567")
    phone.call("+421 908 765 432")

    val mobile = Mobile("+421 901 234 567")
    mobile.number
    mobile.phoneList
    mobile.sms("+421 908 765 432")
    mobile.call("+421 908 765 432")
}
*/

//----------------------------------------------------------------------------------------------

/*
//zviera - rodove a druhove meno
//cicavec - porod
//vtak - znes

open class zviera(val rodoveMeno: String, val druhoveMeno: String) {
    open fun reprodukcia() {
        println("reprodukuje")
    }
}

class cicavec(rodoveMeno: String, druhoveMeno: String) : zviera(rodoveMeno, druhoveMeno) {
    override fun reprodukcia() {
        println("porod")
    }
}

class vtak(rodoveMeno: String, druhoveMeno: String) : zviera(rodoveMeno, druhoveMeno) {
    override fun reprodukcia() {
        println("znes")
    }
}


fun main() {
    // vytvor 2 vtaky (tucniak gronsky, drozd obycajny)
    // vytvor 2 cicavce (homo sapiens, vtakopysk perry)
    // vloz ich do zoznamu

    // zo vstupu nacitaj [vtak|cicavec]
    // prejdi zoznamom a vypis iba vtaky / iba cicavce


    val zoznam = listOf(
        cicavec("homo", "sapiens"),
        cicavec("vtakopysk", "perry"),
        vtak("tucniak", "gronsky"),
        vtak("drozd", "obycajny")
    ).shuffled()

    //val vtaky = readln()[0] in arrayOf('v', 'V')

    for (zviera in zoznam) {
        println("${zviera.rodoveMeno} ${zviera.druhoveMeno}")
        zviera.reprodukcia()
        println()
    }
}
*/

//---------------------------------------------------------------------------------

open class tvar(){
    open fun obvod(){}
    open fun obsah(){}
}

class kruh(val polomer: Float): tvar(){
    override fun obvod(){
        println("o kruhu: ${2*Math.PI*polomer}")
    }
    override fun obsah(){
        println("s kruhu: ${Math.PI*polomer*polomer}")
    }
}

class obdlznik(val a: Float, val b: Float): tvar(){
    override fun obvod(){
        println("o obdlznika: ${2*a+2*b}" )
    }
    override fun obsah(){
        println("s obdlznika: ${a*b}")
    }
}

fun main(){
    val list = listOf(
        kruh(5f),
        kruh(10f),
        obdlznik(5f, 10f),
        obdlznik(10f, 20f)
    ).shuffled()

    for(tvar in list){
        tvar.obvod()
        tvar.obsah()
        println()
    }
}