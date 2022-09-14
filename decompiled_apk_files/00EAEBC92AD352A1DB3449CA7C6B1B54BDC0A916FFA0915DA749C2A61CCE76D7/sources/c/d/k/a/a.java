package c.d.k.a;
/* loaded from: classes.dex */
public class a {
    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new AssertionError();
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new AssertionError(str);
    }

    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new AssertionError();
    }

    public static void a(boolean z, String str) {
        if (z) {
            return;
        }
        throw new AssertionError(str);
    }
}
