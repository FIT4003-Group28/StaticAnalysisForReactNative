package defpackage;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqz  reason: default package */
/* loaded from: classes5.dex */
public class cqz implements ctj, axvp, axwu {
    private final bosr A;
    @dzsi
    private final bopo B;
    private bond C;
    @dzsi
    private CharSequence D;
    @dzsi
    private String E;
    @dzsi
    private String F;
    private final bomp G;
    final cqy a;
    @dzsi
    ProgressDialog b;
    public final cqf c;
    public final Activity d;
    public final cqt e;
    public final bope f;
    public final bvrb g;
    public final dzsj<axwy> h;
    public final crl i;
    public final bonh j;
    public final bont<cqt> k;
    public bonr l;
    public final bnyc m;
    private final dkyr r;
    private final akpm s;
    private final dzsj<bbul> t;
    private final dzsj<boxa> u;
    private final dxio<akfa> v;
    private final bbtk w;
    private final dzsj<begg> x;
    private final bopt y;
    private final bopt z;

    public cqz(cqf cqfVar, cqt cqtVar, bomt bomtVar, jmx jmxVar, gga ggaVar, btvo btvoVar, cqkj cqkjVar, bvrb bvrbVar, akpm akpmVar, dxio<akfa> dxioVar, ahjq ahjqVar, bnxt bnxtVar, bnxx bnxxVar, bbtk bbtkVar, cjqy cjqyVar, bwqv bwqvVar, dzsj<boxa> dzsjVar, dzsj<bbut> dzsjVar2, dzsj<bbul> dzsjVar3, dzsj<begg> dzsjVar4, dzsj<axwy> dzsjVar5, bnyd bnydVar, boss bossVar, bopp boppVar) {
        bond bondVar;
        akqq g;
        bomp bompVar = new bomp(new cqu(this));
        this.G = bompVar;
        this.c = cqfVar;
        this.e = cqtVar;
        this.d = ggaVar;
        this.w = bbtkVar;
        this.g = bvrbVar;
        this.s = akpmVar;
        this.t = dzsjVar3;
        this.u = dzsjVar;
        this.v = dxioVar;
        this.x = dzsjVar4;
        this.h = dzsjVar5;
        gn gnVar = cqtVar.A;
        dbsk.s(gnVar);
        this.m = bnydVar.a(gnVar, dtxj.n, dtxj.M);
        dkyr ugcParameters = btvoVar.getUgcParameters();
        this.r = ugcParameters;
        this.a = new cqy(this);
        crl crlVar = new crl(cqtVar, cjqyVar, dzsjVar4, ggaVar, cqfVar.a, ggaVar.getString(R.string.AAP_NAME), ggaVar.getString(R.string.AAP_NAME_HINT), ggaVar.getString(R.string.AAP_NAME_HINT), 532480, 2131231754, dtxj.w, true, false, true, bomtVar, ctj.n, false, true, 1);
        this.i = crlVar;
        cqkx.j(crlVar, bompVar);
        this.y = new bopt(ggaVar, cqfVar.f, ggaVar.getString(R.string.PLACE_PHONE), ggaVar.getString(R.string.AAP_PHONE_HINT), ggaVar.getString(R.string.AAP_PHONE_HINT), ggaVar.getString(R.string.PLACE_PHONE), 3, 2131231713, dtxj.A, null, true, false, true, bomtVar, ctj.p, true, null, true, 1);
        this.z = new bopt(ggaVar, cqfVar.g, ggaVar.getString(R.string.PLACE_WEBSITE), ggaVar.getString(R.string.AAP_WEBSITE_HINT), ggaVar.getString(R.string.AAP_WEBSITE_HINT), ggaVar.getString(R.string.PLACE_WEBSITE), 17, 2131231775, dtxj.C, null, true, false, true, bomtVar, ctj.o, true, null, true, 1);
        this.k = new bont<>(cqtVar, cqfVar.d, dtxj.t, true, ggaVar.getString(R.string.AAP_CATEGORY), true, bwqvVar);
        this.l = new bonr(ggaVar, cqtVar, cqkjVar, btvoVar, cqfVar.e, false);
        boolean al = ugcParameters.al();
        dbsk.s(ugcParameters);
        if (ugcParameters.s()) {
            bondVar = new bond(ggaVar, cqfVar.m.d(), dwyd.REPORT_A_PROBLEM, "", dzsjVar2.a(), cqtVar, true != al ? "business_hours_photo" : "business_hours_photo_gallery_default", al, dtya.ah, dtya.ab, dtya.j);
        } else {
            bondVar = null;
        }
        this.A = bossVar.a(cqtVar, cqfVar.m, this.l, bondVar);
        bope bopeVar = new bope(cqfVar.c, cqtVar, R.string.AAP_MAP_OVERLAY, dtxj.u, false, false, true, dosc.TYPE_RAP_ADD_A_PLACE);
        this.f = bopeVar;
        cqv cqvVar = new cqv(this, cqfVar);
        cqw cqwVar = new cqw(this, cqtVar);
        String Rp = cqtVar.Rp(R.string.AAP_ADDRESS);
        bnyg bnygVar = cqtVar.az;
        dbsk.s(bnygVar);
        bonh bonhVar = new bonh(cqtVar, Rp, bnygVar, cqfVar.b, ahjqVar, bnxtVar.a(bopeVar.p(akpmVar), alao.a(akpmVar)), bnxxVar.a(cqfVar.b), cqwVar, cqvVar, null, true, false, jmxVar);
        this.j = bonhVar;
        boki bokiVar = cqfVar.o;
        bopj a = boppVar.a.a();
        bopp.a(a, 1);
        cqhn a2 = boppVar.b.a();
        bopp.a(a2, 2);
        bopp.a(bokiVar, 3);
        bopp.a(ggaVar, 4);
        bopp.a(cqkjVar, 5);
        bopp.a(jmxVar, 6);
        bopp.a(bomtVar, 7);
        this.B = new bopo(a, a2, bokiVar, ggaVar, cqkjVar, jmxVar, bomtVar);
        this.C = new bond(ggaVar, cqfVar.h, dwyd.ADD_A_PLACE, ggaVar.getString(R.string.AAP_ADD_PHOTOS_HELP_TEXT), dzsjVar2.a(), cqtVar, "", true, dtxj.B, dtxj.v, dtxj.r);
        if (bopeVar.g() == null || bonhVar.l().booleanValue() || (g = bopeVar.g()) == null) {
            return;
        }
        dhjy bZ = dhjz.e.bZ();
        double d = g.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ.b;
        int i = 2 | dhjzVar.a;
        dhjzVar.a = i;
        dhjzVar.c = d;
        double d2 = g.b;
        dhjzVar.a = i | 1;
        dhjzVar.b = d2;
        bonhVar.y(bZ.bK(), true);
    }

