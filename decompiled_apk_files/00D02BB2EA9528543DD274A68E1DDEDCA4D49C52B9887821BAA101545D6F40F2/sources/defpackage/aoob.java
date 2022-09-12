package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: aoob  reason: default package */
/* loaded from: classes2.dex */
public abstract class aoob implements aony, anha {
    protected final aonn a;
    private final jkf b;
    private final cjtd c;
    private final aoip d;
    private final gfw e;
    private final aome f;

    public aoob(anrr anrrVar, jkf jkfVar, aoiq aoiqVar, gfw gfwVar, gga ggaVar, cqhn cqhnVar) {
        this.a = new aonn(anrrVar);
        this.b = jkfVar;
        dcdc r = dcdc.r(anrrVar.g.i);
        aoiq.a(r, 1);
        bbut a = aoiqVar.a.a();
        aoiq.a(a, 2);
        aoiq.a(aoiqVar.b.a(), 3);
        Application a2 = aoiqVar.c.a();
        aoiq.a(a2, 4);
        this.d = new aoip(r, a, a2);
        cjta b = cjtd.b();
        b.d = dtyi.bL;
        b.b = anrrVar.w();
        if (anrrVar.v().a()) {
            b.g(anrrVar.v().b());
        }
        this.c = b.a();
        this.e = gfwVar;
        this.f = new aooa(cqhnVar, ggaVar);
    }

    public static dbsl<aoob> u(aoha aohaVar) {
        return new aonz(aohaVar);
    }

    @Override // defpackage.anha
    public aogm b() {
        return f().b();
    }

    protected abstract anrr f();

    @Override // defpackage.aony
    public aonm g() {
        return this.a;
    }

    @Override // defpackage.aony
    public Boolean h() {
        return Boolean.valueOf(f().B());
    }

    @Override // defpackage.aony
    public dcdc<bcdf> i() {
        return this.d.a;
    }

    @Override // defpackage.aony
    public cqkl j() {
        this.b.v();
        return cqkl.a;
    }

    @Override // defpackage.aony
    public cjtd k() {
        return this.c;
    }

    @Override // defpackage.aony
    public dcdc<jbf> l() {
        return dcdc.e();
    }

    @Override // defpackage.aony
    public cqkl m() {
        anrr f = f();
        gfw gfwVar = this.e;
        bbut bbutVar = f.f;
        bbtr k = bbts.k();
        k.c();
        bbsj bbsjVar = (bbsj) k;
        bbsjVar.b = true;
        bbsjVar.c = true;
        bbsjVar.d = false;
        bbsjVar.e = false;
        bbsjVar.f = f.S().toString();
        bbsjVar.g = f.l;
        k.b(true);
        bbutVar.s(true, dbsg.i(k.a()), null, gfwVar, dwyd.UNKNOWN_ENTRY_POINT);
        return cqkl.a;
    }

    @Override // defpackage.aony
    public CharSequence n() {
        return f().S();
    }

    @Override // defpackage.aony
    public Boolean o() {
        return false;
    }

    @Override // defpackage.aony
    public boolean p() {
        return f().s();
    }

    @Override // defpackage.aony
    @dzsi
    public aofb q() {
        return f().t();
    }

    @Override // defpackage.aony
    public aome r() {
        return this.f;
    }

    public aoha s() {
        return f().h;
    }

    public void t(dvyw dvywVar) {
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.b("segmentId", f().h);
        return b.toString();
    }

    public dcdc<dvan> v() {
        return f().k;
    }
}
