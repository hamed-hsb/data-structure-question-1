class ArrayCalculateV2 {

    fun sumWithFor(arr: IntArray): Int{
        var sum = 0
        for (i in arr.size-1  downTo 0){
            sum += arr[i]
        }
        return sum
    }


    fun sumWithWithWhile(array: IntArray) : Int {
        var sum: Int = 0
        var index: Int = 0

        index = 0
        do {

            sum = sum + array[index++]


        }while ( index <= array.size-1)
        return sum
    }
}