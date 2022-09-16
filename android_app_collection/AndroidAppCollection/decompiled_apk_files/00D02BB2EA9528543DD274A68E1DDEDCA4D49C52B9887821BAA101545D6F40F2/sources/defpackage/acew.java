package defpackage;

import android.app.Application;
import android.content.Context;
/* compiled from: PG */
/* renamed from: acew  reason: default package */
/* loaded from: classes2.dex */
public class acew implements jkh, aceq, abwp {
    private static final abxz a = abxz.f(72);
    private static final abxz b = abxz.f(52);
    private static final abxz c = abxz.f(22);
    @dzsi
    private final abkm d;
    private final acbv e;
    private final jkf f;
    private final Context g;
    private abxz h;
    private boolean i;

    public acew(jkf jkfVar, abwo abwoVar, abwq abwqVar, acbw acbwVar, Application application, abtz abtzVar) {
        this.f = jkfVar;
        this.g = application;
        acbw.a(abwoVar, 1);
        acbw.a(abwqVar, 2);
        Application a2 = acbwVar.a.a();
        acbw.a(a2, 3);
        acbi a3 = acbwVar.b.a();
        acbw.a(a3, 4);
        accn a4 = acbwVar.c.a();
        acbw.a(a4, 5);
        cqhn a5 = acbwVar.d.a();
        acbw.a(a5, 6);
        acbg a6 = acbwVar.e.a();
        acbw.a(a6, 7);
        acek a7 = acbwVar.f.a();
        acbw.a(a7, 8);
        acbw.a(acbwVar.g.a(), 9);
        bckz a8 = acbwVar.h.a();
        acbw.a(a8, 10);
        acbv acbvVar = new acbv(abwoVar, abwqVar, a2, a3, a4, a5, a6, a7, a8);
        this.e = acbvVar;
        abwqVar.a(acbvVar);
        jkj l = jkfVar.l();
        this.h = l.L() == jjn.FULLY_EXPANDED ? a : b;
        this.i = l.M() == l.U();
        this.d = abtzVar.a(true, dtye.o, null, absg.UNKNOWN_EXPLORE_SURFACE);
    }

    @Override // defpackage.jkh
    public void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
    }

    @Override // defpackage.jkh
    public void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public void O() {
    }

    @Override // defpackage.jkh
    public void P(jkj jkjVar, jjn jjnVar, float f) {
        boolean z;
        int C = jkjVar.C(this.f.l().E(jjn.FULLY_EXPANDED));
        int C2 = jkjVar.C(jjn.FULLY_EXPANDED) - C;
        int U = jkjVar.U() - C;
        boolean z2 = false;
        int max = Math.max(0, U);
        float f2 = 1.0f;
        if (C2 > 0) {
            f2 = Math.min(1.0f, max / C2);
        }
        abxz abxzVar = a;
        abxz abxzVar2 = b;
        abxz g = abxzVar.h(abxzVar2).i(f2).g(abxzVar2);
        if (!g.equals(this.h)) {
            this.h = g;
            z = true;
        } else {
            z = false;
        }
        boolean z3 = jkjVar.M() == jkjVar.U();
        if (z3 != this.i) {
            this.i = z3;
            z2 = true;
        }
        if (z2 | z) {
            cqkx.p(this);
        }
        this.e.B(jkjVar.U() - k());
    }

    @Override // defpackage.abwp
    public void a() {
    }

    @Override // defpackage.abwp
    public void b() {
    }

    @Override // defpackage.abwp
    public void c() {
    }

    @Override // defpackage.abwp
    public void d(@dzsi dvha dvhaVar) {
        akqi akqiVar = null;
        String str = (dvhaVar == null || (dvhaVar.a & 4) == 0) ? null : dvhaVar.d;
        if (dvhaVar != null && (dvhaVar.a & 8) != 0) {
            dpsn dpsnVar = dvhaVar.e;
            if (dpsnVar == null) {
                dpsnVar = dpsn.d;
            }
            long j = dpsnVar.b;
            dpsn dpsnVar2 = dvhaVar.e;
            if (dpsnVar2 == null) {
                dpsnVar2 = dpsn.d;
            }
            akqiVar = new akqi(j, dpsnVar2.c);
        }
        this.d.a(str, akqiVar);
        cqkx.p(this);
    }

    @Override // defpackage.aceq
    public cqkl f() {
        this.f.B(jjn.FULLY_EXPANDED);
        return cqkl.a;
    }

    @Override // defpackage.aceq
    public Boolean g() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.aceq
    public cqtv h() {
        return this.h;
    }

    @Override // defpackage.aceq
    @dzsi
    public abkm i() {
        return this.d;
    }

    @Override // defpackage.aceq
    /* renamed from: j */
    public acbv e() {
        return this.e;
    }

    public int k() {
        return b.g(c).NR(this.g) + irh.h().NR(this.g) + this.e.A();
    }
}
