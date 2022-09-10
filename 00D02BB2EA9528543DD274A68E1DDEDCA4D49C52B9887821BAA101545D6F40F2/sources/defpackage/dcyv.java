package defpackage;
/* compiled from: PG */
/* renamed from: dcyv  reason: default package */
/* loaded from: classes5.dex */
public final class dcyv extends dcyt {
    public static final dcza a = new dcyv();

    private static long g(long j) {
        return j ^ (j >>> 47);
    }

    private static long h(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static void i(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long a2 = dczj.a(bArr, i);
        long a3 = dczj.a(bArr, i + 8);
        long a4 = dczj.a(bArr, i + 16);
        long a5 = dczj.a(bArr, i + 24);
        long j3 = j + a2;
        long rotateRight = Long.rotateRight(j2 + j3 + a5, 21);
        long j4 = a3 + j3 + a4;
        long rotateRight2 = Long.rotateRight(j4, 44);
        jArr[0] = j4 + a5;
        jArr[1] = rotateRight + rotateRight2 + j3;
    }

    @Override // defpackage.dcyp
    public final dcyz e(byte[] bArr, int i) {
        long j;
        long a2;
        long rotateRight;
        int i2;
        char c = 0;
        dbsk.u(0, i, bArr.length);
        int i3 = 37;
        long j2 = -7286425919675154353L;
        if (i <= 32) {
            if (i > 16) {
                long j3 = (i + i) - 7286425919675154353L;
                long a3 = dczj.a(bArr, 0) * (-5435081209227447693L);
                long a4 = dczj.a(bArr, 8);
                long a5 = dczj.a(bArr, i - 8) * j3;
                j2 = h(Long.rotateRight(a3 + a4, 43) + Long.rotateRight(a5, 30) + (dczj.a(bArr, i - 16) * (-7286425919675154353L)), a3 + Long.rotateRight(a4 - 7286425919675154353L, 18) + a5, j3);
            } else if (i >= 8) {
                long j4 = (i + i) - 7286425919675154353L;
                long a6 = dczj.a(bArr, 0) - 7286425919675154353L;
                long a7 = dczj.a(bArr, i - 8);
                j2 = h((Long.rotateRight(a7, 37) * j4) + a6, (Long.rotateRight(a6, 25) + a7) * j4, j4);
            } else if (i >= 4) {
                j2 = h(i + ((dczj.b(bArr, 0) & 4294967295L) << 3), dczj.b(bArr, i - 4) & 4294967295L, (i + i) - 7286425919675154353L);
            } else if (i > 0) {
                j2 = (-7286425919675154353L) * g((((bArr[0] & 255) + ((bArr[i >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((i + ((bArr[i - 1] & 255) << 2)) * (-4348849565147123417L)));
            }
        } else if (i <= 64) {
            long j5 = (i + i) - 7286425919675154353L;
            long a8 = dczj.a(bArr, 0) * (-7286425919675154353L);
            long a9 = dczj.a(bArr, 8);
            long a10 = dczj.a(bArr, i - 8) * j5;
            long rotateRight2 = Long.rotateRight(a8 + a9, 43) + Long.rotateRight(a10, 30) + (dczj.a(bArr, i - 16) * (-7286425919675154353L));
            long rotateRight3 = Long.rotateRight(a9 - 7286425919675154353L, 18);
            long a11 = dczj.a(bArr, 16) * j5;
            long a12 = dczj.a(bArr, 24);
            long a13 = (dczj.a(bArr, i - 32) + rotateRight2) * j5;
            j2 = h(Long.rotateRight(a11 + a12, 43) + Long.rotateRight(a13, 30) + ((h(rotateRight2, rotateRight3 + a8 + a10, j5) + dczj.a(bArr, i - 24)) * j5), a11 + Long.rotateRight(a12 + a8, 18) + a13, j5);
        } else {
            long g = g(-7956866745689871395L) * (-7286425919675154353L);
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long a14 = dczj.a(bArr, 0) + 95310865018149119L;
            int i4 = i - 1;
            int i5 = (i4 >> 6) * 64;
            int i6 = i4 & 63;
            int i7 = (i5 + i6) - 63;
            long j6 = 2480279821605975764L;
            int i8 = 0;
            while (true) {
                long rotateRight4 = Long.rotateRight(a14 + j6 + jArr[c] + dczj.a(bArr, i8 + 8), i3);
                long rotateRight5 = Long.rotateRight(j6 + jArr[1] + dczj.a(bArr, i8 + 48), 42);
                j = (rotateRight4 * (-5435081209227447693L)) ^ jArr2[1];
                a2 = (rotateRight5 * (-5435081209227447693L)) + jArr[c] + dczj.a(bArr, i8 + 40);
                rotateRight = Long.rotateRight(g + jArr2[c], 33) * (-5435081209227447693L);
                i2 = i6;
                int i9 = i5;
                i(bArr, i8, jArr[1] * (-5435081209227447693L), j + jArr2[c], jArr);
                i(bArr, i8 + 32, rotateRight + jArr2[1], dczj.a(bArr, i8 + 16) + a2, jArr2);
                int i10 = i8 + 64;
                if (i10 == i9) {
                    break;
                }
                i8 = i10;
                i5 = i9;
                g = j;
                a14 = rotateRight;
                i6 = i2;
                c = 0;
                j6 = a2;
                i3 = 37;
            }
            long j7 = j & 255;
            long j8 = (-5435081209227447693L) + j7 + j7;
            long j9 = jArr2[0] + i2;
            long j10 = jArr[0] + j9;
            jArr[0] = j10;
            jArr2[0] = j9 + j10;
            long rotateRight6 = Long.rotateRight(rotateRight + a2 + j10 + dczj.a(bArr, i7 + 8), 37);
            long rotateRight7 = Long.rotateRight(a2 + jArr[1] + dczj.a(bArr, i7 + 48), 42);
            long j11 = (rotateRight6 * j8) ^ (jArr2[1] * 9);
            long a15 = (rotateRight7 * j8) + (jArr[0] * 9) + dczj.a(bArr, i7 + 40);
            long rotateRight8 = Long.rotateRight(j + jArr2[0], 33) * j8;
            i(bArr, i7, jArr[1] * j8, j11 + jArr2[0], jArr);
            i(bArr, i7 + 32, rotateRight8 + jArr2[1], dczj.a(bArr, i7 + 16) + a15, jArr2);
            j2 = h(h(jArr[0], jArr2[0], j8) + (g(a15) * (-4348849565147123417L)) + j11, h(jArr[1], jArr2[1], j8) + rotateRight8, j8);
        }
        return new dcyy(j2);
    }

    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
