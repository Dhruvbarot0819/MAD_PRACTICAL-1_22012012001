import java.awt.AWTEventMulticaster.add

fun main(){
    print("Enter your first number")
    var num:Int = readLine()!!.toInt()

    print("Enter your second number")
    var num2:Int = readLine()!!.toInt()


//    print("addition of two number$num and $num2"+ add(num,num2))
//    print("addition of two number$num and $num2"+ sub(num,num2))
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
}