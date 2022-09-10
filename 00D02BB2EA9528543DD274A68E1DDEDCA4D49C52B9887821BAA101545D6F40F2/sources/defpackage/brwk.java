package defpackage;

import android.app.Application;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brwk  reason: default package */
/* loaded from: classes4.dex */
public class brwk extends brwd implements brve {
    private static final bfke b;
    @dzsi
    public final dkee a;
    @dzsi
    private final brwv c;
    private final bnjs d;
    private final btvo e;
    private final Runnable f;
    @dzsi
    private final brwg i;
    @dzsi
    private bwrs<ilo> j;
    private final boolean k;
    private final boolean l;
    private final bfkm m;
    private final List<jaz> n;
    private final boolean o;
    private final bdzw p;
    private final brvj q;
    private final cwt r;
    private final brbn s;
    @dzsi
    private final ddho t;
    @dzsi
    private final bmbf u;
    private final beey v;

    static {
        bfkd g = bfke.g.g();
        g.c(dtxr.i);
        g.d(dtyb.aV);
        b = g.a();
    }

    public brwk(Application application, bvjj bvjjVar, dxio<akfa> dxioVar, brwh brwhVar, aeqg aeqgVar, brvk brvkVar, brvm brvmVar, bmmq bmmqVar, bfhu bfhuVar, brwc brwcVar, bfgx bfgxVar, ahjq ahjqVar, bnjf bnjfVar, @dzsi brwv brwvVar, bfks bfksVar, final dxio<brba> dxioVar2, btvo btvoVar, brvr brvrVar, brbn brbnVar, bruu bruuVar, cwu cwuVar, beez beezVar, bnjs bnjsVar, Runnable runnable, @dzsi dkee dkeeVar, boolean z, boolean z2, boolean z3, @dzsi dcdc<dqfg> dcdcVar, ddho ddhoVar, @dzsi ddho ddhoVar2) {
        super(application, bvjjVar, dxioVar, aeqgVar, bmmqVar, bfhuVar, brwcVar.a(runnable), bfgxVar, ahjqVar, bnjsVar, null, runnable, ddhoVar, null, dcdcVar, true, new aeqe(dxioVar2) { // from class: brwi
            private final dxio a;

            {
                this.a = dxioVar2;
            }

            @Override // defpackage.aeqe
            public final void a(ilo iloVar) {
                dxio dxioVar3 = this.a;
                begj begjVar = new begj();
                begjVar.n = true;
                begjVar.c = jjn.FULLY_EXPANDED;
                begjVar.e = bege.PRICES;
                begjVar.B = true;
                ((brba) dxioVar3.a()).J(iloVar, begjVar);
            }
        }, null, dtxy.dx, bruuVar);
        bnju A = A();
        ilo aH = A.aH();
        this.c = brwvVar;
        this.d = bnjsVar;
        this.m = bfksVar.a(runnable, null, dbsg.i(b));
        this.f = runnable;
        this.a = dkeeVar;
        this.k = z;
        this.l = z2;
        this.e = btvoVar;
        this.o = z3;
        ddho ddhoVar3 = dtyb.aK;
        btvo a = brvrVar.a.a();
        brvr.a(a, 1);
        dxio a2 = ((dxjh) brvrVar.b).a();
        brvr.a(a2, 2);
        dxio a3 = ((dxjh) brvrVar.c).a();
        brvr.a(a3, 3);
        becb a4 = brvrVar.d.a();
        brvr.a(a4, 4);
        brvs a5 = brvrVar.e.a();
        brvr.a(a5, 5);
        bebr a6 = brvrVar.f.a();
        brvr.a(a6, 6);
        beam a7 = brvrVar.g.a();
        brvr.a(a7, 7);
        bebo a8 = brvrVar.h.a();
        brvr.a(a8, 8);
        bkgz a9 = brvrVar.i.a();
        brvr.a(a9, 9);
        bkgy a10 = brvrVar.j.a();
        brvr.a(a10, 10);
        brvr.a(ddhoVar3, 11);
        this.p = new brvq(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, ddhoVar3);
        this.s = brbnVar;
        bnjc h = bnjd.h();
        h.c(!aH.bX().n.isEmpty());
        h.b(z);
        h.h(A.aB());
        h.g(A.av().booleanValue());
        this.n = bnjfVar.a(aH, h.a()).b(btvoVar.getCategoricalSearchParameters().x());
        brwj brwjVar = new brwj(brbnVar);
        gga a11 = brvkVar.a.a();
        brvk.a(a11, 1);
        brvk.a(brwjVar, 2);
        brvk.a(aH, 3);
        this.q = new brvj(a11, brwjVar, aH);
        int intValue = aD(dkeeVar).intValue();
        bnju A2 = A();
        Map<dghs, brva> a12 = brwhVar.a.a();
        brwh.a(a12, 1);
        btvo a13 = brwhVar.b.a();
        brwh.a(a13, 2);
        bmom a14 = brwhVar.c.a();
        brwh.a(a14, 3);
        brwh.a(A2, 6);
        brwg brwgVar = new brwg(a12, a13, a14, z3, intValue, A2, null);
        this.i = brwgVar;
        if (aC(A) && brwgVar != null) {
            brwgVar.d(8);
        }
        this.r = cwuVar.a(cws.LIST_VIEW);
        this.t = ddhoVar2;
        this.u = new bmbm(false, aH);
        this.v = beezVar.a(beex.LIST_VIEW);
    }

