package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: anue  reason: default package */
/* loaded from: classes.dex */
final class anue {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] c = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] d = {67108863, 33554431};
    private static final int[] e = {26, 25};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr2[1];
        long j2 = jArr2[2];
        long j3 = jArr3[2];
        long j4 = (jArr2[1] * jArr3[3]) + (jArr2[3] * jArr3[1]);
        long j5 = (jArr2[3] * jArr3[3]) + (jArr2[1] * jArr3[5]) + (jArr2[5] * jArr3[1]);
        long j6 = jArr2[4];
        long j7 = jArr3[4];
        long j8 = (jArr2[3] * jArr3[5]) + (jArr2[5] * jArr3[3]) + (jArr2[1] * jArr3[7]) + (jArr2[7] * jArr3[1]);
        long j9 = (jArr2[5] * jArr3[5]) + (jArr2[3] * jArr3[7]) + (jArr2[7] * jArr3[3]) + (jArr2[1] * jArr3[9]) + (jArr2[9] * jArr3[1]);
        long j10 = jArr2[6];
        long j11 = jArr3[6];
        long j12 = (jArr2[5] * jArr3[7]) + (jArr2[7] * jArr3[5]) + (jArr2[3] * jArr3[9]) + (jArr2[9] * jArr3[3]);
        long j13 = (jArr2[7] * jArr3[7]) + (jArr2[5] * jArr3[9]) + (jArr2[9] * jArr3[5]);
        long j14 = jArr2[8];
        long j15 = jArr3[8];
        long j16 = (jArr2[7] * jArr3[9]) + (jArr2[9] * jArr3[7]);
        long j17 = jArr2[9];
        b(new long[]{jArr2[0] * jArr3[0], (jArr2[0] * jArr3[1]) + (jArr2[1] * jArr3[0]), ((j + j) * jArr3[1]) + (jArr2[0] * jArr3[2]) + (jArr2[2] * jArr3[0]), (jArr2[1] * jArr3[2]) + (jArr2[2] * jArr3[1]) + (jArr2[0] * jArr3[3]) + (jArr2[3] * jArr3[0]), (j2 * j3) + j4 + j4 + (jArr2[0] * jArr3[4]) + (jArr2[4] * jArr3[0]), (jArr2[2] * jArr3[3]) + (jArr2[3] * jArr3[2]) + (jArr2[1] * jArr3[4]) + (jArr2[4] * jArr3[1]) + (jArr2[0] * jArr3[5]) + (jArr2[5] * jArr3[0]), j5 + j5 + (jArr2[2] * jArr3[4]) + (jArr2[4] * jArr3[2]) + (jArr2[0] * jArr3[6]) + (jArr2[6] * jArr3[0]), (jArr2[3] * jArr3[4]) + (jArr2[4] * jArr3[3]) + (jArr2[2] * jArr3[5]) + (jArr2[5] * jArr3[2]) + (jArr2[1] * jArr3[6]) + (jArr2[6] * jArr3[1]) + (jArr2[0] * jArr3[7]) + (jArr2[7] * jArr3[0]), (j6 * j7) + j8 + j8 + (jArr2[2] * jArr3[6]) + (jArr2[6] * jArr3[2]) + (jArr2[0] * jArr3[8]) + (jArr2[8] * jArr3[0]), (jArr2[4] * jArr3[5]) + (jArr2[5] * jArr3[4]) + (jArr2[3] * jArr3[6]) + (jArr2[6] * jArr3[3]) + (jArr2[2] * jArr3[7]) + (jArr2[7] * jArr3[2]) + (jArr2[1] * jArr3[8]) + (jArr2[8] * jArr3[1]) + (jArr2[0] * jArr3[9]) + (jArr2[9] * jArr3[0]), j9 + j9 + (jArr2[4] * jArr3[6]) + (jArr2[6] * jArr3[4]) + (jArr2[2] * jArr3[8]) + (jArr2[8] * jArr3[2]), (jArr2[5] * jArr3[6]) + (jArr2[6] * jArr3[5]) + (jArr2[4] * jArr3[7]) + (jArr2[7] * jArr3[4]) + (jArr2[3] * jArr3[8]) + (jArr2[8] * jArr3[3]) + (jArr2[2] * jArr3[9]) + (jArr2[9] * jArr3[2]), (j10 * j11) + j12 + j12 + (jArr2[4] * jArr3[8]) + (jArr2[8] * jArr3[4]), (jArr2[6] * jArr3[7]) + (jArr2[7] * jArr3[6]) + (jArr2[5] * jArr3[8]) + (jArr2[8] * jArr3[5]) + (jArr2[4] * jArr3[9]) + (jArr2[9] * jArr3[4]), j13 + j13 + (jArr2[6] * jArr3[8]) + (jArr2[8] * jArr3[6]), (jArr2[7] * jArr3[8]) + (jArr2[8] * jArr3[7]) + (jArr2[6] * jArr3[9]) + (jArr2[9] * jArr3[6]), (j14 * j15) + j16 + j16, (jArr2[8] * jArr3[9]) + (jArr2[9] * jArr3[8]), (j17 + j17) * jArr3[9]}, jArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j = jArr[8] + (jArr[18] << 4);
        jArr[8] = j;
        long j2 = jArr[18];
        long j3 = j + j2 + j2;
        jArr[8] = j3;
        jArr[8] = j3 + jArr[18];
        long j4 = jArr[7] + (jArr[17] << 4);
        jArr[7] = j4;
        long j5 = jArr[17];
        long j6 = j4 + j5 + j5;
        jArr[7] = j6;
        jArr[7] = j6 + jArr[17];
        long j7 = jArr[6] + (jArr[16] << 4);
        jArr[6] = j7;
        long j8 = jArr[16];
        long j9 = j7 + j8 + j8;
        jArr[6] = j9;
        jArr[6] = j9 + jArr[16];
        long j10 = jArr[5] + (jArr[15] << 4);
        jArr[5] = j10;
        long j11 = jArr[15];
        long j12 = j10 + j11 + j11;
        jArr[5] = j12;
        jArr[5] = j12 + jArr[15];
        long j13 = jArr[4] + (jArr[14] << 4);
        jArr[4] = j13;
        long j14 = jArr[14];
        long j15 = j13 + j14 + j14;
        jArr[4] = j15;
        jArr[4] = j15 + jArr[14];
        long j16 = jArr[3] + (jArr[13] << 4);
        jArr[3] = j16;
        long j17 = jArr[13];
        long j18 = j16 + j17 + j17;
        jArr[3] = j18;
        jArr[3] = j18 + jArr[13];
        long j19 = jArr[2] + (jArr[12] << 4);
        jArr[2] = j19;
        long j20 = jArr[12];
        long j21 = j19 + j20 + j20;
        jArr[2] = j21;
        jArr[2] = j21 + jArr[12];
        long j22 = jArr[1] + (jArr[11] << 4);
        jArr[1] = j22;
        long j23 = jArr[11];
        long j24 = j22 + j23 + j23;
        jArr[1] = j24;
        jArr[1] = j24 + jArr[11];
        long j25 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j25;
        long j26 = jArr[10];
        long j27 = j25 + j26 + j26;
        jArr[0] = j27;
        jArr[0] = j27 + jArr[10];
        c(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j5;
        long j6 = jArr[10];
        long j7 = j5 + j6 + j6;
        jArr[0] = j7;
        jArr[0] = j7 + jArr[10];
        jArr[10] = 0;
        long j8 = jArr[0];
        long j9 = j8 / 67108864;
        jArr[0] = j8 - (j9 << 26);
        jArr[1] = jArr[1] + j9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = jArr2[0];
        long j3 = jArr2[1];
        long j4 = (j3 * j3) + (jArr2[0] * jArr2[2]);
        long j5 = (jArr2[1] * jArr2[2]) + (jArr2[0] * jArr2[3]);
        long j6 = jArr2[2];
        long j7 = jArr2[1];
        long j8 = jArr2[3];
        long j9 = jArr2[0];
        long j10 = (jArr2[2] * jArr2[3]) + (jArr2[1] * jArr2[4]) + (jArr2[0] * jArr2[5]);
        long j11 = jArr2[3];
        long j12 = jArr2[2];
        long j13 = jArr2[4];
        long j14 = jArr2[0];
        long j15 = jArr2[6];
        long j16 = jArr2[1];
        long j17 = (j11 * j11) + (j12 * j13) + (j14 * j15) + ((j16 + j16) * jArr2[5]);
        long j18 = (jArr2[3] * jArr2[4]) + (jArr2[2] * jArr2[5]) + (jArr2[1] * jArr2[6]) + (jArr2[0] * jArr2[7]);
        long j19 = jArr2[4];
        long j20 = jArr2[2];
        long j21 = jArr2[6];
        long j22 = jArr2[0];
        long j23 = jArr2[8];
        long j24 = (jArr2[1] * jArr2[7]) + (jArr2[3] * jArr2[5]);
        long j25 = (j20 * j21) + (j22 * j23) + j24 + j24;
        long j26 = (jArr2[4] * jArr2[5]) + (jArr2[3] * jArr2[6]) + (jArr2[2] * jArr2[7]) + (jArr2[1] * jArr2[8]) + (jArr2[0] * jArr2[9]);
        long j27 = jArr2[5];
        long j28 = jArr2[4];
        long j29 = jArr2[6];
        long j30 = jArr2[2];
        long j31 = jArr2[8];
        long j32 = (jArr2[3] * jArr2[7]) + (jArr2[1] * jArr2[9]);
        long j33 = (j27 * j27) + (j28 * j29) + (j30 * j31) + j32 + j32;
        long j34 = (jArr2[5] * jArr2[6]) + (jArr2[4] * jArr2[7]) + (jArr2[3] * jArr2[8]) + (jArr2[2] * jArr2[9]);
        long j35 = jArr2[6];
        long j36 = jArr2[4];
        long j37 = jArr2[8];
        long j38 = (jArr2[5] * jArr2[7]) + (jArr2[3] * jArr2[9]);
        long j39 = (j36 * j37) + j38 + j38;
        long j40 = (jArr2[6] * jArr2[7]) + (jArr2[5] * jArr2[8]) + (jArr2[4] * jArr2[9]);
        long j41 = jArr2[7];
        long j42 = jArr2[6];
        long j43 = jArr2[8];
        long j44 = jArr2[5];
        long j45 = (j41 * j41) + (j42 * j43) + ((j44 + j44) * jArr2[9]);
        long j46 = (jArr2[7] * jArr2[8]) + (jArr2[6] * jArr2[9]);
        long j47 = jArr2[8];
        long j48 = jArr2[8];
        long j49 = jArr2[9];
        b(new long[]{j * j, (j2 + j2) * jArr2[1], j4 + j4, j5 + j5, (j6 * j6) + (j7 * 4 * j8) + ((j9 + j9) * jArr2[4]), j10 + j10, j17 + j17, j18 + j18, (j19 * j19) + j25 + j25, j26 + j26, j33 + j33, j34 + j34, (j35 * j35) + j39 + j39, j40 + j40, j45 + j45, j46 + j46, (j47 * j47) + (jArr2[7] * 4 * jArr2[9]), (j48 + j48) * jArr2[9], (j49 + j49) * j49}, jArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] g(long[] jArr) {
        int i;
        int i2;
        long j;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                break;
            }
            int i10 = 0;
            while (i10 < 9) {
                long j3 = copyOf[i10];
                int[] iArr = e;
                int i11 = -((int) ((j3 & (j3 >> 31)) >> iArr[i10 & 1]));
                copyOf[i10] = copyOf[i10] + (i11 << iArr[i8]);
                i10++;
                copyOf[i10] = copyOf[i10] - i11;
            }
            long j4 = copyOf[9];
            int i12 = -((int) (((j4 >> 31) & j4) >> 25));
            copyOf[9] = j4 + (i12 << 25);
            copyOf[0] = copyOf[0] - (i12 * 19);
            i9++;
        }
        long j5 = copyOf[0];
        copyOf[0] = j5 + (i2 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j5 >> 31) & j5) >> 26)));
        int i13 = 0;
        for (i = 2; i13 < i; i = 2) {
            int i14 = 0;
            while (i14 < 9) {
                long j6 = copyOf[i14];
                int i15 = e[i14 & 1];
                copyOf[i14] = d[i7] & copyOf[i14];
                i14++;
                copyOf[i14] = copyOf[i14] + ((int) (j6 >> i15));
            }
            i13++;
        }
        copyOf[9] = 33554431 & copyOf[9];
        copyOf[0] = copyOf[0] + (((int) (j >> 25)) * 19);
        int i16 = ((((int) j2) - 67108845) >> 31) ^ (-1);
        for (int i17 = 1; i17 < 10; i17++) {
            int i18 = (d[i17 & 1] ^ ((int) copyOf[i17])) ^ (-1);
            int i19 = i18 & (i18 << 16);
            int i20 = i19 & (i19 << 8);
            int i21 = i20 & (i20 << 4);
            int i22 = i21 & (i21 << 2);
            i16 &= (i22 & (i22 + i22)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i16);
        long j7 = 33554431 & i16;
        copyOf[1] = copyOf[1] - j7;
        for (int i23 = 2; i23 < 10; i23 += 2) {
            copyOf[i23] = copyOf[i23] - (67108863 & i16);
            int i24 = i23 + 1;
            copyOf[i24] = copyOf[i24] - j7;
        }
        for (int i25 = 0; i25 < 10; i25++) {
            copyOf[i25] = copyOf[i25] << c[i25];
        }
        byte[] bArr = new byte[32];
        for (int i26 = 0; i26 < 10; i26++) {
            int[] iArr2 = b;
            bArr[iArr2[i26]] = (byte) (bArr[i3] | (copyOf[i26] & 255));
            bArr[iArr2[i26] + 1] = (byte) (bArr[i4] | ((copyOf[i26] >> 8) & 255));
            bArr[iArr2[i26] + 2] = (byte) (bArr[i5] | ((copyOf[i26] >> 16) & 255));
            bArr[iArr2[i26] + 3] = (byte) (bArr[i6] | (255 & (copyOf[i26] >> 24)));
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long[] h(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int[] iArr = b;
            jArr[i] = (((((bArr[iArr[i]] & 255) | ((bArr[iArr[i] + 1] & 255) << 8)) | ((bArr[iArr[i] + 2] & 255) << 16)) | ((bArr[iArr[i] + 3] & 255) << 24)) >> c[i]) & d[i & 1];
        }
        return jArr;
    }
}
