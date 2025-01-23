/*
open class Phone(val number: String) {
    fun call(target: String) { println("Calling $target") }
}

class MobilePhone(number: String) : Phone(number) {
    fun sms(target: String, text: String) { println("SMS $target $text") }
}

fun main() {
    val telefonnyZoznam = mutableListOf<Phone>()
    telefonnyZoznam.add(Phone("02/4445555"))
    telefonnyZoznam.add(MobilePhone("0902345678"))
    telefonnyZoznam.add(MobilePhone("0901234567"))
    telefonnyZoznam.add(Phone("02/4345545"))
    for (phone in telefonnyZoznam) {
        println(phone.number)
        phone.call("0901234567")
        if (phone is MobilePhone) {
            phone.sms("0902345678", "TEXT")
        }
    }
}
*/

/*
enum class Dinosaur(val height : Double){
    TYRANNOSAURUS(12.3), ANKYLOSAURUS(7.0), TRICERATOPS(8.5), DIPLODOCUS(25.0), ERORAPTOR(1.3)
}

fun main() {
    val number = readln().toInt()
    when(number){
        1 -> println(Dinosaur.TYRANNOSAURUS.height)
        2 -> println(Dinosaur.ANKYLOSAURUS.height)
        3 -> println(Dinosaur.TRICERATOPS.height)
        4 -> println(Dinosaur.DIPLODOCUS.height)
        5 -> println(Dinosaur.ERORAPTOR.height)
    }
}
 */


/*
enum class vyvojarskeProstredie(val url : String){
    DEV("https://dev.example.com"), UAT("https://uat.example.com"), PROD("https://prod.example.com")
}
fun main() {
    val dev = vyvojarskeProstredie.DEV.url
    val uat = vyvojarskeProstredie.UAT.url
    val prod = vyvojarskeProstredie.PROD.url
    val x = readln()
    when(x.lowercase()){
        "d" -> println("Dev: $dev")
        "u" -> println("Uat: $uat")
        "p" -> println("Prod: $prod")
        else -> println("Invalid input")
    }
    }
*/

/*
enum class capitalCity(val latitude : Double, val longitude : Double){
    BRATISLAVA(48.15, 17.11), PRAGUE(50.05, 14.25), BUDAPEST(47.29, 19.03), VIENNA(48.12, 16.22)
}

fun main() {
    val Bratislava = "Bratislava = Latitude: ${capitalCity.BRATISLAVA.latitude}, Longitude: ${capitalCity.BRATISLAVA.longitude}"
    val Prague = "Prague = Latitude: ${capitalCity.PRAGUE.latitude}, Longitude: ${capitalCity.PRAGUE.longitude}"
    val Budapest = "Budapest = Latitude: ${capitalCity.BUDAPEST.latitude}, Longitude: ${capitalCity.BUDAPEST.longitude}"
    val Vienna = "Vienna = Latitude: ${capitalCity.VIENNA.latitude}, Longitude: ${capitalCity.VIENNA.longitude}"

    println(Bratislava)
    println(Prague)
    println(Budapest)
    println(Vienna)
}
*/

abstract class Participant(val name: String) {
    abstract fun x()
}       

class VIP(name: String) : Participant(name) {
    override fun x() {
        println("${name} is a VIP")
    }
}
class Regular(name: String) : Participant(name) {
    override fun x() {
        println("${name} is a regular")
    }
}

fun main() {
    val VIPParticipant = VIP("John").x()
    val regularParticipant = Regular("Jane").x()
}