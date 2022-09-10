package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: amox  reason: default package */
/* loaded from: classes.dex */
public final class amox {
    static final alyh a = new alyh(-1, -1, -1);
    public static final amqn b = new amqh();
    private boolean A;
    private final akrz B;
    private final dxio<amom> C;
    public final amoh c;
    public final amco d;
    @dzsi
    public volatile amog e;
    public volatile amxf f;
    public volatile alwn g;
    public final Set<alyh> h;
    public final Map<alyh, amoo> i;
    public final amoj j;
    @dzsi
    public amoo k;
    public final amou l;
    public final amcm m;
    public final cqat n;
    @dzsi
    public amos o;
    @dzsi
    public final alsq p;
    public volatile boolean q;
    public final boolean r;
    public final AtomicLong s;
    private final dzls t;
    private final Set<amog> u;
    private final akrw v;
    private final alyl w;
    private final Executor x;
    @dzsi
    private bntb y;
    private boolean z;

    public amox(akrw akrwVar, alyl alylVar, amoj amojVar, @dzsi alsq alsqVar, amoh amohVar, amco amcoVar, cqat cqatVar, Executor executor, dxio<amom> dxioVar, boolean z, akrz akrzVar, amxf amxfVar, alwn alwnVar) {
        this.e = null;
        this.t = new dzls();
        this.u = new HashSet();
        this.h = new HashSet();
        this.i = new HashMap();
        this.l = new amou(this);
        this.m = new amow(this);
        this.q = true;
        this.z = true;
        this.A = true;
        this.s = new AtomicLong(0L);
        this.v = akrwVar;
        this.w = alylVar;
        this.f = amxfVar;
        this.g = alwnVar;
        this.c = amohVar;
        this.d = amcoVar;
        this.p = alsqVar;
        this.n = cqatVar;
        this.x = executor;
        this.C = dxioVar;
        this.r = z;
        this.j = amojVar;
        this.B = akrzVar;
    }

    private static long t(alyh alyhVar) {
        return ((alyhVar.a & 31) << 58) | ((alyhVar.b & 536870911) << 29) | (alyhVar.c & 536870911);
    }

    private final boolean u() {
        return this.A && !this.B.h(e());
    }

    private final void v(@dzsi amog amogVar) {
        this.s.incrementAndGet();
        if (amogVar != null) {
            this.c.a(amogVar);
        }
    }

    public final amox a(alyl alylVar, amco amcoVar) {
        amoj amojVar = this.j;
        return new amox(this.v, alylVar, new amoj(amojVar.a, amojVar.d, amojVar.b, amojVar.c), this.p, this.c, amcoVar, this.n, this.x, this.C, this.r, this.B, this.f, this.g);
    }

