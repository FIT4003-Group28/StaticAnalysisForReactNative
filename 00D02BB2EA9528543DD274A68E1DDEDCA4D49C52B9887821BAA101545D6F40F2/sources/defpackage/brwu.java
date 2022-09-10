package defpackage;

import android.app.Application;
import android.view.View;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brwu  reason: default package */
/* loaded from: classes4.dex */
public class brwu extends brwk {
    private static final bfke e;
    private boolean A;
    private float B;
    public final dxio<brba> b;
    public final ilo c;
    public final View.AccessibilityDelegate d;
    private final Application f;
    private final btvo i;
    private final brat j;
    private final List<jaz> k;
    private final brwq l;
    private final bfkm m;
    private final boolean n;
    private final brvl o;
    private final int p;
    private float q;
    private final Runnable r;
    private final Runnable s;
    private final cwu t;
    @dzsi
    private final bmbf u;
    private final cjwu v;
    private final beez w;
    private cwt x;
    @dzsi
    private beey y;
    private boolean z;

    static {
        bfkd g = bfke.g.g();
        g.c(dtxr.j);
        g.d(dtyb.bV);
        e = g.a();
    }

    public brwu(Application application, bvjj bvjjVar, dxio<akfa> dxioVar, btvo btvoVar, brat bratVar, brwh brwhVar, brwr brwrVar, aeqg aeqgVar, brvk brvkVar, bmmq bmmqVar, brvm brvmVar, bfhu bfhuVar, brwc brwcVar, bfgx bfgxVar, ahjq ahjqVar, bnjf bnjfVar, bfks bfksVar, dxio<brba> dxioVar2, brvr brvrVar, brbn brbnVar, bruu bruuVar, cwu cwuVar, beez beezVar, bnjs bnjsVar, Runnable runnable, Runnable runnable2, Runnable runnable3, @dzsi dkee dkeeVar, boolean z, boolean z2, boolean z3, boolean z4, int i, @dzsi dcdc<dqfg> dcdcVar, ddho ddhoVar) {
        super(application, bvjjVar, dxioVar, brwhVar, aeqgVar, brvkVar, brvmVar, bmmqVar, bfhuVar, brwcVar, bfgxVar, ahjqVar, bnjfVar, null, bfksVar, dxioVar2, btvoVar, brvrVar, brbnVar, bruuVar, cwuVar, beezVar, bnjsVar, runnable, dkeeVar, z, z2, z4, dcdcVar, ddhoVar, null);
        this.q = 0.0f;
        this.v = new cjwu();
        this.z = false;
        this.A = false;
        this.B = 0.0f;
        this.d = new brwt(this);
        this.f = application;
        this.i = btvoVar;
        this.j = bratVar;
        this.b = dxioVar2;
        int intValue = aD(dkeeVar).intValue();
        bnju a = bnjsVar.a();
        Map<dghs, brva> a2 = brwrVar.a.a();
        brwr.a(a2, 1);
        btvo a3 = brwrVar.b.a();
        brwr.a(a3, 2);
        bmom a4 = brwrVar.c.a();
        brwr.a(a4, 3);
        brwr.a(a, 6);
        brwq brwqVar = new brwq(a2, a3, a4, z4, intValue, a, null);
        this.l = brwqVar;
        ckql ckqlVar = new ckql();
        ckqlVar.e = false;
        ckqlVar.c = jmj.a(application.getApplicationContext(), 238);
        ckqlVar.d = jmj.a(application.getApplicationContext(), 102);
        this.m = bfksVar.a(runnable, ckqlVar, dbsg.i(e));
        bnju a5 = bnjsVar.a();
        ilo aH = a5.aH();
        this.c = aH;
        bnjc h = bnjd.h();
        h.c(!a5.aH().bX().n.isEmpty());
        h.b(z);
        h.h(a5.aB());
        h.g(a5.av().booleanValue());
        if (a5.v().booleanValue()) {
            h.d(1);
        }
        this.k = bnjfVar.a(aH, h.a()).b(btvoVar.getCategoricalSearchParameters().y());
        this.o = brvm.a(false);
        this.p = i;
        if (aC(a5) && brwqVar != null) {
            brwqVar.d(8);
        }
        this.n = z3;
        this.r = runnable2;
        this.u = new bmbm(false, aH);
        this.t = cwuVar;
        this.s = runnable3;
        this.w = beezVar;
    }

    public static boolean aN(float f, int i, float f2) {
        return ((f * 150.0f) + 102.0f) / ((float) i) < f2;
    }

    private final boolean aO() {
        return aB(((brwk) this).a) && aG();
    }

    @Override // defpackage.brwd, defpackage.brvd
    public bruy H() {
        return this.o;
    }

    @Override // defpackage.brwk, defpackage.brwd, defpackage.brvd
    public beer M() {
        beey beeyVar = this.y;
        return beeyVar != null ? beeyVar : this.x;
    }

    @Override // defpackage.brwk, defpackage.brwd, defpackage.brvd
    public List<jaz> P() {
        return this.k;
    }

    @Override // defpackage.brwk, defpackage.brwd, defpackage.brvd
    public void QR(bwrs<ilo> bwrsVar) {
        super.QR(bwrsVar);
        ilo c = bwrsVar.c();
        brwq brwqVar = this.l;
        if (brwqVar != null) {
            brwqVar.e(bwrsVar);
            this.l.d(C().intValue());
        }
        bmbf bmbfVar = this.u;
        if (bmbfVar != null && c != null) {
            bmbfVar.c(c.cA().a);
        }
        if (c == null || !c.aM() || !this.i.getAdsParameters().o) {
            if (c == null || !c.aO() || !this.i.getAdsParameters().p) {
                return;
            }
            if (this.y == null) {
                this.y = this.w.a(beex.TRAVERSAL_VIEW);
            }
            this.y.t(bwrsVar);
            return;
        }
        if (this.x == null) {
            this.x = this.t.a(cws.TRAVERSAL_VIEW);
        }
        this.x.t(bwrsVar);
    }

