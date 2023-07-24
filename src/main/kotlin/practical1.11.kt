fun main(){
    val firstMatrix = Matrix(arrayOf(intArrayOf(3,-2,5), intArrayOf(3,0,4)),2,3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(2,3), intArrayOf(-9,0), intArrayOf(0,4)),3,2)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(6,3), intArrayOf(9,0), intArrayOf(5,4)),3,2)

    println("Addition")
    print("Matrix:1 $secondMatrix1")

    print("Matrix:2 $secondMatrix")

     val thirdMatrix = secondMatrix1 + secondMatrix
    print("Addition:$thirdMatrix")

    println("Subtraction")
    print("Matrix:1 $secondMatrix1")

    print("Matrix:2 $secondMatrix")

    val subtractMatrix = secondMatrix1 - secondMatrix
    print("Subtraction:$subtractMatrix")


    println("Multiplication")
    print("Matrix:1 $secondMatrix1")

    print("Matrix:2 $secondMatrix")

    val Mulitiplication = firstMatrix * secondMatrix
    print("Addition:$Mulitiplication")




}