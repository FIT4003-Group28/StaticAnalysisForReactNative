package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: chye  reason: default package */
/* loaded from: classes4.dex */
public final class chye extends cqiw<chyf> {
    static final cqjg a = cqjg.a();
    public static final /* synthetic */ int b = 0;
    private final abn c;

    public chye(abn abnVar) {
        super(abnVar);
        this.c = abnVar;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, chyf chyfVar, Context context, cqiv cqivVar) {
        chyf chyfVar2 = chyfVar;
        cqivVar.g(chyfVar2.c());
        cqivVar.g(chyfVar2.d());
    }

    @Override // defpackage.cqiw
    public final cqmj<chyf> a() {
        cqjb<chyf, cqiv> C = C();
        final cqrp d = cqrp.d(10.0d);
        final cqrp d2 = cqrp.d(2.0d);
        return cqgr.fY(cqgr.gd(cqgr.dr(1), cqgr.z(iva.b(ibl.h(), ibl.x())), cqgr.fP(new cizk(), chxw.a, new cqmp[0]), cqgr.fY(jih.a(C, cqgr.aT(a), cqqx.F(), cqqx.K(new cqjb(d, d2) { // from class: chyc
            private final cqtv a;
            private final cqtv b;

            {
                this.a = d;
                this.b = d2;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                cqtv cqtvVar = this.a;
                cqtv cqtvVar2 = this.b;
                int i = chye.b;
                return new chyd(cqtvVar.e(context), (chyf) cqkpVar, cqtvVar2.e(context));
            }
        }), cqqx.p(this.c), cqgr.bp(-1), cqgr.cd(-1), cqgr.dk(chxx.a), cqqx.x(chxy.a), cqqx.v(chxz.a)), cqgr.fP(new cizz(), chya.a, cqgr.aI(chyb.a)))));
    }
}
