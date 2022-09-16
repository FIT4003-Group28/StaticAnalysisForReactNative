package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chkn  reason: default package */
/* loaded from: classes4.dex */
public class chkn extends chjd implements chmp, chke {
    public static final dcqe c = dcqe.c("chkn");
    public final Activity d;
    public final Executor e;
    public final buqs f;
    public final dxio<ahjq> g;
    public final Resources h;
    public final cdfx i;
    public final chmu j;
    public final chie k;
    public final List<chkf> l;
    public final dvya m;
    @dzsi
    public chkm n;
    private final cklf o;
    private final bmdv p;
    private final axru q;
    private final axrx r;
    private final bbut s;
    private final chkk t;
    private final chki u;
    private final chkg v;
    private final dwmx w;

    public chkn(Activity activity, Executor executor, buqs buqsVar, cklf cklfVar, bmdv bmdvVar, dxio<ahjq> dxioVar, axru axruVar, axrx axrxVar, bbut bbutVar, Resources resources, cdfx cdfxVar, chkg chkgVar, chmu chmuVar) {
        super(chmuVar);
        chig chigVar;
        djfi djfiVar;
        this.d = activity;
        this.e = executor;
        this.f = buqsVar;
        this.o = cklfVar;
        this.p = bmdvVar;
        this.g = dxioVar;
        this.q = axruVar;
        this.r = axrxVar;
        this.s = bbutVar;
        this.h = resources;
        this.i = cdfxVar;
        this.v = chkgVar;
        this.j = chmuVar;
        chik a = chmuVar.a();
        if (a.a == 2) {
            chigVar = (chig) a.b;
        } else {
            chigVar = chig.f;
        }
        djfl djflVar = chigVar.b;
        djflVar = djflVar == null ? djfl.e : djflVar;
        if (djflVar.b == 3) {
            djfiVar = (djfi) djflVar.c;
        } else {
            djfiVar = djfi.c;
        }
        dwmx dwmxVar = djfiVar.b;
        dwmxVar = dwmxVar == null ? dwmx.i : dwmxVar;
        this.w = dwmxVar;
        chif chifVar = chigVar.e;
        chifVar = chifVar == null ? chif.d : chifVar;
        dsqp dsqpVar = (dsqp) chifVar.cu(5);
        dsqpVar.bC(chifVar);
        this.k = (chie) dsqpVar;
        dvyw dvywVar = dwmxVar.c;
        dvywVar = dvywVar == null ? dvyw.bv : dvywVar;
        dsqp dsqpVar2 = (dsqp) dvywVar.cu(5);
        dsqpVar2.bC(dvywVar);
        this.m = (dvya) dsqpVar2;
        this.t = new chkk(this);
        this.u = new chki(this);
        this.l = new ArrayList();
    }

    private final void A(cdhl cdhlVar) {
        if (cdhlVar.a().equals(akqi.a)) {
            Toast.makeText(this.d, this.h.getString(R.string.UGC_PLACE_PICKER_SELECT_POI), 1).show();
            return;
        }
        String c2 = cdhlVar.c();
        dvya dvyaVar = this.m;
        if (dvyaVar.c) {
            dvyaVar.bF();
            dvyaVar.c = false;
        }
        dvyw dvywVar = (dvyw) dvyaVar.b;
        dvyw dvywVar2 = dvyw.bv;
        c2.getClass();
        dvywVar.a |= 16;
        dvywVar.i = c2;
        dvya dvyaVar2 = this.m;
        String o = cdhlVar.a().o();
        if (dvyaVar2.c) {
            dvyaVar2.bF();
            dvyaVar2.c = false;
        }
        dvyw dvywVar3 = (dvyw) dvyaVar2.b;
        o.getClass();
        dvywVar3.a |= 4;
        dvywVar3.g = o;
        dvya dvyaVar3 = this.m;
        String v = cdhlVar.a.v();
        if (dvyaVar3.c) {
            dvyaVar3.bF();
            dvyaVar3.c = false;
        }
        dvyw dvywVar4 = (dvyw) dvyaVar3.b;
        v.getClass();
        dvywVar4.b |= 536870912;
        dvywVar4.am = v;
        akqq b = cdhlVar.b();
        if (b != null) {
            dvya dvyaVar4 = this.m;
            dhjz i = b.i();
            if (dvyaVar4.c) {
                dvyaVar4.bF();
                dvyaVar4.c = false;
            }
            dvyw dvywVar5 = (dvyw) dvyaVar4.b;
            i.getClass();
            dvywVar5.e = i;
            dvywVar5.a |= 1;
        } else {
            dvya dvyaVar5 = this.m;
            if (dvyaVar5.c) {
                dvyaVar5.bF();
                dvyaVar5.c = false;
            }
            dvyw dvywVar6 = (dvyw) dvyaVar5.b;
            dvywVar6.e = null;
            dvywVar6.a &= -2;
        }
        for (chkf chkfVar : this.l) {
            chkfVar.b(c2);
        }
        cqkx.p(this);
    }