    private final boolean aJ() {
        ilo c;
        bwrs<ilo> bwrsVar = this.j;
        return bwrsVar != null && (c = bwrsVar.c()) != null && c.aO() && this.e.getAdsParameters().p;
    }

    @Override // defpackage.brwd, defpackage.brvd
    public Integer E() {
        int i;
        if (!Qx().booleanValue()) {
            return 0;
        }
        if (!aE()) {
            bwrs<ilo> bwrsVar = this.j;
            if (bwrsVar != null) {
                ilo c = bwrsVar.c();
                if (this.a == dkee.DINING && c != null && !c.aF(dweb.MENU).isEmpty()) {
                    i = 2;
                }
            }
            return 0;
        }
        i = 1;
        return Integer.valueOf(i);
    }

    @Override // defpackage.brwd, defpackage.brvd
    public beer M() {
        return aJ() ? this.v : this.r;
    }

    @Override // defpackage.brwd, defpackage.brvd
    public List<jaz> P() {
        return this.n;
    }

    @Override // defpackage.brwd
    public int QB() {
        return 4;
    }

    @Override // defpackage.brwd, defpackage.brvd
    public void QR(bwrs<ilo> bwrsVar) {
        this.j = bwrsVar;
        this.p.b(bwrsVar);
        this.s.e = bwrsVar;
        brwg brwgVar = this.i;
        if (brwgVar != null) {
            brwgVar.e(bwrsVar);
            this.i.d(C().intValue());
        }
        if (this.u != null && bwrsVar.c() != null) {
            bmbf bmbfVar = this.u;
            ilo c = bwrsVar.c();
            dbsk.s(c);
            bmbfVar.c(c.cA().a);
        }
        if (aJ()) {
            this.v.t(bwrsVar);
        } else {
            this.r.t(bwrsVar);
        }
        super.QR(bwrsVar);
    }