    private static boolean M(boqs boqsVar) {
        return boqsVar.n().booleanValue() && boqsVar.w().booleanValue();
    }

    public final boolean A() {
        if (!M(this.i)) {
            if (this.j.n().booleanValue() && this.j.l().booleanValue()) {
                return true;
            }
            return (this.k.n().booleanValue() && this.k.l().booleanValue()) || this.f.h().booleanValue() || this.l.f().booleanValue() || this.l.d().booleanValue() || this.C.n().booleanValue() || M(this.y) || M(this.z);
        }
        return true;
    }

    @Override // defpackage.ctj
    public boqn B() {
        return this.f;
    }

    public void C(akqq akqqVar) {
        this.f.f(akqqVar, true, dory.USER_PROVIDED);
        this.j.I(this.f.p(this.s), alao.a(this.s));
    }

    public void D() {
        cqf cqfVar = this.c;
        cqfVar.k = !cqfVar.k;
        cqkx.p(this);
        this.a.e(this.d.getString(c()));
        this.a.g(cjtd.a(y().booleanValue() ? dtxj.a : dtxj.N));
    }

    @Override // defpackage.axwu
    public void F(boolean z) {
        ProgressDialog progressDialog = this.b;
        if (progressDialog != null) {
            if (z) {
                progressDialog.show();
            } else {
                progressDialog.hide();
            }
        }
    }

