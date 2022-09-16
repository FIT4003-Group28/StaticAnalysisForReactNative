package defpackage;

import io.grpc.Status;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: axzl  reason: default package */
/* loaded from: classes2.dex */
public /* synthetic */ class axzl {
    public static void e(ayom ayomVar, AtomicInteger atomicInteger, azoj azojVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable d = azom.d(azojVar);
            if (d != null) {
                ayomVar.b(d);
            } else {
                ayomVar.sm();
            }
        }
    }

    public static void f(bame bameVar, AtomicInteger atomicInteger, azoj azojVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable d = azom.d(azojVar);
            if (d != null) {
                bameVar.b(d);
            } else {
                bameVar.sm();
            }
        }
    }

    public static void g(ayom ayomVar, Throwable th, AtomicInteger atomicInteger, azoj azojVar) {
        if (azom.e(azojVar, th)) {
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            ayomVar.b(azom.d(azojVar));
            return;
        }
        azqc.d(th);
    }

    public static void h(bame bameVar, Throwable th, AtomicInteger atomicInteger, azoj azojVar) {
        if (azom.e(azojVar, th)) {
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            bameVar.b(azom.d(azojVar));
            return;
        }
        azqc.d(th);
    }

    public static void i(bame bameVar, Object obj, AtomicInteger atomicInteger, azoj azojVar) {
        if (atomicInteger.get() != 0 || !atomicInteger.compareAndSet(0, 1)) {
            return;
        }
        bameVar.c(obj);
        if (atomicInteger.decrementAndGet() == 0) {
            return;
        }
        Throwable d = azom.d(azojVar);
        if (d != null) {
            bameVar.b(d);
        } else {
            bameVar.sm();
        }
    }

    public static void j(AtomicReference atomicReference, aypg aypgVar, Class cls) {
        ayrd.b(aypgVar, "next is null");
        if (!atomicReference.compareAndSet(null, aypgVar)) {
            aypgVar.qr();
            if (atomicReference.get() == ayqi.a) {
                return;
            }
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 141 + String.valueOf(name).length());
            sb.append("It is not allowed to subscribe with a(n) ");
            sb.append(name);
            sb.append(" multiple times. Please create a fresh instance of ");
            sb.append(name);
            sb.append(" and subscribe that to the target source instead.");
            azqc.d(new aypr(sb.toString()));
        }
    }

    public static axpa k(List list, List list2) {
        return new axpa(list, list2);
    }

    public static void l(azqb azqbVar, List list) {
        list.add(azqbVar);
    }

    public static void m(azqb azqbVar, List list) {
        list.add(azqbVar);
    }

    public static void n(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }

    public static void o(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static axox p(axoq axoqVar) {
        return new axox(axoqVar.a);
    }

    public void a(Status status, ayat ayatVar) {
        throw null;
    }

    public void b(ayat ayatVar) {
        throw null;
    }

    public void c(Object obj) {
        throw null;
    }

    public void d() {
    }
}
