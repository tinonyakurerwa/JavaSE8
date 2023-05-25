package MyNotFirstButFirstProject.XProSellers;

/*
*
* */
public class AverageSales {

    /*Xpro Sellers is one of the leading companies in the city. The sale data of the company in year 2016-2017 is
    *is given as sales in millions of dollars for all months of the year, beginning January
    *[6,9,7,10,11,9,7,12,14,15,13,11]
    *
    * The finance officer of the company wants to know the monthly average sales and the number of months for which
    * the sales are above the average sales.
    * Below is the solution.
    */

    public static void main(String[] args){
        //finding the monthly average sales and the number of months with sales greater than the average.

        int[] sales = {6,9,7,10,11,9,7,12,14,15,13,11};
        int average =0;
        int sum= 0;
        int monthsGreaterThanAve = 0;

        for(int x: sales){
            sum += x;
        }
        average = sum/sales.length;

        for(int x: sales){
            if (x>average){
                monthsGreaterThanAve ++;
            }
        }

        System.out.println("This is the average sales: "+ average);
        System.out.println("This is the number of montsh with sales greater than average sales: "+ monthsGreaterThanAve);

    }

    /* Alright babes, I hope you are having fun! So! data values are stored in memory locations identified by names
    *(these are sometimes referred to as identifiers) and these named memory locations are called variables!
    *
    * When we declare/ create( say ok, I want a number called x with value 8, kinda like in algebra) our variables
    * we have to say what type of variable it is, so like an integer for whole numbers and strings for english words
    * then we also have to say what the name of that variable will be (this is how we can access it and change it, think
    * of it like being assigned a name at birth.) and then what the value of the variable will actually be.
    *
    * Example: int sum = 0; int is the datatype integer, sum is the identifier, and the value of sum is 0.. woot woot
    * that's it... simpo simpo
    * */

}
