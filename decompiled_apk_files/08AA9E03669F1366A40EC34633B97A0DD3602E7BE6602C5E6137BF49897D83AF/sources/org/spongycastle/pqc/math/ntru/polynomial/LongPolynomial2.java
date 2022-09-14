package org.spongycastle.pqc.math.ntru.polynomial;

import org.spongycastle.util.Arrays;
/* loaded from: classes2.dex */
public class LongPolynomial2 {
    private long[] coeffs;
    private int numCoeffs;

    public LongPolynomial2(IntegerPolynomial integerPolynomial) {
        int i;
        long j;
        this.numCoeffs = integerPolynomial.coeffs.length;
        this.coeffs = new long[(this.numCoeffs + 1) / 2];
        int i2 = 0;
        for (int i3 = 0; i3 < this.numCoeffs; i3 = i) {
            int i4 = i3 + 1;
            int i5 = integerPolynomial.coeffs[i3];
            while (i5 < 0) {
                i5 += 2048;
            }
            if (i4 < this.numCoeffs) {
                i = i4 + 1;
                j = integerPolynomial.coeffs[i4];
            } else {
                i = i4;
                j = 0;
            }
            while (j < 0) {
                j += 2048;
            }
            this.coeffs[i2] = i5 + (j << 24);
            i2++;
        }
    }

    private LongPolynomial2(long[] jArr) {
        this.coeffs = jArr;
    }

    private LongPolynomial2(int i) {
        this.coeffs = new long[i];
    }

    public LongPolynomial2 mult(LongPolynomial2 longPolynomial2) {
        int length = this.coeffs.length;
        if (longPolynomial2.coeffs.length != length || this.numCoeffs != longPolynomial2.numCoeffs) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        LongPolynomial2 multRecursive = multRecursive(longPolynomial2);
        if (multRecursive.coeffs.length > length) {
            if (this.numCoeffs % 2 == 0) {
                for (int i = length; i < multRecursive.coeffs.length; i++) {
                    int i2 = i - length;
                    multRecursive.coeffs[i2] = (multRecursive.coeffs[i2] + multRecursive.coeffs[i]) & 34342963199L;
                }
                multRecursive.coeffs = Arrays.copyOf(multRecursive.coeffs, length);
            } else {
                for (int i3 = length; i3 < multRecursive.coeffs.length; i3++) {
                    int i4 = i3 - length;
                    multRecursive.coeffs[i4] = multRecursive.coeffs[i4] + (multRecursive.coeffs[i3 - 1] >> 24);
                    multRecursive.coeffs[i4] = multRecursive.coeffs[i4] + ((2047 & multRecursive.coeffs[i3]) << 24);
                    long[] jArr = multRecursive.coeffs;
                    jArr[i4] = jArr[i4] & 34342963199L;
                }
                multRecursive.coeffs = Arrays.copyOf(multRecursive.coeffs, length);
                long[] jArr2 = multRecursive.coeffs;
                int length2 = multRecursive.coeffs.length - 1;
                jArr2[length2] = jArr2[length2] & 2047;
            }
        }
        LongPolynomial2 longPolynomial22 = new LongPolynomial2(multRecursive.coeffs);
        longPolynomial22.numCoeffs = this.numCoeffs;
        return longPolynomial22;
    }

    public IntegerPolynomial toIntegerPolynomial() {
        int[] iArr = new int[this.numCoeffs];
        int i = 0;
        for (int i2 = 0; i2 < this.coeffs.length; i2++) {
            int i3 = i + 1;
            iArr[i] = (int) (this.coeffs[i2] & 2047);
            if (i3 < this.numCoeffs) {
                i = i3 + 1;
                iArr[i3] = (int) ((this.coeffs[i2] >> 24) & 2047);
            } else {
                i = i3;
            }
        }
        return new IntegerPolynomial(iArr);
    }

