package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: glc  reason: default package */
/* loaded from: classes.dex */
public final class glc extends itb implements glk, akzx {
    private static final cjtd o = cjtd.a(dtxv.A);
    public final dxio<akox> a;
    public final dxio<iyq> b;
    public final dxio<cqhn> c;
    private final boolean p;
    private final bvjj q;
    private final dxio<araj> r;
    private final btrm s;
    private final btpc t;
    private final bvkx v;
    private final dehq w;
    private final Executor x;
    public final deig<jbq> d = deig.d();
    int k = 1;
    private boolean z = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    @dzsi
    bvpk i = null;
    @dzsi
    public izs j = null;
    @dzsi
    private jbx y = null;
    final glb e = new glb(this);
    private final gla u = new gla(this);

    public glc(btvo btvoVar, bvjj bvjjVar, dehq dehqVar, Executor executor, dxio<akox> dxioVar, dxio<araj> dxioVar2, btpc btpcVar, btrm btrmVar, bvkx bvkxVar, dxio<cqhn> dxioVar3, dxio<iyq> dxioVar4, acyr acyrVar) {
        boolean z = true;
        this.q = bvjjVar;
        this.w = dehqVar;
        this.x = executor;
        this.a = dxioVar;
        this.r = dxioVar2;
        this.t = btpcVar;
        this.s = btrmVar;
        this.b = dxioVar4;
        this.c = dxioVar3;
        this.v = bvkxVar;
        this.p = (!btvoVar.getEnableFeatureParameters().Z || acyrVar.d()) ? false : z;
    }

    private final boolean B() {
        return this.a.a().w() || this.a.a().I();
    }

    private final void C(Runnable runnable, long j) {
        bvpk a = bvpk.a(runnable);
        D();
        this.i = a;
        bvqd.a(this.w.d(a, j, TimeUnit.MILLISECONDS), this.x);
    }

    private final void D() {
        bvpk bvpkVar = this.i;
        if (bvpkVar != null) {
            bvpkVar.b();
            this.i = null;
        }
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        if (!this.p) {
            return;
        }
        this.v.j(new Runnable(this) { // from class: gku
            private final glc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g = true;
            }
        }, bvrj.UI_THREAD, bvkw.ON_FIRST_TRANSITION_COMPLETE);
        this.v.j(new Runnable(this) { // from class: gkv
            private final glc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f = true;
            }
        }, bvrj.UI_THREAD, bvkw.ON_STARTUP_FULLY_COMPLETE);
    }

    @Override // defpackage.itb
    public final void PX() {
        super.PX();
        if (this.p) {
            btrm btrmVar = this.s;
            gla glaVar = this.u;
            dceq a = dcet.a();
            a.b(alhl.class, new gld(0, alhl.class, glaVar, bvrj.UI_THREAD));
            a.b(alim.class, new gld(1, alim.class, glaVar, bvrj.UI_THREAD));
            a.b(ardp.class, new gld(2, ardp.class, glaVar, bvrj.UI_THREAD));
            a.b(btyj.class, new gld(3, btyj.class, glaVar, bvrj.UI_THREAD));
            btrmVar.g(glaVar, a.a());
            bvqj.c(this.a.a().k, new bvqg(this) { // from class: gkw
                private final glc a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    glc glcVar = this.a;
                    akoq akoqVar = (akoq) obj;
                    if (!glcVar.x()) {
                        return;
                    }
                    glcVar.a.a().ad(glcVar);
                    glcVar.s().q(glcVar.e);
                    glcVar.k(glcVar.p());
                }
            }, this.w);
        }
    }

    @Override // defpackage.itb
    public final void PY() {
        super.PY();
        if (this.p) {
            this.a.a().ae(this);
            this.s.a(this.u);
            s().q(null);
            s().i();
            D();
            t(1);
        }
    }

    @Override // defpackage.glk
    public final void d() {
        bvrj.UI_THREAD.c();
        if (this.p) {
            D();
            if (this.k == 1) {
                return;
            }
            t(1);
        }
    }

    @Override // defpackage.glk
    public final void e(boolean z) {
        bvrj.UI_THREAD.c();
        this.z = z;
        if (!z) {
            d();
        } else {
            k(p());
        }
        o();
    }

    @Override // defpackage.glk
    public final boolean f() {
        return this.p;
    }

    @Override // defpackage.glk
    public final void i(@dzsi izs izsVar) {
        if (this.j == izsVar) {
            return;
        }
        this.j = izsVar;
        this.h = false;
    }

    @Override // defpackage.glk
    public final dehn<jbq> j() {
        return this.d;
    }

    public final void k(long j) {
        if (!m()) {
            return;
        }
        C(new Runnable(this) { // from class: gkx
            private final glc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                glc glcVar = this.a;
                bvrj.UI_THREAD.c();
                if (glcVar.g && glcVar.k == 1 && glcVar.q()) {
                    if (glcVar.g && !glcVar.h && glcVar.j != null) {
                        glcVar.d.j(glcVar.b.a());
                        izs izsVar = glcVar.j;
                        dbsk.s(izsVar);
                        izsVar.Q(glcVar.s());
                        glcVar.c.a();
                        izs izsVar2 = glcVar.j;
                        dbsk.s(izsVar2);
                        cqkx.p(izsVar2);
                        glcVar.h = true;
                    }
                    glcVar.t(2);
                }
            }
        }, j);
    }

    @Override // defpackage.akzx
    public final void l(akzs akzsVar) {
        this.w.execute(new Runnable(this) { // from class: gky
            private final glc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                glc glcVar = this.a;
                if (glcVar.m()) {
                    glcVar.k(glcVar.p());
                }
            }
        });
    }

    public final boolean m() {
        return this.p && this.z;
    }

    public final void n() {
        if (this.k == 2) {
            t(3);
        }
    }

    final void o() {
        boolean z = true;
        if (!this.p || !this.z || this.k == 1) {
            z = false;
        }
        this.b.a().a(z);
        s().p(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long p() {
        return gkt.a(this.t, B()).j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q() {
        if (this.a.a().U() || this.r.a().m().i() != amwd.OFF || !this.t.i() || r()) {
            return false;
        }
        izs izsVar = this.j;
        return izsVar == null || izsVar.n().booleanValue();
    }

    public final boolean r() {
        return this.q.m(bvjk.et, false);
    }

    public final jbx s() {
        if (this.y == null) {
            iyv OR = iyw.OR();
            OR.a = o;
            this.y = new iyw(cpnx.a, 3, OR.a, null);
        }
        return this.y;
    }

    public final void t(int i) {
        if (this.p && this.k != i) {
            this.k = i;
            int i2 = i - 1;
            if (i2 == 1) {
                this.b.a().b(false);
                jbx s = s();
                btpc btpcVar = this.t;
                boolean B = B();
                boolean z = this.f;
                long j = gkt.a(btpcVar, B).k;
                if (!z) {
                    j += gkt.a;
                }
                double d = j;
                Double.isNaN(d);
                s.j((long) (d / 0.6d));
            } else if (i2 == 2) {
                s().h();
            } else if (i2 == 3) {
                long j2 = gkt.b;
                if (this.p) {
                    C(new Runnable(this) { // from class: gkz
                        private final glc a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            glc glcVar = this.a;
                            bvrj.UI_THREAD.c();
                            if (glcVar.k != 1) {
                                glcVar.q();
                                glcVar.t(1);
                            }
                        }
                    }, j2);
                }
            }
            o();
        }
    }
}
