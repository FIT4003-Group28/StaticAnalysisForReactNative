package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ldm  reason: default package */
/* loaded from: classes7.dex */
public class ldm {
    @dzsi
    public final String a;
    @dzsi
    public String b;
    @dzsi
    public String c;
    @dzsi
    public ilo d;
    @dzsi
    public qbn e;
    @dzsi
    public qbm f;
    @dzsi
    public eapd g;
    public amvh h;
    @dzsi
    public dspd i;
    public int j;

    public ldm(amvh amvhVar, @dzsi String str, @dzsi String str2, @dzsi String str3) {
        this(amvhVar, str, str2, str3, null, null);
    }

    public static ldm a(ilo iloVar) {
        return new ldm(iloVar.d(), iloVar.y(), iloVar.q(), iloVar.B(), iloVar, null);
    }

    @dzsi
    public static ldm b(@dzsi ilo iloVar) {
        if (iloVar == null || !iloVar.l()) {
            return null;
        }
        dwca k = iloVar.k();
        dbsk.s(k);
        return c(akqi.b(k.a.get(0).e), iloVar.m());
    }

    public static ldm c(akqi akqiVar, @dzsi String str) {
        boolean d = akqi.d(akqiVar);
        if (true != d) {
            akqiVar = null;
        }
        amvg P = amvh.P();
        P.c = akqiVar;
        P.k = d;
        P.b = str;
        return new ldm(P.a(), str, true != d ? null : str, null);
    }

    public static ldm e(akqq akqqVar) {
        String a = akqqVar.a();
        amvg P = amvh.P();
        P.c = akqi.a;
        P.k = false;
        P.d = akqqVar;
        P.A = akqqVar;
        P.b = a;
        return new ldm(P.a(), a, null, null);
    }

    public static ldm f(amvh amvhVar, Resources resources, @dzsi dspd dspdVar) {
        String t = amvhVar.t(resources, false);
        dosw F = amvhVar.F();
        String str = F != null ? F.d : null;
        String str2 = amvhVar.c;
        if (str2 == null && (str2 = amvhVar.k) == null) {
            akqq akqqVar = amvhVar.e;
            str2 = akqqVar != null ? akqqVar.a() : "";
        }
        return new ldm(amvhVar, str2, t, str, null, dspdVar);
    }

    public static ldm g(azva azvaVar, String str) {
        dpjs g = amvj.g(azvaVar.a);
        dbsk.s(g);
        amvg P = amvh.P();
        P.a = g;
        P.c = azvaVar.c;
        P.d = azvaVar.e;
        P.j = str;
        P.k = true;
        amvh a = P.a();
        String str2 = azvaVar.d;
        return new ldm(a, str2, str, str2);
    }

    public static ldm h(azva azvaVar, Resources resources) {
        dndr dndrVar = azvaVar.a;
        boolean z = true;
        if (dndrVar != dndr.HOME && dndrVar != dndr.WORK) {
            z = false;
        }
        dbsk.l(z);
        String string = resources.getString(dndrVar == dndr.HOME ? R.string.HOME_LOCATION : R.string.WORK_LOCATION);
        int i = dndrVar == dndr.HOME ? 6 : 7;
        amvg P = amvh.P();
        P.j = string;
        P.b = azvaVar.d;
        P.c = azvaVar.c;
        P.d = azvaVar.e;
        dpjs g = amvj.g(dndrVar);
        dbsk.s(g);
        P.a = g;
        amvh a = P.a();
        String str = azvaVar.d;
        return new ldm(a, str, string, str, i);
    }

    public static dcdc<ldm> i(amte amteVar, Resources resources) {
        amsy amsyVar = amteVar.a;
        dspd x = amsyVar.m(amsyVar.o()).x();
        amvh[] amvhVarArr = amteVar.c;
        int length = amvhVarArr.length;
        if (length > 1) {
            int i = length - 1;
            dccx F = dcdc.F();
            int i2 = 0;
            while (i2 < i) {
                i2++;
                F.g(f(amvhVarArr[i2], resources, x));
            }
            return F.f();
        }
        return dcdc.f(f(amteVar.g(), resources, x));
    }

    @dzsi
    private final dpjn v() {
        amte l = l();
        if (l != null && l.a.i() >= 2) {
            dpjn dpjnVar = l.a.h(1).b;
            return dpjnVar == null ? dpjn.m : dpjnVar;
        }
        return null;
    }

    public final void j(qbn qbnVar, qbm qbmVar) {
        dbsk.t(qbnVar, "directionsFetcher");
        this.e = qbnVar;
        dbsk.t(qbmVar, "directionsFetcherState");
        this.f = qbmVar;
    }

    public final void k() {
        this.e = null;
        this.f = null;
    }

