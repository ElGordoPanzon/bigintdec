import java.math.BigDecimal;
import java.math.BigInteger;

public class Biginteger {
    public static void main(String[] args) {


        BigInteger bigInt1 = new BigInteger("12345");
        BigInteger bigInt2 = new BigInteger("98765");
        BigInteger gcd = bigInt1.gcd(bigInt2);

        System.out.println("The GCD of " + bigInt1 + " and " + bigInt2 + " is " + gcd);

        BigDecimal bigDec1 = new BigDecimal("12.34");
        BigDecimal bigDec2 = new BigDecimal("56.78");
        BigDecimal square1 = bigDec1.multiply(bigDec1);
        BigDecimal square2 = bigDec2.multiply(bigDec2);


        System.out.println("Square of " + bigDec1 + " is: " + square1);
        System.out.println("Square of " + bigDec2 + " is: " + square2);
    }
}