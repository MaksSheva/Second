package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        int read = System.in.read();//системный ввод - что ввёл, то и вывел
//        System.out.printf("read="+ (char)++read);

//        Scanner scanner = new Scanner(System.in); //програмка сканнер - что ввёл, то и получил на выводе
//        String s = scanner.next();
//        System.out.println(s);

//        Scanner scanner1 = new Scanner(System.in); //програмка сканнер - что ввёл, то и получил на выводе
//        String s1 = scanner1.nextLine(); // лайн - читает предложения с пробелами
//        System.out.println(s1);
//    }
//}


//todo Домашнее задание!!!!!!!!!!!!!!!!!!!!!!!!!1:

//public class Main {
//public static void main(String[] args) throws IOException {
//        float a=0.5f;
//        System.out.println(.2+.1);}}


//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        float a=0.5f;
//        System.out.println(.3f+.4f);
//        System.out.println((float)(.3+.4));
//        }
//    }


//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        float a=0.5f;
//        System.out.println(Double.NEGATIVE_INFINITY/100);
//
//    }
//}


//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        char ch1, ch2;
//
//        ch1=88;
//        ch2='Y';
//
//        System.out.println("ch1 and ch2:");
//        System.out.println(ch1 + "" + ch2);
//        }
//    }


//public class Main {
//
//    public static void main(String[] args) {
//        for (char i = 'a'; i <= 'z'; i++) {
//            System.out.println("i= " + (char) i);
//        }
//        }
//}


//public class Main {
//
//    public static void main(String[] args)  {
//        String a= "Hi";
//        String b= new String("Hi") ;
//       // System.out.println(a==b);
//        System.out.println(a.equals(b));
//        }
//
//    }


//todo Домашнее задание!!!!!!!!!!!!!!!!!!!!!!!
//public class Main {
//
//    public static void main(String[] args)  {
//
//        System.out.println("4/2=" +4/2 =="4/2=2");
//    }

//}
//

//public class Main {
//
//    public static void main(String[] args)  {
//        byte b1=50;
//        byte b2=-99;
//        b1 +=b2;
//
//        System.out.println("b1="+b2);
//        }
//
//    }


//public class Main {
//
//    public static void main(String[] args)  {
//        int a=100;
//
//        System.out.println(a<10? true:false);
//    }
//
//}


//public class Main {
//
//    public static void main(String[] args)  {
//    if (false){
//        System.out.println("true");}
//        else if (true){
//        System.out.println("false");}
//                else {
//            System.out.println("false");
//    }
//    }
//
//}

//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input age and press enter");
//            int x = scanner.nextInt();
//            boolean a = (x >= 3 && x <= 6);
//            boolean b = (x >= 7 && x <= 17);
//            boolean c = (x >= 18 && x <= 24);
//            boolean d = (x >= 24 && x <= 60);
//            boolean e = (x >= 60 && x <= 80);
//
//            if (a == true) {
//                System.out.println("garden");
//            } else if (b == true) {
//                System.out.println("school");
//            } else if (c == true) {
//                System.out.println("university");
//            } else if (d == true) {
//                System.out.println("Job");
//            } else if (e == true) {
//                System.out.println("pension");
//            } else {
//                System.out.println("false");
//            }
//        }
//
//    }
//





//public class Main {
////
////    public static void main(String[] args) {
////int x=8;
////switch (x){
////    case 1:
////    case 2:
////    case 3:
////    case 4:
////    case 5:
////        System.out.println("Work Day");
////        break;
////    case 6:
////    case 7:
////        System.out.println("Weekend");
////        break;
////        default:
////            System.out.println("Fuck");
////}
////
////
////    }
////}




//////////////////todo 4-ya para


//public class Main {
//    public static void main(String[] args) {
//        String strInt = "123";
//        String strDouble = "123.45";
//        int x;
//        double y;
//        x = Integer.parseInt(strInt);
//        y = Double.parseDouble(strDouble);
//        System.out.println("x=" + x);
//        System.out.println("y=" + y);
//        strInt = String.valueOf(x + 1);
//        strDouble = String.valueOf(y + 1);
//        System.out.println("strInt=" + strInt);
//        System.out.println("strDouble=" + strDouble);
//        String str;
//        str = "num=" + 345;
//        System.out.println(str);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        int[][] a = {{9,8,7,},
//                     {6,5,4},
//                    {1, 2, 3}};
////        for (int i = 0; i > a.length; i++){
////            System.out.println(a[i]);
////        };
////            for (int i : a){
////                System.out.println(i);
////        System.out.println(Arrays.toString(a));
//
////        Arrays.stream(a).forEach(System.out::println);
//        int[] a1=new int[3];
//        System.out.println(Arrays.deepToString(a));
//        }
//
//
//    }





public class Main {
    public static void main(String[] args) {
int sum=0;
int nums [][] = new int[3][5];
for (int i=0; i < 3;i++)
    for (int j=0; j<5; j++)
        nums[i][j] = (i+1)*(j+1);
for (int x[]:nums){ int sum1=0;
    for (int y:x){

        System.out.println("Value is:"+y);
        sum+=y;
        sum1+=y;

    }System.out.println("Sum1" +sum1);
}
        System.out.println("Summation" +sum);
    }


}
