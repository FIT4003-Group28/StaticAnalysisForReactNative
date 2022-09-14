package com.facebook.soloader.o;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static b f6498a;

    private a() {
    }

    public static synchronized void a(b bVar) {
        synchronized (a.class) {
            if (f6498a != null) {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
            f6498a = bVar;
        }
    }

    public static synchronized boolean a() {
        boolean z;
        synchronized (a.class) {
            z = f6498a != null;
        }
        return z;
    }

    public static boolean a(String str) {
        synchronized (a.class) {
            if (f6498a == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return f6498a.a(str);
    }
}
