package defpackage;
/* compiled from: PG */
/* renamed from: oze  reason: default package */
/* loaded from: classes7.dex */
public class oze implements oxs {
    public final bwrs<ilo> a;
    public boolean b;
    private final btrm c;
    private final dxio<axwy> d;
    private final jba e;
    private final dtof f;
    private final cjzt g;

    public oze(btrm btrmVar, dxio<axwy> dxioVar, jba jbaVar, dtof dtofVar, cjzt cjztVar) {
        this.c = btrmVar;
        this.d = dxioVar;
        this.e = jbaVar;
        this.f = dtofVar;
        this.g = cjztVar;
        this.a = bwrs.a(owy.c(dtofVar));
    }

    @Override // defpackage.oxe
    @dzsi
    public cjtd a() {
        return this.e.b();
    }

    @Override // defpackage.oxs
    public String b() {
        return this.e.g();
    }

    @Override // defpackage.oxs
    public Boolean c() {
        return this.e.Y();
    }

    @Override // defpackage.oxs
    public String d() {
        return dbsj.e(this.e.k());
    }

    @Override // defpackage.oxs
    public Float e() {
        Float j = this.e.j();
        return Float.valueOf(j != null ? j.floatValue() : 0.0f);
    }

    @Override // defpackage.oxs
    public Boolean f() {
        return this.e.P();
    }

    @Override // defpackage.oxs
    public String g() {
        return this.e.m();
    }

    @Override // defpackage.oxs
    public Boolean h() {
        return this.e.Z();
    }

    @Override // defpackage.oxs
    public String i() {
        return this.e.p();
    }

    @Override // defpackage.oxs
    public String j() {
        return this.e.s();
    }

    @Override // defpackage.oxs
    public cqkl k() {
        cjyi cjyiVar = this.g.c;
        dtof dtofVar = this.f;
        nup nupVar = (nup) cjyiVar;
        if (nupVar.i) {
            qcw x = qcx.x();
            x.u(owy.c(dtofVar).d());
            nupVar.c.a().m(x.a());
        }
        return cqkl.a;
    }

    @Override // defpackage.oxs
    public String l() {
        return this.e.t();
    }

    @Override // defpackage.oxs
    public cqkl m() {
        if (!this.b) {
            this.b = true;
            cqkx.p(this);
            btrm btrmVar = this.c;
            ozd ozdVar = new ozd(btrmVar, this);
            dceq a = dcet.a();
            a.b(azrd.class, new ozf(azrd.class, ozdVar, bvrj.UI_THREAD));
            btrmVar.g(ozdVar, a.a());
            this.d.a().f(this.a);
        }
        return cqkl.a;
    }

    @Override // defpackage.oxs
    public Boolean n() {
        ilo c = this.a.c();
        boolean z = false;
        if (c != null && c.bN()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oxs
    public Boolean o() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.oxs
    public cqkl p(cjqm cjqmVar) {
        if (q().booleanValue()) {
            cjyi cjyiVar = this.g.c;
            dthb dthbVar = this.f.d;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjzt cjztVar = this.g;
            cjyiVar.j(dthbVar, nxc.b(cjztVar.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }

    @Override // defpackage.oxs
    public Boolean q() {
        return Boolean.valueOf((this.f.a & 4) != 0);
    }
}
