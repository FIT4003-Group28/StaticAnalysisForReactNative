package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axyh  reason: default package */
/* loaded from: classes3.dex */
public final class axyh {
    private static final axye<?> b = new axye<>();
    public final Context a;
    private final Map<Class<?>, axyf<?>> c;
    private final axwp d;

    public axyh(Application application, axwp axwpVar) {
        dcdg p = dcdn.p();
        p.f(baal.class, new axyd(this));
        p.f(azva.class, new axyb());
        p.f(azxk.class, new axyg());
        p.f(azvo.class, new axyc());
        this.c = p.b();
        this.a = application.getBaseContext();
        this.d = axwpVar;
    }

    private final synchronized <T extends azwm<T>> dbsi<azxb, azwv> e(azxb azxbVar, T t) {
        azwv a;
        a = this.d.a(azxbVar);
        if (a == null) {
            a = azwv.t(t.b(), t.d(), t.e(this.a), t.c()).i();
        }
        return dbsi.a(azxbVar, a);
    }

    private final <T> azxb f(T t) {
        axye<?> axyeVar;
        axyf<T> h = h(t);
        if (h instanceof axye) {
            axyeVar = (axye) h;
        } else {
            axyeVar = b;
        }
        return axyeVar.c(t);
    }

    private final synchronized void g(azxb azxbVar, azwv azwvVar) {
        if (!azwvVar.p() && !azwvVar.f() && azwvVar.g() == null && !azwvVar.q()) {
            this.d.g(azxbVar);
            return;
        }
        this.d.d(azxbVar, azwvVar);
    }

    private final <T> axyf<T> h(T t) {
        Class j = j(t);
        dbsk.s(j);
        axyf<T> axyfVar = (axyf<T>) this.c.get(j);
        dbsk.s(axyfVar);
        return axyfVar;
    }

    private final <T> boolean i(T t) {
        Class j = j(t);
        return j != null && this.c.containsKey(j);
    }

    @dzsi
    private static <T> Class j(T t) {
        if (t instanceof azwm) {
            return t.getClass();
        }
        if (!(t instanceof azzp)) {
            return null;
        }
        return ((azzp) t).ak();
    }

    public final synchronized <T extends azwm<T>> void a(T t) {
        if (!i(t)) {
            t.getClass();
            return;
        }
        dbsi<azxb, azwv> e = e(f(t), t);
        this.d.d(e.a, h(t).b(e.b, t));
    }

    public final synchronized <P extends azwm<P>, T extends azzp<?, P>> void b(T t) {
        if (!i(t)) {
            t.getClass();
            return;
        }
        dbsi<azxb, azwv> e = e(f(t), t.ao());
        this.d.d(e.a, h(t).b(e.b, t));
    }

    public final synchronized <T extends azwm<T>> void c(T t) {
        if (!i(t)) {
            t.getClass();
            return;
        }
        axyf h = h(t);
        azxb f = f(t);
        azwv a = this.d.a(f);
        if (a == null) {
            return;
        }
        g(f, h.a(a, t));
    }

    public final synchronized <P extends azwm<P>, T extends azzp<?, P>> void d(T t) {
        if (!i(t)) {
            t.getClass();
            return;
        }
        axyf h = h(t);
        azxb f = f(t);
        azwv a = this.d.a(f);
        if (a == null) {
            return;
        }
        g(f, h.a(a, t));
    }
}
