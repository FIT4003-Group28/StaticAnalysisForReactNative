package c.d.d.d;
/* loaded from: classes.dex */
public final class n {
    public static RuntimeException a(Throwable th) {
        i.a(th);
        b(th);
        throw new RuntimeException(th);
    }

    public static <X extends Throwable> void a(Throwable th, Class<X> cls) {
        if (th == null || !cls.isInstance(th)) {
            return;
        }
        throw cls.cast(th);
    }

    public static void b(Throwable th) {
        a(th, Error.class);
        a(th, RuntimeException.class);
    }
}
