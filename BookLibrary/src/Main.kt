//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    var book = Book("The Easy Way","W.B Magnus",7)

    println("Book Information--${book.getDetails()}")

    book.bookBorrowed()
    println(book.getDetails())
    book.returnBook()
    println(book.getDetails())
    book.returnBook()
    println(book.getDetails())

}