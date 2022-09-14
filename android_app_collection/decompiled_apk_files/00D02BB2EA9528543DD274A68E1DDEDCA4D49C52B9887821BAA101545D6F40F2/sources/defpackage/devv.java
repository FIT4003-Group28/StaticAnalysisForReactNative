package defpackage;
/* compiled from: PG */
/* renamed from: devv  reason: default package */
/* loaded from: classes6.dex */
final class devv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(byte b) {
        return b >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(byte b) {
        return b < -32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(byte b) {
        return b < -16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62) {
            if (h(b2)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i] = (char) (((b & 31) << 6) | i(b2));
            return;
        }
        throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (h(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || h(b3) || h(b4)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        int i2 = ((b & 7) << 18) | (i(b2) << 12) | (i(b3) << 6) | i(b4);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }

    private static boolean h(byte b) {
        return b > -65;
    }

    private static int i(byte b) {
        return b & 63;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!h(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if ((b != -19 || b2 < -96) && !h(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | (i(b2) << 6) | i(b3));
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }
}
