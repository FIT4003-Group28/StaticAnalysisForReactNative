package defpackage;
/* compiled from: PG */
/* renamed from: apru  reason: default package */
/* loaded from: classes2.dex */
public final class apru extends itb implements apsa {
    public static boolean a;
    public static boolean b;
    public final gga c;
    public final apro d;
    public final dxio<apri> e;
    public final dxio<akfa> f;
    public final bvjj g;
    public final apyv h;
    public apri i;
    @dzsi
    public btlu j;
    private final bvkx k;
    private final dxio<begg> o;
    private final dehq p;
    private final dehq q;
    private final bvrb r;
    private final auhi s;
    private final aprs t = new aprs(this);
    private final crzp<dbsg<Integer>> u = new aprt(this);
    private final aprr v = new aprr(this);
    @dzsi
    private crzm<dbsg<Integer>> w;

    public apru(gga ggaVar, bvkx bvkxVar, apro aproVar, dxio<apri> dxioVar, dxio<begg> dxioVar2, dxio<akfa> dxioVar3, dehq dehqVar, dehq dehqVar2, bvjj bvjjVar, apyv apyvVar, bvrb bvrbVar, auhi auhiVar) {
        dbsk.l(true);
        this.c = ggaVar;
        this.k = bvkxVar;
        this.d = aproVar;
        this.e = dxioVar;
        this.o = dxioVar2;
        this.f = dxioVar3;
        this.p = dehqVar;
        this.q = dehqVar2;
        this.g = bvjjVar;
        this.h = apyvVar;
        this.r = bvrbVar;
        this.s = auhiVar;
        a = false;
        b = true;
    }

    @Override // defpackage.itb
    public final void Ns() {
        dbsk.l(true);
        super.Ns();
        this.k.k(new Runnable(this) { // from class: aprp
            private final apru a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                apru apruVar = this.a;
                if (!apruVar.w()) {
                    return;
                }
                apruVar.i = apruVar.e.a();
                apruVar.i.a();
                apruVar.j = apruVar.f.a().j();
                apruVar.d.a(apruVar.j);
                btlu btluVar = apruVar.j;
                if (btluVar != null && btluVar.u()) {
                    apruVar.l(apruVar.j);
                    apro aproVar = apruVar.d;
                    btlu btluVar2 = apruVar.j;
                    dbsk.s(btluVar2);
                    aproVar.g(btluVar2);
                }
                if (!apruVar.h.c()) {
                    return;
                }
                apruVar.d.d(false);
            }
        }, this.p, bvkw.ON_STARTUP_FULLY_COMPLETE);
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.f.a().C().d(this.t, this.p);
        this.f.a().D().d(this.v, this.p);
    }

    @Override // defpackage.itb
    public final void Nu() {
        apri apriVar = this.i;
        if (apriVar != null) {
            apriVar.b();
        }
        super.Nu();
    }

    @Override // defpackage.itb
    public final void Po() {
        super.Po();
        this.f.a().C().c(this.t);
        this.f.a().D().c(this.v);
        k();
    }

    @Override // defpackage.apsa
    public final void e() {
        if (this.d.h.size() == 1) {
            ily ilyVar = new ily();
            ilyVar.k(this.d.h.get(0).o());
            ilo d = ilyVar.d();
            j(d);
            this.o.a().p(d, null, new aprq(this));
            return;
        }
        this.c.D(apuz.g());
    }

    @Override // defpackage.apsa
    public final void f() {
        if (a) {
            if (this.c.K() instanceof apuz) {
                return;
            }
            this.c.D(apuz.g());
            i();
        } else if (this.d.h.size() <= 1) {
            b = false;
        } else {
            a = true;
            this.c.D(apuz.g());
            i();
        }
    }

    public final void i() {
        avac.bp(this.c, Integer.valueOf(dpyv.INSIGHTS_BUSINESS_NOTIFICATION.dm), this.g, this.r, this.s);
    }

    public final void j(ilo iloVar) {
        begj begjVar = new begj();
        begjVar.b(iloVar);
        begjVar.n = true;
        begjVar.c = jjn.EXPANDED;
        begjVar.H = false;
        begjVar.c(false);
        this.o.a().o(begjVar, false, null);
    }

    public final synchronized void k() {
        a = false;
        b = true;
        crzm<dbsg<Integer>> crzmVar = this.w;
        if (crzmVar != null) {
            crzmVar.c(this.u);
            this.w = null;
        }
    }

    public final synchronized void l(btlu btluVar) {
        if (this.w == null) {
            crzm<dbsg<Integer>> u = this.g.u(bvjk.jp, btluVar);
            this.w = u;
            u.d(this.u, this.q);
        }
    }
}
