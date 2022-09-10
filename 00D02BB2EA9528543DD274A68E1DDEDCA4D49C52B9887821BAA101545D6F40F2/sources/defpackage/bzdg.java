package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bzdg  reason: default package */
/* loaded from: classes4.dex */
public final class bzdg {
    public static final bzdg a;
    public final amuo b;
    public final int c;
    private final amuo d;
    private final int e;
    private final int f;
    @dzsi
    private final bzda g;
    @dzsi
    private final vxv h;

    static {
        amuo a2 = amuo.i().a();
        a = new bzdg(a2, a2, 1, 0, 0, null, null);
    }

    private bzdg(amuo amuoVar, amuo amuoVar2, int i, int i2, int i3, @dzsi bzda bzdaVar, @dzsi vxv vxvVar) {
        this.b = amuoVar;
        this.d = amuoVar2;
        this.c = i;
        this.e = i2;
        this.f = i3;
        this.g = bzdaVar;
        this.h = vxvVar;
    }

    public static bzdg a(amuo amuoVar, @dzsi bzda bzdaVar, vxv vxvVar) {
        amuo amuoVar2;
        int i;
        int i2;
        int i3;
        dbsk.s(amuoVar);
        int i4 = 0;
        if (amuoVar.Q == null) {
            i2 = 1;
            i3 = 0;
            i = 0;
            amuoVar2 = amuoVar;
        } else {
            dbsk.s(amuoVar.b);
            int i5 = 0;
            int i6 = 0;
            amuo amuoVar3 = amuoVar;
            while (true) {
                if (!amuoVar3.equals(amuoVar)) {
                    i5 += amuoVar3.m;
                    i4 += amuoVar3.k;
                }
                amuo amuoVar4 = amuoVar3.Q;
                i6++;
                if (amuoVar4 == null || !bzdb.b(amuoVar, amuoVar4)) {
                    break;
                }
                amuoVar3 = amuoVar4;
            }
            amuoVar2 = amuoVar3;
            i = i4;
            i2 = i6;
            i3 = i5;
        }
        return new bzdg(amuoVar, amuoVar2, i2, i3, i, bzdaVar, vxvVar);
    }

    public static bzdg b(amub amubVar, int i, bzda bzdaVar, vxv vxvVar) {
        bzdg a2 = a(amubVar.o(0), bzdaVar, vxvVar);
        while (i > 0) {
            if (a2.c() == dqvj.TRANSIT) {
                i--;
            }
            if (i > 0) {
                a2 = a2.B();
            }
        }
        return a2;
    }

    @dzsi
    public final String A() {
        if (D()) {
            return null;
        }
        if (c() != dqvj.TRANSIT) {
            return alcf.j(K().a());
        }
        return alcf.f(alcf.w(K().a, false));
    }

    public final bzdg B() {
        dbsk.l(!D());
        amuo amuoVar = this.d.Q;
        dbsk.s(amuoVar);
        bzda bzdaVar = this.g;
        vxv vxvVar = this.h;
        dbsk.s(vxvVar);
        return a(amuoVar, bzdaVar, vxvVar);
    }

    public final bzdg C() {
        dbsk.l(!E());
        amuo amuoVar = this.b.R;
        dbsk.s(amuoVar);
        while (bzdb.b(amuoVar.R, amuoVar)) {
            amuoVar = amuoVar.R;
            dbsk.s(amuoVar);
        }
        bzda bzdaVar = this.g;
        vxv vxvVar = this.h;
        dbsk.s(vxvVar);
        return a(amuoVar, bzdaVar, vxvVar);
    }

    public final boolean D() {
        return this.b.Q == null;
    }

    public final boolean E() {
        return this.b.R == null;
    }

    public final boolean F() {
        if (D()) {
            return false;
        }
        return B().D();
    }

    public final int G(amuo amuoVar) {
        if (D()) {
            return H(amuoVar) ? 0 : 1;
        } else if (bzdb.b(this.b, amuoVar)) {
            return 0;
        } else {
            return this.b.i < amuoVar.i ? -1 : 1;
        }
    }

    public final boolean H(@dzsi amuo amuoVar) {
        return this.b.equals(amuoVar);
    }

    public final boolean I(@dzsi amuo amuoVar) {
        return this.d.equals(amuoVar);
    }

    public final int J() {
        return K().b;
    }

    public final amuq K() {
        amuq amuqVar = this.b.b;
        bzda bzdaVar = this.g;
        if (bzdaVar != null && amuqVar != null) {
            amuqVar = bzdaVar.b(amuqVar.b);
        }
        String valueOf = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("StepGroup must not be null, stepGroupList=");
        sb.append(valueOf);
        dbsk.t(amuqVar, sb.toString());
        return amuqVar;
    }

    public final int L() {
        int i = 0;
        bzdg bzdgVar = this;
        while (true) {
            if (bzdgVar.c() == dqvj.TRANSIT) {
                i++;
            }
            if (bzdgVar.E()) {
                return i;
            }
            bzdgVar = bzdgVar.C();
        }
    }

    public final int M() {
        int i = 0;
        for (bzdg bzdgVar = this; !bzdgVar.E(); bzdgVar = bzdgVar.C()) {
            i++;
        }
        return i;
    }

