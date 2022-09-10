package defpackage;
/* compiled from: PG */
/* renamed from: ssx  reason: default package */
/* loaded from: classes7.dex */
public final class ssx implements qcy<ssw> {
    private final qbj a;
    private final ufg b;

    public ssx(qbj qbjVar, ufg ufgVar) {
        this.a = qbjVar;
        this.b = ufgVar;
    }

    @Override // defpackage.qcy
    public final /* bridge */ /* synthetic */ ssw a(qct qctVar) {
        dbsg dbsgVar;
        int a;
        if (qctVar.n() == null) {
            return ssw.d();
        }
        qbn n = qctVar.n();
        dbsk.s(n);
        qbm a2 = n.a();
        this.b.d(a2.i());
        if (a2.g() != null) {
            vun g = a2.g();
            dbsk.s(g);
            dbsgVar = dbsg.j(g.b);
        } else {
            dbsgVar = dbpy.a;
        }
        dbsg dbsgVar2 = dbpy.a;
        if (qctVar.r() != null) {
            duqc r = qctVar.r();
            dbsk.s(r);
            if ((r.a & 8) != 0) {
                duqc r2 = qctVar.r();
                dbsk.s(r2);
                dqvj c = dqvj.c(r2.e);
                if (c == null) {
                    c = dqvj.DRIVE;
                }
                dbsgVar2 = dbsg.i(c);
            }
        }
        if (dbsgVar.a()) {
            dwao dwaoVar = (dwao) dbsgVar.b();
            dbsk.s(dwaoVar);
            dphq dphqVar = dwaoVar.e;
            if (dphqVar == null) {
                dphqVar = dphq.m;
            }
            dqvj c2 = dqvj.c(dphqVar.b);
            if (c2 == null) {
                c2 = dqvj.MIXED;
            }
            if (c2.equals(dqvj.MIXED) && ((a = dpho.a(dphqVar.c)) == 0 || a == 1)) {
                return ssw.e(ssq.RESULT_LIST, dbpy.a, deha.a(tgh.f(false, dbpy.a, dbsgVar2, dbsg.i(n))));
            }
        }
        return ssw.e(ssq.RESULT_LIST, dbpy.a, deha.a(tgh.f(true, dbsgVar, dbsgVar2, dbpy.a)));
    }

    @Override // defpackage.qcy
    public final /* bridge */ /* synthetic */ ssw b(qcx qcxVar) {
        amvh g = qcxVar.g();
        dcdc<amvh> h = qcxVar.h();
        if (h.isEmpty()) {
            h = dcdc.f(amvh.a);
        }
        if (g == null) {
            g = this.a.f(h.get(0));
        }
        dccx F = dcdc.F();
        F.g(g);
        F.i(h);
        dcdc<amvh> f = F.f();
        this.b.d(f);
        return ssw.e(ufe.a(f) ? ssq.RESULT_LIST : ssq.ZERO_STATE, dbpy.a, deha.a(tgh.f(true, dbsg.j(qcxVar.y()), dbsg.j(qcxVar.f()), dbpy.a)));
    }
}
