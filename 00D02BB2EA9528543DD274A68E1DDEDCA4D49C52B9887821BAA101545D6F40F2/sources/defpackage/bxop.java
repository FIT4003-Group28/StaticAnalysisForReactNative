package defpackage;
/* compiled from: PG */
/* renamed from: bxop  reason: default package */
/* loaded from: classes4.dex */
public class bxop implements bxoi {
    private final dcdc<String> a;
    @dzsi
    private final akqi b;
    private final String c;
    @dzsi
    private final cqtd d;
    @dzsi
    private final cqss e;
    private final dzsj<begg> f;
    private final dzsj<brba> g;
    private final cklq h;

    public bxop(broc brocVar, dzsj<begg> dzsjVar, dzsj<brba> dzsjVar2, cklq cklqVar) {
        this.a = brocVar.c;
        akqi akqiVar = brocVar.b;
        this.b = akqiVar;
        this.c = brocVar.a;
        int i = akqiVar != null ? 13 : 3;
        owz a = oxa.a(i - 1);
        this.d = a == null ? null : cqrt.i(a.a(), bxnv.i(i));
        this.e = bxnv.h(i);
        this.f = dzsjVar;
        this.g = dzsjVar2;
        this.h = cklqVar;
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

    @Override // defpackage.bxoi
    public Boolean a() {
        return true;
    }

    @Override // defpackage.bxoi
    public Boolean b() {
        return false;
    }

    @Override // defpackage.bxoi
    public Boolean c() {
        return false;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return this.d;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (this.b != null) {
            ily ilyVar = new ily();
            ilyVar.F(this.c);
            ilyVar.j(this.b);
            ilyVar.f = false;
            ilyVar.D();
            ilo d = ilyVar.d();
            begj begjVar = new begj();
            begjVar.b(d);
            begjVar.d = d.cc(cjqm.a);
            begjVar.k = this.c;
            this.h.a(ckls.TYPED_SUGGESTION_CLICKED);
            this.f.a().o(begjVar, true, null);
        } else {
            this.g.a().j(this.c, cjsb.b(dtyi.cY));
        }
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        return cjtd.a(dtyi.cY);
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
    public CharSequence l() {
        return this.a.size() > 1 ? this.a.get(1) : "";
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return !this.a.isEmpty() ? this.a.get(0) : this.c;
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
        return this.e;
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
