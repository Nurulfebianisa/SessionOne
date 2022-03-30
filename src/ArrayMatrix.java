public class ArrayMatrix {
    public static void main(String[] args) {
        //array 1 dimension
        int[] angka= {1,2,3,4,5,6,7,8};
        //print element inside angka
        for (int i = 0; i <angka.length; i ++){
            System.out.println(angka[1]);
        }
        //array 20
        System.out.println("\nCetak Array 20");
        System.out.println(".........................");
        int [][] angka20 = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        for (int baris = 0; baris < 3; baris++ ){
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.println(angka20[baris][kolom] + "    ");
            }
            System.out.println("   ");

            }
        }
    }

