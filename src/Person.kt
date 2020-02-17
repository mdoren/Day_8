class Person constructor(
    var firstName: String,
    var lastName: String,
    var age: Int
) {
    var fullName: String = "$firstName $lastName"
    get() = field
    set(value){
        field = value
    }
    var yearOfBirth: Int = 2020 -age
    get() = field
    set(value){
        field = value
    }


    init{
        yearOfBirth = 2020 - age
        // test for bad values
    }


    fun printFullName(){
        println("Inside the class - $fullName")
    }
}