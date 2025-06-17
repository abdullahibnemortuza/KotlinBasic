class Manager(name: String, salary: Double, val department: String) : Employee(name, salary) {
//    override fun showDetails() {
//        println("Name: $name Salary: $salary and Department: $department")
//    }

    override fun calculateBonus() {
        var bonus = (salary * 1.4) - salary
        println("Name: $name Salary: $salary Bonus: $bonus Total Salary: ${salary + bonus}")
    }
}