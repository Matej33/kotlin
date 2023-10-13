import kotlin.math.sqrt

fun hello(input: String) : String {
    return "Hello + $input"
}

fun bmiCalc(weight : Float, height : Float): Float {
    return weight / (height*height)
}

fun c(a : Float, b : Float): Float{
    return sqrt(a*a + b*b)
}

fun extractDay(date: String): String {
    //return date.substringBefore('.')
    return date.split('.')[0]
}
fun extractMonth(date: String): String {
    //return date.substringAfterLast('.').substringBefore('.')
    return date.split('.')[1]

}
fun extractYear(date: String): String {
    //return date.substringAfterLast('.')
    return date.split('.')[2]

}

fun schema(url: String): String {
    return url.substringBefore(':')
}
fun host(url: String): String {
    return url.substringBefore('/')
}
fun path(url: String): String {
    return url.substringBefore('?')
}

fun main() {
    var url:String = "https://www.google.com/images?q=vajce"
    println(schema(url))
    url = url.removeRange(0,(schema(url).length+3))
    println(host(url))
    url = url.removeRange(0,(host(url).length+1))
    println(path(url))
    url = url.removeRange(0,(path(url).length+1))
    println(url)


}

