package c.e.a.b.d.g;
/* loaded from: classes.dex */
final class o3 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f4322a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f4323b;

    static {
        f4323b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return f4322a != null && !f4323b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> b() {
        return f4322a;
    }
}
