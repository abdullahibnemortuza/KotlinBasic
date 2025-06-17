class Student(name: String,age:Int,val studentId: Int):Person(name,age) {
    override fun introduce(): String{
        return  "My name is $name, age $age and my student id is $studentId"
    }
}