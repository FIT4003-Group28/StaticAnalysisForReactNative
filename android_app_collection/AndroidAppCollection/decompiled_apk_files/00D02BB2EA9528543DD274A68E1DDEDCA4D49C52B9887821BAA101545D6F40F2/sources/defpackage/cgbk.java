package defpackage;
/* compiled from: PG */
/* renamed from: cgbk  reason: default package */
/* loaded from: classes4.dex */
public class cgbk implements cgbf {
    private final cchz b;
    private final akfa c;
    private final axjh d;
    private final ceet e;
    private final acyp f;
    private final axhq i;
    private dqwa g = dqwa.g;
    private dqam h = dqam.g;
    public boolean a = false;

    public cgbk(cchz cchzVar, cqhn cqhnVar, akfa akfaVar, axjh axjhVar, ceet ceetVar, acyp acypVar, axhq axhqVar, m mVar) {
        this.b = cchzVar;
        this.c = akfaVar;
        this.d = axjhVar;
        this.e = ceetVar;
        this.f = acypVar;
        this.i = axhqVar;
        axhqVar.a(axhp.a).b(mVar, new aa(this) { // from class: cgbg
            private final cgbk a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                cgbk cgbkVar = this.a;
                cgbkVar.a = ((Boolean) obj).booleanValue();
                cqkx.p(cgbkVar);
            }
        });
    }

    private final dbsg<dqkn> q() {
        return dbsg.j(this.c.j()).h(cgbj.a);
    }

    @Override // defpackage.cgbf
    public String a() {
        return (String) dbsg.j(this.c.j()).h(cgbh.a).c("");
    }

    @Override // defpackage.cgbf
    public String b() {
        dbsg j = dbsg.j(this.c.j());
        final cchz cchzVar = this.b;
        cchzVar.getClass();
        return (String) j.h(new dbrn(cchzVar) { // from class: cgbi
            private final cchz a;

            {
                this.a = cchzVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return this.a.c((btlu) obj);
            }
        }).f();
    }

    @Override // defpackage.cgbf
    public Boolean c() {
        dqvy dqvyVar = this.g.c;
        if (dqvyVar == null) {
            dqvyVar = dqvy.h;
        }
        int a = dqvx.a(dqvyVar.g);
        return Boolean.valueOf(a != 0 && a == 2);
    }

    @Override // defpackage.cgbf
    public Integer d() {
        int i = 0;
        for (dqvu dqvuVar : this.g.b) {
            i += dqvuVar.f;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.cgbf
    public Integer e() {
        dqvy dqvyVar = this.g.c;
        if (dqvyVar == null) {
            dqvyVar = dqvy.h;
        }
        return Integer.valueOf(dqvyVar.d);
    }

    @Override // defpackage.cgbf
    public Boolean f() {
        boolean z = false;
        if (this.d.e()) {
            dqah dqahVar = this.h.d;
            if (dqahVar == null) {
                dqahVar = dqah.e;
            }
            if ((dqahVar.a & 2) != 0) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgbf
    public Integer g() {
        dqah dqahVar = this.h.d;
        if (dqahVar == null) {
            dqahVar = dqah.e;
        }
        return Integer.valueOf(dqahVar.c);
    }

    @Override // defpackage.cgbf
    public Boolean h() {
        dqal dqalVar;
        boolean z;
        if (this.i.d()) {
            z = this.a;
        } else {
            dqam dqamVar = this.h;
            if (dqamVar.b == 1) {
                dqalVar = (dqal) dqamVar.c;
            } else {
                dqalVar = dqal.e;
            }
            z = dqalVar.b;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgbf
    public cqkl i() {
        this.e.i(null);
        return cqkl.a;
    }

    @Override // defpackage.cgbf
    public cqkl j() {
        dbsg<dqkn> q = q();
        if (q.a()) {
            this.d.l(q.b(), axok.FOLLOWERS, this.h);
        }
        return cqkl.a;
    }

    @Override // defpackage.cgbf
    public cjtd k() {
        return cjtd.a(h().booleanValue() ? dtxl.ef : dtxl.eg);
    }

    @Override // defpackage.cgbf
    public Boolean l() {
        return Boolean.valueOf(this.f.f());
    }

    @Override // defpackage.cgbf
    public String m() {
        dqwe dqweVar = this.g.d;
        if (dqweVar == null) {
            dqweVar = dqwe.f;
        }
        if ((dqweVar.a & 16) != 0) {
            dqwe dqweVar2 = this.g.d;
            if (dqweVar2 == null) {
                dqweVar2 = dqwe.f;
            }
            return dqweVar2.e;
        }
        return null;
    }

    public void n(dqam dqamVar) {
        this.h = dqamVar;
        cqkx.p(this);
        dbsg<dqkn> q = q();
        if (q.a()) {
            this.d.F(q.b().d, dqamVar);
        }
    }

    public void o(dqwa dqwaVar) {
        this.g = (dqwa) dbsg.j(dqwaVar).c(dqwa.g);
        cqkx.p(this);
    }

    public void p(cgci cgciVar) {
        dqam dqamVar = cgciVar.c;
        if (dqamVar == null) {
            dqamVar = dqam.g;
        }
        this.h = dqamVar;
        dqwa dqwaVar = cgciVar.b;
        if (dqwaVar == null) {
            dqwaVar = dqwa.g;
        }
        this.g = dqwaVar;
        cqkx.p(this);
        dbsg<dqkn> q = q();
        if (q.a()) {
            this.d.F(q.b().d, this.h);
        }
    }
}