    public final int N() {
        int M = M() + 1;
        for (bzdg bzdgVar = this; !bzdgVar.D(); bzdgVar = bzdgVar.B()) {
            M++;
        }
        return M;
    }

    public final dqvj c() {
        return bzdb.a(this.b);
    }

    public final dphe d() {
        dbsk.l(c() == dqvj.TRANSIT);
        return K().g();
    }

    public final String e() {
        dpgw dpgwVar = d().c;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        return dpgwVar.b;
    }

    @dzsi
    public final String f() {
        douj g = alcf.g(K().a);
        if (g == null) {
            return null;
        }
        return g.e;
    }

    public final String g() {
        dpgw dpgwVar = d().d;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        return dpgwVar.b;
    }

    @dzsi
    public final String h() {
        dpgw dpgwVar = d().c;
        if (dpgwVar == null) {
            dpgwVar = dpgw.r;
        }
        return dpgwVar.k;
    }

    public final eapd i() {
        if (c() == dqvj.TRANSIT) {
            eapd j = j();
            if (j != null) {
                return j;
            }
            if (c() == dqvj.TRANSIT) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                dbsk.l(c() == dqvj.TRANSIT);
                dpci dpciVar = K().a().f;
                if (dpciVar == null) {
                    dpciVar = dpci.i;
                }
                dgaw dgawVar = dpciVar.e;
                if (dgawVar == null) {
                    dgawVar = dgaw.g;
                }
                return new eapd(timeUnit.toMillis(dgawVar.b));
            }
            return B().i().f(y());
        }
        return B().i().f(y());
    }

    @dzsi
    public final eapd j() {
        List<doyp> c = t().c();
        if (c.isEmpty()) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        dgaw dgawVar = c.get(0).b;
        if (dgawVar == null) {
            dgawVar = dgaw.g;
        }
        return new eapd(timeUnit.toMillis(dgawVar.b));
    }

    @dzsi
    public final eapd k(int i, eapd eapdVar) {
        for (doyp doypVar : t().c()) {
            dgaw dgawVar = doypVar.b;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
            eapd eapdVar2 = new eapd(dgawVar.b * 1000);
            if (eapdVar2.w(eapdVar)) {
                if (i == 0) {
                    return eapdVar2;
                }
                i = 0;
            }
        }
        return null;
    }

    @dzsi
    public final eapd l(eapd eapdVar) {
        return k(0, eapdVar);
    }

    public final int m() {
        return bzlw.a(q().d);
    }

    public final boolean n() {
        return K().g() != null && K().g().l.size() > 1;
    }

    public final double o(amub amubVar, int i) {
        dcdc<amvb> at = amubVar.at(K());
        return (at == null || i >= at.size()) ? dcyn.a : at.get(i).c;
    }

    @dzsi
    public final dotv p(int i) {
        if (!n()) {
            return null;
        }
        for (dotv dotvVar : K().g().l) {
            if (i >= dotvVar.c && i < dotvVar.d) {
                return dotvVar;
            }
        }
        return null;
    }

    public final dpgl q() {
        dpgl dpglVar = d().l.get(0).b;
        return dpglVar == null ? dpgl.g : dpglVar;
    }

    @dzsi
    public final String r() {
        return alcf.r(q().b);
    }

    @dzsi
    public final dozc s() {
        return alca.i(this.b.C);
    }

    public final vxu t() {
        dbsk.l(c() == dqvj.TRANSIT);
        vxv vxvVar = this.h;
        dbsk.s(vxvVar);
        return vxvVar.a(K().a, true, false);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("firstStep", this.b.g());
        return b.toString();
    }

    public final int u() {
        return d().e;
    }

    public final dpgw v(int i) {
        if (i == 0) {
            dpgw dpgwVar = d().c;
            return dpgwVar == null ? dpgw.r : dpgwVar;
        } else if (i == u()) {
            dpgw dpgwVar2 = d().d;
            return dpgwVar2 == null ? dpgw.r : dpgwVar2;
        } else {
            return d().j.get(i - 1);
        }
    }

    public final int w() {
        dbsk.l(!D());
        amuo amuoVar = this.d.Q;
        dbsk.s(amuoVar);
        return this.f + amuoVar.k;
    }

    public final double x(amub amubVar) {
        amuo amuoVar;
        if (D()) {
            amuoVar = this.d;
        } else {
            amuoVar = this.d.Q;
            dbsk.s(amuoVar);
        }
        return amubVar.K(amuoVar.j);
    }

    public final eaow y() {
        dbsk.l(!D());
        dqvj c = c();
        dqvj dqvjVar = dqvj.DRIVE;
        int ordinal = c.ordinal();
        if (ordinal == 2) {
            amuo amuoVar = this.d.Q;
            dbsk.s(amuoVar);
            return eaow.d(this.e + amuoVar.m);
        } else if (ordinal == 3) {
            dgas dgasVar = d().s;
            if (dgasVar == null) {
                dgasVar = dgas.e;
            }
            return eaow.d(dgasVar.b);
        } else {
            return eaow.a;
        }
    }

    public final dcdc<dpce> z() {
        return alcf.w(K().a, true);
    }
}
