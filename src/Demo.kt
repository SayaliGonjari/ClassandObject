fun main(arg: Array<String>) {
    var user = User()
    user.cal(10, 20)

    var user2 = User2()
    user2.sub(90, 50)

    var user3 = User.User3()
    user3.sub(60,50)
    println(user3.s1)
    println("Second name is ${user3.s2}")

    val user4  = User.User3("John")
    val user5 = User.User3("Willam",40)


}

class User {
    fun cal(i: Int, j: Int) {
        var result = i + j;
        println("Result is $result")
    }

    class User3 {
        var s1:String="Sayali"
        var s2:String="Atharva"
        fun sub(i: Int, j: Int) {
            var result = i - j
            println("Subtraction is $result")
        }

        constructor(s:String){
            println("Name is $s")
        }

        constructor(s:String,i:Int){
            println("Name in secondary constructor $s , $i")
        }
        constructor(){

        }
    }
}

class User2 {
    fun sub(i: Int, j: Int) {
        var result = i - j
        println("Subtraction is $result")
    }
}