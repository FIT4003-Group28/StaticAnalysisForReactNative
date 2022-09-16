package org.spongycastle.math.raw;

import java.math.BigInteger;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.util.Pack;
/* loaded from: classes2.dex */
public abstract class Nat192 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & M) + (iArr2[0] & M) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & M) + (iArr2[1] & M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & M) + (iArr2[2] & M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & M) + (iArr2[3] & M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[4] & M) + (iArr2[4] & M);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & M) + (iArr2[5] & M);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & M) + (iArr2[0] & M) + (iArr3[0] & M) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & M) + (iArr2[1] & M) + (iArr3[1] & M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & M) + (iArr2[2] & M) + (iArr3[2] & M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & M) + (iArr2[3] & M) + (iArr3[3] & M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[4] & M) + (iArr2[4] & M) + (iArr3[4] & M);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & M) + (iArr2[5] & M) + (iArr3[5] & M);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (iArr[0] & M) + (iArr2[0] & M) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & M) + (iArr2[1] & M);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & M) + (iArr2[2] & M);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & M) + (iArr2[3] & M);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[4] & M) + (iArr2[4] & M);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & M) + (M & iArr2[5]);
        iArr2[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i4 = i2 + 0;
        long j = (i3 & M) + (iArr[i + 0] & M) + (iArr2[i4] & M);
        iArr2[i4] = (int) j;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (iArr[i + 1] & M) + (iArr2[i5] & M);
        iArr2[i5] = (int) j2;
        int i6 = i2 + 2;
        long j3 = (j2 >>> 32) + (iArr[i + 2] & M) + (iArr2[i6] & M);
        iArr2[i6] = (int) j3;
        int i7 = i2 + 3;
        long j4 = (j3 >>> 32) + (iArr[i + 3] & M) + (iArr2[i7] & M);
        iArr2[i7] = (int) j4;
        int i8 = i2 + 4;
        long j5 = (j4 >>> 32) + (iArr[i + 4] & M) + (iArr2[i8] & M);
        iArr2[i8] = (int) j5;
        int i9 = i2 + 5;
        long j6 = (j5 >>> 32) + (iArr[i + 5] & M) + (M & iArr2[i9]);
        iArr2[i9] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = i + 0;
        int i4 = i2 + 0;
        long j = (iArr[i3] & M) + (iArr2[i4] & M) + 0;
        int i5 = (int) j;
        iArr[i3] = i5;
        iArr2[i4] = i5;
        int i6 = i + 1;
        int i7 = i2 + 1;
        long j2 = (j >>> 32) + (iArr[i6] & M) + (iArr2[i7] & M);
        int i8 = (int) j2;
        iArr[i6] = i8;
        iArr2[i7] = i8;
        int i9 = i + 2;
        int i10 = i2 + 2;
        long j3 = (j2 >>> 32) + (iArr[i9] & M) + (iArr2[i10] & M);
        int i11 = (int) j3;
        iArr[i9] = i11;
        iArr2[i10] = i11;
        int i12 = i + 3;
        int i13 = i2 + 3;
        long j4 = (j3 >>> 32) + (iArr[i12] & M) + (iArr2[i13] & M);
        int i14 = (int) j4;
        iArr[i12] = i14;
        iArr2[i13] = i14;
        int i15 = i + 4;
        int i16 = i2 + 4;
        long j5 = (j4 >>> 32) + (iArr[i15] & M) + (iArr2[i16] & M);
        int i17 = (int) j5;
        iArr[i15] = i17;
        iArr2[i16] = i17;
        int i18 = i + 5;
        int i19 = i2 + 5;
        long j6 = (j5 >>> 32) + (iArr[i18] & M) + (M & iArr2[i19]);
        int i20 = (int) j6;
        iArr[i18] = i20;
        iArr2[i19] = i20;
        return (int) (j6 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean gte = gte(iArr, i, iArr2, i2);
        if (gte) {
            sub(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            sub(iArr2, i2, iArr, i, iArr3, i3);
        }
        return gte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        int i = 0;
        while (bigInteger.signum() != 0) {
            create[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return create;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] create64 = create64();
        int i = 0;
        while (bigInteger.signum() != 0) {
            create64[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return create64;
    }

    public static int getBit(int[] iArr, int i) {
        if (i == 0) {
            return iArr[0] & 1;
        }
        int i2 = i >> 5;
        if (i2 < 0 || i2 >= 6) {
            return 0;
        }
        return (iArr[i2] >>> (i & 31)) & 1;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            int i2 = iArr[i] ^ PKIFailureInfo.systemUnavail;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 5; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ PKIFailureInfo.systemUnavail;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & M;
        long j2 = iArr2[1] & M;
        long j3 = iArr2[2] & M;
        long j4 = iArr2[3] & M;
        long j5 = iArr2[4] & M;
        long j6 = iArr2[5] & M;
        long j7 = iArr[0] & M;
        long j8 = (j7 * j) + 0;
        iArr3[0] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        int i = 1;
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j3);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j4);
        iArr3[3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j5);
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[5] = (int) j13;
        iArr3[6] = (int) (j13 >>> 32);
        for (int i2 = 6; i < i2; i2 = 6) {
            long j14 = iArr[i] & M;
            int i3 = i + 0;
            long j15 = (j14 * j) + (iArr3[i3] & M) + 0;
            iArr3[i3] = (int) j15;
            int i4 = i + 1;
            long j16 = (j15 >>> 32) + (j14 * j2) + (iArr3[i4] & M);
            iArr3[i4] = (int) j16;
            int i5 = i + 2;
            long j17 = (j16 >>> 32) + (j14 * j3) + (iArr3[i5] & M);
            iArr3[i5] = (int) j17;
            int i6 = i + 3;
            long j18 = (j17 >>> 32) + (j14 * j4) + (iArr3[i6] & M);
            iArr3[i6] = (int) j18;
            int i7 = i + 4;
            long j19 = (j18 >>> 32) + (j14 * j5) + (iArr3[i7] & M);
            iArr3[i7] = (int) j19;
            int i8 = i + 5;
            long j20 = (j19 >>> 32) + (j14 * j6) + (iArr3[i8] & M);
            iArr3[i8] = (int) j20;
            iArr3[i + 6] = (int) (j20 >>> 32);
            i = i4;
            j3 = j3;
        }
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2 + 0] & M;
        long j2 = iArr2[i2 + 1] & M;
        long j3 = iArr2[i2 + 2] & M;
        long j4 = iArr2[i2 + 3] & M;
        long j5 = iArr2[i2 + 4] & M;
        long j6 = iArr2[i2 + 5] & M;
        long j7 = iArr[i + 0] & M;
        long j8 = (j7 * j) + 0;
        iArr3[i3 + 0] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[i3 + 1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j3);
        iArr3[i3 + 2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j4);
        iArr3[i3 + 3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j5);
        iArr3[i3 + 4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[i3 + 5] = (int) j13;
        iArr3[i3 + 6] = (int) (j13 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 6) {
            i5 += i4;
            long j14 = iArr[i + i6] & M;
            int i7 = i5 + 0;
            long j15 = (j14 * j) + (iArr3[i7] & M) + 0;
            iArr3[i7] = (int) j15;
            int i8 = i5 + 1;
            int i9 = i6;
            long j16 = (j15 >>> 32) + (j14 * j2) + (iArr3[i8] & M);
            iArr3[i8] = (int) j16;
            int i10 = i5 + 2;
            long j17 = (j16 >>> 32) + (j14 * j3) + (iArr3[i10] & M);
            iArr3[i10] = (int) j17;
            int i11 = i5 + 3;
            long j18 = (j17 >>> 32) + (j14 * j4) + (iArr3[i11] & M);
            iArr3[i11] = (int) j18;
            int i12 = i5 + 4;
            long j19 = (j18 >>> 32) + (j14 * j5) + (iArr3[i12] & M);
            iArr3[i12] = (int) j19;
            int i13 = i5 + 5;
            long j20 = (j19 >>> 32) + (j14 * j6) + (iArr3[i13] & M);
            iArr3[i13] = (int) j20;
            iArr3[i5 + 6] = (int) (j20 >>> 32);
            i6 = i9 + 1;
            i4 = 1;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j = iArr2[0] & M;
        long j2 = iArr2[1] & M;
        long j3 = iArr2[2] & M;
        long j4 = iArr2[3] & M;
        long j5 = iArr2[4] & M;
        long j6 = iArr2[5] & M;
        long j7 = 0;
        int i7 = 0;
        while (i7 < 6) {
            long j8 = j6;
            long j9 = iArr[i7] & M;
            long j10 = j5;
            long j11 = (j9 * j) + (iArr3[i] & M) + 0;
            iArr3[i7 + 0] = (int) j11;
            int i8 = i7 + 1;
            long j12 = j2;
            long j13 = (j11 >>> 32) + (j9 * j2) + (iArr3[i8] & M);
            iArr3[i8] = (int) j13;
            long j14 = j3;
            long j15 = (j13 >>> 32) + (j9 * j3) + (iArr3[i2] & M);
            iArr3[i7 + 2] = (int) j15;
            long j16 = (j15 >>> 32) + (j9 * j4) + (iArr3[i3] & M);
            iArr3[i7 + 3] = (int) j16;
            long j17 = (j16 >>> 32) + (j9 * j10) + (iArr3[i4] & M);
            iArr3[i7 + 4] = (int) j17;
            long j18 = (j17 >>> 32) + (j9 * j8) + (iArr3[i5] & M);
            iArr3[i7 + 5] = (int) j18;
            long j19 = (j18 >>> 32) + j7 + (iArr3[i6] & M);
            iArr3[i7 + 6] = (int) j19;
            j7 = j19 >>> 32;
            j6 = j8;
            i7 = i8;
            j5 = j10;
            j2 = j12;
            j3 = j14;
            j4 = j4;
        }
        return (int) j7;
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2 + 0] & M;
        long j2 = iArr2[i2 + 1] & M;
        long j3 = iArr2[i2 + 2] & M;
        long j4 = iArr2[i2 + 3] & M;
        long j5 = iArr2[i2 + 4] & M;
        long j6 = iArr2[i2 + 5] & M;
        int i4 = i3;
        int i5 = 0;
        long j7 = 0;
        while (i5 < 6) {
            long j8 = iArr[i + i5] & M;
            int i6 = i4 + 0;
            long j9 = j6;
            long j10 = (j8 * j) + (iArr3[i6] & M) + 0;
            iArr3[i6] = (int) j10;
            int i7 = i4 + 1;
            long j11 = (j10 >>> 32) + (j8 * j2) + (iArr3[i7] & M);
            iArr3[i7] = (int) j11;
            int i8 = i4 + 2;
            long j12 = (j11 >>> 32) + (j8 * j3) + (iArr3[i8] & M);
            iArr3[i8] = (int) j12;
            int i9 = i4 + 3;
            long j13 = (j12 >>> 32) + (j8 * j4) + (iArr3[i9] & M);
            iArr3[i9] = (int) j13;
            int i10 = i4 + 4;
            long j14 = (j13 >>> 32) + (j8 * j5) + (iArr3[i10] & M);
            iArr3[i10] = (int) j14;
            int i11 = i4 + 5;
            long j15 = (j14 >>> 32) + (j8 * j9) + (iArr3[i11] & M);
            iArr3[i11] = (int) j15;
            int i12 = i4 + 6;
            long j16 = (j15 >>> 32) + j7 + (iArr3[i12] & M);
            iArr3[i12] = (int) j16;
            j7 = j16 >>> 32;
            i5++;
            j = j;
            j6 = j9;
            j2 = j2;
            i4 = i7;
            j3 = j3;
        }
        return (int) j7;
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = i & M;
        long j2 = iArr[i2 + 0] & M;
        long j3 = (j * j2) + (iArr2[i3 + 0] & M) + 0;
        iArr3[i4 + 0] = (int) j3;
        long j4 = iArr[i2 + 1] & M;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (iArr2[i3 + 1] & M);
        iArr3[i4 + 1] = (int) j5;
        long j6 = iArr[i2 + 2] & M;
        long j7 = (j5 >>> 32) + (j * j6) + j4 + (iArr2[i3 + 2] & M);
        iArr3[i4 + 2] = (int) j7;
        long j8 = iArr[i2 + 3] & M;
        long j9 = (j7 >>> 32) + (j * j8) + j6 + (iArr2[i3 + 3] & M);
        iArr3[i4 + 3] = (int) j9;
        long j10 = iArr[i2 + 4] & M;
        long j11 = (j9 >>> 32) + (j * j10) + j8 + (iArr2[i3 + 4] & M);
        iArr3[i4 + 4] = (int) j11;
        long j12 = iArr[i2 + 5] & M;
        long j13 = (j11 >>> 32) + (j * j12) + j10 + (iArr2[i3 + 5] & M);
        iArr3[i4 + 5] = (int) j13;
        return (j13 >>> 32) + j12;
    }

    public static int mulWordAddExt(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = i & M;
        int i4 = i3 + 0;
        long j2 = ((iArr[i2 + 0] & M) * j) + (iArr2[i4] & M) + 0;
        iArr2[i4] = (int) j2;
        int i5 = i3 + 1;
        long j3 = (j2 >>> 32) + ((iArr[i2 + 1] & M) * j) + (iArr2[i5] & M);
        iArr2[i5] = (int) j3;
        int i6 = i3 + 2;
        long j4 = (j3 >>> 32) + ((iArr[i2 + 2] & M) * j) + (iArr2[i6] & M);
        iArr2[i6] = (int) j4;
        int i7 = i3 + 3;
        long j5 = (j4 >>> 32) + ((iArr[i2 + 3] & M) * j) + (iArr2[i7] & M);
        iArr2[i7] = (int) j5;
        int i8 = i3 + 4;
        long j6 = (j5 >>> 32) + ((iArr[i2 + 4] & M) * j) + (iArr2[i8] & M);
        iArr2[i8] = (int) j6;
        int i9 = i3 + 5;
        long j7 = (j6 >>> 32) + (j * (iArr[i2 + 5] & M)) + (iArr2[i9] & M);
        iArr2[i9] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & M;
        long j3 = j & M;
        int i3 = i2 + 0;
        long j4 = (j2 * j3) + (iArr[i3] & M) + 0;
        iArr[i3] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        int i4 = i2 + 1;
        long j7 = (j4 >>> 32) + j6 + (iArr[i4] & M);
        iArr[i4] = (int) j7;
        int i5 = i2 + 2;
        long j8 = (j7 >>> 32) + j5 + (iArr[i5] & M);
        iArr[i5] = (int) j8;
        long j9 = j8 >>> 32;
        int i6 = i2 + 3;
        long j10 = j9 + (iArr[i6] & M);
        iArr[i6] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = i & M;
        long j2 = i2 & M;
        int i4 = i3 + 0;
        long j3 = (j * j2) + (iArr[i4] & M) + 0;
        iArr[i4] = (int) j3;
        int i5 = i3 + 1;
        long j4 = (j3 >>> 32) + j2 + (iArr[i5] & M);
        iArr[i5] = (int) j4;
        long j5 = j4 >>> 32;
        int i6 = i3 + 2;
        long j6 = j5 + (iArr[i6] & M);
        iArr[i6] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i3, 3);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & M;
        int i3 = i2 + 0;
        long j3 = ((j & M) * j2) + (iArr[i3] & M) + 0;
        iArr[i3] = (int) j3;
        long j4 = j2 * (j >>> 32);
        int i4 = i2 + 1;
        long j5 = (j3 >>> 32) + j4 + (iArr[i4] & M);
        iArr[i4] = (int) j5;
        int i5 = i2 + 2;
        long j6 = (j5 >>> 32) + (iArr[i5] & M);
        iArr[i5] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i2, 3);
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = i & M;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = j2 + ((iArr[i3] & M) * j);
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 6);
        return (int) j2;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & M;
        int i = 5;
        int i2 = 12;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j2 = iArr[i] & M;
            long j3 = j2 * j2;
            int i5 = i2 - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i2 = i5 - 1;
            iArr2[i2] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i6 << 31) & M);
                iArr2[0] = (int) j4;
                long j6 = iArr[1] & M;
                long j7 = iArr2[2] & M;
                long j8 = j5 + (j6 * j);
                int i7 = (int) j8;
                iArr2[1] = (i7 << 1) | (((int) (j4 >>> 32)) & 1);
                long j9 = j7 + (j8 >>> 32);
                long j10 = iArr[2] & M;
                long j11 = iArr2[3] & M;
                long j12 = iArr2[4] & M;
                long j13 = j9 + (j10 * j);
                int i8 = (int) j13;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                int i9 = i8 >>> 31;
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j12 + (j14 >>> 32);
                long j16 = j14 & M;
                long j17 = iArr[3] & M;
                long j18 = (iArr2[5] & M) + (j15 >>> 32);
                long j19 = j15 & M;
                long j20 = (iArr2[6] & M) + (j18 >>> 32);
                long j21 = j18 & M;
                long j22 = j16 + (j17 * j);
                int i10 = (int) j22;
                iArr2[3] = (i10 << 1) | i9;
                long j23 = j19 + (j22 >>> 32) + (j17 * j6);
                long j24 = j21 + (j23 >>> 32) + (j17 * j10);
                long j25 = j23 & M;
                long j26 = j20 + (j24 >>> 32);
                long j27 = j24 & M;
                long j28 = iArr[4] & M;
                long j29 = (iArr2[7] & M) + (j26 >>> 32);
                long j30 = j26 & M;
                long j31 = j29 & M;
                long j32 = j25 + (j28 * j);
                int i11 = (int) j32;
                iArr2[4] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                long j33 = j27 + (j32 >>> 32) + (j28 * j6);
                long j34 = j30 + (j33 >>> 32) + (j28 * j10);
                long j35 = j33 & M;
                long j36 = j31 + (j34 >>> 32) + (j28 * j17);
                long j37 = j34 & M;
                long j38 = (iArr2[8] & M) + (j29 >>> 32) + (j36 >>> 32);
                long j39 = j36 & M;
                long j40 = iArr[5] & M;
                long j41 = (iArr2[9] & M) + (j38 >>> 32);
                long j42 = j38 & M;
                long j43 = j41 & M;
                long j44 = j35 + (j40 * j);
                int i13 = (int) j44;
                iArr2[5] = (i13 << 1) | i12;
                long j45 = j37 + (j44 >>> 32) + (j40 * j6);
                long j46 = j39 + (j45 >>> 32) + (j40 * j10);
                long j47 = j42 + (j46 >>> 32) + (j40 * j17);
                long j48 = j43 + (j47 >>> 32) + (j40 * j28);
                long j49 = (iArr2[10] & M) + (j41 >>> 32) + (j48 >>> 32);
                int i14 = (int) j45;
                iArr2[6] = (i13 >>> 31) | (i14 << 1);
                int i15 = (int) j46;
                iArr2[7] = (i15 << 1) | (i14 >>> 31);
                int i16 = (int) j47;
                iArr2[8] = (i15 >>> 31) | (i16 << 1);
                int i17 = (int) j48;
                iArr2[9] = (i17 << 1) | (i16 >>> 31);
                int i18 = (int) j49;
                iArr2[10] = (i17 >>> 31) | (i18 << 1);
                iArr2[11] = (i18 >>> 31) | ((iArr2[11] + ((int) (j49 >>> 32))) << 1);
                return;
            }
            i = i4;
            i3 = i6;
        }
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j = M;
        long j2 = iArr[i + 0] & M;
        int i12 = 12;
        int i13 = 5;
        int i14 = 0;
        while (true) {
            int i15 = i13 - 1;
            long j3 = iArr[i + i13] & j;
            long j4 = j3 * j3;
            int i16 = i12 - 1;
            iArr2[i2 + i16] = ((int) (j4 >>> 33)) | (i14 << 31);
            i12 = i16 - 1;
            iArr2[i2 + i12] = (int) (j4 >>> 1);
            i14 = (int) j4;
            if (i15 <= 0) {
                long j5 = j2 * j2;
                long j6 = ((i14 << 31) & M) | (j5 >>> 33);
                iArr2[i2 + 0] = (int) j5;
                long j7 = iArr[i + 1] & M;
                long j8 = iArr2[i3] & M;
                long j9 = j6 + (j7 * j2);
                int i17 = (int) j9;
                iArr2[i2 + 1] = (i17 << 1) | (((int) (j5 >>> 32)) & 1);
                long j10 = j8 + (j9 >>> 32);
                long j11 = iArr[i + 2] & M;
                long j12 = iArr2[i4] & M;
                long j13 = iArr2[i5] & M;
                long j14 = j10 + (j11 * j2);
                int i18 = (int) j14;
                iArr2[i2 + 2] = (i17 >>> 31) | (i18 << 1);
                long j15 = j12 + (j14 >>> 32) + (j11 * j7);
                long j16 = j13 + (j15 >>> 32);
                long j17 = j15 & M;
                long j18 = iArr[i + 3] & M;
                long j19 = (iArr2[i6] & M) + (j16 >>> 32);
                long j20 = j16 & M;
                long j21 = j19 & M;
                long j22 = j17 + (j18 * j2);
                int i19 = (int) j22;
                iArr2[i2 + 3] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                long j23 = j20 + (j22 >>> 32) + (j18 * j7);
                long j24 = j21 + (j23 >>> 32) + (j18 * j11);
                long j25 = j23 & M;
                long j26 = (iArr2[i7] & M) + (j19 >>> 32) + (j24 >>> 32);
                long j27 = j24 & M;
                long j28 = iArr[i + 4] & M;
                long j29 = (iArr2[i8] & M) + (j26 >>> 32);
                long j30 = j26 & M;
                long j31 = j29 & M;
                long j32 = j25 + (j28 * j2);
                int i21 = (int) j32;
                iArr2[i2 + 4] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                long j33 = j27 + (j32 >>> 32) + (j28 * j7);
                long j34 = j30 + (j33 >>> 32) + (j28 * j11);
                long j35 = j33 & M;
                long j36 = j31 + (j34 >>> 32) + (j28 * j18);
                long j37 = j34 & M;
                long j38 = (iArr2[i9] & M) + (j29 >>> 32) + (j36 >>> 32);
                long j39 = j36 & M;
                long j40 = iArr[i + 5] & M;
                long j41 = (iArr2[i10] & M) + (j38 >>> 32);
                long j42 = j38 & M;
                long j43 = j41 & M;
                long j44 = j35 + (j2 * j40);
                int i23 = (int) j44;
                iArr2[i2 + 5] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                long j45 = j37 + (j44 >>> 32) + (j7 * j40);
                long j46 = j39 + (j45 >>> 32) + (j40 * j11);
                long j47 = j42 + (j46 >>> 32) + (j40 * j18);
                long j48 = j43 + (j47 >>> 32) + (j40 * j28);
                long j49 = (iArr2[i11] & M) + (j41 >>> 32) + (j48 >>> 32);
                int i25 = (int) j45;
                iArr2[i2 + 6] = i24 | (i25 << 1);
                int i26 = (int) j46;
                iArr2[i2 + 7] = (i25 >>> 31) | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j47;
                iArr2[i2 + 8] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j48;
                iArr2[i2 + 9] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) j49;
                iArr2[i2 + 10] = i31 | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = i2 + 11;
                iArr2[i34] = ((iArr2[i34] + ((int) (j49 >>> 32))) << 1) | i33;
                return;
            }
            i13 = i15;
            j = 4294967295L;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((iArr[0] & M) - (iArr2[0] & M)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((iArr[1] & M) - (iArr2[1] & M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr[2] & M) - (iArr2[2] & M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr[3] & M) - (iArr2[3] & M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[4] & M) - (iArr2[4] & M));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[5] & M) - (iArr2[5] & M));
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((iArr[i + 0] & M) - (iArr2[i2 + 0] & M)) + 0;
        iArr3[i3 + 0] = (int) j;
        long j2 = (j >> 32) + ((iArr[i + 1] & M) - (iArr2[i2 + 1] & M));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr[i + 2] & M) - (iArr2[i2 + 2] & M));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr[i + 3] & M) - (iArr2[i2 + 3] & M));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[i + 4] & M) - (iArr2[i2 + 4] & M));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[i + 5] & M) - (iArr2[i2 + 5] & M));
        iArr3[i3 + 5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((iArr3[0] & M) - (iArr[0] & M)) - (iArr2[0] & M)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + (((iArr3[1] & M) - (iArr[1] & M)) - (iArr2[1] & M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + (((iArr3[2] & M) - (iArr[2] & M)) - (iArr2[2] & M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + (((iArr3[3] & M) - (iArr[3] & M)) - (iArr2[3] & M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + (((iArr3[4] & M) - (iArr[4] & M)) - (iArr2[4] & M));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + (((iArr3[5] & M) - (iArr[5] & M)) - (iArr2[5] & M));
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = ((iArr2[0] & M) - (iArr[0] & M)) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((iArr2[1] & M) - (iArr[1] & M));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr2[2] & M) - (iArr[2] & M));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr2[3] & M) - (iArr[3] & M));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr2[4] & M) - (iArr[4] & M));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr2[5] & M) - (M & iArr[5]));
        iArr2[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = i2 + 0;
        long j = ((iArr2[i3] & M) - (iArr[i + 0] & M)) + 0;
        iArr2[i3] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >> 32) + ((iArr2[i4] & M) - (iArr[i + 1] & M));
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >> 32) + ((iArr2[i5] & M) - (iArr[i + 2] & M));
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >> 32) + ((iArr2[i6] & M) - (iArr[i + 3] & M));
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (j4 >> 32) + ((iArr2[i7] & M) - (iArr[i + 4] & M));
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (j5 >> 32) + ((iArr2[i8] & M) - (iArr[i + 5] & M));
        iArr2[i8] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
    }
}
