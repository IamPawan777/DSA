/* ...arrays declaration & traverse...*/

// class Arrays {
//     public static void main(String[] args) {
//         // int[] a = {12,23,34,223,44};        //1st
        
//         String[] a = new String[3];          //2nd
//         a[0] = "rahul";
//         a[1] = "karan";
//         a[2] = "neha";
        
//         // System.out.println(a[2]);
        
//         for (int i = 0; i < a.length; i++) {     //traverse complete array
//             System.out.print(a[i] + " ");
//         }
//     }
// }






/* .....Insert element and print.... */

// class Arrays {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = scan.nextInt();
//         double[] val = new double[n];
        
//         System.out.println("Enter double values: ");
//         for(int i=0; i<val.length; i++) {               //traverse in array not size
//             val[i] = scan.nextDouble();                 //write nextDouble to insert double value
//         }

//         System.out.println("Number are: ");
//         for(int i=0; i<val.length; i++) {
//             System.out.print(val[i] + "   ");
//         }

//     }
// }







/* ....search any element.... */

import java.util.Scanner;
class Arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = s.nextInt();
        int[] value = new int[size];

        System.out.println("Enter Names: ");
        for (int i = 0; i < value.length; i++) {
            value[i] = s.nextInt();
        }

        System.out.print("Search name: ");
        int searchName = s.nextInt();

        for (int i = 0; i < value.length; i++) {
            if(value[i] == searchName) {
                System.out.print("At index : " + i);
            }
        }
    }
}