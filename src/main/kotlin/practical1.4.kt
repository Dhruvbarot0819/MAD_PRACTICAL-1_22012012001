fun main(){
    print("Enter your number: ")
    var num:Int = readLine()!!.toInt()

    if (num %2==0){
        print("number is even")
    }
    else{
        print("number is odd")
    }
}