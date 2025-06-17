//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val person = Person("Mizan",25)
    val student = Student("Mortuza",25,13265)
    val teacher = Teacher("Abdullah",25,"Android")

    println(person.introduce())
    println(student.introduce())
    println(teacher.introduce())
}