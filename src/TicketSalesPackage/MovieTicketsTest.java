package TicketSalesPackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTicketsTest
{
//test sales are calculated right
    @Test void CalculateTotalSales_ReturnsExpectedSales()
    {
        IMovieTickets testClass = new MovieTickets();
        int[] ticketSales = {3000, 1500, 1700};
        int expected = 6200;
        int actual = testClass.TotalMovieSales(ticketSales);
        assertEquals(expected, actual, 0.1);
    }

//    test top movie is right
    @Test
    void TopMovieSales_ReturnsTopMovie()
    {
        String[] movies = {"Napoleon", "Oppenheimer"};
        IMovieTickets testClass = new MovieTickets();
        int[] totalSales = {6200, 6300};
        movies = new String[]{"Napoleon", "Oppenheimer"};
        String expected = "Oppenheimer";
        String topMovieIndex = testClass.TopMovie(movies, totalSales);
        String actual = movies[Integer.parseInt(topMovieIndex)];
        assertEquals(expected, actual);
    }
}