
fun main(){
    var statement = description("Lilian", 19)
    var know= count("Lilian")
    println(know)
var name= just("Lilian")
   var newName=word("akirachix")
}
fun description(name:String, age:Int){
    var statement="Hi, I am $name and I am $age years old."
    println(statement)
}

fun count(word:String):Int{
    var know= word. length
    return know
}

fun just(name:String){
    if(name=="Lilian")
    println("That's me!")

    else
        println("I don't know who that is.")
}

fun word(name:String){
    var name = "akirachix"
    var newName= name[0].toString() + name[1] +name[3]
    println(newName)
}