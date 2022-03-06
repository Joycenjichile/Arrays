fun main(){
    names()
     String()
    nums()
    var x=people("Effence","Kamau","Waithera")
    println(x.contentToString())
}
fun names(){
    var arraynames = arrayOf("Mercy","Lucy","Agnes","Emma")
    println(arraynames.contentToString())

}
fun String(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach{citie ->
        println(citie.capitalize())

    }

}
fun nums(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers.get(1) + numbers.get(4)
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}
fun people(num1:String,num2:String,num3:String): Array<String> {
    var friends= arrayOf(num1,num2,num3)
    return friends




}


