package defpackage;
/* compiled from: PG */
/* renamed from: ywh  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ywh {
    public static final /* synthetic */ int a = 0;

    static {
        int i = ywk.b;
    }

    public static int a(int i, int i2) {
        return i | (i2 << 16) | 268435456;
    }

    public static int b(int i, int i2) {
        return i | (i2 << 16);
    }

    public static int c(int i) {
        return (char) i;
    }

    public static long d(int i) {
        int i2 = (i >>> 16) & 4095;
        if (i2 >= 64) {
            return -1L;
        }
        return (1 << i2) - 1;
    }

    public static boolean e(int i) {
        return (i & 268435456) == 0;
    }
}
