package defpackage;
/* compiled from: PG */
/* renamed from: cpwl  reason: default package */
/* loaded from: classes5.dex */
public final class cpwl {
    private static final Object[] a = new Object[0];

    public static <T> T a(T t) {
        h(t, null);
        return t;
    }

    public static void b(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(i(str, objArr));
    }

    public static void c(boolean z, String str) {
        b(z, str, a);
    }

    public static void d(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalStateException(i(str, objArr));
    }

    public static void e(boolean z, String str) {
        d(z, str, a);
    }

    public static <T> void f(T t, String str, Object... objArr) {
        if (t != null) {
            return;
        }
        throw new NullPointerException(i(str, objArr));
    }

    public static <T> void h(T t, String str) {
        f(t, str, a);
    }

    private static String i(String str, Object... objArr) {
        return String.format(String.valueOf(str), objArr);
    }

    public static void g(int i, int i2) {
        if (i2 >= 0) {
            if (i < 0) {
                throw new IndexOutOfBoundsException(i("%s (%d) must not be negative", "index", Integer.valueOf(i)));
            }
            if (i >= i2) {
                throw new IndexOutOfBoundsException(i("%s (%d) must not be greater than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            return;
        }
        throw new IllegalArgumentException(i("negative size: %d", Integer.valueOf(i2)));
    }
}
