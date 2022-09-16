package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: azqc  reason: default package */
/* loaded from: classes2.dex */
public final class azqc {
    static volatile ayqb a;
    static volatile ayqe b;
    public static volatile ayqe c;
    public static volatile ayqe d;
    public static volatile ayqe e;
    public static volatile ayqe f;
    public static volatile ayqe g;
    public static volatile ayqe h;
    public static volatile ayqe i;
    static volatile ayqe j;
    static volatile ayqe k;
    static volatile ayqe l;
    static volatile ayqe m;
    static volatile ayqe n;
    static volatile ayqe o;
    static volatile ayqe p;
    static volatile ayqe q;
    public static volatile aypx r;
    public static volatile aypx s;
    public static volatile aypx t;
    public static volatile aypx u;
    public static volatile aypx v;
    static volatile boolean w;
    public static volatile boolean x;

    public static final void a(Throwable th, Throwable th2) {
        th2.getClass();
        if (th != th2) {
            int i2 = azrq.a;
            Method method = azro.a;
            if (method == null) {
                return;
            }
            method.invoke(th, th2);
        }
    }

    public static ayor b(ayqe ayqeVar, Callable callable) {
        try {
            ayor ayorVar = (ayor) ayqeVar.a(callable);
            ayrd.b(ayorVar, "Scheduler Callable result can't be null");
            return ayorVar;
        } catch (Throwable th) {
            throw azom.b(th);
        }
    }

    public static ayor c(Callable callable) {
        try {
            ayor ayorVar = (ayor) callable.call();
            ayrd.b(ayorVar, "Scheduler Callable result can't be null");
            return ayorVar;
        } catch (Throwable th) {
            throw azom.b(th);
        }
    }

    public static void d(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof aypq) && !(th instanceof aypp) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof aypo)) {
            th = new ayps(th);
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static void e(ayqe ayqeVar) {
        c = ayqeVar;
    }

    public static void f(ayqe ayqeVar) {
        e = ayqeVar;
    }

    public static void g() {
    }

    public static void h() {
    }

    public static void i() {
    }

    public static void j() {
    }

    public static void k() {
    }

    public static void l() {
    }

    public static void m() {
    }

    public static void n() {
    }

    public static void o(Runnable runnable) {
        ayrd.b(runnable, "run is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ServiceLoader, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List, java.util.ArrayList] */
    public static List p(Class cls, Iterable iterable, ClassLoader classLoader, aybq aybqVar) {
        ?? load;
        if (!q(classLoader)) {
            load = ServiceLoader.load(cls, classLoader);
            if (!load.iterator().hasNext()) {
                load = ServiceLoader.load(cls);
            }
        } else {
            load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                try {
                    load.add(cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : load) {
            aybqVar.b(obj);
            arrayList.add(obj);
        }
        Collections.sort(arrayList, Collections.reverseOrder(new aybp(aybqVar)));
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean q(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
