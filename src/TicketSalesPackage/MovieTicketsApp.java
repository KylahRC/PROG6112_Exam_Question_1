package TicketSalesPackage;

import java.text.DecimalFormat;

public class MovieTicketsApp
{
    public static void main(String[] args)
    {
//        declarations
        int[][] movieTicketSales = {
                {3000, 1500, 1700},
                {3500, 1200, 1600}
        };

        String[] months = {"JAN", "FEB", "MAR"};
        String[] movies = {"Napoleon", "Oppenheimer"};
        MovieTickets movieTickets = new MovieTickets();
        int[] totalSales = new int[2];
//        declarations

//        printing section
        System.out.println("MOVIE TICKET SALES REPORT - 2024\n");
        System.out.println("--------------------------------------------------------------");

        // Print the month headings
        System.out.print("    \t\t");
        for (String month : months)
        {
            System.out.print(month + "\t\t");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");

//Prints the sales
        for (int i = 0; i < movieTicketSales.length; i++)
        {
            totalSales[i] = movieTickets.TotalMovieSales(movieTicketSales[i]);

            System.out.print(movies[i] + "\t");
            for (int j = 0; j < movieTicketSales[i].length; j++)
            {
                System.out.print("R " + movieTicketSales[i][j] + "\t");
            }
            System.out.println();
        }

//        prints for each movie
        System.out.println("\n--------------------------------------------------------------");
        DecimalFormat df = new DecimalFormat("###,###.##");

        for (int i = 0; i < movies.length; i++)
        {
            System.out.println("Total movie ticket sales for " + movies[i] + " = R " + df.format(totalSales[i]));

        }

        IMovieTickets object = new MovieTickets();
        String topMovieIndex = object.TopMovie(movies, totalSales);

        System.out.println("\nTop performing movie: " + movies[Integer.parseInt(topMovieIndex)]);
    }
}
