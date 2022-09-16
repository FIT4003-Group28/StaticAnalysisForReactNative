package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cibc  reason: default package */
/* loaded from: classes4.dex */
public class cibc extends ciae implements cibb, chyv {
    private final cilu c;
    private final axru d;
    private final boolean e;
    private final ahjq f;
    private final String g;

    public cibc(bmdv bmdvVar, axru axruVar, btvo btvoVar, ahjq ahjqVar, chrx chrxVar, chxl chxlVar, cilu ciluVar) {
        super(chrxVar, chxlVar, bmdvVar);
        chwb chwbVar;
        dhpt dhptVar = btvoVar.getContributionsPageParameters().h;
        this.e = (dhptVar == null ? dhpt.w : dhptVar).b;
        this.d = axruVar;
        this.f = ahjqVar;
        this.c = ciluVar;
        chxk chxkVar = chxlVar.u.get(0);
        if (chxkVar.b == 3) {
            chwbVar = (chwb) chxkVar.c;
        } else {
            chwbVar = chwb.c;
        }
        dqbz dqbzVar = chwbVar.b;
        this.g = (dqbzVar == null ? dqbz.b : dqbzVar).a;
    }

    @Override // defpackage.chyv
    public chyu a() {
        return chys.a(this);
    }

    @Override // defpackage.chyv
    public boolean b() {
        return chys.b(this);
    }

    @Override // defpackage.chyv
    public chyw c() {
        return chyw.UNKNOWN;
    }

    @Override // defpackage.chyv
    public List<? extends chyv> d() {
        return dcdc.f(this.c);
    }

    @Override // defpackage.ciae, defpackage.cicy
    public /* bridge */ /* synthetic */ String e() {
        return super.e();
    }

    @Override // defpackage.ciae
    public boolean equals(@dzsi Object obj) {
        return (obj instanceof cibc) && super.equals(obj) && this.c.equals(((cibc) obj).c);
    }

    @Override // defpackage.ciae, defpackage.cicy
    public /* bridge */ /* synthetic */ String f() {
        return super.f();
    }

    @Override // defpackage.ciae, defpackage.cicy
    public /* bridge */ /* synthetic */ Boolean g() {
        throw null;
    }

    @Override // defpackage.ciae, defpackage.cicy
    public /* bridge */ /* synthetic */ Integer h() {
        return super.h();
    }

    @Override // defpackage.ciae
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // defpackage.ciae, defpackage.cicy
    public /* bridge */ /* synthetic */ String i() {
        return super.i();
    }

    @Override // defpackage.ciae, defpackage.cicy
    public /* bridge */ /* synthetic */ cqkl j() {
        return super.j();
    }

    @Override // defpackage.ciae, defpackage.cicy
    public /* bridge */ /* synthetic */ cqkl k() {
        throw null;
    }

    @Override // defpackage.ciae, defpackage.cicy
    public /* bridge */ /* synthetic */ cqkl l() {
        return super.l();
    }

    @Override // defpackage.cibb
    public cill n() {
        return this.c;
    }

    @Override // defpackage.cibb
    public Boolean o() {
        boolean z = false;
        if (this.d.a("android.permission.ACCESS_COARSE_LOCATION") && this.f.d()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cibb
    public Boolean p() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.cibb
    public Boolean q() {
        return Boolean.valueOf(!this.g.isEmpty());
    }

    @Override // defpackage.cibb
    public String r() {
        return this.g;
    }
}
