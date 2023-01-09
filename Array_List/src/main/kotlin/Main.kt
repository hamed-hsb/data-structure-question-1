import java.util.*
import kotlin.collections.ArrayList


fun main(args: Array<String>) {

    val runtime = Runtime.getRuntime()

    runtime.gc()


    val sc = Scanner(System.`in`)


    println("Enter array's length :")
    var arrLen = sc.nextInt()

    var arr = ArrayList<Int>()

    for (index in 0..arrLen-1){
       // println("Enter number ${index+1} :")
        arr.add(index+1000000)
    }

    val startTime = System.currentTimeMillis()
    println("\n\n")

    println("sumByRecursion : "+ ListCalculateV1().sumWithRecursion(arr,arrLen-1))

    println("sumByFor : "+ ListCalculateV1().sumWithFor(arr))

    println("sumByWhile : "+ ListCalculateV1().sumWithWithWhile(arr))

    println("\n")
    println("End of calculations " )
    println("\n")

    val stopTime = System.currentTimeMillis()

    val elapsedTime = stopTime - startTime


    println("Time elapsed: "+elapsedTime)

    println("\n")


    val memory: Long = runtime.totalMemory() - runtime.freeMemory()
    println("Used memory is bytes: $memory")
    System.out.println(
        "Used memory is megabytes: "
                + bytesToMegabytes(memory)
    )



}



private const val MEGABYTE = 1024L * 1024L

fun bytesToMegabytes(bytes: Long): Long {
    return bytes / MEGABYTE
}