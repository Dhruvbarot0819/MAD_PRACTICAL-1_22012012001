fun main() {
    print("Please enter size of array:")
    val input1 = readLine()!!
    val array_size: Int = input1.toInt()
    val array = Array<Int>(array_size) { 0 }
    val array2 = array
    println("Please enter elements")
    for (i in 0..array_size - 1) {
        print("arr[$i]=")
        array.set(i, readLine()!!.toInt())
    }
    var temp: Int
    for (i in 0..array_size - 1) { for (j in 0..array_size - 1) {
        if (array[i] <= array[j])
        {
            temp = array[i]
            array[i] = array[j]
            array[j] = temp
        }
    }
    }

    println(" Without using inbuilt function")
    println("	Sorted Array	")

    for (i in 0..array_size - 1) {
        println("arr[$i]=" + array[i])
    }

}
