package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bfhe  reason: default package */
/* loaded from: classes3.dex */
public class bfhe implements bfgr, bega {
    @dzsi
    public bwrs<ilo> a;
    @dzsi
    public bruz b;
    private final bwqv d;
    private final bfgv e;
    private final iqs f;
    private final bfha g;
    private final bmef h;
    private final bego i;
    private final btvo j;
    private final bfgq k;
    @dzsi
    private bnhz l;
    @dzsi
    private final View.OnClickListener m;
    @dzsi
    private String p;
    private dbsg<bfgz> n = dbpy.a;
    private jjn o = jjn.COLLAPSED;
    final bwrr<ilo> c = new bfhd(this);

    public bfhe(boolean z, @dzsi View.OnClickListener onClickListener, cqhn cqhnVar, cqhu cqhuVar, iqs iqsVar, bwqv bwqvVar, bfhx bfhxVar, bfha bfhaVar, bmef bmefVar, bego begoVar, btvo btvoVar, bfgq bfgqVar) {
        this.d = bwqvVar;
        this.f = iqsVar;
        this.e = bfhxVar;
        this.m = onClickListener;
        this.g = bfhaVar;
        this.h = bmefVar;
        this.i = begoVar;
        this.j = btvoVar;
        this.k = bfgqVar;
    }

    @Override // defpackage.bfgr
    @dzsi
    public CharSequence a() {
        ilo iloVar = (ilo) bwrs.b(this.a);
        if (iloVar != null) {
            return this.g.d(iloVar);
        }
        return null;
    }

    @Override // defpackage.bfgr
    public Boolean b() {
        ilo iloVar = (ilo) bwrs.b(this.a);
        boolean z = false;
        if (iloVar != null && iloVar.o()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgr
    @dzsi
    public CharSequence c() {
        return this.p;
    }

    @Override // defpackage.bfgr
    @dzsi
    public cqtd d() {
        return bfha.c(this.l, this.j);
    }

    @Override // defpackage.bfgr
    @dzsi
    public String e() {
        return bfha.b(this.l, this.j);
    }

    @Override // defpackage.bfgr
    public Boolean f() {
        return bfha.e(this.o);
    }

    @Override // defpackage.bfgr
    public Boolean g() {
        ilo iloVar = (ilo) bwrs.b(this.a);
        boolean z = false;
        if (iloVar != null && iloVar.m) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgr
    @dzsi
    public cjtd h() {
        return (cjtd) this.n.h(bfhc.a).f();
    }

    @Override // defpackage.bfgr
    public void i(View view) {
        this.k.a(view);
    }

    @Override // defpackage.bfgr
    public cjtd j() {
        return this.k.d;
    }

    @Override // defpackage.bfgr
    @dzsi
    public View.OnClickListener k() {
        return this.k.e(this.m);
    }

    @Override // defpackage.bfgr
    public Boolean l() {
        ilo iloVar = (ilo) bwrs.b(this.a);
        boolean z = false;
        if (iloVar != null && iloVar.f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgr
    @dzsi
    public bruv m() {
        bruz bruzVar;
        if (this.j.getEnableFeatureParameters().bu || (bruzVar = this.b) == null) {
            return null;
        }
        return bruzVar.a();
    }

    @Override // defpackage.bfgr
    public Boolean n() {
        return Boolean.valueOf(this.i.a((ilo) bwrs.b(this.a)));
    }

    public void o(bnhz bnhzVar) {
        this.l = bnhzVar;
    }

    public Boolean p() {
        return Boolean.valueOf(this.o.b());
    }

    public void q(final jjn jjnVar) {
        this.o = jjnVar;
        bvor.a(this.n, new mw(jjnVar) { // from class: bfhb
            private final jjn a;

            {
                this.a = jjnVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj) {
                ((bfgz) obj).b(this.a);
            }
        });
        if (jjnVar != jjn.HIDDEN) {
            this.k.d();
        }
    }

    public void r() {
        bwrs<ilo> bwrsVar = this.a;
        if (bwrsVar != null) {
            this.d.g(bwrsVar, this.c);
        }
    }

    public void s() {
        bwrs<ilo> bwrsVar = this.a;
        if (bwrsVar != null) {
            bwqv.t(bwrsVar, this.c);
        }
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.a = bwrsVar;
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        dbsk.s(iloVar);
        this.n = dbsg.i(bfha.f(iloVar));
        this.p = this.h.a(iloVar, new begh()).a("\n");
        this.e.c(iloVar);
        this.f.e(bwrsVar);
        this.k.b(iloVar);
    }

    @Override // defpackage.bega
    public void u() {
        this.k.c();
        this.n = dbpy.a;
    }

    public void v(Boolean bool) {
    }

    @Override // defpackage.bega
    public Boolean w() {
        return true;
    }

    public void x(@dzsi bruz bruzVar) {
        this.b = bruzVar;
    }
}
