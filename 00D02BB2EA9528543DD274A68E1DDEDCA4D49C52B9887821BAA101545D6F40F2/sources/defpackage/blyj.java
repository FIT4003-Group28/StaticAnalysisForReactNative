package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: blyj  reason: default package */
/* loaded from: classes3.dex */
public class blyj extends blxc {
    public final bvrb d;
    public final dxio<blpp> e;
    @dzsi
    public bwrs<ilo> f;
    public final blwy g;
    public final dxio<btvo> h;
    @dzsi
    bvxh i;
    private final dxio<akfa> k;
    private final bvvw l;
    private boolean m;
    private CharSequence p;
    private CharSequence q;
    private final dxio<begg> r;
    private final cjqy s;
    private final ckcw u;
    private boolean v;
    private String w;
    private final ckmm x;
    private final bhhf y;
    private boolean n = false;
    private boolean o = false;
    private final blyi t = new blyi(this);
    int j = 1;

    public blyj(blwy blwyVar, dxio<akfa> dxioVar, bvrb bvrbVar, cjqy cjqyVar, dxio<blpp> dxioVar2, dxio<begg> dxioVar3, ckcw ckcwVar, dxio<btvo> dxioVar4, bvvw bvvwVar, cqhn cqhnVar, ckmm ckmmVar, bhhf bhhfVar) {
        this.g = blwyVar;
        this.k = dxioVar;
        this.d = bvrbVar;
        this.e = dxioVar2;
        this.r = dxioVar3;
        this.u = ckcwVar;
        this.h = dxioVar4;
        this.l = bvvwVar;
        this.s = cjqyVar;
        this.x = ckmmVar;
        this.y = bhhfVar;
    }

    private final dbsg<blvu> as() {
        return dbsg.j(new blvv(this.g.e(), new blwn(this.e.a().o())).b);
    }

    private final boolean at() {
        return av() && this.v;
    }

    private final boolean au() {
        return this.h.a().getEnableFeatureParameters().ae;
    }

    private final boolean av() {
        return this.h.a().getEnableFeatureParameters().ag;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence E() {
        return this.p;
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public CharSequence F() {
        return this.q;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public Boolean G() {
        dbsg<blvu> as = as();
        boolean z = false;
        if (as.a() && as.b().q == 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc, defpackage.blwp
    public void a() {
    }

    @Override // defpackage.blxc
    public Boolean ab() {
        return Boolean.valueOf(as().a());
    }

    @Override // defpackage.blxc
    public Boolean ac() {
        boolean z = true;
        if (this.r.a().f() && this.r.a().j() != bege.OVERVIEW) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc
    public Boolean ad() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.blxc
    public Boolean ae() {
        CharSequence E = E();
        boolean z = false;
        if (!this.b && ab().booleanValue() && !TextUtils.isEmpty(E) && !at()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blxc
    public void ag(btrm btrmVar) {
        blyi blyiVar = this.t;
        dceq a = dcet.a();
        a.b(beud.class, new blyk(0, beud.class, blyiVar, bvrj.UI_THREAD));
        a.b(blpl.class, new blyk(1, blpl.class, blyiVar, bvrj.UI_THREAD));
        a.b(blpn.class, new blyk(2, blpn.class, blyiVar, bvrj.UI_THREAD));
        a.b(bqje.class, new blyk(3, bqje.class, blyiVar, bvrj.UI_THREAD));
        a.b(blpi.class, new blyk(4, blpi.class, blyiVar, bvrj.UI_THREAD));
        btrmVar.g(blyiVar, a.a());
    }

    @Override // defpackage.blxc
    public void ah(btrm btrmVar) {
        btrmVar.a(this.t);
    }

    @Override // defpackage.blxc
    public final void ak(int i, boolean z) {
        if (z == this.n || !ae().booleanValue()) {
            return;
        }
        this.o = true;
        this.n = z;
        cqkx.p(this);
    }

    public void an(CharSequence charSequence) {
        this.p = charSequence;
    }

    public void ao(CharSequence charSequence) {
        this.q = charSequence;
    }

    public final void ap() {
        if (dbsd.a(this.k.a().j(), btlu.a)) {
            return;
        }
        blwy blwyVar = this.g;
        blwyVar.b.b(new blwx(blwyVar, new blyf(this)), bvrj.BACKGROUND_THREADPOOL);
    }

    public final void aq() {
        if (this.y.b(this.f)) {
            return;
        }
        dbsg<blvu> as = as();
        if (!as.a()) {
            return;
        }
        an(as.b().h);
        ao(as.b().i);
        bwrs<ilo> bwrsVar = this.f;
        if (bwrsVar == null) {
            return;
        }
        String str = bwrsVar.c().cq().b;
        int b = this.f.c().cq().b();
        if (dbsj.d(str) || dbsd.a(str, this.w)) {
            return;
        }
        this.w = str;
        if (!au()) {
            return;
        }
        if (this.h.a().getEnableFeatureParameters().af) {
            this.d.b(new blyg(this, str, b), bvrj.UI_THREAD);
        } else {
            this.l.i(str);
        }
    }

    public final boolean ar() {
        return !av();
    }

    @Override // defpackage.blxc, defpackage.blwp
    public cqkl q() {
        dcdc<blvu> e = this.g.e();
        if (!e.isEmpty()) {
            String str = this.f.c().cq().b;
            if (!au() || dbsj.d(str)) {
                if (au() && dbsj.d(str)) {
                    cjqy cjqyVar = this.s;
                    cjsx i = cjsy.i();
                    i.b(ddda.dl);
                    cjqyVar.k(i.a());
                }
                String str2 = this.f.c().a() == null ? null : this.f.c().a().e;
                btlu j = this.k.a().j();
                ((ckhe) this.u.a(ckjw.I)).a();
                this.x.e(cwsv.a("RiddlerStartNativePageEvent"));
                this.e.a().p(new blvw(e), false, str2, true, this.f.c().ai(), btlu.h(j), blpk.PLACE_PAGE, this.j);
            } else if (this.i != null) {
                this.e.a().j(this.i, blpq.PLACE_PAGE_PREFETCH);
            } else {
                this.e.a().i(str, this.f.c().cq().b(), blpq.PLACE_PAGE_NONPREFETCH);
            }
        }
        this.v = true;
        if (at()) {
            cqkx.p(this);
        }
        this.i = null;
        return cqkl.a;
    }

    @Override // defpackage.blxc, defpackage.blwp
    public cqkl s() {
        this.b = true;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.blxc, defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.f = bwrsVar;
        iln be = bwrsVar.c().be();
        boolean z = true;
        if (be != iln.BUSINESS && be != iln.STATION && be != iln.GEOCODE) {
            z = false;
        }
        this.m = z;
        this.g.a();
        this.g.c(bwrsVar.c().bp());
        this.g.d(bwrsVar.c().cq());
        if (ab().booleanValue()) {
            this.j = 2;
        }
        ap();
    }

    @Override // defpackage.blxc, defpackage.bega
    public void u() {
        this.f = null;
        this.m = false;
        this.g.a();
        this.g.d(null);
    }

    @Override // defpackage.blxc, defpackage.blwp
    @dzsi
    public cqfc z(blwo blwoVar) {
        if (this.o) {
            this.o = false;
            return ai(blwoVar, !this.n);
        }
        return null;
    }
}
