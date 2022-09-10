package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: yww  reason: default package */
/* loaded from: classes7.dex */
public class yww implements yvt {
    @dzsi
    public cqtd a;
    @dzsi
    private final eaol b;
    @dzsi
    private final eaol c;
    @dzsi
    private final donz d;
    @dzsi
    private final String e;
    @dzsi
    private final CharSequence f;
    @dzsi
    private final String g;
    @dzsi
    private final eapq h;
    @dzsi
    private final drhn i;
    @dzsi
    private final String j;
    @dzsi
    private final dqea k;
    @dzsi
    private final doza l;
    private final akqi m;
    private final dpce n;
    private final akqi o;
    @dzsi
    private final dpce p;
    private final qbt q;
    private final cqat r;
    private final cjtd s;
    private cqtv t = cqrp.d(dcyn.a);
    private final vtk u;

    public yww(Activity activity, qbt qbtVar, cqat cqatVar, cqhn cqhnVar, xaz xazVar, @dzsi eaol eaolVar, @dzsi eaol eaolVar2, @dzsi donz donzVar, @dzsi String str, @dzsi CharSequence charSequence, dpjb dpjbVar, @dzsi String str2, @dzsi eapq eapqVar, @dzsi dqea dqeaVar, @dzsi doza dozaVar, akqi akqiVar, dpce dpceVar, @dzsi dpce dpceVar2, akqi akqiVar2, cjtd cjtdVar) {
        String str3;
        ywv ywvVar = new ywv(this);
        this.u = ywvVar;
        this.q = qbtVar;
        this.r = cqatVar;
        this.b = eaolVar;
        this.c = eaolVar2;
        this.d = donzVar;
        this.e = str;
        this.f = charSequence;
        drhn i = xazVar.i(str2, dpjbVar);
        this.i = i;
        drhh b = xazVar.b(i);
        if (i == null || b == null) {
            str3 = null;
            this.a = null;
        } else {
            this.a = xazVar.c(b, xaz.h(i) && xazVar.f(), false, ywvVar);
            str3 = b.d;
        }
        this.j = str3;
        this.g = str2;
        this.h = eapqVar;
        this.k = dqeaVar;
        this.l = dozaVar;
        this.m = akqiVar;
        this.n = dpceVar;
        this.p = dpceVar2;
        this.o = akqiVar2;
        this.s = cjtdVar;
    }

    @Override // defpackage.xkd
    public Boolean Z(donz donzVar) {
        return Boolean.valueOf(this.d == donzVar);
    }

    @Override // defpackage.yvt
    @dzsi
    public dpyy a() {
        return null;
    }

    @Override // defpackage.xkd
    public Boolean aa() {
        return Boolean.valueOf(this.d != null);
    }

    @Override // defpackage.xka
    @dzsi
    public eapr ab() {
        return this.b;
    }

    @Override // defpackage.xkc
    public Boolean ad() {
        return false;
    }

    @Override // defpackage.xka
    @dzsi
    public eapq af() {
        eaol eaolVar = this.b;
        if (eaolVar != null) {
            return xkb.c(this.r, eaolVar.Ti(), this.b.Ti());
        }
        return null;
    }

    @Override // defpackage.xkc
    public Boolean ag() {
        return Boolean.valueOf(af() != null);
    }

    @Override // defpackage.wpl
    @dzsi
    public String b() {
        throw null;
    }

    @Override // defpackage.wpl
    @dzsi
    public akqi c() {
        throw null;
    }

    @Override // defpackage.wpl
    @dzsi
    public String d() {
        return this.e;
    }

    @Override // defpackage.yvt
    @dzsi
    public drhn e() {
        return this.i;
    }

    @Override // defpackage.yvt
    @dzsi
    public donz f() {
        return this.d;
    }

    @Override // defpackage.yvt
    @dzsi
    public CharSequence g() {
        return this.f;
    }

    @Override // defpackage.yvt
    @dzsi
    public String h() {
        return this.g;
    }

    @Override // defpackage.yvt
    public Boolean i() {
        return Boolean.valueOf(this.h != null);
    }

    @Override // defpackage.yvt
    @dzsi
    public eapq j() {
        return this.h;
    }

    @Override // defpackage.yvt
    @dzsi
    public dqea k() {
        return this.k;
    }

    @Override // defpackage.yvt
    @dzsi
    public doza l() {
        return this.l;
    }

    @Override // defpackage.yvt
    public cqkl m() {
        qbt qbtVar = this.q;
        qdb g = qdc.g();
        g.b(this.m.o());
        qas qasVar = (qas) g;
        qasVar.b = this.o.o();
        qasVar.a = this.n;
        qasVar.e = this.g;
        eaol eaolVar = this.b;
        qasVar.d = eaolVar != null ? eaolVar.Ti() : null;
        qbtVar.r(g.c());
        return cqkl.a;
    }

    @Override // defpackage.wpl, defpackage.zef
    @dzsi
    public cjtd n() {
        return this.s;
    }

    @Override // defpackage.yvt
    @dzsi
    public dpce o() {
        return this.p;
    }

    @Override // defpackage.yvt
    public void p(cqtv cqtvVar) {
        this.t = cqtvVar;
    }

    @Override // defpackage.yvt
    public cqtv q() {
        return this.t;
    }

    @Override // defpackage.wpl
    @dzsi
    public CharSequence r() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.wpl
    public Boolean s() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.wpl
    @dzsi
    public cqtd t() {
        return this.a;
    }

    @Override // defpackage.wpl
    public Boolean u() {
        return Boolean.valueOf(this.a != null);
    }

    @Override // defpackage.wpl
    public cjtd v() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.wpl
    @dzsi
    public String w() {
        return this.j;
    }

    @Override // defpackage.wpl
    @dzsi
    public String x() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.wpl
    @dzsi
    public eapr y() {
        return this.c;
    }

    @Override // defpackage.wpl
    public Boolean z() {
        eaol eaolVar = new eaol(this.r.b());
        eaol eaolVar2 = this.b;
        boolean z = true;
        if (eaolVar2 == null || !eaolVar.w(eaolVar2.l(1))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