    @Override // defpackage.brwd, defpackage.brvd
    public Boolean Qx() {
        boolean z = false;
        if (aB(this.a) && aA() && aG()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brwd, defpackage.brvd
    public Boolean V() {
        boolean z = false;
        if (super.V().booleanValue() && !W().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brwd, defpackage.brvd
    public Boolean W() {
        return A().aw();
    }

    @Override // defpackage.brwd, defpackage.brvd
    public cjtd Y() {
        ilo aH = A().aH();
        if (aH == null || !aH.al().a.a()) {
            if (aH == null || !aH.ao()) {
                return cjtd.b;
            }
            cjta c = cjtd.c(aH.a());
            c.d = dtyb.bs;
            return c.a();
        }
        cjta b2 = cjtd.b();
        b2.d = dtyb.bm;
        return b2.a();
    }

    @Override // defpackage.brwd, defpackage.brvd
    public Boolean Z() {
        boolean z = false;
        if (!V().booleanValue() && !W().booleanValue() && !A().as().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brve
    @dzsi
    public bruv a() {
        return this.i;
    }

    @dzsi
    public bwrs<ilo> aI() {
        return this.j;
    }

    @Override // defpackage.brwd, defpackage.brvd
    @dzsi
    public bmbf ag() {
        if (this.e.getCategoricalSearchParameters().v()) {
            bmbf bmbfVar = this.u;
            dbsk.s(bmbfVar);
            if (bmbfVar.a().isEmpty()) {
                return null;
            }
            return this.u;
        }
        return null;
    }

    @Override // defpackage.brwd, defpackage.brvd
    public Boolean aj() {
        return false;
    }

    @Override // defpackage.brwd, defpackage.brvd
    public cjtd ap() {
        return cjtd.a(dtyb.aZ);
    }

    @Override // defpackage.brve
    public Boolean aq() {
        cwz y = y();
        boolean z = false;
        if (y != null && y.v().booleanValue() && y.y().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brve
    public Boolean ar() {
        return false;
    }

    @Override // defpackage.brve
    public Boolean as() {
        return false;
    }

    @Override // defpackage.brve
    public cqtv at() {
        return cqrp.d(dcyn.a);
    }

    @Override // defpackage.brve
    public Boolean au() {
        return false;
    }

    @Override // defpackage.brve
    public Float av() {
        return Float.valueOf(0.0f);
    }

    @Override // defpackage.brve
    public Boolean aw() {
        return false;
    }

    @Override // defpackage.brve
    public void ax() {
    }

    @Override // defpackage.brve
    public void ay() {
    }

    @Override // defpackage.brvd
    public Boolean d() {
        return Boolean.valueOf(!this.n.isEmpty());
    }

    @Override // defpackage.brvd
    public cqtv e() {
        return cqrp.d(142.0d);
    }

    @Override // defpackage.brvd
    public Boolean f() {
        return true;
    }

    @Override // defpackage.brvd
    public Boolean g() {
        return false;
    }

    @Override // defpackage.brwd
    protected final float h() {
        return 221.0f;
    }

    @Override // defpackage.brwd
    @dzsi
    protected final dkee i() {
        return this.a;
    }

    @Override // defpackage.brwd, defpackage.brvd
    public bfkm m() {
        bfkm bfkmVar = this.m;
        if (bfkmVar instanceof bfkr) {
            ((bfkr) bfkmVar).t(A().aH());
        }
        return this.m;
    }

    @Override // defpackage.brve
    public Boolean n() {
        return false;
    }

    @Override // defpackage.brve
    public Boolean o() {
        return true;
    }

    @Override // defpackage.brve
    public cqtc r() {
        return cqrp.d(dcyn.a);
    }

    @Override // defpackage.brve
    public cqtv t() {
        return cqrp.d(dcyn.a);
    }

    @Override // defpackage.brve
    public Boolean u() {
        for (bdzv bdzvVar : this.p.a()) {
            if (bdzvVar.d().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.brve
    public bdzw v() {
        return this.p;
    }

    @Override // defpackage.brve
    public bruw w() {
        return this.q;
    }

    @Override // defpackage.brve
    @dzsi
    public cjwu x() {
        return null;
    }

    @Override // defpackage.brve
    @dzsi
    public cwz y() {
        beer M = M();
        if (M instanceof cwz) {
            return (cwz) M;
        }
        return null;
    }

    @Override // defpackage.brve
    public Boolean z() {
        cwz y = y();
        boolean z = false;
        if (y != null && y.v().booleanValue() && !y.y().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public brwu aH(boolean z, int i, Runnable runnable, Runnable runnable2) {
        ddho ddhoVar;
        brwv brwvVar = this.c;
        if (brwvVar == null || (ddhoVar = this.t) == null) {
            return (brwu) this;
        }
        bnjs bnjsVar = this.d;
        Runnable runnable3 = this.f;
        dkee dkeeVar = this.a;
        boolean z2 = this.k;
        boolean z3 = this.l;
        boolean z4 = this.o;
        dcdc<dqfg> dcdcVar = this.h;
        Application a = brwvVar.a.a();
        brwv.a(a, 1);
        bvjj a2 = brwvVar.b.a();
        brwv.a(a2, 2);
        dxio a3 = ((dxjh) brwvVar.c).a();
        brwv.a(a3, 3);
        btvo a4 = brwvVar.d.a();
        brwv.a(a4, 4);
        brat a5 = brwvVar.e.a();
        brwv.a(a5, 5);
        brwh a6 = brwvVar.f.a();
        brwv.a(a6, 6);
        brwr a7 = brwvVar.g.a();
        brwv.a(a7, 7);
        aeqg a8 = brwvVar.h.a();
        brwv.a(a8, 8);
        brvk a9 = brwvVar.i.a();
        brwv.a(a9, 9);
        bmmq a10 = brwvVar.j.a();
        brwv.a(a10, 10);
        brvm a11 = brwvVar.k.a();
        brwv.a(a11, 11);
        bfhu a12 = brwvVar.l.a();
        brwv.a(a12, 12);
        brwc a13 = brwvVar.m.a();
        brwv.a(a13, 13);
        bfgx a14 = brwvVar.n.a();
        brwv.a(a14, 14);
        ahjq a15 = brwvVar.o.a();
        brwv.a(a15, 15);
        bnjf a16 = brwvVar.p.a();
        brwv.a(a16, 16);
        bfks a17 = brwvVar.q.a();
        brwv.a(a17, 17);
        dxio a18 = ((dxjh) brwvVar.r).a();
        brwv.a(a18, 18);
        brvr a19 = brwvVar.s.a();
        brwv.a(a19, 19);
        brbn a20 = brwvVar.t.a();
        brwv.a(a20, 20);
        bruu a21 = brwvVar.u.a();
        brwv.a(a21, 21);
        cwu a22 = brwvVar.v.a();
        brwv.a(a22, 22);
        brwv.a(brwvVar.w.a(), 23);
        brwv.a(brwvVar.x.a(), 24);
        beez a23 = brwvVar.y.a();
        brwv.a(a23, 25);
        brwv.a(bnjsVar, 26);
        brwv.a(runnable3, 27);
        brwv.a(runnable, 28);
        brwv.a(runnable2, 29);
        brwv.a(ddhoVar, 38);
        brwu brwuVar = new brwu(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, bnjsVar, runnable3, runnable, runnable2, dkeeVar, z2, z3, z, z4, i, dcdcVar, ddhoVar);
        bwrs<ilo> bwrsVar = this.j;
        if (bwrsVar != null) {
            brwuVar.QR(bwrsVar);
        }
        return brwuVar;
    }
}