    private LongPolynomial2 multRecursive(LongPolynomial2 longPolynomial2) {
        long[] jArr = this.coeffs;
        long[] jArr2 = longPolynomial2.coeffs;
        int length = longPolynomial2.coeffs.length;
        int i = 0;
        if (length <= 32) {
            int i2 = length * 2;
            LongPolynomial2 longPolynomial22 = new LongPolynomial2(new long[i2]);
            int i3 = 0;
            while (i3 < i2) {
                for (int max = Math.max(i, (i3 - length) + 1); max <= Math.min(i3, length - 1); max++) {
                    long j = jArr[i3 - max] * jArr2[max];
                    longPolynomial22.coeffs[i3] = (longPolynomial22.coeffs[i3] + (j & ((j & 2047) + 34342961152L))) & 34342963199L;
                    int i4 = i3 + 1;
                    longPolynomial22.coeffs[i4] = (longPolynomial22.coeffs[i4] + ((j >>> 48) & 2047)) & 34342963199L;
                }
                i3++;
                i = 0;
            }
            return longPolynomial22;
        }
        int i5 = length / 2;
        LongPolynomial2 longPolynomial23 = new LongPolynomial2(Arrays.copyOf(jArr, i5));
        LongPolynomial2 longPolynomial24 = new LongPolynomial2(Arrays.copyOfRange(jArr, i5, length));
        LongPolynomial2 longPolynomial25 = new LongPolynomial2(Arrays.copyOf(jArr2, i5));
        LongPolynomial2 longPolynomial26 = new LongPolynomial2(Arrays.copyOfRange(jArr2, i5, length));
        LongPolynomial2 longPolynomial27 = (LongPolynomial2) longPolynomial23.clone();
        longPolynomial27.add(longPolynomial24);
        LongPolynomial2 longPolynomial28 = (LongPolynomial2) longPolynomial25.clone();
        longPolynomial28.add(longPolynomial26);
        LongPolynomial2 multRecursive = longPolynomial23.multRecursive(longPolynomial25);
        LongPolynomial2 multRecursive2 = longPolynomial24.multRecursive(longPolynomial26);
        LongPolynomial2 multRecursive3 = longPolynomial27.multRecursive(longPolynomial28);
        multRecursive3.sub(multRecursive);
        multRecursive3.sub(multRecursive2);
        LongPolynomial2 longPolynomial29 = new LongPolynomial2(length * 2);
        for (int i6 = 0; i6 < multRecursive.coeffs.length; i6++) {
            longPolynomial29.coeffs[i6] = multRecursive.coeffs[i6] & 34342963199L;
        }
        for (int i7 = 0; i7 < multRecursive3.coeffs.length; i7++) {
            int i8 = i5 + i7;
            longPolynomial29.coeffs[i8] = (longPolynomial29.coeffs[i8] + multRecursive3.coeffs[i7]) & 34342963199L;
        }
        for (int i9 = 0; i9 < multRecursive2.coeffs.length; i9++) {
            int i10 = (i5 * 2) + i9;
            longPolynomial29.coeffs[i10] = (longPolynomial29.coeffs[i10] + multRecursive2.coeffs[i9]) & 34342963199L;
        }
        return longPolynomial29;
    }

    private void add(LongPolynomial2 longPolynomial2) {
        if (longPolynomial2.coeffs.length > this.coeffs.length) {
            this.coeffs = Arrays.copyOf(this.coeffs, longPolynomial2.coeffs.length);
        }
        for (int i = 0; i < longPolynomial2.coeffs.length; i++) {
            this.coeffs[i] = (this.coeffs[i] + longPolynomial2.coeffs[i]) & 34342963199L;
        }
    }

    private void sub(LongPolynomial2 longPolynomial2) {
        if (longPolynomial2.coeffs.length > this.coeffs.length) {
            this.coeffs = Arrays.copyOf(this.coeffs, longPolynomial2.coeffs.length);
        }
        for (int i = 0; i < longPolynomial2.coeffs.length; i++) {
            this.coeffs[i] = 34342963199L & ((this.coeffs[i] + 140737496743936L) - longPolynomial2.coeffs[i]);
        }
    }

    public void subAnd(LongPolynomial2 longPolynomial2, int i) {
        long j = i;
        long j2 = (j << 24) + j;
        for (int i2 = 0; i2 < longPolynomial2.coeffs.length; i2++) {
            this.coeffs[i2] = ((this.coeffs[i2] + 140737496743936L) - longPolynomial2.coeffs[i2]) & j2;
        }
    }

    public void mult2And(int i) {
        long j = i;
        long j2 = (j << 24) + j;
        for (int i2 = 0; i2 < this.coeffs.length; i2++) {
            this.coeffs[i2] = (this.coeffs[i2] << 1) & j2;
        }
    }

    public Object clone() {
        LongPolynomial2 longPolynomial2 = new LongPolynomial2((long[]) this.coeffs.clone());
        longPolynomial2.numCoeffs = this.numCoeffs;
        return longPolynomial2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LongPolynomial2) {
            return Arrays.areEqual(this.coeffs, ((LongPolynomial2) obj).coeffs);
        }
        return false;
    }
}
