class ArrayCalculateV1 {

    fun sumWithFor(array: IntArray) : Int {
        var sum: Int = 0
        array.forEach {
            sum = sum + it
        }

        return sum
    }

    fun sumWithWithWhile(array: IntArray) : Int {
        var sum: Int = 0
        var index: Int = 0

        index = 0
        while ( index <= array.size-1){

            sum = sum + array[index]

            index ++
        }
        return sum
    }

    fun sumWithRecursion(a: IntArray, n: Int): Int {
        return if (n == 0) a[n] else a[n] + sumWithRecursion(a, n - 1)
    }
}