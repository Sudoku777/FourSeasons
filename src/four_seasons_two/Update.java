package four_seasons_two;

import java.util.Arrays;

public class Update {
    public static void main(String[] args) {
        int [] arr1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(arr1[2]);//находим нужный элемент массива
        System.out.println(arr1.length);//длина массива
        //создания копии массива
        int [] arr2=arr1;
        System.out.println(arr2.length);
        //сортировка массива
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}
