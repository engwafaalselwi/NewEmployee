fun main (){
    // The iOSDeveloper :
    var iOS = iOSDeveloper()
    iOS.name()
    iOS.age()
    iOS.salary()
    iOS.iosapp()

    //androidDeveloper :
    var android = androidDeveloper()
    android.name()
    android.age()
    android.salary()
    android.android()


    //webDeveloper
    var web = webDeveloper()
    web.name()
    web.age()
    web.salary()
    web.website()
}

abstract class Employee(name:String , age:Int) {
   // var  name : String = " "
   // var age : Int = 20
    abstract fun name ()
    abstract fun age ()
    abstract fun salary()
}

class iOSDeveloper : Employee("Ali" , 25) {
    override fun name() {
        println("The name of iOSDeveloper is Ali")
    }

    override fun age() {
        println("The age of iOSDeveloper is 25")
    }

    override fun salary() {
        println("The Salary of iOSDeveloper is 10 000$")
    }

    fun iosapp(){
        println("special iosapp")
    }

}

class androidDeveloper : Employee("Ahmed",32) {
    override fun name() {
        println("The Name of androidDeveloper is Ahmed")
    }

    override fun age() {
       println("The Age of androidDeveloper is 32")
    }

    override fun salary() {
        println("The Salary of androidDeveloper is 20 000$")
    }
    fun android (){
        println("special android ")
    }
}

class webDeveloper : Employee("Mohmmed" , 40) {
    override fun name() {
        println("The name of webDeveloper is Mohmmed")
    }

    override fun age() {
        println("The Age of webDeveloper is 40")
    }

    override fun salary() {
        println("The Salary of webDeveloper is 50 000$")
    }
    fun website(){
        println("special website ")
    }
}