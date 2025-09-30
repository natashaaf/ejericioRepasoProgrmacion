import java.util.Scanner;

//1: Pedir 5 números, y mostrar al final si se ha introducido alguno negativo.
//(Pseudocódigo y en Java

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int[] nums = new int[5];
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println("Ingrese el número: ");
//            nums[i] = sc.nextInt();
//        }
//
//
//        if (hayNegativo(nums)) {
//            System.out.println("Hay número negativo.");
//        } else {
//            System.out.println("No hay número negativo.");
//        }
//    }
//
//    public static boolean hayNegativo(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < 0) {
//                return true;
//            }
//        }
//        return false;
//    }
//}


//2: Pedir números e indicar si es múltiplo de 3. El programa finaliza con -1
//(Pseudocódigo, ordinograma y en Java)

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Ingrese el número: ");
            nums[i] = sc.nextInt();
        }
        if (esMultiploTres(nums)) {
            System.out.println("Hay número negativo.");
        } else {
            System.out.println("No hay número negativo.");
        }


    }
    public static boolean esMultiploTres(int[] nums){
        for(int i=0;i< nums.length;i++){
            if(nums[i]%2!=0){
                return true;
            }
        }

        return false;

    }
}