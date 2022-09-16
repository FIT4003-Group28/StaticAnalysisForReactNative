package org.spongycastle.pqc.math.ntru.polynomial;

import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.pqc.math.ntru.util.ArrayEncoder;
import org.spongycastle.pqc.math.ntru.util.Util;
import org.spongycastle.util.Arrays;
/* loaded from: classes2.dex */
public class SparseTernaryPolynomial implements TernaryPolynomial {
    private static final int BITS_PER_INDEX = 11;
    private int N;
    private int[] negOnes;
    private int[] ones;

    SparseTernaryPolynomial(int i, int[] iArr, int[] iArr2) {
        this.N = i;
        this.ones = iArr;
        this.negOnes = iArr2;
    }

    public SparseTernaryPolynomial(IntegerPolynomial integerPolynomial) {
        this(integerPolynomial.coeffs);
    }

    public SparseTernaryPolynomial(int[] iArr) {
        this.N = iArr.length;
        this.ones = new int[this.N];
        this.negOnes = new int[this.N];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.N; i3++) {
            int i4 = iArr[i3];
            switch (i4) {
                case -1:
                    this.negOnes[i2] = i3;
                    i2++;
                    break;
                case 0:
                    break;
                case 1:
                    this.ones[i] = i3;
                    i++;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal value: " + i4 + ", must be one of {-1, 0, 1}");
            }
        }
        this.ones = Arrays.copyOf(this.ones, i);
        this.negOnes = Arrays.copyOf(this.negOnes, i2);
    }

    public static SparseTernaryPolynomial fromBinary(InputStream inputStream, int i, int i2, int i3) {
        int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(2047);
        return new SparseTernaryPolynomial(i, ArrayEncoder.decodeModQ(Util.readFullLength(inputStream, ((i2 * numberOfLeadingZeros) + 7) / 8), i2, 2048), ArrayEncoder.decodeModQ(Util.readFullLength(inputStream, ((numberOfLeadingZeros * i3) + 7) / 8), i3, 2048));
    }

    public static SparseTernaryPolynomial generateRandom(int i, int i2, int i3, SecureRandom secureRandom) {
        return new SparseTernaryPolynomial(Util.generateRandomTernary(i, i2, i3, secureRandom));
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial, org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial) {
        int[] iArr = integerPolynomial.coeffs;
        if (iArr.length != this.N) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        int[] iArr2 = new int[this.N];
        for (int i = 0; i != this.ones.length; i++) {
            int i2 = (this.N - 1) - this.ones[i];
            for (int i3 = this.N - 1; i3 >= 0; i3--) {
                iArr2[i3] = iArr2[i3] + iArr[i2];
                i2--;
                if (i2 < 0) {
                    i2 = this.N - 1;
                }
            }
        }
        for (int i4 = 0; i4 != this.negOnes.length; i4++) {
            int i5 = (this.N - 1) - this.negOnes[i4];
            for (int i6 = this.N - 1; i6 >= 0; i6--) {
                iArr2[i6] = iArr2[i6] - iArr[i5];
                i5--;
                if (i5 < 0) {
                    i5 = this.N - 1;
                }
            }
        }
        return new IntegerPolynomial(iArr2);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial, int i) {
        IntegerPolynomial mult = mult(integerPolynomial);
        mult.mod(i);
        return mult;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = bigIntPolynomial.coeffs;
        if (bigIntegerArr.length != this.N) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[this.N];
        for (int i = 0; i < this.N; i++) {
            bigIntegerArr2[i] = BigInteger.ZERO;
        }
        for (int i2 = 0; i2 != this.ones.length; i2++) {
            int i3 = (this.N - 1) - this.ones[i2];
            for (int i4 = this.N - 1; i4 >= 0; i4--) {
                bigIntegerArr2[i4] = bigIntegerArr2[i4].add(bigIntegerArr[i3]);
                i3--;
                if (i3 < 0) {
                    i3 = this.N - 1;
                }
            }
        }
        for (int i5 = 0; i5 != this.negOnes.length; i5++) {
            int i6 = (this.N - 1) - this.negOnes[i5];
            for (int i7 = this.N - 1; i7 >= 0; i7--) {
                bigIntegerArr2[i7] = bigIntegerArr2[i7].subtract(bigIntegerArr[i6]);
                i6--;
                if (i6 < 0) {
                    i6 = this.N - 1;
                }
            }
        }
        return new BigIntPolynomial(bigIntegerArr2);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public int[] getOnes() {
        return this.ones;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public int[] getNegOnes() {
        return this.negOnes;
    }

    public byte[] toBinary() {
        byte[] encodeModQ = ArrayEncoder.encodeModQ(this.ones, 2048);
        byte[] encodeModQ2 = ArrayEncoder.encodeModQ(this.negOnes, 2048);
        byte[] copyOf = Arrays.copyOf(encodeModQ, encodeModQ.length + encodeModQ2.length);
        System.arraycopy(encodeModQ2, 0, copyOf, encodeModQ.length, encodeModQ2.length);
        return copyOf;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial toIntegerPolynomial() {
        int[] iArr = new int[this.N];
        for (int i = 0; i != this.ones.length; i++) {
            iArr[this.ones[i]] = 1;
        }
        for (int i2 = 0; i2 != this.negOnes.length; i2++) {
            iArr[this.negOnes[i2]] = -1;
        }
        return new IntegerPolynomial(iArr);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public int size() {
        return this.N;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public void clear() {
        for (int i = 0; i < this.ones.length; i++) {
            this.ones[i] = 0;
        }
        for (int i2 = 0; i2 < this.negOnes.length; i2++) {
            this.negOnes[i2] = 0;
        }
    }

    public int hashCode() {
        return ((((this.N + 31) * 31) + Arrays.hashCode(this.negOnes)) * 31) + Arrays.hashCode(this.ones);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparseTernaryPolynomial sparseTernaryPolynomial = (SparseTernaryPolynomial) obj;
        return this.N == sparseTernaryPolynomial.N && Arrays.areEqual(this.negOnes, sparseTernaryPolynomial.negOnes) && Arrays.areEqual(this.ones, sparseTernaryPolynomial.ones);
    }
}
