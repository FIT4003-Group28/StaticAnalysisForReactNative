package defpackage;
/* compiled from: PG */
/* renamed from: aoex  reason: default package */
/* loaded from: classes.dex */
public final class aoex {
    public static volatile ayax a;
    public static volatile ayax b;
    public static volatile ayax c;
    public static volatile ayax d;
    public static volatile ayax e;
    public static volatile ayax f;
    public static volatile ayax g;

    private aoex() {
    }

    public static int a(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static void c(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (k(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || k(b4) || k(b5)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        int j = ((b2 & 7) << 18) | (j(b3) << 12) | (j(b4) << 6) | j(b5);
        cArr[i] = (char) ((j >>> 10) + 55232);
        cArr[i + 1] = (char) ((j & 1023) + 56320);
    }

    public static void d(byte b2, char[] cArr, int i) {
        cArr[i] = (char) b2;
    }

    public static void f(byte b2, byte b3, char[] cArr, int i) {
        if (b2 >= -62) {
            if (k(b3)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i] = (char) (((b2 & 31) << 6) | j(b3));
            return;
        }
        throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
    }

    public static boolean g(byte b2) {
        return b2 >= 0;
    }

    public static boolean h(byte b2) {
        return b2 < -16;
    }

    public static boolean i(byte b2) {
        return b2 < -32;
    }

    private static int j(byte b2) {
        return b2 & 63;
    }

    private static boolean k(byte b2) {
        return b2 > -65;
    }

    public static void e(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!k(b3)) {
            if (b2 == -32) {
                if (b3 >= -96) {
                    b2 = -32;
                }
            }
            if (b2 == -19) {
                if (b3 < -96) {
                    b2 = -19;
                }
            }
            if (!k(b4)) {
                cArr[i] = (char) (((b2 & 15) << 12) | (j(b3) << 6) | j(b4));
                return;
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }
}
