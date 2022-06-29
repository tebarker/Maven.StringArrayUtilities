package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {


        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {


        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        int length = array.length;
        return array[length-1];

    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        int length = array.length;
        return array[length-2];

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        List<String> stringArrayList = new ArrayList<>(Arrays.asList(array));
        return stringArrayList.contains(value);



    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for (int i = 0; i < array.length/2; i++) {
            String tempArr = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tempArr;
        }

        return array;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean yesNo = true;
        for (int i = 0; i <= array.length/2 + 1; i++) {
            if (Objects.equals(array[i], array[array.length - 1 - i])) {

            } else {
                return false;
            }
        }
        return (yesNo);


    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String arrayAsString = Arrays.toString(array);
        String lowerCase = arrayAsString.toLowerCase();
        int count = (int) lowerCase.chars().filter(i -> i >= 'a' && i <= 'z').distinct().count();

        return (count == 26);


    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i].equals(value)) {
                count++;
            }
        }
        return count;


    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int count = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i].equals(valueToRemove)) {
                count ++;
            }
        }
        String[] newArray = new String[array.length - count];
        for (int index1 = 0, index2 = 0; index1 < array.length; index1++) {
            if (Objects.equals(array[index1], valueToRemove)) {
            } else {
                newArray[index2] = array[index1];
                index2++;
            }
        }
        return newArray;


    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        List<String> newArrayList = new ArrayList<>(Arrays.asList(array));
        for (int i = 1; i < newArrayList.size(); i++) {
            if (newArrayList.get(i) == newArrayList.get(i-1)) {
                newArrayList.remove(i);
                i--;
            }
        }
        int size = newArrayList.size();
        String[] newArray = newArrayList.toArray(new String[0]);
        return newArray;


    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        List<String> newArrayList = new ArrayList<>(Arrays.asList(array));
        List<String> copiedArrayList = new ArrayList<>(newArrayList);
        int copyCount = copiedArrayList.size() - 1;
        for (int i = newArrayList.size()-2; i >= 0; i--) {
            if (Objects.equals(newArrayList.get(i), copiedArrayList.get(copyCount))) {
                newArrayList.set(i + 1, newArrayList.get(i) + newArrayList.get(i +1));
                newArrayList.remove(i);
                copyCount -= 1;
            } else {
                copyCount -= 1;
            }
        }
        String[] outputArray = newArrayList.toArray(new String[0]);
        return outputArray;

    }


}