    @Override // defpackage.chmv
    public void RH(cqiv cqivVar) {
        if (!((chif) this.k.b).c || this.n != null) {
            cqivVar.a(new chev(), this);
        }
    }

    @Override // defpackage.chke
    public void b(int i) {
        if (v().booleanValue()) {
            return;
        }
        DisplayMetrics displayMetrics = this.h.getDisplayMetrics();
        int max = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
        HashSet hashSet = new HashSet();
        dccx dccxVar = new dccx();
        for (chkf chkfVar : this.l) {
            dwfl dwflVar = chkfVar.a().b;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            if (chkfVar.f().booleanValue()) {
                hashSet.add(dwflVar.d);
            }
            int a = dwfk.a(dwflVar.i);
            if (a == 0 || a != 2) {
                dccxVar.g(dwflVar);
            } else {
                dsqp dsqpVar = (dsqp) dwflVar.cu(5);
                dsqpVar.bC(dwflVar);
                dwfi dwfiVar = (dwfi) dsqpVar;
                String a2 = ckqc.FIFE.a(dwflVar.h, max, max, null);
                if (dwfiVar.c) {
                    dwfiVar.bF();
                    dwfiVar.c = false;
                }
                dwfl dwflVar2 = (dwfl) dwfiVar.b;
                a2.getClass();
                dwflVar2.a |= 128;
                dwflVar2.h = a2;
                dccxVar.g(dwfiVar.bK());
            }
        }
        bbut bbutVar = this.s;
        ckni ckniVar = new ckni(dccxVar.f(), null, null, hashSet);
        bbtv v = bbty.v();
        v.c(dbsg.i(bbtw.DONT_SEND_YET));
        v.d(false);
        v.e(false);
        v.m(true);
        bbutVar.o(ckniVar, i, v.a(), this.b.e());
    }

    @Override // defpackage.chke
    public void c() {
        cqkx.p(this.t);
    }

