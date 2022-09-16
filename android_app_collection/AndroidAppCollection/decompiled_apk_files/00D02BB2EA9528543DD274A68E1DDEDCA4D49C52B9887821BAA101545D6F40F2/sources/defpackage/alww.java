package defpackage;
/* compiled from: PG */
/* renamed from: alww  reason: default package */
/* loaded from: classes.dex */
public final class alww {
    public static float a(int i, int i2) {
        return i > 0 ? i2 == 0 ? i - 1 : i + e(i2) : e(i2);
    }

    public static float b(int i, int i2) {
        if (i2 == 0) {
            return 30.0f;
        }
        return i + e(i2);
    }

    public static float c(int i, int i2) {
        return i2 == 0 ? Math.max(0, i - 4) : i + e(i2);
    }

    public static float d(int i, int i2) {
        if (i2 == 0) {
            return 30.0f;
        }
        return i + e(i2);
    }

    public static float e(int i) {
        return i / 8.0f;
    }

    public static float f(int i) {
        return i / 100.0f;
    }

    public static float g(int i) {
        return i / 1000.0f;
    }

    public static boolean h(int i, int i2) {
        return (i & i2) != 0;
    }
}
