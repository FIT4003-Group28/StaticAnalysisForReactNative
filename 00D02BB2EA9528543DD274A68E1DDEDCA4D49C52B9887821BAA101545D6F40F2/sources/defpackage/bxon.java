package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxon  reason: default package */
/* loaded from: classes4.dex */
public class bxon implements bxnw {
    private static final bxov a = bxom.a;
    private final gga b;
    private final String c;
    private final String d;
    private final String e;
    @dzsi
    private String f;
    @dzsi
    private String g;
    private final ges h;
    @dzsi
    private final String i;
    @dzsi
    private final akqq j;
    private final ddho k;
    private final ddho l;
    private final ddho m;
    @dzsi
    private final cjtd n;
    private final akpm o;
    private final dxio<araj> p;
    private final bxov q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private boolean v = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public bxon(String str, String str2, String str3, boolean z, ges gesVar, @dzsi String str4, @dzsi akqq akqqVar, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, @dzsi ddho ddhoVar3, @dzsi cjtd cjtdVar, boolean z2, boolean z3, @dzsi bxov bxovVar, gga ggaVar, akpm akpmVar, dxio<araj> dxioVar, btvo btvoVar) {
        this.f = null;
        this.g = null;
        this.h = gesVar;
        this.b = ggaVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.i = str4;
        this.j = akqqVar;
        this.k = (ddho) dbsc.a(ddhoVar, dtxy.a);
        this.l = (ddho) dbsc.a(ddhoVar2, dtxy.a);
        this.m = (ddho) dbsc.a(ddhoVar3, dtxy.a);
        this.n = cjtdVar;
        this.r = z2;
        this.o = akpmVar;
        this.p = dxioVar;
        this.s = z3;
        this.u = z;
        this.f = null;
        this.g = null;
        this.q = bxovVar == null ? a : bxovVar;
        this.t = btvoVar.getEnableFeatureParameters().ah;
    }

    @Override // defpackage.bxoi
    public cyg A() {
        return null;
    }

    @Override // defpackage.bxoi
    public Boolean B() {
        return bxoh.a();
    }

    @Override // defpackage.bxoi
    public jic C() {
        return null;
    }

    @Override // defpackage.bxoi
    public Boolean D() {
        return bxoh.b();
    }

    @Override // defpackage.bxoi
    public CharSequence E() {
        return "";
    }

    @Override // defpackage.bxnw
    public void F(boolean z) {
        this.v = z;
    }

    @Override // defpackage.bxnw
    public Boolean G() {
        boolean z = true;
        if (!this.s && this.v) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxnw
    public void H(String str) {
        this.f = str;
    }

    @Override // defpackage.bxnw
    public void I(String str) {
        this.g = str;
    }

    @Override // defpackage.bxoi
    public Boolean a() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean b() {
        return true;
    }

    @Override // defpackage.bxoi
    public Boolean c() {
        return false;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return iup.c(R.raw.ic_mod_map, ibm.p());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        gfv a2;
        ges gesVar = this.h;
        if (!gesVar.aD) {
            return cqkl.a;
        }
        bxlx a3 = bxlz.a(gesVar);
        if (a3 != null) {
            akqq akqqVar = this.j;
            if (akqqVar != null) {
                a3.a(akqqVar);
            }
            a3.c(2);
            return cqkl.a;
        }
        if (this.r) {
            akra akraVar = new akra();
            if (this.p.a().m().f().f(akraVar)) {
                akpm akpmVar = this.o;
                alaa a4 = alad.a();
                a4.c(akraVar.S());
                a4.c = 14.0f;
                alao.d(akpmVar, a4.a());
            }
        }
        if (this.t) {
            a2 = andm.g(anee.A(this.b.getString(R.string.CHOOSE_ON_MAP_TITLE), this.b.getString(R.string.CHOOSE_A_PLACE_SUBTITLE), this.i, this.j, this.k, this.l, this.m));
        } else {
            aneb z = anee.z();
            z.r(this.d);
            z.q(this.e);
            andx andxVar = (andx) z;
            andxVar.b = this.i;
            andxVar.c = this.j;
            z.g(this.k);
            z.c(this.l);
            z.e(this.m);
            z.p(this.u);
            if (this.f != null) {
                z.o(true);
                andxVar.d = this.f;
            }
            if (this.g != null) {
                z.f(true);
                andxVar.e = this.g;
            }
            a2 = this.q.a(z);
        }
        this.h.aZ(a2);
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return this.n;
    }

    @Override // defpackage.bxoi
    public Boolean i() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean j() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean k() {
        return false;
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        return this.c;
    }

    @Override // defpackage.bxoi
    @dzsi
    public CharSequence n() {
        return null;
    }

    @Override // defpackage.bxoi
    public Boolean o() {
        return false;
    }

    @Override // defpackage.bxoi
    public cqkl p() {
        return cqkl.a;
    }

    @Override // defpackage.bxoi
    @dzsi
    public cjtd q() {
        return null;
    }

    @Override // defpackage.bxoi
    @dzsi
    public cqss r() {
        return null;
    }

    @Override // defpackage.bxoi
    public cqkl s() {
        return cqkl.a;
    }

    @Override // defpackage.bxoi
    @dzsi
    public cjtd t() {
        return null;
    }

    @Override // defpackage.bxoi
    @dzsi
    public CharSequence u() {
        return null;
    }

    @Override // defpackage.bxoi
    public bxok v() {
        return null;
    }

    @Override // defpackage.bxoi
    public bxok w() {
        return null;
    }

    @Override // defpackage.bxoi
    public String x() {
        return " ";
    }

    @Override // defpackage.bxoi
    public bxoj y() {
        return null;
    }

    @Override // defpackage.bxoi
    public acmv z() {
        return null;
    }
}
