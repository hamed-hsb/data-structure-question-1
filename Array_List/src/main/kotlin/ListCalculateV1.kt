class ListCalculateV1 {

    fun sumWithFor(list: List<Int>) : Int {
        var sum: Int = 0
        list.forEach {
            sum = sum + it
        }

        return sum
    }

    fun sumWithWithWhile(list: List<Int>) : Int {
        var sum: Int = 0
        var index: Int = 0

        index = 0
        while ( index <= list.size-1){

            sum = sum + list.get(index)

            index ++
        }
        return sum
    }

    fun sumWithRecursion(list: List<Int>, n: Int): Int {
        return if (n == 0) list.get(n) else list.get(n) + sumWithRecursion(list, n - 1)
    }

}