package defpackage;

import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: amrg  reason: default package */
/* loaded from: classes.dex */
public final class amrg {
    public static final Comparator<Map.Entry<aktc, amrf>> g = amqz.a;
    public final akty a;
    public final Object b = new Object();
    public final Map<aktc, amrf> c = new IdentityHashMap();
    public final amrh d = new amrh();
    public final amre e;
    public boolean f;
    private final Runnable h;

    public amrg(akty aktyVar, Runnable runnable) {
        amre amreVar = new amre(this);
        this.e = amreVar;
        this.a = aktyVar;
        this.h = runnable;
        this.f = false;
        ((alom) aktyVar).c.e(amreVar.e);
    }

    public final void a(aktc aktcVar) {
        synchronized (this.b) {
            this.c.remove(aktcVar);
            this.a.g(aktcVar);
        }
    }

    public final void b(aktc aktcVar, amrl amrlVar, amsb amsbVar, int i, dcdc<dmlo> dcdcVar) {
        amrb g2 = amrc.g();
        g2.b(aktcVar);
        g2.c(amrlVar);
        g2.f(amsbVar);
        g2.d(i);
        g2.e(dcdcVar);
        c(g2.g());
    }

    public final void c(amrc amrcVar) {
        aktc a = amrcVar.a();
        akra b = a.b();
        dmlo c = a.c();
        if (c == null) {
            return;
        }
        synchronized (this.b) {
            if (!this.c.containsKey(a)) {
                this.c.put(a, new amrf(amrcVar.b(), amrcVar.c(), amrcVar.d(), b, c, amrcVar.e(), amrcVar.f()));
            }
        }
        this.h.run();
    }
}
