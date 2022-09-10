package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import java.util.List;
/* compiled from: PG */
/* renamed from: oyj  reason: default package */
/* loaded from: classes7.dex */
public class oyj implements oxi {
    private final cjzt a;
    private final dtkf b;
    private final CharSequence c;
    @dzsi
    private final CharSequence d;
    @dzsi
    private final CharSequence e;
    @dzsi
    private final CharSequence f;
    @dzsi
    private final CharSequence g;
    @dzsi
    private final jic h;
    @dzsi
    private final cqtd i;
    @dzsi
    private final cqss j;
    @dzsi
    private final jic k;
    private final List<oxh> l;
    @dzsi
    private final String m;
    @dzsi
    private final cqss n;
    @dzsi
    private final cqss o;
    private final Boolean p;
    private final Boolean q;
    @dzsi
    private final jic r;
    private final List<oxh> s;
    @dzsi
    private final cqss t;
    private final boolean u;
    private final boolean v;
    private final cjtd w;

    public oyj(Context context, cjzt cjztVar, dtkf dtkfVar, dtlb dtlbVar) {
        dtkq dtkqVar;
        cqtd cqtdVar;
        cqss cqssVar;
        cqss cqssVar2;
        cqss cqssVar3;
        this.a = cjztVar;
        this.b = dtkfVar;
        String str = dtkfVar.b.size() > 0 ? dtkfVar.b.get(0) : "";
        String str2 = null;
        String str3 = dtkfVar.c.size() > 0 ? dtkfVar.c.get(0) : null;
        String str4 = dtkfVar.d.size() > 0 ? dtkfVar.d.get(0) : null;
        if (dtlbVar != null) {
            Resources resources = context.getResources();
            dtqa dtqaVar = dtlbVar.e;
            this.c = owy.a(str, dtqaVar == null ? dtqa.b : dtqaVar, resources);
            if (str3 != null) {
                dtqa dtqaVar2 = dtlbVar.f;
                CharSequence a = owy.a(str3, dtqaVar2 == null ? dtqa.b : dtqaVar2, resources);
                this.d = a;
                this.e = str4;
                this.g = a;
            } else {
                this.d = null;
                dtqa dtqaVar3 = dtlbVar.f;
                CharSequence a2 = owy.a(str4, dtqaVar3 == null ? dtqa.b : dtqaVar3, resources);
                this.e = a2;
                this.g = a2;
            }
            if ((dtlbVar.a & 1) != 0) {
                dtjf dtjfVar = dtlbVar.b;
                cqssVar = oyf.c(dtjfVar == null ? dtjf.d : dtjfVar, resources);
            } else {
                cqssVar = null;
            }
            this.n = cqssVar;
            if ((dtlbVar.a & 2) != 0) {
                dtjf dtjfVar2 = dtlbVar.c;
                cqssVar2 = oyf.c(dtjfVar2 == null ? dtjf.d : dtjfVar2, resources);
            } else {
                cqssVar2 = null;
            }
            this.o = cqssVar2;
            if ((dtlbVar.a & 4) != 0) {
                dtjf dtjfVar3 = dtlbVar.d;
                cqssVar3 = oyf.c(dtjfVar3 == null ? dtjf.d : dtjfVar3, resources);
            } else {
                cqssVar3 = null;
            }
            this.t = cqssVar3;
            int a3 = dtla.a(dtlbVar.g);
            this.p = Boolean.valueOf(L(a3 == 0 ? 1 : a3));
            int a4 = dtla.a(dtlbVar.h);
            this.q = Boolean.valueOf(L(a4 == 0 ? 1 : a4));
        } else {
            this.c = str;
            this.d = str3;
            this.e = str4;
            this.g = str3 == null ? str4 : str3;
            this.n = null;
            this.o = null;
            this.t = null;
            this.p = false;
            this.q = false;
        }
        if ((dtkfVar.a & 1) != 0) {
            dtkqVar = dtkfVar.f;
            if (dtkqVar == null) {
                dtkqVar = dtkq.f;
            }
        } else {
            dtkqVar = null;
        }
        dtkq dtkqVar2 = dtkfVar.g.size() > 0 ? dtkfVar.g.get(0) : null;
        this.u = K(dtkqVar);
        this.v = K(dtkqVar2);
        this.h = dtkqVar != null ? oyf.a(dtkqVar) : null;
        if (dtkqVar != null) {
            owz a5 = oxa.a(dtkqVar.b);
            cqtdVar = cqrt.i(a5 != null ? a5.b() : null, bxnv.i(dtkn.a(dtkqVar.b)));
        } else {
            cqtdVar = null;
        }
        this.i = cqtdVar;
        this.j = dtkqVar != null ? bxnv.h(dtkn.a(dtkqVar.b)) : null;
        dccx F = dcdc.F();
        for (dtkq dtkqVar3 : dtkfVar.g) {
            F.g(new oyi(oyf.a(dtkqVar3)));
        }
        dcdc f = F.f();
        this.l = f;
        this.k = f.isEmpty() ? null : ((oxh) f.get(0)).a();
        this.m = (dtkfVar.g.size() == 0 || (dtkfVar.g.get(0).a & 256) == 0) ? null : dtkfVar.g.get(0).e;
        dccx F2 = dcdc.F();
        for (dtkq dtkqVar4 : dtkfVar.e) {
            F2.g(new oyi(oyf.a(dtkqVar4)));
        }
        dcdc f2 = F2.f();
        this.s = f2;
        this.r = f2.isEmpty() ? null : ((oxh) f2.get(0)).a();
        this.w = oyf.b(cjztVar.b, dtkfVar.k, dtxl.b, cjztVar.e, (dtkfVar.a & 128) != 0 ? decs.a(dtkfVar.m) : null);
        this.f = dtkfVar.d.size() > 1 ? dtkfVar.d.get(1) : str2;
    }

