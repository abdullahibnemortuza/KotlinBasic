//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val employee = Employee("Mortuza",35000.0)
    val manager = Manager("Abdullah",35000.0,"Digital Marketing")

    employee.showDetails()
    manager.showDetails()
    employee.calculateBonus()
    manager.calculateBonus()
}