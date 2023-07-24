class student(var enrollment:Int){
    constructor():this(97){
       print("student enrollment number is $enrollment ")
    }
    init {
        print("student enrollment No: $enrollment ,")
    }
//    fun print(){
//        print("student enrollment number is $enrollment")
//    }
}

fun main(){
    var en = student()
//    en.print()
}