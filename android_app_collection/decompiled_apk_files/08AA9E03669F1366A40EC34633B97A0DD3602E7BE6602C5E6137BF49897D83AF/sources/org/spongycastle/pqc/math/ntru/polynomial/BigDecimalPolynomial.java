package org.spongycastle.pqc.math.ntru.polynomial;

import java.math.BigDecimal;
/* loaded from: classes2.dex */
public class BigDecimalPolynomial {
    BigDecimal[] coeffs;
    private static final BigDecimal ZERO = new BigDecimal("0");
    private static final BigDecimal ONE_HALF = new BigDecimal("0.5");

    /* JADX INFO: Access modifiers changed from: package-private */
    public BigDecimalPolynomial(int i) {
        this.coeffs = new BigDecimal[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.coeffs[i2] = ZERO;
        }
    }

    BigDecimalPolynomial(BigDecimal[] bigDecimalArr) {
        this.coeffs = bigDecimalArr;
    }

    public BigDecimalPolynomial(BigIntPolynomial bigIntPolynomial) {
        int length = bigIntPolynomial.coeffs.length;
        this.coeffs = new BigDecimal[length];
        for (int i = 0; i < length; i++) {
            this.coeffs[i] = new BigDecimal(bigIntPolynomial.coeffs[i]);
        }
    }

    public void halve() {
        for (int i = 0; i < this.coeffs.length; i++) {
            this.coeffs[i] = this.coeffs[i].multiply(ONE_HALF);
        }
    }

