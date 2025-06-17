class Book(private val title: String,private val author: String, var stock: Int) {
    fun getDetails(): String{
        return "Title: $title, Author: $author, Available Quantity: $stock"
    }
    fun bookBorrowed(): Boolean{
        return if (stock > 0){
            stock--
            println("Borrowed Book: $title")
            true
        } else {
            println("$title is not available at this moment.")
            false
        }
    }
    fun returnBook(){
        stock++
        println("Returned book is: $title")
    }
}