    @Override // defpackage.chjd, defpackage.chjf, defpackage.chmv
    public chik e() {
        chig chigVar;
        djfi djfiVar;
        chik e = super.e();
        dsqp dsqpVar = (dsqp) e.cu(5);
        dsqpVar.bC(e);
        chij chijVar = (chij) dsqpVar;
        chik chikVar = (chik) chijVar.b;
        if (chikVar.a == 2) {
            chigVar = (chig) chikVar.b;
        } else {
            chigVar = chig.f;
        }
        dsqp dsqpVar2 = (dsqp) chigVar.cu(5);
        dsqpVar2.bC(chigVar);
        chhz chhzVar = (chhz) dsqpVar2;
        djfl djflVar = ((chig) chhzVar.b).b;
        if (djflVar == null) {
            djflVar = djfl.e;
        }
        dsqp dsqpVar3 = (dsqp) djflVar.cu(5);
        dsqpVar3.bC(djflVar);
        djfa djfaVar = (djfa) dsqpVar3;
        djfl djflVar2 = (djfl) djfaVar.b;
        if (djflVar2.b == 3) {
            djfiVar = (djfi) djflVar2.c;
        } else {
            djfiVar = djfi.c;
        }
        dsqp dsqpVar4 = (dsqp) djfiVar.cu(5);
        dsqpVar4.bC(djfiVar);
        djfh djfhVar = (djfh) dsqpVar4;
        dwmx dwmxVar = ((djfi) djfhVar.b).b;
        if (dwmxVar == null) {
            dwmxVar = dwmx.i;
        }
        dsqp dsqpVar5 = (dsqp) dwmxVar.cu(5);
        dsqpVar5.bC(dwmxVar);
        dwmu dwmuVar = (dwmu) dsqpVar5;
        dvya dvyaVar = this.m;
        if (dwmuVar.c) {
            dwmuVar.bF();
            dwmuVar.c = false;
        }
        dwmx dwmxVar2 = (dwmx) dwmuVar.b;
        dvyw bK = dvyaVar.bK();
        bK.getClass();
        dwmxVar2.c = bK;
        dwmxVar2.a |= 2;
        if (dwmuVar.c) {
            dwmuVar.bF();
            dwmuVar.c = false;
        }
        ((dwmx) dwmuVar.b).g = dwmx.ck();
        for (chkf chkfVar : this.l) {
            dwmz a = chkfVar.a();
            if (dwmuVar.c) {
                dwmuVar.bF();
                dwmuVar.c = false;
            }
            dwmx dwmxVar3 = (dwmx) dwmuVar.b;
            a.getClass();
            dsrj<dwmz> dsrjVar = dwmxVar3.g;
            if (!dsrjVar.a()) {
                dwmxVar3.g = dsqw.cl(dsrjVar);
            }
            dwmxVar3.g.add(a);
        }
        chie chieVar = this.k;
        if (chhzVar.c) {
            chhzVar.bF();
            chhzVar.c = false;
        }
        chig chigVar2 = (chig) chhzVar.b;
        chif bK2 = chieVar.bK();
        bK2.getClass();
        chigVar2.e = bK2;
        chigVar2.a |= 8;
        if (djfhVar.c) {
            djfhVar.bF();
            djfhVar.c = false;
        }
        djfi djfiVar2 = (djfi) djfhVar.b;
        dwmx bK3 = dwmuVar.bK();
        bK3.getClass();
        djfiVar2.b = bK3;
        djfiVar2.a |= 1;
        if (djfaVar.c) {
            djfaVar.bF();
            djfaVar.c = false;
        }
        djfl djflVar3 = (djfl) djfaVar.b;
        djfi bK4 = djfhVar.bK();
        bK4.getClass();
        djflVar3.c = bK4;
        djflVar3.b = 3;
        if (chhzVar.c) {
            chhzVar.bF();
            chhzVar.c = false;
        }
        chig chigVar3 = (chig) chhzVar.b;
        djfl bK5 = djfaVar.bK();
        bK5.getClass();
        chigVar3.b = bK5;
        chigVar3.a |= 1;
        if (chijVar.c) {
            chijVar.bF();
            chijVar.c = false;
        }
        chik chikVar2 = (chik) chijVar.b;
        chig bK6 = chhzVar.bK();
        bK6.getClass();
        chikVar2.b = bK6;
        chikVar2.a = 2;
        return chijVar.bK();
    }

    @Override // defpackage.chjf
    public void f() {
        for (dwmz dwmzVar : this.w.g) {
            int size = this.l.size();
            List<chkf> list = this.l;
            chkg chkgVar = this.v;
            dvyw dvywVar = this.w.c;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            String str = dvywVar.i;
            String d = this.b.d();
            chkg.a(chkgVar.a.a(), 1);
            Resources a = chkgVar.b.a();
            chkg.a(a, 2);
            chkg.a(str, 3);
            chkg.a(dwmzVar, 5);
            chkg.a(this, 7);
            list.add(new chkf(a, str, size, dwmzVar, d, this));
            if (size >= 6 && dwmzVar.c) {
                chie chieVar = this.k;
                if (chieVar.c) {
                    chieVar.bF();
                    chieVar.c = false;
                }
                chif.b((chif) chieVar.b);
            }
        }
    }

    @Override // defpackage.chmp
    public cqkl h() {
        this.o.a("maps_android_add_photos_contribute");
        return cqkl.a;
    }

    @Override // defpackage.chmp
    public cjtd i() {
        cjta b = cjtd.b();
        b.g(this.b.d());
        b.d = dtyc.x;
        return b.a();
    }

