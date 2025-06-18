//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var userName = readLine()!!.toString()

    var reversedName = userName.reversed()

    if (userName == reversedName){
        println("Palindrome")
    } else {
        println("Not a Palindrome")
    }

}