package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cext  reason: default package */
/* loaded from: classes4.dex */
public class cext implements ceta, bwrr {
    public final axwy a;
    public final bwrs<ilo> b;
    private final Activity c;
    private final bwqv d;
    private final ahjq e;
    private final akfa f;
    private final akfc g;
    private final bvsl h;
    private final begg i;
    private final axyp j;
    private ilo k;
    private cdjd l;
    @dzsi
    private final jay m;
    private final boolean n;
    private int o = -1;
    private axyo p;

    public cext(Activity activity, cqhn cqhnVar, bwqv bwqvVar, ahjq ahjqVar, akfa akfaVar, akfc akfcVar, bvsl bvslVar, begg beggVar, axwy axwyVar, axyp axypVar, bwrs<ilo> bwrsVar, bwrs<cdjd> bwrsVar2, @dzsi jay jayVar, boolean z) {
        this.c = activity;
        this.d = bwqvVar;
        this.e = ahjqVar;
        this.f = akfaVar;
        this.g = akfcVar;
        this.h = bvslVar;
        this.i = beggVar;
        this.a = axwyVar;
        this.j = axypVar;
        this.b = bwrsVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.k = c;
        cdjd c2 = bwrsVar2.c();
        dbsk.s(c2);
        this.l = c2;
        this.m = jayVar;
        this.n = z;
        this.p = axypVar.a(this.k);
    }

    @Override // defpackage.ceta
    public String a() {
        return this.k.n();
    }

    @Override // defpackage.ceta
    public String b() {
        StringBuilder sb = new StringBuilder(this.k.ar());
        if (!this.k.Y().isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(this.k.Y());
        }
        return sb.toString();
    }

    @Override // defpackage.ceta
    public String c() {
        StringBuilder sb = new StringBuilder();
        if (!this.k.av().isEmpty()) {
            sb.append(this.k.av());
        }
        String e = dbsj.e(isl.a(this.e.a(), this.k.aj(), this.h));
        if (e.length() > 0) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(e);
        }
        return sb.toString();
    }

    @Override // defpackage.ceta
    public cjtd d() {
        return cjtd.a(dtxl.fA);
    }

    @Override // defpackage.ceta
    public cqkl e() {
        begg beggVar = this.i;
        begj begjVar = new begj();
        ily g = this.k.g();
        g.c = false;
        begjVar.b(g.d());
        begjVar.c = jjn.EXPANDED;
        begjVar.n = true;
        beggVar.o(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.ceta
    public Boolean f() {
        return true;
    }

    @Override // defpackage.ceta
    public cqtd g() {
        return this.p.d();
    }

    @Override // defpackage.ceta
    public cqsn h() {
        return this.p.f();
    }

    @Override // defpackage.ceta
    public cjtd i() {
        return cjtd.a(dtxl.fB);
    }

    @Override // defpackage.ceta
    public cjtd j() {
        if (this.n) {
            return cjtd.a(dtxl.fr);
        }
        return cjtd.b;
    }

    @Override // defpackage.ceta
    public cqkl k() {
        if (this.f.j() == null) {
            this.g.k(new cexs(this), "");
        } else {
            this.a.j(this.b);
        }
        return cqkl.a;
    }

    @Override // defpackage.ceta
    @dzsi
    public jht m() {
        jht b;
        jay jayVar = this.m;
        if (jayVar == null || (b = jayVar.b()) == null || b.b().isEmpty()) {
            return null;
        }
        return b;
    }

    @Override // defpackage.ceta
    @dzsi
    public String n() {
        int i = this.o;
        if (i > 0) {
            return this.c.getString(R.string.ACCESSIBILITY_PLACE_REVIEW_ORDINAL_WITH_DETAILS, new Object[]{Integer.valueOf(i), a(), b(), c()});
        }
        return null;
    }

    public void o() {
        this.d.g(this.b, this);
    }

    public void p() {
        bwqv.t(this.b, this);
    }

    @Override // defpackage.bwrr
    /* renamed from: q */
    public void PV(@dzsi ilo iloVar) {
        s();
    }

    public void r(int i) {
        this.o = i;
    }

    public void s() {
        this.p = this.j.a(this.k);
        cqkx.p(this);
    }

    public void t(bkpe bkpeVar) {
        this.l = bkpeVar.c(this.l, this.b);
        ilo c = this.b.c();
        dbsk.s(c);
        this.k = c;
    }
}
