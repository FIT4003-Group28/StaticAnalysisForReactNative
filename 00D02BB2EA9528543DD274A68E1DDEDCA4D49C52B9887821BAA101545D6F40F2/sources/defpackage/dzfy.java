package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dzfy  reason: default package */
/* loaded from: classes6.dex */
public final class dzfy {
    static volatile dzaz<? super Throwable> a;
    static volatile dzba<? super Runnable, ? extends Runnable> b;
    public static volatile dzba<? super Callable<dyzz>, ? extends dyzz> c;
    public static volatile dzba<? super Callable<dyzz>, ? extends dyzz> d;
    public static volatile dzba<? super Callable<dyzz>, ? extends dyzz> e;
    public static volatile dzba<? super Callable<dyzz>, ? extends dyzz> f;
    public static volatile dzba<? super dyzz, ? extends dyzz> g;
    public static volatile dzba<? super dyzz, ? extends dyzz> h;
    static volatile dzba<? super dyzs, ? extends dyzs> i;
    static volatile dzba<? super dyzu, ? extends dyzu> j;
    static volatile dzba<? super dzaa, ? extends dzaa> k;
    static volatile dzba<? super dyzp, ? extends dyzp> l;
    public static volatile dzay<? super dyzs, ? super eavl, ? extends eavl> m;
    public static volatile dzay<? super dyzu, ? super dyzw, ? extends dyzw> n;
    public static volatile dzay<? super dzaa, ? super dzab, ? extends dzab> o;
    public static volatile dzay<? super dyzp, ? super dyzq, ? extends dyzq> p;

    public static void a(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof dzau) && !(th instanceof dzat) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof dzar)) {
            th = new dzaw(th);
        }
        deki.b(th);
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static dyzz b(Callable<dyzz> callable) {
        try {
            dyzz call = callable.call();
            dzbm.a(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw dzfo.a(th);
        }
    }

    public static void c(Runnable runnable) {
        dzbm.a(runnable, "run is null");
    }

    public static void d() {
    }

    public static <T> void e() {
    }

    public static <T> void f() {
    }

    public static <T> void g() {
    }
}
