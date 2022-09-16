package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: asam  reason: default package */
/* loaded from: classes2.dex */
public final class asam implements crgy {
    public final dxio<cpwx> b;
    public final dehq c;
    public final Executor d;
    public final btrm e;
    public final cjqq f;
    public final cjqy g;
    public final asik h;
    public final arnd i;
    public final boolean j;
    public boolean k;
    public boolean l;
    @dzsi
    public dehu m;
    private final cjyh n;
    private final dbsg<atbs> o;
    private final dxio<aufc> p;
    @dzsi
    private dqvj r;
    final asal a = new asal(this);
    private arym q = null;

    public asam(dxio<cpwx> dxioVar, dehq dehqVar, Executor executor, btrm btrmVar, cjqq cjqqVar, cjqy cjqyVar, dbsg<atbs> dbsgVar, brlz brlzVar, asik asikVar, cjyh cjyhVar, arnd arndVar, dxio<aufc> dxioVar2, akfa akfaVar) {
        this.b = dxioVar;
        this.c = dehqVar;
        this.d = executor;
        this.e = btrmVar;
        this.f = cjqqVar;
        this.g = cjqyVar;
        this.o = dbsgVar;
        this.h = asikVar;
        this.n = cjyhVar;
        this.i = arndVar;
        daqq daqqVar = brlzVar.g;
        if (daqqVar != null) {
            boolean z = false;
            if (daqqVar.d && !asikVar.a()) {
                z = true;
            }
            this.l = z;
        }
        this.p = dxioVar2;
        this.j = akfaVar.d();
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        if (this.j) {
            return;
        }
        btrm btrmVar = this.e;
        asal asalVar = this.a;
        dceq a = dcet.a();
        a.b(crih.class, new asan(0, crih.class, asalVar, bvrj.UI_THREAD));
        a.b(brcp.class, new asan(1, brcp.class, asalVar, bvrj.UI_THREAD));
        a.b(crie.class, new asan(2, crie.class, asalVar, bvrj.UI_THREAD));
        a.b(crid.class, new asan(3, crid.class, asalVar, bvrj.UI_THREAD));
        btrmVar.g(asalVar, a.a());
        this.q = crgzVar.a;
        this.r = crgzVar.b;
        this.i.h = false;
        if (!this.l) {
            return;
        }
        c();
        if (!g()) {
            return;
        }
        this.e.b(new crhd(7));
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        if (this.j) {
            return;
        }
        this.e.a(this.a);
        this.k = false;
        if (this.q == arym.GUIDED_NAV) {
            this.i.c(2, this.r);
        }
        this.i.h = false;
        dehu dehuVar = this.m;
        if (dehuVar != null) {
            dehuVar.cancel(true);
        }
        this.d.execute(new Runnable(this) { // from class: asad
            private final asam a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                asam asamVar = this.a;
                asamVar.b.a().j(asamVar.c);
            }
        });
    }

    public final void c() {
        this.d.execute(new Runnable(this) { // from class: asae
            private final asam a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.a().b();
            }
        });
        if (this.b.a().a() != 3) {
            this.k = true;
            d(0);
        }
    }

    public final void d(final int i) {
        if (i >= 5) {
            this.d.execute(new Runnable(this) { // from class: asaf
                private final asam a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    asam asamVar = this.a;
                    asamVar.b.a().j(asamVar.c);
                }
            });
            if (!g()) {
                return;
            }
            this.i.a();
            return;
        }
        this.d.execute(new Runnable(this, i) { // from class: asag
            private final asam a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                asam asamVar = this.a;
                int i2 = this.b;
                cpwx a = asamVar.b.a();
                asak asakVar = new asak(asamVar, i2);
                cpwx.f("bindService");
                a.b();
                a.d.g = asakVar;
                if (a.m.a() == 3) {
                    return;
                }
                a.k = null;
                a.m.e();
            }
        });
        if (this.b.a().a() != 0) {
            return;
        }
        e(i + 1);
    }

    public final void e(final int i) {
        this.m = this.c.d(new Runnable(this, i) { // from class: asah
            private final asam a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d(this.b);
            }
        }, 1000L, TimeUnit.MILLISECONDS);
    }

    public final void f() {
        arym arymVar;
        if (!g() || !this.o.a() || (arymVar = this.q) == null || arymVar == arym.FREE_NAV) {
            return;
        }
        if (!this.o.b().b() || this.o.b().i() || this.o.b().c()) {
            this.i.c(4, this.r);
            return;
        }
        int i = this.p.a().b() ? 3 : 2;
        int ordinal = this.q.ordinal();
        if (ordinal == 0) {
            this.i.d(6, this.r, i);
        } else if (ordinal != 1) {
        } else {
            this.i.d(5, this.r, i);
        }
    }

    public final boolean g() {
        return this.n.b() && this.r == dqvj.DRIVE;
    }
}
