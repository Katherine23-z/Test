package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final int INDEX_VALUE = 4;
    public static final int NUMBER_1 = 1;
    public static final int NUMBER_2 = 4;


    public static void main(String[] args) {

    }

    public boolean arrayOfTwoValues(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        boolean a = false;

        if(list.contains(NUMBER_1) && list.contains(NUMBER_2)){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) == NUMBER_1 || list.get(i) == NUMBER_2){
                    a = true;
                }else return false;
            }
        }
        return a;
    }

    public int[] newArrayFromLastIndex(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        if(list.indexOf(INDEX_VALUE) != -1){
            int index = list.lastIndexOf(INDEX_VALUE);
            int capacity = (arr.length - 1) - index;
            int[] newArr = new int[capacity];
            System.arraycopy(arr, index+1, newArr, 0, capacity);
            return newArr;
        } else {
            throw new RuntimeException("Нет нужного элемента в массиве");
        }
    }
}
