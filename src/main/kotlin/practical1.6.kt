import java.awt.AWTEventMulticaster.add

fun main(){
    print("Enter your first number")
    var num:Int = readLine()!!.toInt()

    print("Enter your second number")
    var num2:Int = readLine()!!.toInt()


    print("Addition of two number ${add(num,num2)}")
    print("subtraction of two number ${sub(num,num2)}")
    print("multiplication of two number ${mul(num,num2)}")
    print("division of two number ${div(num,num2)}")

}

fun add(num:Int,num2:Int):Int{
    return num + num2
}

fun sub(num:Int,num2:Int):Int{
    return num - num2
}

fun mul(num:Int,num2:Int):Int{
    return num * num2
}

fun div(num:Int,num2:Int):Int{
    return num / num2
}