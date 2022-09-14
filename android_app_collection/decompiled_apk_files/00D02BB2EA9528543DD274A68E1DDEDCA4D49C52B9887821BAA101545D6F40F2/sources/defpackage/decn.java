package defpackage;
/* compiled from: PG */
/* renamed from: decn  reason: default package */
/* loaded from: classes.dex */
public final class decn {
    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int b(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j <= j2 ? 0 : 1;
    }

    public static long c(long... jArr) {
        dbsk.a(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static long d(long j, long j2, long j3) {
        return Math.min(Math.max(j, j2), j3);
    }

    public static byte[] e(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return bArr;
    }

    public static long f(byte[] bArr) {
        int length = bArr.length;
        dbsk.h(length >= 8, "array too small: %s < %s", length, 8);
        return g(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long g(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((b2 & 255) << 48) | ((b & 255) << 56) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16) | ((b7 & 255) << 8) | (b8 & 255);
    }
}
