/*
enum class City(val cityName:String,val latitude:Double, val longtitude:Double)
{
    BRATISLAVA("Bratislava",48.15,17.1167),
    TRENCIN("Trencin",48.8942,18.0449),
    ZILINA("Zilina",49.2197,18.7494),
    KOSICE("Kosice",48.7164,21.2611),
    NOVE_MESTO_NAD_VAHOM("Nove Mesto nad Vahom",48.7578,17.8289),
    NITRA("Nitra",48.3122,18.0878),
    BANSKA_BYSTRICA("Banska Bystrica",48.7394,19.1533),
    PRESOV("Presov",48.9987,21.2335),
    TRNAVA("Trnava",48.3775,17.5872),
    POPRAD("Poprad",49.0617,20.2972),
    MARTIN("Martin",49.0667,18.9333),
    ZVOLEN("Zvolen",48.5833,19.1333),
    PUCHOV("Puchov",49.1333,18.3167),
    SENEC("Senec",48.2,17.4),
    SENICA("Senica",48.6833,17.3667),
    DUNAJSKA_STREDA("Dunajska Streda",47.9833,17.6167),
}

fun main() {
    val city1 = City.values().random()
    var city2 = City.values().random()
    while(city1 == city2){
        city2 = City.values().random()
    }
    {
        city2 = City.values().random()
    }
    var smer = "";

    if(city1.latitude > city2.latitude)
    {
        smer = "juh"
    }
    else if(city1.latitude < city2.latitude)
    {
        smer = "sever"
    }
    else if(city1.longtitude > city2.longtitude)
    {
        smer = "zapad"
    }
    else if(city1.longtitude < city2.longtitude)
    {
        smer = "vychod"
    }
    else if(city1.latitude > city2.latitude && city1.longtitude > city2.longtitude){
        smer = "severovychod"
    }


    println("Napis akym smerom treba ist z ${city1.cityName} do ${city2.cityName}?")

    while(true)
    {
        val input = readln()
        if(input == smer)
        {
            println("Spravne")
            break
        }
        else
        {
            println("Zle")
        }
    }
}

 */

/*
enum class Day {
   SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

fun main() {
   val day = Day.entries.toTypedArray().random()
   when(day) {
       Day.SATURDAY -> println("day off")
       Day.SUNDAY -> println("day off")
       else -> println("work!")
   }
}
*/
