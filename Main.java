package MyPolynomial;

public class Main {

    public static void main(String[] args) throws Exception {
        double[] coeffs = {1,6,9};
        MyPolynomial m = new MyPolynomial(coeffs);
        double [] ali = {4,7,1,8};
        MyPolynomial n = new MyPolynomial(ali);
                System.out.println(n);
        System.out.println(m);
        System.out.print(m.toString());
//        System.out.print("\nadd:");
//        System.out.println(m.add(n));
    }
}
