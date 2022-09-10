package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: brwd  reason: default package */
/* loaded from: classes4.dex */
public abstract class brwd implements brvd {
    private final ddho a;
    private final Runnable b;
    private final boolean c;
    private final aeqf d;
    @dzsi
    private final bmmp e;
    @dzsi
    private final View.OnAttachStateChangeListener f;
    protected final Application g;
    @dzsi
    protected final dcdc<dqfg> h;
    @dzsi
    private final brvc i;
    @dzsi
    private final bnhz j;
    private final bfht k;
    private final bnju l;
    private final bfgx m;
    private final brvl n;
    private final boolean o;
    private ilo p;
    private bfgs q;
    private boolean r;
    private List<zef> s = dcdc.e();
    private final bruu t;

    /* JADX INFO: Access modifiers changed from: protected */
    public brwd(Application application, bvjj bvjjVar, dxio<akfa> dxioVar, aeqg aeqgVar, bmmq bmmqVar, bfhu bfhuVar, @dzsi brvc brvcVar, bfgx bfgxVar, ahjq ahjqVar, bnjs bnjsVar, @dzsi View.OnAttachStateChangeListener onAttachStateChangeListener, Runnable runnable, ddho ddhoVar, @dzsi bnhz bnhzVar, @dzsi dcdc<dqfg> dcdcVar, boolean z, @dzsi aeqe aeqeVar, @dzsi mw<ilo> mwVar, ddho ddhoVar2, bruu bruuVar) {
        this.g = application;
        this.i = brvcVar;
        this.j = bnhzVar;
        this.f = onAttachStateChangeListener;
        this.b = runnable;
        this.a = ddhoVar;
        this.c = z;
        bnjsVar.b(true);
        bnjsVar.c = ahjqVar.a();
        bnju a = bnjsVar.a();
        this.l = a;
        this.p = a.aH();
        this.h = dcdcVar;
        this.k = bfhuVar.a(false, false, null);
        this.d = aeqgVar.a(this.p, aeqeVar, ddhoVar2);
        this.n = brvm.a(true);
        ilo iloVar = this.p;
        jkf a2 = bmmqVar.a.a();
        bmmq.a(a2, 1);
        bmmo a3 = bmmqVar.b.a();
        bmmq.a(a3, 2);
        bmmq.a(iloVar, 3);
        this.e = new bmmp(a2, a3, iloVar, mwVar);
        this.m = bfgxVar;
        this.q = bfgxVar.a(this.p.cK());
        this.o = bvjjVar.o(bvjk.hO, dxioVar.a().j(), false);
        this.t = bruuVar;
        a(this.p);
    }

    private final void a(ilo iloVar) {
        this.p = iloVar;
        boolean z = true;
        if (!this.c && !iloVar.j() && !iloVar.h && !iloVar.f) {
            z = false;
        }
        this.r = z;
        brvc brvcVar = this.i;
        if (brvcVar != null) {
            brvcVar.e(iloVar);
        }
        this.q = this.m.a(iloVar.cK());
        bruu bruuVar = this.t;
        ArrayList arrayList = new ArrayList();
        if (iloVar.ba()) {
            dopk bP = iloVar.bP();
            albv.f(bruuVar.a, bP);
            for (doph dophVar : bP.e) {
                for (dooo doooVar : dophVar.d) {
                    arrayList.add(new zsf(bruuVar.a, doooVar.c, null, null, null, akqi.b(doooVar.b), null, cjtd.b));
                }
            }
        }
        this.s = arrayList;
    }

