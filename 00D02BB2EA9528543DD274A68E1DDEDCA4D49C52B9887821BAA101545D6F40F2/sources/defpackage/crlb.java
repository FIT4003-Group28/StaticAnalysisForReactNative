package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: crlb  reason: default package */
/* loaded from: classes5.dex */
public final class crlb implements crgy {
    private static final dbsl<crqw> h = new crky();
    public final cqat a;
    public final crnh b;
    @dzsi
    public crqw c;
    private final btrm d;
    private final bvrb e;
    private long f;
    private long g;
    private final dclm i = dclm.a(new LinkedHashMap());
    private final crla j = new crla(this);

    public crlb(btrm btrmVar, bvrb bvrbVar, cqat cqatVar, crnh crnhVar) {
        this.d = btrmVar;
        this.e = bvrbVar;
        this.a = cqatVar;
        this.b = crnhVar;
    }

    private final synchronized void l() {
        this.i.clear();
        this.f = 0L;
        this.g = Long.MAX_VALUE;
        h(null);
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        btrm btrmVar = this.d;
        dceq a = dcet.a();
        a.b(crhy.class, new crlc(0, crhy.class, this, bvrj.UI_THREAD));
        a.b(creu.class, new crlc(1, creu.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        synchronized (this) {
            crnh crnhVar = this.b;
            crnhVar.c.add(this.j);
        }
        l();
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        synchronized (this) {
            crnh crnhVar = this.b;
            crnhVar.c.remove(this.j);
        }
        this.d.a(this);
        l();
    }

    public final synchronized void c(Class<? extends crqw> cls) {
        this.i.remove(cls);
    }

    public final synchronized void d() {
        if (!this.i.isEmpty()) {
            Collection<?> L = dcep.L(dcft.i(this.i.values(), h));
            if (!L.isEmpty()) {
                L.size();
                this.i.values().removeAll(L);
            }
        }
        crqw crqwVar = this.c;
        if (crqwVar == null || !crqwVar.c()) {
            return;
        }
        this.d.b(new crhy(this.c, true));
    }

    public final synchronized <T extends crqw> void e(T t) {
        if (t.equals(this.c)) {
            return;
        }
        if (t.f() < this.a.b()) {
            return;
        }
        if (t.b()) {
            h(t);
            return;
        }
        dclm dclmVar = this.i;
        Class<?> cls = t.getClass();
        dclm.d(cls, dclmVar.put(cls, t));
        f();
    }

    public final synchronized void f() {
        crqw crqwVar;
        if (this.c == null) {
            long e = this.a.e();
            if (e < this.f || e > this.g) {
                return;
            }
            crnh crnhVar = this.b;
            Iterable values = this.i.values();
            synchronized (crnhVar.b) {
                crqwVar = (crqw) dcft.r(dcft.i(values, crnhVar.d), null);
            }
            if (crqwVar == null) {
                return;
            }
            this.i.remove(crqwVar.getClass());
            h(crqwVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(long j) {
        dcft.y(this.i.values(), new crkz(this));
        this.g = j - 20000;
        f();
    }

    public final void h(@dzsi crqw crqwVar) {
        this.c = crqwVar;
        this.d.b(new cria(this.c));
    }

    public final synchronized void i(crhy crhyVar) {
        if (this.c == crhyVar.a) {
            h(null);
        }
    }

    public final synchronized void j(creu creuVar) {
        if (creuVar.a != 1) {
            this.f = Long.MAX_VALUE;
            return;
        }
        this.f = this.a.e() + 3000;
        this.e.a(new Runnable(this) { // from class: crkx
            private final crlb a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f();
            }
        }, bvrj.UI_THREAD, 3000L);
    }

    public final synchronized void k() {
        if (!this.i.isEmpty()) {
            this.i.clear();
        }
        if (this.c != null) {
            h(null);
        }
    }
}