    @dzsi
    public final amte l() {
        qbm qbmVar = this.f;
        if (qbmVar == null || !qbmVar.o()) {
            return null;
        }
        return this.f.n();
    }

    public final int m() {
        amsy amsyVar;
        amte l = l();
        if (l == null || (amsyVar = l.a) == null) {
            return 0;
        }
        return amsyVar.n();
    }

    public final amve n(int i) {
        boolean z = true;
        dbsk.a(i >= 0);
        if (i >= m()) {
            z = false;
        }
        dbsk.a(z);
        amte l = l();
        dbsk.s(l);
        return l.a.m(i);
    }

    @dzsi
    public final akqq o() {
        ilo iloVar = this.d;
        if (iloVar == null || iloVar.aj() == null) {
            amte l = l();
            return (l != null ? l.g() : this.h).e;
        }
        return iloVar.aj();
    }

    public final void p(ilo iloVar) {
        dbsk.s(iloVar);
        this.d = iloVar;
        this.h = iloVar.d();
        if (!dbsj.d(iloVar.q())) {
            this.b = iloVar.q();
        }
        dcdc<String> z = iloVar.z();
        if (z.size() > 1) {
            this.c = TextUtils.join(", ", z.subList(1, z.size()));
        }
    }

    public final boolean q(ldm ldmVar) {
        return this.h.e(ldmVar.h, 1.0d);
    }

    @dzsi
    public final dcdc<dpca> r() {
        dpjn v = v();
        if (v == null) {
            return null;
        }
        dccx F = dcdc.F();
        for (dpca dpcaVar : v.e) {
            int a = dpbz.a(dpcaVar.b);
            if (a != 0 && a == 4) {
                F.g(dpcaVar);
            }
        }
        return F.f();
    }

    public final boolean s() {
        dpjn v = v();
        if (v == null) {
            return false;
        }
        for (dpca dpcaVar : v.e) {
            int a = dpbz.a(dpcaVar.b);
            if (a != 0 && a == 4) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        ilo iloVar = this.d;
        dnjf dnjfVar = null;
        if (iloVar == null || iloVar.ad() == null) {
            qbm qbmVar = this.f;
            if (qbmVar != null && qbmVar.i().size() >= 2) {
                dnjfVar = this.f.i().get(1).G();
            }
        } else {
            dnjfVar = this.d.ad();
        }
        return dnjfVar != null;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("query", this.a);
        b.b("title", this.b);
        b.b("subtitle", this.c);
        b.b("placemark", this.d);
        b.b("waypoint", this.h);
        return b.toString();
    }

    public final int u() {
        amsy amsyVar;
        qbm qbmVar = this.f;
        if (qbmVar == null) {
            return 1;
        }
        amte n = qbmVar.n();
        if (n != null && (amsyVar = n.a) != null && !amsyVar.d() && !amsyVar.t()) {
            return 4;
        }
        return (qbmVar.d() || !qbmVar.o()) ? 3 : 2;
    }

    public ldm(amvh amvhVar, @dzsi String str, @dzsi String str2, @dzsi String str3, int i) {
        this(amvhVar, str, str2, str3);
        this.j = i;
    }

    public ldm(amvh amvhVar, @dzsi String str, @dzsi String str2, @dzsi String str3, @dzsi ilo iloVar, @dzsi dspd dspdVar) {
        String f;
        dcdc.e();
        this.j = -1;
        dbsk.s(amvhVar);
        this.h = amvhVar;
        this.a = str;
        if (dbsj.d(str2)) {
            this.b = dbsj.f(str3);
            f = null;
        } else {
            this.b = str2;
            f = dbsj.f(str3);
        }
        this.c = f;
        this.d = iloVar;
        this.i = dspdVar;
    }

    public static ldm d(alap alapVar) {
        if (!akqi.d(alapVar.g)) {
            String T = !dbsj.d(alapVar.q) ? alapVar.q : alapVar.r.T();
            amvg P = amvh.P();
            P.c = null;
            P.k = false;
            P.b = T;
            P.d = alapVar.r.S();
            return new ldm(P.a(), T, null, null);
        }
        alxk alxkVar = alapVar.c;
        String str = alxkVar != null ? alxkVar.a : alapVar.q;
        ily ilyVar = new ily();
        ilyVar.i(alapVar);
        ilyVar.f = false;
        ilyVar.u = str;
        ilyVar.D();
        ilyVar.C(alapVar.j);
        ilyVar.j = true;
        ilo d = ilyVar.d();
        amvg P2 = amvh.P();
        P2.c = d.ai();
        P2.b = d.y();
        P2.d = d.aj();
        return new ldm(P2.a(), d.y(), d.q(), d.B());
    }
}