    @Override // defpackage.axwu
    public boolean G() {
        return this.e.aD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ilo H() {
        String c = this.c.b.c();
        bokg bokgVar = this.c.b;
        String str = bokgVar.m;
        dory doryVar = bokgVar.k;
        dory doryVar2 = dory.USER_PROVIDED;
        dvya bZ = dvyw.bv.bZ();
        if (c != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyw dvywVar = (dvyw) bZ.b;
            c.getClass();
            int i = dvywVar.a | 1024;
            dvywVar.a = i;
            dvywVar.p = c;
            c.getClass();
            dvywVar.a = i | 4096;
            dvywVar.r = c;
            bZ.a(c);
        }
        if (str != null && doryVar != doryVar2) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyw dvywVar2 = (dvyw) bZ.b;
            str.getClass();
            dvywVar2.a |= 4;
            dvywVar2.g = str;
        }
        ily ilyVar = new ily();
        ilyVar.E(bZ.bK());
        ilyVar.u = doryVar == doryVar2 ? null : this.c.b.l;
        akqq akqqVar = this.c.c.b;
        if (akqqVar != null) {
            ilyVar.q(akqqVar);
        }
        String c2 = this.c.a.c();
        if (c2 != null) {
            ilyVar.F(c2);
        }
        return ilyVar.d();
    }

    @Override // defpackage.ctj
    public Boolean I() {
        return Boolean.valueOf(this.c.l);
    }

    @Override // defpackage.ctj
    public cqkl J() {
        this.c.l = true;
        cqkx.p(this);
        return cqkl.a;
    }

    public boolean a() {
        return this.m.a(A());
    }

    public void b() {
        this.G.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return y().booleanValue() ? R.string.ADD_A_NAMED_PLACE : this.r.j() ? R.string.ADD_A_PLACE_OR_BUSINESS : R.string.AAP_TITLE;
    }

    public String d() {
        cqt cqtVar = this.e;
        gga ggaVar = cqtVar.aE;
        return (!cqtVar.aD || ggaVar == null) ? "" : ggaVar.getString(c());
    }

    @Override // defpackage.ctj
    public ctm e() {
        return this.i;
    }

    @Override // defpackage.ctj
    public bopw f() {
        return this.j;
    }

    @dzsi
    public bnxs g() {
        return this.j.K();
    }

    @Override // defpackage.ctj
    public boqc h() {
        return this.k;
    }

    @Override // defpackage.ctj
    public boqs i() {
        return this.y;
    }

    @Override // defpackage.ctj
    public boqs j() {
        return this.z;
    }

    @Override // defpackage.ctj
    public CharSequence k() {
        return this.e.Rp(R.string.AAP_INDICATES_REQUIRED_FIELD);
    }

    @Override // defpackage.ctj
    @dzsi
    public CharSequence l() {
        if (this.D == null && this.e.aD) {
            this.D = this.u.a().P();
        }
        return this.D;
    }

    public void m() {
        akpm akpmVar;
        if (!this.e.aD) {
            return;
        }
        String i = this.i.i();
        this.F = i;
        if (i == null || i.equals(this.E) || this.F.length() <= 3 || (akpmVar = this.s) == null) {
            return;
        }
        dhjx p = this.f.p(akpmVar);
        akqs a = alao.a(this.s);
        if (a == null) {
            return;
        }
        cql cqlVar = this.e.ay;
        dbsk.s(cqlVar);
        String str = this.F;
        dbsk.s(str);
        bxkx bxkxVar = new bxkx();
        bxkz d = bxkz.d(str, str.codePointCount(0, str.length()), cqlVar.b.e());
        bxkxVar.a(d);
        cqlVar.f = str;
        cqlVar.d.e(bxla.ADD_A_PLACE_SUGGESTION, d, p, a, null, false, false, bxkxVar, dwjm.DEFAULT_SEARCH, false, false, false);
    }

    public void n(CharSequence charSequence, String str, String str2, boolean z, dory doryVar) {
        String charSequence2 = charSequence.toString();
        dory B = this.j.B();
        if (z || (!this.j.t() && B != dory.PRE_FILLED)) {
            this.j.u(charSequence2, doryVar, str, str2, z);
            if (!z || this.f.j().booleanValue() || B == dory.PRE_FILLED) {
                return;
            }
            cql cqlVar = this.e.ay;
            dbsk.s(cqlVar);
            cqlVar.a(charSequence2);
        }
    }

    public void p(List<bbtm> list) {
        this.C.q(list);
    }

    public void q(List<bbtm> list) {
        this.A.g(list);
    }

    public void r() {
        this.l.p();
    }

    public void t(@dzsi dvyw dvywVar, boolean z) {
        if (this.e.aD && this.j.d().booleanValue()) {
            this.j.e(false);
            if (dvywVar != null) {
                if (z) {
                    this.j.w(dvywVar.r);
                }
                this.j.u(dvywVar.r, dory.REVERSE_GEOCODED, dvywVar.g, dvywVar.r, false);
                if (!this.j.z()) {
                    return;
                }
                this.f.f(akqq.j(this.j.x()), false, dory.USER_PROVIDED);
                this.j.A(false);
                return;
            }
            Toast.makeText(this.e.J(), (int) R.string.LOCATION_DATA_ERROR, 0).show();
        }
    }

