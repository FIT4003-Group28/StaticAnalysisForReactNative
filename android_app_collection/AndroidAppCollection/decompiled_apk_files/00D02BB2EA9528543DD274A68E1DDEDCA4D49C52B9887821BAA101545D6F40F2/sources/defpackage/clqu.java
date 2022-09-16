package defpackage;
/* compiled from: PG */
/* renamed from: clqu  reason: default package */
/* loaded from: classes5.dex */
public final class clqu {
    public final cloz a;
    public cmeh c;
    public cmeh d;
    public cmeh e;
    public dcdc<cmeh> b = dcdc.e();
    private dcdn<cmeh, clpb> f = dcmn.a;

    public clqu(cloz clozVar) {
        this.a = clozVar;
    }

    public static cmeh c(clog clogVar, dcdc<cmeh> dcdcVar, cmeh cmehVar, cloz clozVar) {
        int i;
        clpb n = clogVar.n();
        clmt clmtVar = (clmt) clogVar;
        if (clmtVar.n.b.t()) {
            i = 0;
        } else {
            cloc clocVar = clmtVar.n;
            i = clocVar.b.i(clocVar.c.a);
        }
        Object j = n.t() ? null : n.j(i);
        int e = (clogVar.j() || n.t()) ? -1 : n.y(i, clozVar).e(cllt.b(clogVar.i()) - clozVar.e);
        for (int i2 = 0; i2 < dcdcVar.size(); i2++) {
            cmeh cmehVar2 = dcdcVar.get(i2);
            if (e(cmehVar2, j, clogVar.j(), clogVar.k(), clogVar.l(), e)) {
                return cmehVar2;
            }
        }
        if (dcdcVar.isEmpty() && cmehVar != null) {
            if (e(cmehVar, j, clogVar.j(), clogVar.k(), clogVar.l(), e)) {
                return cmehVar;
            }
        }
        return null;
    }

    private final void d(dcdg<cmeh, clpb> dcdgVar, cmeh cmehVar, clpb clpbVar) {
        if (cmehVar == null) {
            return;
        }
        if (clpbVar.i(cmehVar.a) != -1) {
            dcdgVar.f(cmehVar, clpbVar);
            return;
        }
        clpb clpbVar2 = this.f.get(cmehVar);
        if (clpbVar2 == null) {
            return;
        }
        dcdgVar.f(cmehVar, clpbVar2);
    }

    private static boolean e(cmeh cmehVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!cmehVar.a.equals(obj)) {
            return false;
        }
        if (z) {
            if (cmehVar.b != i || cmehVar.c != i2) {
                return false;
            }
        } else if (cmehVar.b != -1 || cmehVar.e != i3) {
            return false;
        }
        return true;
    }

    public final clpb a(cmeh cmehVar) {
        return this.f.get(cmehVar);
    }

    public final void b(clpb clpbVar) {
        dcdg<cmeh, clpb> p = dcdn.p();
        if (!this.b.isEmpty()) {
            for (int i = 0; i < this.b.size(); i++) {
                d(p, this.b.get(i), clpbVar);
            }
            if (!this.b.contains(this.c)) {
                d(p, this.c, clpbVar);
            }
        } else {
            d(p, this.d, clpbVar);
            if (!dbsd.a(this.e, this.d)) {
                d(p, this.e, clpbVar);
            }
            if (!dbsd.a(this.c, this.d) && !dbsd.a(this.c, this.e)) {
                d(p, this.c, clpbVar);
            }
        }
        this.f = p.b();
    }
}
