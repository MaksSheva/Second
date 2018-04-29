import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Second {


    // TODO: 1)================================================
//    public static void main(String[] args) throws IOException {
//        System.out.println("Insert name");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        System.out.println("Hello " + name);
//    }
//}
    // TODO: 2)================================================
    // TODO: Аргументы командной строки 1 2 3 4 5 6 7 8 9 10
//    public static void main(String[] args) throws IOException {
//        for (int i=args.length; i>0; i--){
//            System.out.print(args[i - 1] + " ");
//        }
//    }
    // TODO: 3)================================================
//    public static void main(String[] args) throws IOException {
//        System.out.println("Введите число рендомных значений:");
//        Scanner scanner = new Scanner(System.in);
//        int x = Integer.parseInt(scanner.next());
//        Random rand = new Random();
//        int[] array = new int[x];
//
//        for (int i : array) {
//            array[i] = rand.nextInt(100);
//            if (array[i] % 2 == 0) {
//                System.out.print("Строка: " + array[i] + " ");
//            } else {
//                System.out.println("\nПереход: " + array[i]);
//            }
//
//        }
//    }
//}

    // TODO: 4)================================================
//    public static void main(String[] args) throws IOException {
//        System.out.println("Insert Password");
//        Scanner scanner = new Scanner(System.in);
//        String psw = scanner.next();
//        String confirm = "123456AZaz";
//        if  (confirm == psw) {
//            System.out.println("Password is correct");
//        }
//        else {
//            System.out.println("Wrong password");
//        }
//    }
//}

    //TODO: 5)================================================
//    public static void main(String[] args) throws IOException {
//        int s = 0;
//        int p = 1;
//
//        for (int i = 0; i < args.length; i++) {
//            int arg = Integer.parseInt(args[i]);
//            s = s + arg;
//            p = p * arg;
//        }
//        System.out.println("Сумма аргументов: " + s);
//        System.out.println("Произведение аргументов: " + p);
//    }
//}



    public static void main(String arg[]) {
        String input;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите числа через пробел,для выхода нажмите enter");
            input = sc.nextLine();
        }
        String[] numbers = input.split("\\s");
        int i[] = new int[numbers.length];
        for (int j = 0; j < numbers.length; j++) {
            i[j] = Integer.valueOf(numbers[j]);
        }
        System.out.println(Arrays.toString(i));
    }
}


