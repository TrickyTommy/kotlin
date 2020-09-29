fun hello(name: String = "World!"): String {
    var area ="${name.capitalize()}"
    if(area == ""){
        area = "World!"
    }
    // return statement
    return area
}
fun main() {
    
    var  sapa=hello("tommy")
    print("Hello, $sapa")
}
