open class Person( val name: String, val age: Int) {
    open fun introduce(): String{
        return "My name is $name and age $age"
    }
}