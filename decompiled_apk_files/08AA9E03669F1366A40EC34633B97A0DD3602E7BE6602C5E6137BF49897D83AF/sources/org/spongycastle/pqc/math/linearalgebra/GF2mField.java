package org.spongycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;
/* loaded from: classes2.dex */
public class GF2mField {
    private int degree;
    private int polynomial;

    public int add(int i, int i2) {
        return i ^ i2;
    }

    public GF2mField(int i) {
        this.degree = 0;
        if (i >= 32) {
            throw new IllegalArgumentException(" Error: the degree of field is too large ");
        }
        if (i < 1) {
            throw new IllegalArgumentException(" Error: the degree of field is non-positive ");
        }
        this.degree = i;
        this.polynomial = PolynomialRingGF2.getIrreduciblePolynomial(i);
    }

    public GF2mField(int i, int i2) {
        this.degree = 0;
        if (i != PolynomialRingGF2.degree(i2)) {
            throw new IllegalArgumentException(" Error: the degree is not correct");
        }
        if (!PolynomialRingGF2.isIrreducible(i2)) {
            throw new IllegalArgumentException(" Error: given polynomial is reducible");
        }
        this.degree = i;
        this.polynomial = i2;
    }

    public GF2mField(byte[] bArr) {
        this.degree = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.polynomial = LittleEndianConversions.OS2IP(bArr);
        if (!PolynomialRingGF2.isIrreducible(this.polynomial)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.degree = PolynomialRingGF2.degree(this.polynomial);
    }

    public GF2mField(GF2mField gF2mField) {
        this.degree = 0;
        this.degree = gF2mField.degree;
        this.polynomial = gF2mField.polynomial;
    }

    public int getDegree() {
        return this.degree;
    }

    public int getPolynomial() {
        return this.polynomial;
    }

    public byte[] getEncoded() {
        return LittleEndianConversions.I2OSP(this.polynomial);
    }

    public int mult(int i, int i2) {
        return PolynomialRingGF2.modMultiply(i, i2, this.polynomial);
    }

    public int exp(int i, int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i2 < 0) {
            i = inverse(i);
            i2 = -i2;
        }
        int i3 = i;
        int i4 = 1;
        while (i2 != 0) {
            if ((i2 & 1) == 1) {
                i4 = mult(i4, i3);
            }
            i3 = mult(i3, i3);
            i2 >>>= 1;
        }
        return i4;
    }

    public int inverse(int i) {
        return exp(i, (1 << this.degree) - 2);
    }

    public int sqRoot(int i) {
        for (int i2 = 1; i2 < this.degree; i2++) {
            i = mult(i, i);
        }
        return i;
    }

    public int getRandomElement(SecureRandom secureRandom) {
        return RandUtils.nextInt(secureRandom, 1 << this.degree);
    }

    public int getRandomNonZeroElement() {
        return getRandomNonZeroElement(new SecureRandom());
    }

    public int getRandomNonZeroElement(SecureRandom secureRandom) {
        int nextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
        int i = 0;
        while (nextInt == 0 && i < 1048576) {
            nextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
            i++;
        }
        if (i == 1048576) {
            return 1;
        }
        return nextInt;
    }

    public boolean isElementOfThisField(int i) {
        return this.degree == 31 ? i >= 0 : i >= 0 && i < (1 << this.degree);
    }

    public String elementToStr(int i) {
        String str = "";
        for (int i2 = 0; i2 < this.degree; i2++) {
            str = (((byte) i) & 1) == 0 ? "0" + str : "1" + str;
            i >>>= 1;
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2mField)) {
            return false;
        }
        GF2mField gF2mField = (GF2mField) obj;
        return this.degree == gF2mField.degree && this.polynomial == gF2mField.polynomial;
    }

    public int hashCode() {
        return this.polynomial;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.degree + ") = GF(2)[X]/<" + polyToString(this.polynomial) + "> ";
    }

    private static String polyToString(int i) {
        String str = "";
        if (i == 0) {
            return "0";
        }
        if (((byte) (i & 1)) == 1) {
            str = "1";
        }
        int i2 = i >>> 1;
        int i3 = 1;
        while (i2 != 0) {
            if (((byte) (i2 & 1)) == 1) {
                str = str + "+x^" + i3;
            }
            i2 >>>= 1;
            i3++;
        }
        return str;
    }
}