    @Override // defpackage.brwk, defpackage.brwd, defpackage.brvd
    public Boolean Qx() {
        boolean z = false;
        if (!ar().booleanValue() && aO()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brwd, defpackage.brvd
    public Integer Qy() {
        return 1;
    }

    @Override // defpackage.brwd, defpackage.brvd
    @dzsi
    public CharSequence R() {
        if (A().v().booleanValue()) {
            return A().aA();
        }
        return null;
    }

    @Override // defpackage.brwk, defpackage.brwd, defpackage.brvd
    public cjtd Y() {
        ilo aH = A().aH();
        if (aH == null || !aH.ao()) {
            return super.Y();
        }
        cjta c = cjtd.c(aH.a());
        c.d = dtyb.bM;
        return c.a();
    }

    @Override // defpackage.brwk, defpackage.brve
    @dzsi
    public bruv a() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.brwd
    public final boolean aA() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.brwd
    public final boolean aG() {
        return aN(this.f.getResources().getConfiguration().fontScale, this.f.getResources().getConfiguration().screenHeightDp, this.i.getSearchParameters().j());
    }

    @dzsi
    public View aJ() {
        View view = null;
        if (ar().booleanValue()) {
            for (View view2 : cqkx.n(this)) {
                View a = cqhu.a(view2, bsph.a);
                if (a != null) {
                    view = a;
                }
            }
        }
        return view;
    }

    public void aK(boolean z) {
        this.z = z;
        if (!z) {
            this.A = false;
        }
    }

    public void aL(float f) {
        View aJ = aJ();
        if (aJ != null) {
            this.B = (-aJ.getMeasuredHeight()) * f;
            if (!this.A) {
                return;
            }
            cqkx.p(this);
        }
    }

    public void aM(float f) {
        this.q = f;
    }

    @Override // defpackage.brwk, defpackage.brwd, defpackage.brvd
    @dzsi
    public bmbf ag() {
        if (this.i.getCategoricalSearchParameters().v()) {
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
    public Boolean ak() {
        boolean z = false;
        if (this.j.b() && this.f.getResources().getConfiguration().orientation != 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brwd, defpackage.brvd
    public cqtv an() {
        double d = this.f.getResources().getConfiguration().screenWidthDp;
        Double.isNaN(d);
        return cqrp.d(d * 0.6d);
    }

    @Override // defpackage.brwd, defpackage.brvd
    public Integer ao() {
        return 4;
    }

    @Override // defpackage.brwk, defpackage.brwd, defpackage.brvd
    public cjtd ap() {
        return cjtd.a(dtyb.cb);
    }

    @Override // defpackage.brwk, defpackage.brve
    public Boolean aq() {
        return false;
    }

    @Override // defpackage.brwk, defpackage.brve
    public Boolean ar() {
        boolean z = false;
        if (M() != null && M().v().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brwk, defpackage.brve
    public Boolean as() {
        boolean z = false;
        if (ar().booleanValue() && this.z) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brwk, defpackage.brve
    public cqtv at() {
        return au().booleanValue() ? cqsg.d(t(), cqrp.d(22.0d)) : cqrp.d(22.0d);
    }

    @Override // defpackage.brwk, defpackage.brve
    public Boolean au() {
        boolean z = false;
        if (aO() && ar().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brwk, defpackage.brve
    public Float av() {
        return Float.valueOf(this.B);
    }

    @Override // defpackage.brwk, defpackage.brve
    public Boolean aw() {
        return Boolean.valueOf(this.A);
    }

    @Override // defpackage.brwk, defpackage.brve
    public void ax() {
        this.A = true;
    }

    @Override // defpackage.brwk, defpackage.brve
    public void ay() {
        this.s.run();
    }

    @Override // defpackage.brwk, defpackage.brvd
    public Boolean d() {
        boolean z = false;
        if (!this.n && !this.k.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brwk, defpackage.brvd
    public cqtv e() {
        return cqrp.d(102.0d);
    }

    @Override // defpackage.brwk, defpackage.brwd, defpackage.brvd
    public bfkm m() {
        bfkm bfkmVar = this.m;
        if (bfkmVar instanceof bfkr) {
            ((bfkr) bfkmVar).t(A().aH());
        }
        return this.m;
    }

    @Override // defpackage.brwk, defpackage.brve
    public Boolean n() {
        return true;
    }

    @Override // defpackage.brwk, defpackage.brve
    public Boolean o() {
        boolean z = true;
        if (aD(((brwk) this).a).intValue() == 2 && !this.i.getCategoricalSearchParameters().s()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brwd, defpackage.brvd
    public cqkl q() {
        if (this.q != -1.0f || !this.i.getCategoricalSearchParameters().a()) {
            return super.q();
        }
        this.r.run();
        return cqkl.a;
    }

    @Override // defpackage.brwk, defpackage.brve
    public cqtc r() {
        return cqrp.d(this.p);
    }

    @Override // defpackage.brwd, defpackage.brvd
    public View.OnAttachStateChangeListener s() {
        return new brws(this);
    }

    @Override // defpackage.brwk, defpackage.brve
    public cqtv t() {
        return cqrp.d(Math.round((this.q + 1.0f) * 102.0f));
    }

    @Override // defpackage.brwk, defpackage.brve
    public Boolean u() {
        return false;
    }

    @Override // defpackage.brwk, defpackage.brve
    @dzsi
    public cjwu x() {
        return this.v;
    }

    @Override // defpackage.brwk, defpackage.brve
    public Boolean z() {
        return false;
    }
}
