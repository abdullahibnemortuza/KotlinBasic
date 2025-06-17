open class Employee(val name: String,var salary: Double) {
    open fun showDetails(){
        println("Name: $name Salary: $salary")
    }
    open fun calculateBonus() {
        var bonus = (salary * 1.15) - salary
        println("Name: $name Salary: $salary Bonus: $bonus Total salary: ${salary + bonus}")
    }
}