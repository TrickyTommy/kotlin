import java.util.*

fun main() {

    var num = 3
    var twoD=Array(4,{IntArray(0)})
    for (i in 1..num  ){
        var colArray= IntArray(4)
        for (j in 1..num)
        {
//            print("${i*j}  ")
            colArray[j]=i*j
        }
//        println()
        twoD[i-1]=colArray

    }
    for (colArray in twoD)
    {
        for (colValue in colArray)
        {
            print(colValue)
            print(" ")
        }

        println("")
    }



}