    private final nxc J(cjqm cjqmVar) {
        cjzt cjztVar = this.a;
        return nxc.a(cjztVar.a, cjztVar.b, cjqmVar);
    }

    private static boolean K(dtkq dtkqVar) {
        return dtkqVar == null || dtkqVar.b == 1;
    }

    private static boolean L(int i) {
        return i == 2;
    }

    @Override // defpackage.oxi
    public Boolean A() {
        return Boolean.valueOf(this.r != null);
    }

    @Override // defpackage.oxi
    public jic B() {
        return this.r;
    }

    @Override // defpackage.oxi
    public List<oxh> C() {
        return this.s;
    }

    @Override // defpackage.oxi
    public cqss D() {
        cqss cqssVar = this.t;
        return cqssVar == null ? ibm.b() : cqssVar;
    }

    @Override // defpackage.oxi
    public Boolean E() {
        return Boolean.valueOf((this.b.a & 2) != 0);
    }

    @Override // defpackage.oxi
    public cqkl F(cjqm cjqmVar) {
        if (E().booleanValue()) {
            cjyi cjyiVar = this.a.c;
            dthb dthbVar = this.b.h;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjyiVar.j(dthbVar, J(cjqmVar));
        }
        return cqkl.a;
    }

    @Override // defpackage.oxi
    public Boolean G() {
        return Boolean.valueOf((this.b.a & 4) != 0);
    }

    @Override // defpackage.oxi
    public cqkl H(cjqm cjqmVar) {
        if (G().booleanValue()) {
            cjyi cjyiVar = this.a.c;
            dthb dthbVar = this.b.i;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjyiVar.j(dthbVar, J(cjqmVar));
        }
        return cqkl.a;
    }

    @Override // defpackage.oxi
    public Boolean I() {
        cjzt cjztVar = this.a;
        return Boolean.valueOf(cjztVar.d == cjztVar.a.b.size() + (-1));
    }

    @Override // defpackage.oxe
    public cjtd a() {
        return this.w;
    }

    @Override // defpackage.oxi
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.oxi
    public CharSequence c() {
        int size = this.b.b.size();
        if (size <= 1) {
            return this.c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        for (int i = 1; i < size; i++) {
            spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) this.b.b.get(i));
        }
        return spannableStringBuilder;
    }

    @Override // defpackage.oxi
    public Boolean d() {
        return this.p;
    }

    @Override // defpackage.oxi
    public Boolean e() {
        return Boolean.valueOf(this.d != null);
    }

    @Override // defpackage.oxi
    public CharSequence f() {
        return this.d;
    }

    @Override // defpackage.oxi
    public Boolean g() {
        return this.q;
    }

    @Override // defpackage.oxi
    public cqtd h() {
        jic jicVar = this.h;
        if (jicVar != null) {
            return jicVar.c;
        }
        return null;
    }

    @Override // defpackage.oxi
    public Boolean i() {
        return Boolean.valueOf(this.e != null);
    }

    @Override // defpackage.oxi
    public CharSequence j() {
        return this.e;
    }

    @Override // defpackage.oxi
    public Boolean k() {
        return Boolean.valueOf(this.f != null);
    }

    @Override // defpackage.oxi
    public CharSequence l() {
        return this.f;
    }

    @Override // defpackage.oxi
    public CharSequence m() {
        return this.g;
    }

    @Override // defpackage.oxi
    public Boolean n() {
        return Boolean.valueOf(this.h != null);
    }

    @Override // defpackage.oxi
    public Boolean o() {
        return Boolean.valueOf(this.u);
    }

    @Override // defpackage.oxi
    public Boolean p() {
        jic jicVar = this.h;
        boolean z = false;
        if (jicVar != null && jicVar.a != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oxi
    public jic q() {
        return this.h;
    }

    @Override // defpackage.oxi
    public cqtd r() {
        return this.i;
    }

    @Override // defpackage.oxi
    public cqss s() {
        return this.j;
    }

    @Override // defpackage.oxi
    public Boolean t() {
        return Boolean.valueOf(this.k != null);
    }

    @Override // defpackage.oxi
    public Boolean u() {
        return Boolean.valueOf(this.v);
    }

    @Override // defpackage.oxi
    public jic v() {
        return this.k;
    }

    @Override // defpackage.oxi
    public List<oxh> w() {
        return this.l;
    }

    @Override // defpackage.oxi
    @dzsi
    public String x() {
        return this.m;
    }

    @Override // defpackage.oxi
    public cqss y() {
        return this.n;
    }

    @Override // defpackage.oxi
    public cqss z() {
        return this.o;
    }
}
