package se.lexicon;

import jdk.nashorn.internal.runtime.Scope;

import java.util.Arrays;

public class WeekTwoExercises {


    //Exercise 02
   /* public static int indexOf(int findIndexElement, int source[]) {
        int indexFound = Arrays.binarySearch(source, findIndexElement);

        if (indexFound >= 0) {
            return indexFound;
        } else {
            return -1;
        }
    }*/






    //Exercise 8
    // parameter of source
    // return array without duplicates
    // sort
    //prep empty array
    // are they the same
    // if not duplicate use method add element
    // return array with no dup

    public static int removeDuplicatedElements(int numbers[], int n){
        if(n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if(numbers[i] != numbers[i+1]){
                temp[j++] = numbers[i];
            }
        }
        temp[j++] = numbers[n-1];
        //Changing original array
        for(int i=0; i<j; i++){
            numbers[i] = temp[i];
        }
        return j;
    }



    //Exercise 09
       /*public static String[] addElements (String[]surNames, String elementToAdd){
            surNames = Arrays.copyOf(surNames, surNames.length + 1);
            surNames[surNames.length - 1] = elementToAdd;
            return surNames;
        }*/




        public static void main (String[]args){




        /*Exercise 01
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));*/

        /*Exercise 02
        int[] source ={3, 5, 12, 53, 109};
        System.out.println("Index position of number 12 is: " + indexOf(12, source));*/




        /*Exercise 03
        String[] countries = {"Paris", "London", "New York", "Stockholm"};
        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));*/



        /*Exercise 04
        int[] numbers = {25, 83, 95, 101};
        int[] numbersCopy = Arrays.copyOf(numbers, 4);
        System.out.println("Elements of numbers: " + Arrays.toString(numbers));
        System.out.println("Elements of numbersCopy: " + Arrays.toString(numbersCopy));*/

        /*Exercise 05
        String[][] countries = {{"Brazil", "Sweden"}, {"Japan", "Germany"}};

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
            }
            System.out.println();
        }*/

        /*Exercise 06
        double[] numbers={43, 5, 23, 17, 2, 14};
        System.out.println("Average is: " + (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5])/6);*/

        /*Exercise 07
        int [] numbers= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array numbers: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                int odds = (numbers[i]);
                System.out.println("Odd array: " + odds);
            }
        }*/

            /*Exercise 08
            int[] numbers = {20, 20, 40, 20, 30, 40, 50, 60, 50};
            Arrays.sort(numbers);
            System.out.println("Original Array Numbers, sorted with duplicates: " + Arrays.toString(numbers));
            int length = numbers.length;
            length = removeDuplicatedElements(numbers, length);
            System.out.print("Array Numbers without duplicates: ");
            //printing array elements
            for(int i=0; i<length; i++)
                System.out.print(numbers[i] + " ");*/



            //Exercise 09
       /* String[] surNames={"Robinson", "Davis", "Williams", "Jordan"};
        String elementToAdd = "Elbrink";
        surNames = addElements(surNames, elementToAdd);
        elementToAdd = "Alcantara";
        surNames = addElements(surNames, elementToAdd);
        surNames = addElements(surNames, "Jonas");
        for(String answer: surNames) {
            System.out.print(answer + " ");
        }*/


        }
    }



