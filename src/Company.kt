fun main (){
    // The iOSDeveloper :
    var iOS = iOSDeveloper()
    iOS.name = "iOSDeveloper "
    iOS.age =  25
    iOS.salary = 60.000
    println("Information about iOSDeveloper")
    println("The Kind Of Programer is "  + iOS.name + " ***** The age is :  " + iOS.age + " ***** The Salary is : " + iOS.salary)
    iOS.iosapp()
    println(" ****************************************")




    //androidDeveloper :
    var android = androidDeveloper()
    android.name = "androidDeveloper "
    android.age = 43
    android.salary = 40.000

    println("Information about androidDeveloper")
    println("The Kind Of Programer is "  + iOS.name + " ***** The age is :  " + iOS.age + " ***** The Salary is : " + iOS.salary)
    android.android()
    println(" ****************************************")



    //webDeveloper
    var web = webDeveloper()
    web.name = "webDeveloper"
    web.age = 40
    web.salary = 80.000

    println("Information about webDeveloper")
    println("The Kind Of Programer is "  + iOS.name + " ***** The age is :  " + iOS.age + " ***** The Salary is : " + iOS.salary)
    web.website()
    println(" ****************************************")

}

abstract class Employee() {
  abstract  var name :String
    abstract var age :Int
    abstract var salary : Double
}

class iOSDeveloper : Employee() {

    fun iosapp(){
        println("special iosapp")
    }

    override var name: String = " "


    override var age: Int = 0

    override var salary: Double = 0.0


}

class androidDeveloper : Employee() {

    fun android (){
        println("special android ")
    }

    override var name: String = " "

    override var age: Int = 0

    override var salary: Double = 0.0

}

class webDeveloper : Employee() {

    fun website(){
        println("special website ")
    }

    override var name: String = "  "

    override var age: Int = 0

    override var salary: Double = 0.0

}