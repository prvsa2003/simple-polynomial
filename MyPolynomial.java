    package MyPolynomial;

import java.util.Arrays;

public class MyPolynomial {

    private double[] coeffs;


    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getdegree() {
        int d = 0;
        for( int i = 0; i < coeffs.length; i++ )
            if( coeffs[ i ] != 0 ) d = i;
        return d;
    }

    public MyPolynomial add(MyPolynomial right) {
        int newdeg = Math.max(right.getdegree(), this.getdegree());
        double[] c = new double[newdeg + 1];
        try{
        for (int i = 0; i < c.length; ++i) {
            if (i>this.coeffs.length-1) {
               c[i]+=right.coeffs[i];
            } else if (i>right.coeffs.length-1) {
                c[i]+=this.coeffs[i];
            } else {
                c[i] += this.coeffs[i] + right.coeffs[i];
            }
        
        }
        
        }catch(Exception arryIndexOfBandException){
            System.err.println("!");
        }
        return new MyPolynomial(c);
    }
    
  public double evaluate(double x) {
        double p = 0;
        for (int i = getdegree(); i >= 0; i--){
            p = coeffs[i] + (x * p);}
        return p;
    }

public MyPolynomial Multiply(MyPolynomial m)  {
     int k = this.coeffs.length;
     int a = m.coeffs.length;
     double arr [] = new double[(k+a)-1];
       for (int i = 0; i <k; i++) {
           for (int j = 0; j <a; j++) {
             arr[i+j] = (this.coeffs[i]*m.coeffs[j]);
               
           }
           
       }
        return new MyPolynomial(arr);
  }
    public String toString() {
        if      (getdegree() == -1) return "0";
        else if (getdegree() ==  0) return "" + coeffs[0];
        else if (getdegree() ==  1) return coeffs[1] + "x + " + coeffs[0];
        String s = coeffs[getdegree()] + "x^" + getdegree();
        for (int i = getdegree() - 1; i >= 0; i--) {
            if      (coeffs[i] == 0) continue;
            else if (coeffs[i]  > 0) s = s + " + " + (coeffs[i]);
            else if (coeffs[i]  < 0) s = s + " - " + (-coeffs[i]);
            if      (i == 1) s = s + "x";
            else if (i >  1) s = s + "x^" + i;
        }
        return s;
    }


}