    public static boolean aB(@dzsi dkee dkeeVar) {
        return dkeeVar == dkee.DINING || dkeeVar == dkee.RICH || dkeeVar == dkee.HOTEL || dkeeVar == dkee.HOTEL_CHAIN || dkeeVar == dkee.SHOPPING;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean aC(bnju bnjuVar) {
        List<bevm> R = bnjuVar.R();
        return R != null && !R.isEmpty();
    }

    @Override // defpackage.brvd
    public Boolean B() {
        return Boolean.valueOf(e().e(this.g.getApplicationContext()) == 0);
    }

    @Override // defpackage.brvd
    public Integer C() {
        if (!this.p.aV()) {
            ilo iloVar = this.p;
            if (!iloVar.i) {
                if (!dbsj.d(iloVar.ab())) {
                    return Integer.valueOf(QB());
                }
                if (!aC(this.l)) {
                    return aD(i());
                }
                return 8;
            }
        }
        return 7;
    }

    @Override // defpackage.brvd
    public Boolean D() {
        return Boolean.valueOf(!this.r);
    }

    @Override // defpackage.brvd
    public Integer E() {
        int i = 0;
        if (aE() && Qx().booleanValue()) {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.brvd
    public Integer F() {
        int i = 0;
        if (aE() && !Qx().booleanValue()) {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.brvd
    public aeqd G() {
        return (this.d.b() == null && aF()) ? this.e : this.d;
    }

    @Override // defpackage.brvd
    public bruy H() {
        return this.n;
    }

    @Override // defpackage.brvd
    @dzsi
    public aeqj I() {
        if (E().intValue() == 1) {
            return G().d();
        }
        return null;
    }

    @Override // defpackage.brvd
    public brux J() {
        return this.k;
    }

    @Override // defpackage.brvd
    public Boolean K() {
        return Boolean.valueOf(this.p.j());
    }

    @Override // defpackage.brvd
    @dzsi
    public brvc L() {
        return this.i;
    }

    @Override // defpackage.brvd
    @dzsi
    public beer M() {
        brvc brvcVar = this.i;
        if (brvcVar == null) {
            return null;
        }
        return brvcVar.d();
    }

    @Override // defpackage.brvd
    public bfgs N() {
        return this.q;
    }

    @Override // defpackage.brvd
    @dzsi
    public bnhz O() {
        return this.j;
    }

    @Override // defpackage.brvd
    public List<jaz> P() {
        return dcdc.e();
    }

    @Override // defpackage.brvd
    public String Q() {
        String string = this.g.getString(R.string.HOTEL_GOOGLE_ONE_BADGE_DESCRIPTION);
        String g = A().g();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(g).length());
        sb.append(string);
        sb.append(", ");
        sb.append(g);
        return (!aE() || Qx().booleanValue() || G().d() == null) ? A().g() : sb.toString();
    }

    public int QB() {
        return 5;
    }

    @Override // defpackage.brvd
    public void QR(bwrs<ilo> bwrsVar) {
        this.k.t(bwrsVar);
        ilo c = bwrsVar.c();
        if (c != null) {
            this.l.au(c);
            this.d.h(c);
            this.e.h(c);
            a(c);
        }
    }

    @Override // defpackage.brvd
    public Boolean Qx() {
        brvc brvcVar = this.i;
        boolean z = false;
        if (brvcVar == null || !brvcVar.a().booleanValue()) {
            if (aB(i()) && aA() && aG()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    @Override // defpackage.brvd
    public Integer Qy() {
        return 2;
    }

    @Override // defpackage.brvd
    @dzsi
    public CharSequence R() {
        if (A().v().booleanValue()) {
            return A().az();
        }
        return null;
    }

    public void Rd(boolean z) {
    }

    @Override // defpackage.brvd
    public Boolean S() {
        boolean z = false;
        if ((this.p.ba() && T().booleanValue()) || (this.o && this.p.cX() != 1)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvd
    public Boolean T() {
        return Boolean.valueOf(this.p.cX() == 2);
    }

    @Override // defpackage.brvd
    public cjtd U() {
        if (this.o) {
            cjta c = cjtd.c(this.p.a());
            c.d = dtxy.nm;
            return c.a();
        }
        return cjtd.a(dtxy.gT);
    }

    @Override // defpackage.brvd
    public Boolean V() {
        bnhz bnhzVar = this.j;
        boolean z = true;
        boolean z2 = bnhzVar != null && bnhzVar.b().booleanValue() && !dbsj.d(this.j.a());
        boolean z3 = !this.l.aa().booleanValue() && !dbsj.d(this.l.t());
        if (!z2 && !z3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvd
    public Boolean W() {
        return false;
    }

    @Override // defpackage.brvd
    public cjtd X() {
        return this.l.aG();
    }

    @Override // defpackage.brvd
    public cjtd Y() {
        return cjtd.b;
    }

    @Override // defpackage.brvd
    public Boolean Z() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean aA() {
        return this.l.ah().i().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Integer aD(@dzsi dkee dkeeVar) {
        int i;
        dcdc<dqfg> dcdcVar;
        if (dkeeVar == null) {
            return 1;
        }
        if (dkeeVar != dkee.DINING || (dcdcVar = this.h) == null || dcdcVar.isEmpty() || (!this.h.contains(dqfg.FOOD_DELIVERY) && !this.h.contains(dqfg.FOOD_PICKUP) && !this.h.contains(dqfg.RESERVE_RESTAURANTS))) {
            switch (dkeeVar.ordinal()) {
                case 1:
                    i = 4;
                    break;
                case 2:
                case 5:
                case 10:
                    i = 0;
                    break;
                case 3:
                case 9:
                default:
                    return 1;
                case 4:
                    i = 3;
                    break;
                case 6:
                    i = 9;
                    break;
                case 7:
                case 8:
                    i = 2;
                    break;
                case 11:
                    i = 10;
                    break;
            }
        } else {
            i = 11;
        }
        return Integer.valueOf(i);
    }

    public boolean aE() {
        dkee i = i();
        if (i == null) {
            return false;
        }
        int ordinal = i.ordinal();
        if ((ordinal == 7 || ordinal == 8) && this.p.bS().a() && G().b() != null) {
            aeqk b = G().b();
            dbsk.s(b);
            if (!dbsj.d(b.b())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean aF() {
        return this.e.b() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean aG() {
        return ((float) this.g.getResources().getConfiguration().screenHeightDp) / h() > 2.0f;
    }

    @Override // defpackage.brvd
    @dzsi
    public cqix<? extends aklb> aa() {
        return null;
    }

    @Override // defpackage.brvd
    public Boolean ab() {
        return false;
    }

    @Override // defpackage.brvd
    @dzsi
    public cjhh ac() {
        return null;
    }

    @Override // defpackage.brvd
    @dzsi
    public bfmg ad() {
        return null;
    }

    @Override // defpackage.brvd
    @dzsi
    public betc ae() {
        return null;
    }

    @Override // defpackage.brvd
    @dzsi
    public bijb af() {
        return null;
    }

    @Override // defpackage.brvd
    @dzsi
    public bmbf ag() {
        return null;
    }

    @Override // defpackage.brvd
    public Boolean ah() {
        return false;
    }

    @Override // defpackage.brvd
    public cjtd ai() {
        return cjtd.b;
    }

    @Override // defpackage.brvd
    public Boolean aj() {
        return Boolean.valueOf(this.j != null);
    }

    @Override // defpackage.brvd
    public Boolean ak() {
        return false;
    }

    @Override // defpackage.brvd
    public Boolean al() {
        throw null;
    }

    @Override // defpackage.brvd
    public List<zef> am() {
        return this.s;
    }

    @Override // defpackage.brvd
    public cqtv an() {
        double d = this.g.getResources().getConfiguration().screenWidthDp;
        Double.isNaN(d);
        return cqrp.d(d * 0.8d);
    }

    @Override // defpackage.brvd
    public Integer ao() {
        return 5;
    }

    @Override // defpackage.brvd
    public cjtd ap() {
        throw null;
    }

    @Override // defpackage.brvd
    /* renamed from: az */
    public bnju A() {
        return this.l;
    }

    protected abstract float h();

    @dzsi
    protected abstract dkee i();

    @Override // defpackage.brvd
    public cjtd k() {
        cjta c = cjtd.c(this.p.ca());
        c.d = this.a;
        return c.a();
    }

    @Override // defpackage.brvd
    public bfkm m() {
        return this.l.ah();
    }

    @Override // defpackage.brvd
    public Boolean p() {
        return true;
    }

    @Override // defpackage.brvd
    public cqkl q() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.brvd
    @dzsi
    public View.OnAttachStateChangeListener s() {
        return this.f;
    }
}
