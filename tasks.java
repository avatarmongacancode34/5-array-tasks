
import java.util.Scanner;
import java.util.Arrays;
public class tasks{
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {



        // Task 1:

        System.out.println(""" 
        Welcome to array chose one of these options:
        1. Check index of a value
        2. Swap values
        3. sort in ascending order
        4. sort in descending order
        5. perform binary search
        6. perform linear search
        Enter your choice below. 
        """);
        int choice = input.nextInt();

        switch (choice){
            case 1 -> checkIndexValues();
            case 2 -> swapValues();
            case 3 -> sortAscending();
            case 4-> sortDescending();
            case 5-> binarySearch();
            case 6-> linearSearch();
            default -> System.out.println("Enter a valid option");
        }

        input.close();
    }

    static void checkIndexValues(){
        // This method checks the index of a given value
        int[] array = new int[]{2, 5, 8, 3, 4, 6, 10, 15, 20, 1};
        // initializing variables
        int indexOfGiven= -1;
        int indexOne = 0;
        int indexTwo = 0;
        // receive given value as input
        System.out.print("Enter the number whose index you want to check: ");
        int givenValue = input.nextInt();

        // locating the value in the array
        for (int i = 0; i < array.length;i++){
            if (array[i] == givenValue){indexOfGiven =i;}

        }
        System.out.println("The index of " + givenValue + " is "+ indexOfGiven);
    }
    static void swapValues() {
        // this method swaps two given values in the array
        int[] array = new int[]{2, 5, 8, 3, 4, 6, 10, 15, 20, 1};
        // receiving two values as in put
        System.out.println("Enter the two values you want to swap.");
        System.out.print("Value 1: ");
        int valueOne = input.nextInt();
        System.out.print("Value 2: ");
        int valueTwo = input.nextInt();
        // initializing
        int indexOne = 0;
        int indexTwo = 0;
        boolean oneIsFound = false;
        boolean twoIsFound = false;

        // locating the values
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueOne) {
                indexOne = i;
                oneIsFound = true;
            }
            if (array[i] == valueTwo) {
                indexTwo = i;
                twoIsFound = true;
            }
        }
        if (oneIsFound && twoIsFound) {
            array[indexOne] = valueTwo;
            array[indexTwo] = valueOne;
            System.out.println("Your new array will as follows: " + Arrays.toString(array));
        } else {
            System.out.println("One of the values could not be located in the array");
        }
    }

    static int[] sortAscending() {
        int[] array = new int[]{2, 5, 8, 3, 4, 6, 10, 15, 20, 1};
        // This method sorts arrays in ascending order
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int currentValue = array[i];
                int nextValue = array[j];
                if (currentValue < nextValue) {
                    array[i] = nextValue;
                    array[j] = currentValue;
                }
            }

        }
        System.out.println("Your new array is "+ Arrays.toString(array));
       return array;

    }

    static void sortDescending() {
        int[] array = new int[]{2, 5, 8, 3, 4, 6, 10, 15, 20, 1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int currentValue = array[i];
                int nextValue = array[j];
                if (currentValue > nextValue) {
                    array[i] = nextValue;
                    array[j] = currentValue;
                }
            }
        }
        System.out.println("Your new array is "+ Arrays.toString(array));
    }

    static void binarySearch() {
        int[] array = new int[]{2, 5, 8, 3, 4, 6, 10, 15, 20, 1};

        array = sortAscending();

        // binary search
        System.out.print("Enter the value you want to search: ");
        int searchedValue = input.nextInt();
        int upperBound = array.length - 1;
        int lowerBound = 0;
        int middle = (lowerBound + upperBound) / 2;

        boolean isFound = false;
        while (lowerBound <= upperBound) {
            if (array[middle] == searchedValue) {
                System.out.println("Value found at index " + middle);
                isFound = true;
                break;
            } else if (array[middle] > searchedValue) {
                upperBound = middle - 1;
                middle = (lowerBound + upperBound) / 2;
            } else {
                lowerBound = middle + 1;
                middle = (lowerBound + upperBound) / 2;
            }
        }
        if (!isFound) {
            System.out.println("The value is not in the array. ");
        }
    }

static void linearSearch() {
    int[] array = new int[]{2, 5, 8, 3, 4, 6, 10, 15, 20, 1};

    // linear search
    System.out.print("Enter the value you want to search: ");
    int searchValue = input.nextInt();
    int indexOfSearch = -1;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == searchValue) {
            indexOfSearch = i;
        }
    }
    System.out.println("Value is at index " + indexOfSearch);
}




    }


