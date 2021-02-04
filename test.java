public class test {
    public static void main(String[]args) {
       int[] a = {50,100};
       int[] b = new int[2];

       b = a;
       System.out.println(b[0]);
       b[0] = 66;
       System.out.println(a[0]);
 }
}
