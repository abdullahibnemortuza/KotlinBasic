class Teacher(name: String, age:Int, val tsub: String):Person(name,age) {
    override fun introduce(): String {
        return "My name is $name,age is $age and I teach $tsub"
    }
}