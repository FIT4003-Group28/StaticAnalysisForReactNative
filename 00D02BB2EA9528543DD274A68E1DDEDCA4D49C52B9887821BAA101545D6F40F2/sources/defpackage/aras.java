package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: aras  reason: default package */
/* loaded from: classes.dex */
public final class aras implements arbu {
    public static final dcqe a = dcqe.c("aras");
    public final bvrb c;
    public final arbx d;
    public final akpe e;
    @dzsi
    public akox f;
    @dzsi
    public arbq h;
    public boolean i;
    public boolean j;
    @dzsi
    public alae k;
    @dzsi
    public cryz<akoq> l;
    private final btrm m;
    private final bvnx n;
    @dzsi
    private arba o;
    public final Object b = new Object();
    public amwd g = amwd.OFF;
    private final arbw p = new arao(this);
    private final araq q = new araq(this);
    private final arar r = new arar(this);

    public aras(btrm btrmVar, bvnx bvnxVar, bvrb bvrbVar, arbx arbxVar, akpe akpeVar) {
        this.m = btrmVar;
        this.n = bvnxVar;
        this.c = bvrbVar;
        this.d = arbxVar;
        this.e = akpeVar;
    }

    private final void n(@dzsi amwd amwdVar, @dzsi alai alaiVar, boolean z) {
        boolean z2;
        alag alagVar;
        bvrj.UI_THREAD.c();
        if (alaiVar != null) {
            amwdVar = alaiVar.f.c;
        }
        if (amwdVar == amwd.OFF) {
            alaiVar = null;
        }
        dbsk.s(amwdVar);
        boolean f = this.d.f(null);
        if ((amwdVar == amwd.COMPASS || amwdVar == amwd.TRACKING) && !f) {
            return;
        }
        synchronized (this.b) {
            this.g = amwdVar;
        }
        int ordinal = amwdVar.ordinal();
        boolean z3 = false;
        if (ordinal == 0) {
            this.d.u();
        } else if (ordinal == 1 || ordinal == 2) {
            arba arbaVar = this.o;
            if (arbaVar != null) {
                synchronized (arbaVar.b) {
                    alai alaiVar2 = arbaVar.c;
                    boolean z4 = (alaiVar2 == null || alaiVar == null || (alagVar = alaiVar2.a) == null || alagVar != alaiVar.a) ? false : true;
                    arbaVar.c = alaiVar;
                    boolean z5 = arbaVar.d;
                    arbaVar.d = z;
                    int d = arbaVar.d();
                    if (z5 == z && z4 && (arbaVar.e & d) == d) {
                        z2 = false;
                    }
                    z2 = true;
                }
                if (z2) {
                    arba arbaVar2 = this.o;
                    akox akoxVar = this.f;
                    if (akoxVar != null && arbaVar2 != null) {
                        akoxVar.r(arbaVar2);
                    }
                }
            }
            this.d.t();
            this.d.v();
        }
        this.d.x(amwdVar == amwd.COMPASS);
        akox akoxVar2 = this.f;
        if (akoxVar2 != null) {
            if (amwdVar != amwd.OFF) {
                z3 = true;
            }
            if (!akoxVar2.q) {
                akoxVar2.n.a().c(z3);
            }
        }
        this.m.b(new amwe(amwdVar));
    }

    public final void a(akox akoxVar, Resources resources) {
        bvrj.UI_THREAD.c();
        dbsk.s(akoxVar);
        this.f = akoxVar;
        this.d.a(akoxVar, resources);
        this.h = new arbq(this.m, akoxVar.k(), this.r);
        this.o = new arba(this.n, akoxVar.k(), this.m, this.q);
        synchronized (this.b) {
            this.i = this.e.b();
        }
    }

    public final void b(boolean z) {
        amwd amwdVar;
        bvrj.UI_THREAD.c();
        synchronized (this.b) {
            amwdVar = this.g;
        }
        if (amwdVar == amwd.COMPASS) {
            h(amwd.TRACKING);
        }
        if (amwdVar != amwd.TRACKING || z || this.d.l() != ardz.MAP) {
            h(amwd.OFF);
        } else {
            dbsk.s(this.f);
            alad p = this.f.k().p();
            alaf a2 = alai.a();
            a2.f = alah.LOCATION_ONLY;
            alae alaeVar = this.k;
            if (alaeVar == null) {
                alaeVar = alae.a;
            }
            a2.e = alaeVar;
            a2.b = p.k;
            a2.c = p.l;
            a2.d = p.m;
            j(a2.a(), true);
        }
        this.d.p(this.p);
        this.d.b();
        akox akoxVar = this.f;
        dbsk.s(akoxVar);
        akoxVar.h();
        arbq arbqVar = this.h;
        dbsk.s(arbqVar);
        btrm btrmVar = arbqVar.a;
        arbp arbpVar = arbqVar.f;
        dceq a3 = dcet.a();
        a3.b(alhw.class, new arbr(alhw.class, arbpVar, bvrj.UI_THREAD));
        btrmVar.g(arbpVar, a3.a());
        arbqVar.e = true;
    }

    public final void c() {
        bvrj.UI_THREAD.c();
        arbq arbqVar = this.h;
        dbsk.s(arbqVar);
        arbqVar.e = false;
        arbqVar.a.a(arbqVar.f);
        cryz<akoq> cryzVar = this.l;
        if (cryzVar != null) {
            cryzVar.c();
            this.l = null;
        }
        this.d.d();
        this.d.q(this.p);
    }

    public final void d() {
        bvrj.UI_THREAD.c();
        this.d.e();
        this.h = null;
        this.f = null;
    }

    @Override // defpackage.arbu
    public final void e() {
        synchronized (this.b) {
            this.i = false;
        }
    }

    @Override // defpackage.arbu
    public final arbx f() {
        return this.d;
    }

    @Override // defpackage.arbu
    public final void g(boolean z) {
        arbq arbqVar = this.h;
        if (arbqVar != null) {
            arbqVar.d = z;
            if (z) {
                return;
            }
            arbqVar.c = null;
        }
    }

    @Override // defpackage.arbu
    public final void h(amwd amwdVar) {
        n(amwdVar, null, true);
    }

    @Override // defpackage.arbu
    public final amwd i() {
        amwd amwdVar;
        synchronized (this.b) {
            amwdVar = this.g;
        }
        return amwdVar;
    }

    @Override // defpackage.arbu
    public final void j(alai alaiVar, boolean z) {
        if (alaiVar == null) {
            n(amwd.OFF, null, false);
        } else {
            n(null, alaiVar, z);
        }
    }

    @Override // defpackage.arbu
    public final void k(boolean z) {
        bvrj.UI_THREAD.c();
        arba arbaVar = this.o;
        if (arbaVar != null) {
            arbaVar.a = z ? new araz() : null;
        }
    }

    @Override // defpackage.arbu
    public final void l(@dzsi alae alaeVar) {
        this.k = alaeVar;
    }

    public final alae m() {
        alae alaeVar = this.k;
        return alaeVar == null ? alae.a : alaeVar;
    }
}
