package defpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: awqp  reason: default package */
/* loaded from: classes3.dex */
public final class awqp implements awti {
    public final bvrb a;
    public final akfa b;
    @dzsi
    public btlu c;
    private final bvjj d;
    private final dxio<axwq> e;
    private final ania f;
    private final dxio<ckcw> g;
    private final bwrg<awtr> h;
    @dzsi
    private deig<Void> j;
    @dzsi
    private awtn k;
    private final AtomicInteger i = new AtomicInteger();
    private final Set<awqv> l = dcnm.l();
    private boolean m = false;

    public awqp(bvrb bvrbVar, bvjj bvjjVar, dxio<axwq> dxioVar, ania aniaVar, akfa akfaVar, dxio<ckcw> dxioVar2, bwrg<awtr> bwrgVar) {
        this.a = bvrbVar;
        this.d = bvjjVar;
        this.e = dxioVar;
        this.f = aniaVar;
        this.b = akfaVar;
        this.g = dxioVar2;
        this.h = bwrgVar;
    }

    private final synchronized void q(@dzsi final awtn awtnVar) {
        for (final awqv awqvVar : this.l) {
            if (bvrj.UI_THREAD.b()) {
                awqvVar.a(awtnVar);
            } else {
                this.a.b(new Runnable(awqvVar, awtnVar) { // from class: awqh
                    private final awtn a;
                    private final awqv b;

                    {
                        this.b = awqvVar;
                        this.a = awtnVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.b.a(this.a);
                    }
                }, bvrj.UI_THREAD);
            }
        }
    }

    private final synchronized void r(@dzsi final awtn awtnVar, final boolean z) {
        this.m = true;
        final awtn awtnVar2 = this.k;
        this.k = awtnVar;
        if (!dbsd.a(awtnVar, awtnVar2)) {
            q(awtnVar);
        }
        final int incrementAndGet = this.i.incrementAndGet();
        this.a.a(new Runnable(this, awtnVar, awtnVar2, z, incrementAndGet) { // from class: awqj
            private final awqp a;
            private final awtn b;
            private final awtn c;
            private final boolean d;
            private final int e;

            {
                this.a = this;
                this.b = awtnVar;
                this.c = awtnVar2;
                this.d = z;
                this.e = incrementAndGet;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h(this.b, this.c, this.d, this.e);
            }
        }, bvrj.BACKGROUND_THREADPOOL, 500L);
    }

    @dzsi
    private final synchronized awtn s() {
        dcdc g = this.e.a().g(azxm.c);
        int size = g.size();
        dpzm dpzmVar = null;
        for (int i = 0; i < size; i++) {
            azwo azwoVar = (azwo) g.get(i);
            if (dpzmVar == null || azwoVar.g().c > dpzmVar.c) {
                dpzmVar = azwoVar.g();
            }
        }
        if (dpzmVar == null) {
            return null;
        }
        awtk awtkVar = new awtk();
        dpum dpumVar = dpzmVar.b;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        awtkVar.h(akqq.f(dpumVar));
        awtkVar.b(dpzmVar.e);
        awtkVar.c(dpzmVar.f);
        awtkVar.g(dcdc.e());
        int i2 = 1;
        awtkVar.d(true);
        int i3 = dpzmVar.a;
        if ((i3 & 32) != 0) {
            awtkVar.a = dpzmVar.g;
        }
        if ((i3 & 64) != 0) {
            awtkVar.b = dpzmVar.h;
        }
        if ((i3 & 128) != 0) {
            int a = dpzl.a(dpzmVar.i);
            if (a != 0) {
                i2 = a;
            }
            awtkVar.j(i2);
        } else {
            awtkVar.j(1);
        }
        long j = dpzmVar.d;
        if (j != 0) {
            awtkVar.i(j);
        } else {
            awtkVar.i(TimeUnit.MILLISECONDS.toMicros(dpzmVar.c));
        }
        return awtkVar.k();
    }

    private final synchronized boolean t() {
        if (!this.b.c()) {
            return false;
        }
        if (!e()) {
            return false;
        }
        return this.f.a();
    }

    private final synchronized boolean u(@dzsi awtn awtnVar, @dzsi awtn awtnVar2) {
        bvrj.UI_THREAD.d();
        if (!t() || (awtnVar != null && awtnVar.p())) {
            return false;
        }
        boolean z = true;
        if (awtnVar2 != null && (awtnVar == null || awtnVar.k() > awtnVar2.k())) {
            z = v(awtnVar2);
        }
        if (!z || awtnVar == null) {
            return z;
        }
        return w(awtnVar);
    }

    private final synchronized boolean v(awtn awtnVar) {
        try {
        } catch (axxc unused) {
            return false;
        }
        return ((Boolean) dehf.a(this.e.a().q(new azwn(awtnVar).b()), axxc.class)).booleanValue();
    }

    private final synchronized boolean w(awtn awtnVar) {
        try {
            return ((azwo) dehf.a(this.e.a().p(azxm.c, new azwn(awtnVar).b()), axxc.class)) != null;
        } catch (axxc unused) {
            return false;
        }
    }