    @dzsi
    public final amqn b(alyh alyhVar, long j, @dzsi amog amogVar) {
        amqn i;
        if (amogVar == null || (i = this.c.i(amogVar, alyhVar, false, j)) == b || i == null || i.u(j)) {
            return null;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(alyh alyhVar) {
        boolean add;
        synchronized (this.h) {
            add = this.h.add(alyhVar);
        }
        if (add) {
            d(alyhVar, false, this.m);
        }
    }

    public final void d(alyh alyhVar, boolean z, amcm amcmVar) {
        if (z) {
            this.d.d(alyhVar, amcmVar, this.q);
        } else {
            this.d.a(alyhVar, amcmVar);
        }
    }

    public final akry e() {
        return this.d.m();
    }

    public final boolean f(alvb alvbVar, akra akraVar, List<alyh> list, @dzsi Set<alyh> set, aksj aksjVar, int i, boolean z, boolean z2) {
        amog amogVar = this.e;
        if (amogVar != null) {
            this.c.j(amogVar);
        }
        if (!z2) {
            this.d.f(aksjVar, list);
        }
        synchronized (this.j) {
            if (this.z || !z2) {
                this.z = z2;
                this.j.b(alvbVar, akraVar, list, set, i, z);
                amoo amooVar = this.k;
                this.k = this.j.e();
                if (amooVar == null) {
                    this.x.execute(new Runnable(this) { // from class: amop
                        private final amox a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            amoo amooVar2;
                            amox amoxVar = this.a;
                            amyn.d.a();
                            synchronized (amoxVar.j) {
                                amooVar2 = amoxVar.k;
                                amoxVar.k = null;
                            }
                            amoxVar.l.b(amooVar2, true);
                        }
                    });
                }
                return true;
            }
            return false;
        }
    }

    public final void g() {
        synchronized (this.j) {
            this.j.d();
        }
    }

    public final void h(bntb bntbVar) {
        if (bntbVar != this.y) {
            r();
            this.y = bntbVar;
            k();
        }
    }

    public final synchronized void i(boolean z) {
        this.A = z;
    }

    public final synchronized boolean j() {
        return this.y != null;
    }

    public final void k() {
        this.e = amog.f(this.v, this.w, this.r ? null : this.g, this.f.r, Integer.valueOf(System.identityHashCode(this.y)));
    }

    public final boolean l() {
        synchronized (this.u) {
            if (!this.u.isEmpty()) {
                for (amog amogVar : this.u) {
                    v(amogVar);
                }
                this.u.clear();
                return true;
            }
            return false;
        }
    }

    public final synchronized boolean m(alyh alyhVar) {
        long t = t(alyhVar);
        if (!this.t.f(t)) {
            return false;
        }
        return ((long) this.t.i(t)) > 100;
    }

    public final synchronized void n(alyh alyhVar, int i) {
        dzls dzlsVar = this.t;
        if (dzlsVar.h > 10000) {
            dzlsVar.clear();
            this.t.n();
        }
        long t = t(alyhVar);
        if (this.t.f(t)) {
            i = Math.min(i, this.t.i(t));
        }
        this.t.a(t, i);
    }

    public final synchronized void o(alyh alyhVar) {
        amog amogVar = this.e;
        if (amogVar == null || !u()) {
            return;
        }
        this.c.e(amogVar, alyhVar, b);
    }

    public final void p() {
        amog amogVar = this.e;
        if (amogVar == null) {
            return;
        }
        synchronized (this.u) {
            this.u.add(amogVar);
            this.s.incrementAndGet();
        }
    }

    @dzsi
    public final synchronized aktk q() {
        return null;
    }

    public final void r() {
        v(this.e);
    }

    public final synchronized boolean s(alyh alyhVar, @dzsi alyg alygVar, @dzsi alyg alygVar2, @dzsi Runnable runnable) {
        boolean z;
        boolean z2 = false;
        if (u()) {
            amog amogVar = this.e;
            long j = this.s.get();
            if (alygVar instanceof alyt) {
                alyt alytVar = (alyt) alygVar;
                long t = t(alyhVar);
                if (alyhVar.a > 13 || (this.t.f(t) && this.t.i(t) <= 100)) {
                    z = false;
                    this.C.a().b(alytVar, alygVar2, this.f.r, new amoq(this, z, alyhVar, amogVar, j, runnable));
                }
                z = true;
                this.C.a().b(alytVar, alygVar2, this.f.r, new amoq(this, z, alyhVar, amogVar, j, runnable));
            } else {
                if (alygVar instanceof alwf) {
                    alwf alwfVar = (alwf) alygVar;
                    if (alwfVar.b != null) {
                        this.C.a().a(alwfVar, this.f.r, null, new amor(this, amogVar, j, alyhVar, runnable));
                    } else {
                        bvoo.j(new RuntimeException());
                    }
                }
                return z2;
            }
            z2 = true;
            return z2;
        }
        return false;
    }

    public final String toString() {
        String dbsbVar;
        synchronized (this.j) {
            dbsb b2 = dbsc.b(this);
            b2.b("drawMode", this.f);
            b2.b("legend", this.g);
            b2.h("enableNetworkRequests", this.q);
            b2.h("allowEarlyFetching", this.z);
            b2.b("fetchRequestProvider", this.j);
            dbsbVar = b2.toString();
        }
        return dbsbVar;
    }

    public amox(akrw akrwVar, alyl alylVar, amoj amojVar, @dzsi alsq alsqVar, amoh amohVar, amco amcoVar, cqat cqatVar, Executor executor, dxio<amom> dxioVar, boolean z, akrz akrzVar, boolean z2) {
        this(akrwVar, alylVar, amojVar, alsqVar, amohVar, amcoVar, cqatVar, executor, dxioVar, z, akrzVar, amxf.ROADMAP, amxf.ROADMAP.a(z2));
    }
}