    public void u(List<bxmh> list) {
        this.E = this.F;
        this.F = null;
        this.i.a(list);
    }

    @Override // defpackage.ctj
    /* renamed from: v */
    public bosr L() {
        return this.A;
    }

    @Override // defpackage.ctj
    @dzsi
    /* renamed from: w */
    public bopo K() {
        return this.B;
    }

    @Override // defpackage.ctj
    public bopv x() {
        return this.C;
    }

    @Override // defpackage.ctj
    public Boolean y() {
        return Boolean.valueOf(this.c.k);
    }

    @Override // defpackage.ctj
    public jbh z() {
        return this.a;
    }

    @Override // defpackage.axvp
    public void E(boolean z, @dzsi azvc azvcVar, Context context) {
        if (!z) {
            jmw.g(context, R.string.AAP_TITLE, R.string.ADD_A_NAMED_PLACE_ERROR);
            return;
        }
        begj begjVar = new begj();
        begjVar.b(H());
        begjVar.c = jjn.EXPANDED;
        this.x.a().o(begjVar, true, null);
    }

    public void o(@dzsi dwby dwbyVar) {
        if (dwbyVar == null || (dwbyVar.a & 2) == 0) {
            this.f.f(null, false, dory.UNSPECIFIED);
            return;
        }
        dpum dpumVar = dwbyVar.b;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        this.f.f(akqq.f(dpumVar), false, dory.GEOCODED);
    }

    public void s(@dzsi dwhd dwhdVar) {
        int a;
        gga ggaVar;
        int a2;
        btlu j;
        if (dwhdVar != null && (a2 = dwhc.a(dwhdVar.b)) != 0 && a2 == 2 && ((this.C.n().booleanValue() || !this.c.m.d().b().isEmpty()) && (j = this.v.a().j()) != null)) {
            String str = j.s().name;
            String str2 = dwhdVar.e;
            ily ilyVar = new ily();
            ilyVar.k(str2);
            akqq g = this.f.g();
            dbsk.s(g);
            ilyVar.q(g);
            ilo d = ilyVar.d();
            ArrayList arrayList = new ArrayList();
            ArrayList<bbtm> b = this.c.h.b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(this.w.b(b.get(i)));
            }
            ArrayList<bbtm> b2 = this.c.m.d().b();
            int size2 = b2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bbtj b3 = this.w.b(b2.get(i2));
                b3.f("business_hours_photo");
                if ((dwhdVar.a & 4) != 0) {
                    b3.h(dwhdVar.d);
                }
                arrayList.add(b3);
            }
            this.t.a().h(str, dwyd.ADD_A_PLACE, bbvh.e(d).f(dgpu.LOCAL), arrayList, cjqm.a);
        }
        ProgressDialog progressDialog = this.b;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.b = null;
        }
        if (dwhdVar == null || (a = dwhc.a(dwhdVar.b)) == 0 || a != 4) {
            return;
        }
        dnof dnofVar = dwhdVar.c;
        if (dnofVar == null) {
            dnofVar = dnof.b;
        }
        for (dneq dneqVar : dnofVar.a) {
            dqgh b4 = dqgh.b(dneqVar.a);
            int a3 = dneo.a(dneqVar.b);
            if (a3 != 0 && a3 == 2 && (ggaVar = this.e.aE) != null) {
                int ordinal = b4.ordinal();
                if (ordinal == 1) {
                    this.i.x(true);
                    this.i.y(ggaVar.getString(R.string.RAP_INVALID_NAME));
                    cqkx.p(this.i);
                } else if (ordinal == 4) {
                    this.j.r(true);
                    this.j.s(ggaVar.getString(R.string.RAP_INVALID_ADDRESS));
                    cqkx.p(this.j);
                } else if (ordinal == 6) {
                    this.z.x(true);
                    this.z.y(ggaVar.getString(R.string.RAP_INVALID_WEBSITE));
                    cqkx.p(this.z);
                } else if (ordinal == 18) {
                    this.y.x(true);
                    this.y.y(ggaVar.getString(R.string.RAP_INVALID_PHONE));
                    cqkx.p(this.y);
                }
            }
        }
    }
}
