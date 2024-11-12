package TicketSalesPackage;

public class MovieTickets implements IMovieTickets
{
//    method for total sales
    @Override public int TotalMovieSales(int[] movieTicketSales)
    {
        int totalSales = 0;
        for (double sale : movieTicketSales)
        {
            totalSales += sale;
        }
        return totalSales;
    }

//    method for best movie
    @Override public String TopMovie(String[] movies, int[] totalSales)
    {
        int topPosition = 0;
        int topSale = totalSales[0];
        for (int i = 1; i < totalSales.length; i++)
        {
            if (totalSales[i] > topSale)
            {
                topSale = totalSales[i];
                topPosition = i;
            }
        }
        return String.valueOf(topPosition);
    }
}
