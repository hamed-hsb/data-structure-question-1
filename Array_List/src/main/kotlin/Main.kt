import java.util.Scanner

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)


    println("Enter array's length :")
    var arrLen = sc.nextInt()

    var arr = IntArray(arrLen)

    for (index in 0..arrLen-1){
        println("Enter number ${index+1} :")
        arr[index] = sc.nextInt()
    }



    println("\n\n")

    println("sumWithRecursion : "+ArrayCalculate().sumWithRecursion(arr,arr.size-1))

    println("sumWithFor : "+ArrayCalculate().sumWithFor(arr))

    println("sumWithWhile : "+ArrayCalculate().sumWithWithWhile(arr))

    println("\n\n")
    println("End of calculations")
}