package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bqre  reason: default package */
/* loaded from: classes4.dex */
public final class bqre extends cqiw<bqtb> {
    public static final cqtv a = cqrp.d(20.0d);
    private final boolean b;

    public bqre(boolean z) {
        super(Boolean.valueOf(z));
        this.b = z;
    }

    private static void e(bqtb bqtbVar, cqiv cqivVar) {
        cqivVar.f(new bqpb(), bqtbVar.Q());
        cqivVar.a(new bqpk(), bqtbVar);
    }

    private static void f(bqtb bqtbVar, cqiv cqivVar) {
        if (bqtbVar.F() == null) {
            return;
        }
        bqnk bqnkVar = new bqnk();
        bqsw F = bqtbVar.F();
        dbsk.s(F);
        cqivVar.a(bqnkVar, F);
    }

    private static void h(bqtb bqtbVar, cqiv cqivVar) {
        if (bqtbVar.E() == null) {
            return;
        }
        bqnj bqnjVar = new bqnj();
        bqsv E = bqtbVar.E();
        dbsk.s(E);
        cqivVar.a(bqnjVar, E);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bqtb bqtbVar, Context context, cqiv cqivVar) {
        bqtb bqtbVar2 = bqtbVar;
        if (bqtbVar2.M().booleanValue()) {
            cqivVar.c(new bqqv(cqrp.d(15.0d)));
        }
        if (bqtbVar2.y().booleanValue()) {
            cqivVar.a(new bqrd(this.b), bqtbVar2);
        }
        cqivVar.a(new bqqa(), bqtbVar2.C());
        cqivVar.a(new bqqi(), bqtbVar2);
        int intValue = bqtbVar2.X().intValue();
        if (intValue == 1) {
            e(bqtbVar2, cqivVar);
            h(bqtbVar2, cqivVar);
        } else if (intValue != 2) {
            e(bqtbVar2, cqivVar);
            return;
        } else {
            h(bqtbVar2, cqivVar);
            e(bqtbVar2, cqivVar);
        }
        f(bqtbVar2, cqivVar);
    }

    @Override // defpackage.cqiw
    public final cqmj<bqtb> a() {
        bqpp bqppVar = new bqpp();
        cqlc cqlcVar = bqpd.a;
        cqmp[] cqmpVarArr = {cqgr.aI(bqpe.a)};
        cqmp[] cqmpVarArr2 = {cqgr.bp(-1), cqgr.cd(-1), cqgr.ck(C()), cqqx.F(), cqqx.v(bqph.a)};
        cqlc cqlcVar2 = bqpf.a;
        cqgq a2 = itj.a();
        a2.a = Float.valueOf(0.0f);
        a2.f();
        a2.c();
        a2.d = 200;
        cqnf b = a2.b();
        cqgq a3 = itj.a();
        a3.a = Float.valueOf(1.0f);
        a3.f();
        a3.j();
        a3.d = 200;
        return cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.dB(ird.c()), iue.b(cjtd.a(dtyf.Q)), cqgr.z(ibm.b()), cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.fP(new bqqu(), bqpc.a, new cqmp[0]), cqgr.fP(bqppVar, cqlcVar, cqmpVarArr), cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), cqqx.D(cqmpVarArr2), iue.i(cqgr.bq(cqrp.d(6.0d)), cqgr.bw(48), cqjv.l(cqlcVar2, b, a3.b())))), cqgr.fY(cqgr.aI(bqpg.a), cqgr.bp(-1), cqgr.cd(-1), cqgr.z(irg.H()), cqgr.J(true), cqgr.gg(cqgr.bw(17), cqgr.ce(cqrp.d(48.0d)), cqgr.bq(cqrp.d(48.0d)))));
    }
}
