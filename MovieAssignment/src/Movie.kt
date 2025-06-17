class Movie(private val title: String, private var availableSeats: Int) {
    fun getInfo(): String{
        return "Title: $title, Available Seats: $availableSeats"
    }
    fun bookSeat(): String{
        if (availableSeats > 0){
            availableSeats--
            return "Available seat for $title is $availableSeats"
        } else {
            return "No seat available for $title"
        }
    }
}