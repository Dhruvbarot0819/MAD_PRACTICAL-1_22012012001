fun main(){
    print("Enter your number: ")
    var num:Int = readLine()!!.toInt()

//    if (num %2==0){
//        print("number is even")
//    }
//    else{
//        print("number is odd")
//    }
    println(if(num%2==0) "$num is Even" else "$num is Odd")
}