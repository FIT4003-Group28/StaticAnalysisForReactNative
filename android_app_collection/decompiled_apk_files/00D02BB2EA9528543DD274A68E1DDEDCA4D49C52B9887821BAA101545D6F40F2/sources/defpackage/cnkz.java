package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: cnkz  reason: default package */
/* loaded from: classes5.dex */
public final class cnkz {
    public static long a(byte[] bArr) {
        int length = bArr.length;
        int i = 37;
        char c = 0;
        if (length <= 32) {
            if (length > 16) {
                long j = (length + length) - 7286425919675154353L;
                long b = b(bArr, 0) * (-5435081209227447693L);
                long b2 = b(bArr, 8);
                long b3 = b(bArr, length - 8) * j;
                return c(Long.rotateRight(b + b2, 43) + Long.rotateRight(b3, 30) + (b(bArr, length - 16) * (-7286425919675154353L)), b + Long.rotateRight(b2 - 7286425919675154353L, 18) + b3, j);
            } else if (length >= 8) {
                long j2 = (length + length) - 7286425919675154353L;
                long b4 = b(bArr, 0) - 7286425919675154353L;
                long b5 = b(bArr, length - 8);
                return c((Long.rotateRight(b5, 37) * j2) + b4, (Long.rotateRight(b4, 25) + b5) * j2, j2);
            } else if (length >= 4) {
                return c(length + ((d(bArr, 0) & 4294967295L) << 3), d(bArr, length - 4) & 4294967295L, (length + length) - 7286425919675154353L);
            } else {
                if (length <= 0) {
                    return -7286425919675154353L;
                }
                return (-7286425919675154353L) * e((((bArr[0] & 255) + ((bArr[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr[length - 1] & 255) << 2)) * (-4348849565147123417L)));
            }
        } else if (length <= 64) {
            long j3 = (length + length) - 7286425919675154353L;
            long b6 = b(bArr, 0) * (-7286425919675154353L);
            long b7 = b(bArr, 8);
            long b8 = b(bArr, length - 8) * j3;
            long rotateRight = Long.rotateRight(b6 + b7, 43) + Long.rotateRight(b8, 30) + (b(bArr, length - 16) * (-7286425919675154353L));
            long rotateRight2 = Long.rotateRight(b7 - 7286425919675154353L, 18);
            long b9 = b(bArr, 16) * j3;
            long b10 = b(bArr, 24);
            long b11 = (rotateRight + b(bArr, length - 32)) * j3;
            return c(Long.rotateRight(b9 + b10, 43) + Long.rotateRight(b11, 30) + ((c(rotateRight, rotateRight2 + b6 + b8, j3) + b(bArr, length - 24)) * j3), b9 + Long.rotateRight(b10 + b6, 18) + b11, j3);
        } else {
            long e = e(-7956866745689871395L) * (-7286425919675154353L);
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long b12 = b(bArr, 0) + 95310865018149119L;
            int i2 = length - 1;
            int i3 = (i2 >> 6) * 64;
            int i4 = i2 & 63;
            int i5 = (i3 + i4) - 63;
            long j4 = 2480279821605975764L;
            int i6 = 0;
            while (true) {
                long rotateRight3 = Long.rotateRight(b12 + j4 + jArr[c] + b(bArr, i6 + 8), i);
                long rotateRight4 = Long.rotateRight(j4 + jArr[1] + b(bArr, i6 + 48), 42);
                long j5 = (rotateRight3 * (-5435081209227447693L)) ^ jArr2[1];
                long b13 = (rotateRight4 * (-5435081209227447693L)) + jArr[c] + b(bArr, i6 + 40);
                long rotateRight5 = Long.rotateRight(e + jArr2[c], 33) * (-5435081209227447693L);
                int i7 = i4;
                int i8 = i3;
                f(bArr, i6, jArr[1] * (-5435081209227447693L), j5 + jArr2[c], jArr);
                f(bArr, i6 + 32, rotateRight5 + jArr2[1], b(bArr, i6 + 16) + b13, jArr2);
                int i9 = i6 + 64;
                if (i9 == i8) {
                    long j6 = j5 & 255;
                    long j7 = (-5435081209227447693L) + j6 + j6;
                    long j8 = jArr2[0] + i7;
                    long j9 = jArr[0] + j8;
                    jArr[0] = j9;
                    jArr2[0] = j8 + j9;
                    long rotateRight6 = Long.rotateRight(rotateRight5 + b13 + j9 + b(bArr, i5 + 8), 37);
                    long rotateRight7 = Long.rotateRight(b13 + jArr[1] + b(bArr, i5 + 48), 42);
                    long j10 = (rotateRight6 * j7) ^ (jArr2[1] * 9);
                    long b14 = (rotateRight7 * j7) + (jArr[0] * 9) + b(bArr, i5 + 40);
                    long rotateRight8 = Long.rotateRight(j5 + jArr2[0], 33) * j7;
                    f(bArr, i5, jArr[1] * j7, jArr2[0] + j10, jArr);
                    f(bArr, i5 + 32, rotateRight8 + jArr2[1], b(bArr, i5 + 16) + b14, jArr2);
                    return c(c(jArr[0], jArr2[0], j7) + (e(b14) * (-4348849565147123417L)) + j10, c(jArr[1], jArr2[1], j7) + rotateRight8, j7);
                }
                i6 = i9;
                i3 = i8;
                e = j5;
                b12 = rotateRight5;
                i4 = i7;
                c = 0;
                j4 = b13;
                i = 37;
            }
        }
    }

    private static long b(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    private static long c(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static int d(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static long e(long j) {
        return j ^ (j >>> 47);
    }

    private static void f(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = b(bArr, i);
        long b2 = b(bArr, i + 8);
        long b3 = b(bArr, i + 16);
        long b4 = b(bArr, i + 24);
        long j3 = j + b;
        long rotateRight = Long.rotateRight(j2 + j3 + b4, 21);
        long j4 = b2 + j3 + b3;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + b4;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }
}
