package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: chja  reason: default package */
/* loaded from: classes4.dex */
public class chja implements chmz {
    private final chla a;
    private final cchz b;
    private final akfa c;
    private final djgl d;
    private final ddho e;
    private final ddho f;
    private final chlr g;
    @dzsi
    private final ilo h;
    private final djex i;

    public chja(chla chlaVar, akfa akfaVar, cchz cchzVar, djgl djglVar, ddho ddhoVar, ddho ddhoVar2, chlr chlrVar, @dzsi ilo iloVar) {
        djex djexVar;
        this.a = chlaVar;
        this.b = cchzVar;
        this.c = akfaVar;
        this.d = djglVar;
        this.e = ddhoVar;
        this.f = ddhoVar2;
        this.g = chlrVar;
        this.h = iloVar;
        djez djezVar = djglVar.d;
        djezVar = djezVar == null ? djez.c : djezVar;
        if (djezVar.a == 1) {
            djexVar = (djex) djezVar.b;
        } else {
            djexVar = djex.d;
        }
        this.i = djexVar;
    }

    @Override // defpackage.chmz
    public Boolean A() {
        return false;
    }

    @Override // defpackage.chmz
    @dzsi
    public String B() {
        return null;
    }

    @Override // defpackage.chmz
    @dzsi
    public String C() {
        return null;
    }

    @Override // defpackage.chmz
    @dzsi
    public jic D() {
        return null;
    }

    @Override // defpackage.chmz
    @dzsi
    public cjtd E() {
        return null;
    }

    @Override // defpackage.chmz
    @dzsi
    public String F() {
        return null;
    }

    @Override // defpackage.chmz
    public Boolean G() {
        return false;
    }

    @Override // defpackage.chmz
    public cqkl H() {
        return cqkl.a;
    }

    @Override // defpackage.chmz
    @dzsi
    public String I() {
        return null;
    }

    @Override // defpackage.chmz
    @dzsi
    public String J() {
        return null;
    }

    @Override // defpackage.chmz
    public cqkl K() {
        return cqkl.a;
    }

    @Override // defpackage.chmz
    public Boolean L() {
        return false;
    }

    @Override // defpackage.chmz
    public Boolean M() {
        return false;
    }

    @Override // defpackage.chmz
    public cqkl N() {
        return cqkl.a;
    }

    @Override // defpackage.chmz
    @dzsi
    public cjtd O() {
        return null;
    }

    @Override // defpackage.chmz
    public cqkl a() {
        this.g.q(true);
        return cqkl.a;
    }

    @Override // defpackage.chmz
    public cjtd b() {
        cjta b = cjtd.b();
        b.g(this.d.e);
        b.b = this.d.f;
        b.d = this.e;
        return b.a();
    }

    @Override // defpackage.chmz
    public cjtd c() {
        return cjtd.a(dtyc.g);
    }

    @Override // defpackage.chmz
    public List<chmx> d() {
        dccx F = dcdc.F();
        F.g(new chlb(this.i.b, djvc.MINOR_TYPE, djvc.UNKNOWN_TYPE));
        dkgh dkghVar = this.i.a;
        if (dkghVar == null) {
            dkghVar = dkgh.d;
        }
        dkgn dkgnVar = dkghVar.c;
        if (dkgnVar == null) {
            dkgnVar = dkgn.h;
        }
        F.g(new chlb(dkgnVar.b, djvc.MAJOR_TYPE, djvc.MINOR_TYPE));
        return F.f();
    }

    @Override // defpackage.chmz
    public jic e() {
        dkgh dkghVar = this.i.a;
        if (dkghVar == null) {
            dkghVar = dkgh.d;
        }
        dkgn dkgnVar = dkghVar.c;
        if (dkgnVar == null) {
            dkgnVar = dkgn.h;
        }
        return new jic(dkgnVar.d, ckqc.FIFE_MERGE, (cqtd) null, 250);
    }

    @Override // defpackage.chmz
    @dzsi
    public jic f() {
        if (this.c.j() == null) {
            return null;
        }
        cchz cchzVar = this.b;
        btlu j = this.c.j();
        dbsk.s(j);
        return new jic(cchzVar.c(j), ckqc.FIFE_MERGE, (cqtd) null, 250);
    }

    @Override // defpackage.chmz
    public List<chmw> g() {
        djex djexVar;
        dccx F = dcdc.F();
        djez djezVar = this.d.d;
        if (djezVar == null) {
            djezVar = djez.c;
        }
        if (djezVar.a == 1) {
            djexVar = (djex) djezVar.b;
        } else {
            djexVar = djex.d;
        }
        for (djev djevVar : djexVar.c) {
            F.g(this.a.a(this.g, djevVar, this.e, this.f, this.d.f, this.h));
        }
        return F.f();
    }

    @Override // defpackage.chmz
    @dzsi
    public chmw h() {
        return null;
    }

    @Override // defpackage.chmz
    public Boolean i() {
        return false;
    }

    @Override // defpackage.chmz
    public List<chml> j() {
        return dcdc.e();
    }

    @Override // defpackage.chmz
    public CharSequence k() {
        return "";
    }

    @Override // defpackage.chmz
    public String l() {
        return "";
    }

    @Override // defpackage.chmz
    public Boolean m() {
        return false;
    }

    @Override // defpackage.chmz
    public Boolean n() {
        return false;
    }

    @Override // defpackage.chmz
    public String o() {
        return "";
    }

    @Override // defpackage.chmz
    public Boolean p() {
        return true;
    }

    @Override // defpackage.chmz
    public chmz q() {
        return this;
    }

    @Override // defpackage.chmz
    @dzsi
    public jbc r() {
        return null;
    }

    @Override // defpackage.chmz
    public Integer s() {
        return 0;
    }

    @Override // defpackage.chmz
    public cqkl t() {
        return cqkl.a;
    }

    @Override // defpackage.chmz
    public String u() {
        return "";
    }

    @Override // defpackage.chmz
    public List<chmt> v() {
        return dcdc.e();
    }

    @Override // defpackage.chmz
    public Integer w() {
        return 0;
    }

    @Override // defpackage.chmz
    @dzsi
    public cqqw x() {
        return null;
    }

    @Override // defpackage.chmz
    @dzsi
    public cqfc y() {
        return null;
    }

    @Override // defpackage.chmz
    public List<chmx> z() {
        return dcdc.e();
    }
}
