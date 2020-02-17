fun main(){
    var person1 = Person("Dave", "Boesen", 5)

    println("This is ${person1.fullName}")

    person1.printFullName()

    person1.firstName = "David"
    person1.printFullName()
}