    public BigDecimalPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        return mult(new BigDecimalPolynomial(bigIntPolynomial));
    }

    public BigDecimalPolynomial mult(BigDecimalPolynomial bigDecimalPolynomial) {
        int length = this.coeffs.length;
        if (bigDecimalPolynomial.coeffs.length != length) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        BigDecimalPolynomial multRecursive = multRecursive(bigDecimalPolynomial);
        if (multRecursive.coeffs.length > length) {
            for (int i = length; i < multRecursive.coeffs.length; i++) {
                int i2 = i - length;
                multRecursive.coeffs[i2] = multRecursive.coeffs[i2].add(multRecursive.coeffs[i]);
            }
            multRecursive.coeffs = copyOf(multRecursive.coeffs, length);
        }
        return multRecursive;
    }

    private BigDecimalPolynomial multRecursive(BigDecimalPolynomial bigDecimalPolynomial) {
        BigDecimal[] bigDecimalArr = this.coeffs;
        BigDecimal[] bigDecimalArr2 = bigDecimalPolynomial.coeffs;
        int length = bigDecimalPolynomial.coeffs.length;
        if (length <= 1) {
            BigDecimal[] bigDecimalArr3 = (BigDecimal[]) this.coeffs.clone();
            for (int i = 0; i < this.coeffs.length; i++) {
                bigDecimalArr3[i] = bigDecimalArr3[i].multiply(bigDecimalPolynomial.coeffs[0]);
            }
            return new BigDecimalPolynomial(bigDecimalArr3);
        }
        int i2 = length / 2;
        BigDecimalPolynomial bigDecimalPolynomial2 = new BigDecimalPolynomial(copyOf(bigDecimalArr, i2));
        BigDecimalPolynomial bigDecimalPolynomial3 = new BigDecimalPolynomial(copyOfRange(bigDecimalArr, i2, length));
        BigDecimalPolynomial bigDecimalPolynomial4 = new BigDecimalPolynomial(copyOf(bigDecimalArr2, i2));
        BigDecimalPolynomial bigDecimalPolynomial5 = new BigDecimalPolynomial(copyOfRange(bigDecimalArr2, i2, length));
        BigDecimalPolynomial bigDecimalPolynomial6 = (BigDecimalPolynomial) bigDecimalPolynomial2.clone();
        bigDecimalPolynomial6.add(bigDecimalPolynomial3);
        BigDecimalPolynomial bigDecimalPolynomial7 = (BigDecimalPolynomial) bigDecimalPolynomial4.clone();
        bigDecimalPolynomial7.add(bigDecimalPolynomial5);
        BigDecimalPolynomial multRecursive = bigDecimalPolynomial2.multRecursive(bigDecimalPolynomial4);
        BigDecimalPolynomial multRecursive2 = bigDecimalPolynomial3.multRecursive(bigDecimalPolynomial5);
        BigDecimalPolynomial multRecursive3 = bigDecimalPolynomial6.multRecursive(bigDecimalPolynomial7);
        multRecursive3.sub(multRecursive);
        multRecursive3.sub(multRecursive2);
        BigDecimalPolynomial bigDecimalPolynomial8 = new BigDecimalPolynomial((length * 2) - 1);
        for (int i3 = 0; i3 < multRecursive.coeffs.length; i3++) {
            bigDecimalPolynomial8.coeffs[i3] = multRecursive.coeffs[i3];
        }
        for (int i4 = 0; i4 < multRecursive3.coeffs.length; i4++) {
            int i5 = i2 + i4;
            bigDecimalPolynomial8.coeffs[i5] = bigDecimalPolynomial8.coeffs[i5].add(multRecursive3.coeffs[i4]);
        }
        for (int i6 = 0; i6 < multRecursive2.coeffs.length; i6++) {
            int i7 = (i2 * 2) + i6;
            bigDecimalPolynomial8.coeffs[i7] = bigDecimalPolynomial8.coeffs[i7].add(multRecursive2.coeffs[i6]);
        }
        return bigDecimalPolynomial8;
    }

    public void add(BigDecimalPolynomial bigDecimalPolynomial) {
        if (bigDecimalPolynomial.coeffs.length > this.coeffs.length) {
            this.coeffs = copyOf(this.coeffs, bigDecimalPolynomial.coeffs.length);
            for (int length = this.coeffs.length; length < this.coeffs.length; length++) {
                this.coeffs[length] = ZERO;
            }
        }
        for (int i = 0; i < bigDecimalPolynomial.coeffs.length; i++) {
            this.coeffs[i] = this.coeffs[i].add(bigDecimalPolynomial.coeffs[i]);
        }
    }

    void sub(BigDecimalPolynomial bigDecimalPolynomial) {
        if (bigDecimalPolynomial.coeffs.length > this.coeffs.length) {
            this.coeffs = copyOf(this.coeffs, bigDecimalPolynomial.coeffs.length);
            for (int length = this.coeffs.length; length < this.coeffs.length; length++) {
                this.coeffs[length] = ZERO;
            }
        }
        for (int i = 0; i < bigDecimalPolynomial.coeffs.length; i++) {
            this.coeffs[i] = this.coeffs[i].subtract(bigDecimalPolynomial.coeffs[i]);
        }
    }

    public BigIntPolynomial round() {
        int length = this.coeffs.length;
        BigIntPolynomial bigIntPolynomial = new BigIntPolynomial(length);
        for (int i = 0; i < length; i++) {
            bigIntPolynomial.coeffs[i] = this.coeffs[i].setScale(0, 6).toBigInteger();
        }
        return bigIntPolynomial;
    }

    public Object clone() {
        return new BigDecimalPolynomial((BigDecimal[]) this.coeffs.clone());
    }

    private BigDecimal[] copyOf(BigDecimal[] bigDecimalArr, int i) {
        BigDecimal[] bigDecimalArr2 = new BigDecimal[i];
        if (bigDecimalArr.length < i) {
            i = bigDecimalArr.length;
        }
        System.arraycopy(bigDecimalArr, 0, bigDecimalArr2, 0, i);
        return bigDecimalArr2;
    }

    private BigDecimal[] copyOfRange(BigDecimal[] bigDecimalArr, int i, int i2) {
        int i3 = i2 - i;
        BigDecimal[] bigDecimalArr2 = new BigDecimal[i3];
        if (bigDecimalArr.length - i < i3) {
            i3 = bigDecimalArr.length - i;
        }
        System.arraycopy(bigDecimalArr, i, bigDecimalArr2, 0, i3);
        return bigDecimalArr2;
    }

    public BigDecimal[] getCoeffs() {
        BigDecimal[] bigDecimalArr = new BigDecimal[this.coeffs.length];
        System.arraycopy(this.coeffs, 0, bigDecimalArr, 0, this.coeffs.length);
        return bigDecimalArr;
    }
}
