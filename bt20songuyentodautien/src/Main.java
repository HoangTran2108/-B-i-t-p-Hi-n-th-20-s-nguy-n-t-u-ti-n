public class Main {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên");
        int count = 0;
        int countSNT = 0;
         for (int i=2; i<200; i++) {
             if (countSNT <20) {
                 for (int j=1; j<=i; j++) {
                     if (i%j == 0) {
                         count++;
                     }
                 }
                 if (count==2) {
                     System.out.println(i);
                     countSNT++;
                 }
                 count = 0;
             }
             else {
                 break;
             }
         }
    }
}