    @Override // defpackage.chmp
    public jic j() {
        return new jic(((dvyw) this.m.b).am.isEmpty() ? "https://maps.gstatic.com/mapsactivities/icons/poi_icons/mobile/0/xxhdpi/generic_visited.png" : ((dvyw) this.m.b).am, ckqc.FULLY_QUALIFIED, ibm.l(), 0);
    }

    @Override // defpackage.chmp
    public String k() {
        return ((dvyw) this.m.b).i;
    }

    @Override // defpackage.chmp
    public String l() {
        dwmx dwmxVar = this.w;
        if ((dwmxVar.a & 4) != 0) {
            bmdv bmdvVar = this.p;
            dosf dosfVar = dwmxVar.d;
            if (dosfVar == null) {
                dosfVar = dosf.f;
            }
            return bmdvVar.b(dosfVar, ((dvyw) this.m.b).ad, true);
        }
        return "";
    }

    @Override // defpackage.chmp
    public dcdc<chmm> m() {
        if (t() == null) {
            return dcdc.r(this.l);
        }
        return dcdc.r(this.l).subList(0, 5);
    }

    @Override // defpackage.chmp
    public void n(bbua bbuaVar) {
        for (int i = 0; i < this.l.size(); i++) {
            chkf chkfVar = this.l.get(i);
            dwfl dwflVar = chkfVar.a().b;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            String str = dwflVar.d;
            dbsk.l(str.equals(bbuaVar.a().get(i).d));
            chkfVar.d(bbuaVar.a().get(i));
            Boolean bool = bbuaVar.c().get(str);
            dbsk.s(bool);
            chkfVar.c(bool.booleanValue());
            if (i >= 6 && chkfVar.f().booleanValue()) {
                chie chieVar = this.k;
                if (chieVar.c) {
                    chieVar.bF();
                    chieVar.c = false;
                }
                chif.b((chif) chieVar.b);
            }
        }
        cqkx.p(this);
    }

    @Override // defpackage.chmp
    public cqkl o() {
        if (v().booleanValue()) {
            return cqkl.a;
        }
        if (this.q.a("android.permission.ACCESS_FINE_LOCATION")) {
            q();
        } else {
            this.r.b("android.permission.ACCESS_FINE_LOCATION", new axrw(this) { // from class: chkh
                private final chkn a;

                {
                    this.a = this;
                }

                @Override // defpackage.axrw
                public final void a(int i) {
                    chkn chknVar = this.a;
                    if (i == 0) {
                        chknVar.g.a().m();
                        chknVar.q();
                    }
                }
            });
        }
        return cqkl.a;
    }

    @Override // defpackage.chmp
    public cjtd p() {
        cjta b = cjtd.b();
        b.g(this.b.d());
        b.d = dtyc.z;
        return b.a();
    }

    public final void q() {
        akqq akqqVar;
        dvyw dvywVar = (dvyw) this.m.b;
        if ((dvywVar.a & 1) != 0) {
            dhjz dhjzVar = dvywVar.e;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            akqqVar = akqq.j(dhjzVar);
        } else {
            akqqVar = null;
        }
        this.b.e().aZ(cdhp.g(akqqVar, dbpy.a));
    }

    @Override // defpackage.chmp
    public void r(cdil cdilVar) {
        A(cdilVar.a());
    }

    @Override // defpackage.chmp
    public void s(aeuf aeufVar) {
        A(cdhl.e(aeufVar));
    }

    @Override // defpackage.chmp
    @dzsi
    public chmn t() {
        if (this.l.size() <= 6 || ((chif) this.k.b).b) {
            return null;
        }
        return this.u;
    }

    @Override // defpackage.chmp
    public chmo u() {
        return this.t;
    }

    @Override // defpackage.chmp
    public Boolean v() {
        boolean z = true;
        if (!((chif) this.k.b).c && this.n == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.chmp
    public cjtd w() {
        cjta b = cjtd.b();
        b.g(this.b.d());
        b.d = dtyc.v;
        return b.a();
    }

    @Override // defpackage.caye
    public cayf x() {
        return this.j.f();
    }

    @Override // defpackage.chmp
    public Boolean y() {
        return Boolean.valueOf(this.j.g());
    }

    public final int z() {
        int i = 0;
        for (chkf chkfVar : this.l) {
            if (chkfVar.f().booleanValue()) {
                i++;
            }
        }
        return i;
    }
}
