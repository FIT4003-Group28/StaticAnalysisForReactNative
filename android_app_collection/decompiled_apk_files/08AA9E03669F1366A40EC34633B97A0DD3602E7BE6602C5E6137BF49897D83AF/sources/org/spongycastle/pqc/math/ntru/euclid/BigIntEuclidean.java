package org.spongycastle.pqc.math.ntru.euclid;

import java.math.BigInteger;
/* loaded from: classes2.dex */
public class BigIntEuclidean {
    public BigInteger gcd;
    public BigInteger x;
    public BigInteger y;

    private BigIntEuclidean() {
    }

    public static BigIntEuclidean calculate(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = BigInteger.ZERO;
        BigInteger bigInteger4 = BigInteger.ONE;
        BigInteger bigInteger5 = BigInteger.ONE;
        BigInteger bigInteger6 = BigInteger.ZERO;
        while (true) {
            BigInteger bigInteger7 = bigInteger2;
            BigInteger bigInteger8 = bigInteger;
            bigInteger = bigInteger7;
            BigInteger bigInteger9 = bigInteger4;
            bigInteger4 = bigInteger3;
            BigInteger bigInteger10 = bigInteger6;
            bigInteger6 = bigInteger5;
            if (!bigInteger.equals(BigInteger.ZERO)) {
                BigInteger[] divideAndRemainder = bigInteger8.divideAndRemainder(bigInteger);
                BigInteger bigInteger11 = divideAndRemainder[0];
                bigInteger2 = divideAndRemainder[1];
                bigInteger3 = bigInteger9.subtract(bigInteger11.multiply(bigInteger4));
                bigInteger5 = bigInteger10.subtract(bigInteger11.multiply(bigInteger6));
            } else {
                BigIntEuclidean bigIntEuclidean = new BigIntEuclidean();
                bigIntEuclidean.x = bigInteger9;
                bigIntEuclidean.y = bigInteger10;
                bigIntEuclidean.gcd = bigInteger8;
                return bigIntEuclidean;
            }
        }
    }
}
