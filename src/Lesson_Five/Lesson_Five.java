package Lesson_Five;

import java.util.Arrays;

public class Lesson_Five {

//    public static void main(String[] args) {
//
//
//    int [][] a = new int[4][];
//    a[0] = new int[]{1,2,3};
//
//    a[1] = new int[]{1,1};
//
//    a[2] = new int[]{3};
//
//    a[3] = new int[]{2,2,2,2,2,2,2,2,2};
//        System.out.println(Arrays.deepToString(a));
//    }

    //todo Перевернуть массив!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] a1 = {8, 7, 6, 5, 4, 3, 2, 1};
//        System.out.println(Arrays.toString(a));
//
//        MyMethod(a);
//
//        System.out.println(Arrays.toString(a));
//
//        MyMethod(a1);
//
//        System.out.println(Arrays.toString(a1));
//    }
//
//    private static void MyMethod(int[] a) {
//        for (int i = 0; i < a.length / 2; i++) {
//            int tmp = a[i];
//            a[i] = a[a.length - 1 - i];
//            a[a.length - 1 - i] = tmp;
//
//        }
//    }
//todo СОРТИРОВКА!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    public static void main(String[] args) {
//        int[] a = {1, 3, 2, 6, 4, 5, 8, 7};
//        System.out.println(Arrays.toString(a));
//        for (int i = a.length - 1; i>=0; i--)
//        {
//            sort(a, i); //todo ССЫЛКА НА МЕТОД (МЕТОД ВНИЗУ)
//
//        }
//        System.out.println(Arrays.toString(a));
//    }
////TODO МЕТОД НА КОТОРЫЙ ССЫЛАЕТСЯ ССЫЛКА ORT(a, i)
//    private static void sort(int[] a, int i) {
//        for (int j = 0; j < i; j++) {
//            if (a[j]>a[j+1])
//            {
//                int tmp = a[j];
//                a[j] = a [j+1];
//                a[j+1]=tmp;
//            }
//
//        }
//    }


//    public static void main(String[] args) {
//
//        int twoD[][] = new int[4][];
//
//        twoD[0] = new int[1];
//        twoD[1] = new int[2];
//        twoD[2] = new int[3];
//        twoD[3] = new int[4];
//
//        int i, j, k = 0;
//
//        for (i = 0; i < 4; i++)
//            for (j = 0; j < i + 1; j++) {
//                twoD[i][j] = k;
//                k++;
//            }
//        for (i = 0; i < 4; i++)
//            System.out.print(twoD[i][j] + " ");
//        System.out.println();
//
//
//    }


//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30};
//        int pos = Arrays.binarySearch(arr, 25);
//        System.out.println(pos);
//    }


    public static void main(String[] args) {
        int[] arr0 = {1,2,3,4,5,6};
        int[] arr1 = {0,0,0,0,0,0,0,0};

        System.out.println("arr0: "+ Arrays.toString(arr0));
        System.out.println("arr1: "+ Arrays.toString(arr1));

        System.arraycopy(arr0,1,arr1,2,3);
        System.out.println(Arrays.toString(arr1));
    }




}






