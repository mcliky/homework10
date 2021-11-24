package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] += rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high){
                return;
        }
        int mid = low + (high - low) / 2;
        int reliance = array[mid];
        int i=low;
        int j=high;
        while (i <= j) {
            while (array[i] < reliance) {
                i++;
            }
            while (array[j] > reliance) {
                j--;
            }
            if (i<=j){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                i++;
                j--;
            }

        }
        if(low<j){
            quickSort(array,low,j);
        }
        if(i<high){
            quickSort(array,i,high);
        }


    }
}