    private final synchronized void x() {
        awtn awtnVar = this.k;
        if (awtnVar != null) {
            awtm i = awtnVar.i();
            i.d(true);
            r(i.k(), false);
        }
    }

    @Override // defpackage.awti
    public final synchronized dehn<awtn> a() {
        dehn<awtn> h;
        if (this.m) {
            h = deha.a(this.k);
        } else {
            h = deew.h(b(), new dbrn(this) { // from class: awqi
                private final awqp a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    Void r2 = (Void) obj;
                    return this.a.p();
                }
            }, dege.a);
        }
        return h;
    }

    @Override // defpackage.awti
    public final synchronized dehn<Void> b() {
        deig<Void> deigVar = this.j;
        if (deigVar == null) {
            deig<Void> d = deig.d();
            this.j = d;
            this.h.h(new awqo(this));
            return d;
        }
        return deigVar;
    }

    @Override // defpackage.awti
    public final synchronized void c() {
        this.j = null;
    }

    public final synchronized void d(@dzsi awtn awtnVar) {
        this.m = true;
        this.k = awtnVar;
        if (awtnVar != null) {
            if (!awtnVar.h()) {
                l();
            } else if (this.c == null || !this.f.a()) {
                r(null, false);
            }
        }
        deig<Void> deigVar = this.j;
        if (deigVar != null) {
            try {
                deigVar.j(null);
            } catch (Exception e) {
                this.j.k(e);
            }
        }
    }

    @Override // defpackage.awti
    public final synchronized boolean e() {
        return this.m;
    }

    @Override // defpackage.awti
    @dzsi
    public final synchronized awtn f() {
        dbsk.l(e());
        return this.k;
    }

    @Override // defpackage.awti
    public final synchronized void g(@dzsi awtn awtnVar) {
        r(awtnVar, true);
    }

    public final synchronized void h(@dzsi awtn awtnVar, @dzsi awtn awtnVar2, boolean z, int i) {
        if (i != this.i.get()) {
            return;
        }
        if (z) {
            boolean u = u(awtnVar, awtnVar2);
            if (awtnVar != null && u && !awtnVar.h()) {
                awtm i2 = awtnVar.i();
                i2.d(true);
                awtnVar = i2.k();
                this.k = awtnVar;
            }
        }
        if (awtnVar == null) {
            this.h.g();
            if (awtnVar2 == null) {
                return;
            }
            this.d.Z(bvjk.cT, awtnVar2.k());
            return;
        }
        this.h.e(awtnVar.n());
    }

    public final synchronized void i(gds gdsVar) {
        awtn awtnVar;
        btlu btluVar = gdsVar.a;
        btlu btluVar2 = this.c;
        if (btluVar2 != null && ((btluVar == null || !btlu.g(btluVar2, btluVar)) && (awtnVar = this.k) != null && awtnVar.h())) {
            r(null, false);
        }
        if (this.c == null && btluVar != null && e()) {
            this.a.b(new Runnable(this) { // from class: awqk
                private final awqp a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l();
                }
            }, bvrj.BACKGROUND_THREADPOOL);
        }
        this.c = btluVar;
    }

    public final synchronized void j(anlb anlbVar) {
        if (anlbVar.a) {
            this.a.b(new Runnable(this) { // from class: awql
                private final awqp a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l();
                }
            }, bvrj.BACKGROUND_THREADPOOL);
            return;
        }
        awtn awtnVar = this.k;
        if (awtnVar == null || !awtnVar.h()) {
            return;
        }
        r(null, false);
    }

    public final synchronized void k(azrh azrhVar) {
        if (!t() || azrhVar.a() != 1) {
            return;
        }
        this.a.b(new Runnable(this) { // from class: awqm
            private final awqp a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.m();
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    public final synchronized void m() {
        bvrj.UI_THREAD.d();
        if (!t()) {
            return;
        }
        try {
            awtn s = s();
            if (s != null && s.k() == this.d.w(bvjk.cT, -1L)) {
                return;
            }
            awtn awtnVar = this.k;
            if (awtnVar == null) {
                if (s != null) {
                    r(s, false);
                }
            } else if (s == null) {
                if (awtnVar.h()) {
                    r(null, false);
                }
            } else if (awtnVar.k() < s.k()) {
                r(s, false);
            } else {
                if (this.k.k() == s.k() && this.k.d() < s.d()) {
                    awtm i = s.i();
                    i.g(this.k.g());
                    r(i.k(), false);
                    return;
                }
                if (this.k.k() > s.k() && this.k.h()) {
                    ((ckcn) this.g.a().a(ckif.b)).a();
                }
            }
        } catch (axxc unused) {
        }
    }

    @Override // defpackage.awti
    public final synchronized void n(awqv awqvVar) {
        this.l.add(awqvVar);
    }

    @Override // defpackage.awti
    public final synchronized void o(awqv awqvVar) {
        this.l.remove(awqvVar);
    }

    @dzsi
    public final synchronized awtn p() {
        return this.k;
    }

    public final synchronized void l() {
        awtn awtnVar = this.k;
        if (awtnVar == null || !awtnVar.h()) {
            if (!u(this.k, null)) {
                return;
            }
            x();
            m();
        }
    }
}
