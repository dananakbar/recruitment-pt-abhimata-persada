import java.math.BigInteger;
import java.util.Arrays;

public class logics{
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getFiboSeq(8)));
        System.out.println(getFiboNum(8));

        System.out.println(Arrays.toString(getFiboSeq(100)));
        System.out.println(getFiboNum(100));

        System.out.println(Arrays.toString(getEvenSeq(20)));
        System.out.println(getEvenNum(20));

    }

    // public static int[] getFiboSeq(int num){
    //     if (num == 0) return new int[]{0};
    //     else if (num == 1) return new int[]{0, 1};
    //     else if (num >= 2){
    //         int[] arr = new int[num + 1];

    //         arr[0] = 0;
    //         arr[1] = 1;

    //         for (int i = 2; i <= num; i++){
    //             arr[i] = arr[i - 2] + arr[i - 1];
    //         }
    //         return arr;
    //     }
    //     else return new int[0];
    // }

    // public static int getFiboNum(int num){
    //     return getFiboSeq(num)[num];
    // }

    /* Fungsi ini mengembalikan array yang berisi deretan angka Fibonacci.
     * Parameter merupakan integer sebagai panjang deretan.
     * Tipe data yang nilai yang dikembalikan adalah array BigInteger.
     * Deretan Fibonacci dimulai dari F0 dengan nilai 0.
     * Jika parameter negatif, maka array kosong dikembalikan.
    */
    public static BigInteger[] getFiboSeq(int num){
        if (num == 0) return new BigInteger[]{BigInteger.ZERO};
        else if (num == 1) return new BigInteger[]{BigInteger.ZERO, BigInteger.ONE};
        else if (num >= 2){
            BigInteger[] arr = new BigInteger[num + 1];

            arr[0] = BigInteger.ZERO;
            arr[1] = BigInteger.ONE;

            for (int i = 2; i <= num; i++){
                arr[i] = arr[i - 2].add(arr[i - 1]);
            }
            return arr;
        }
        else return new BigInteger[0];
    }

    /* Fungsi ini mengembalikan angka ke-sekian dalam deretan angka Fibonacci.
     * Parameter merupakan integer sebagai angka keberapa dalam deretan.
     * Tipe data nilai yang dikembalikan adalah BigInteger.
     * Jika parameter negatif, maka nilai -1 dikembalikan.
    */
    public static BigInteger getFiboNum(int num){
        if (num >= 0) return getFiboSeq(num)[num];
        else return BigInteger.valueOf(-1);
    }

    public static int[] getEvenSeq(int num){
        if (num <= 0) return new int[0];
        else {
            int[] arr = new int[num];
            for (int i = 0; i < num; i++){
                arr[i] = 2 * (i + 1);
            }
            return arr;
        }
    }

    public static int getEvenNum(int num){
        if (num < 0) return -1;
        else return 2 * num;
    }

}