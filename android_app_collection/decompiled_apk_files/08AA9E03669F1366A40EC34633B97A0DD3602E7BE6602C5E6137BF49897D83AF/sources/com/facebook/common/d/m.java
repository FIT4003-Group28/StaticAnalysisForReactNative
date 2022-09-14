package com.facebook.common.d;
/* compiled from: Throwables.java */
/* loaded from: classes.dex */
public final class m {
    public static <X extends Throwable> void a(Throwable th, Class<X> cls) {
        if (th == null || !cls.isInstance(th)) {
            return;
        }
        throw cls.cast(th);
    }

    public static void a(Throwable th) {
        a(th, Error.class);
        a(th, RuntimeException.class);
    }

    public static RuntimeException b(Throwable th) {
        a((Throwable) i.a(th));
        throw new RuntimeException(th);
    }
}
