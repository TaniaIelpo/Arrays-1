package it.develhope.array1;

/**
 * @author Tania Ielpo
 */
public class Test {
    public static void main(String[] args) {
        String[] carBrands = new String[]{"BMW", "Ford", "Audi", "Jeep", "Fiat"};

        /*
        print in console the number of items of the carBrands array
         */

        System.out.println("CarBrands Array has "+carBrands.length+" elements.");

        //print in console the 3rd item of carBrands array
        System.out.println("The 3th element is: "+carBrands[2]);

        /*declare an empty array of integers called primeNumbers
         with a predefined size of 6 items*/
        int[] primeNumbers= new int[6];

        //insert one by one the values of the first 6 prime numbers, populating primeNumbers array
        primeNumbers[0]=2 ;
        primeNumbers[1]=3;
        primeNumbers[2]=5;
        primeNumbers[3]=7;
        primeNumbers[4]=11;
        primeNumbers[5]=13;

        //print in console all the content of the already populated primeNumbers array

        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.println(primeNumbers[i]);

        }
    }

}
