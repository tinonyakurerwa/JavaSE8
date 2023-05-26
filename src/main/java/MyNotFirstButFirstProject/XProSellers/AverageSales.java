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
    *
    * The data type tells us the kind of data that can be stored in our variable, as well as what we can do with it, and
    * the amount o memory needed for it( that whole memory management thing that Java is so good with)
    * -BIG MAJOR thing! we can't mismatch data types, so if we say integer we better only have whole numbers in there no
    * decimals there.
    *
    *
    * Oh Oh, we have to talk some details now... Data Types! There are two kinds of data types... hold your horses, I
    * will tell you what they are.... so there are Primitive and Non-Primitive data types.
    *
    *   Primitive: these hold the value of the data item, so if we go to the address named sum, we will find the value 0.
    *   Non-Primitive: this holds the reference of the memory location where the data item(object) is called.... so like
    *                  if we have a string data type with name "name"(lol) and value Tinotenda, if we go to name we will
    *                  find the address of the value Tinotenda not the actual value.. so they are also called Reference
    *                  data types... because they refer you to the actual thing!
    *
    *
    * Data Conversions... Really thinking this should have been a readme file lol.. but OH WELL.. maybe I will copy and
    * paste it into one at some point.
    *
    * So with Data types you can convert them to prevent loss of information. And you may need to, because if you divide
    * 3 by 2 and get 1.5 and assign it to an int you end up with 1, it drops the .5 because remember, int is only for
    * whole numbers. So this then means that we get a wrong answer which is an OH NO!... BUT! We can do a data conversion
    * where we change the int to a something with larger space, and this is called Explicit Type Conversion!
    * Explicit conversions are used to prevent data loss in maths.
    *
    * And though this a little like why would you do that, you can do the opposite and do a narrowing conversion, where
    * you take a bigger data type and store it in a little one.And you gota do this thing called type casting,
    * so if you have, long id = 45738L when you do the whole narrowing conversion to an int, you type cast like so
    * int int_id = (int) id;... the (int) is the type casting. You can change a smaller datatype without casting.
    *
    *
    *
    * Control Structures(woot woot)
    *
    * Kinda self-explanatory, but these are the regulators of our program, they check some condition and so certain things
    * based on the condition being met or not, these are your if-statements, try-catch, do-while, while loops and so
    * forth.
    *
    *
    * */

}