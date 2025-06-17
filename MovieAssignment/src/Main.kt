//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var myMovie = Movie("The Godzilla",25)

    println("Movie Information: ${myMovie.getInfo()}")

    println(myMovie.bookSeat())
    println(myMovie.bookSeat())
}