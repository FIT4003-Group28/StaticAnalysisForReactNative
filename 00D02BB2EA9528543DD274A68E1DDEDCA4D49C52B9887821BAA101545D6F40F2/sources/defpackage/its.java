package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: its  reason: default package */
/* loaded from: classes6.dex */
public final class its {
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(@dzsi cqsn cqsnVar, cqmj<T> cqmjVar, cqmj<T>... cqmjVarArr) {
        cqmp[] cqmpVarArr = {cqgr.aD(cqjv.v(cqsnVar)), cqgr.bR(cqrp.d(24.0d)), cqgr.bG(cqrp.d(24.0d)), cqgr.eN(5), cqgr.eU(irg.J()), irn.f(), cqgr.eJ(cqsnVar)};
        cqmp[] cqmpVarArr2 = {cqgr.aJ(8388627)};
        cqmj gd = cqgr.gd(cqgr.aJ(8388629));
        gd.f(cqmjVarArr);
        return cqgr.gd(cqgr.cd(-1), cqgr.dU(cqrp.d(24.0d)), cqgr.dr(1), cqgr.z(irg.a()), cqgr.gq(cqmpVarArr), cqmjVar, cqgr.fY(cqgr.bR(cqrp.d(24.0d)), cqgr.bG(cqrp.d(24.0d)), cqgr.bq(cqrp.f(48.0d)), cqgr.gd(cqmpVarArr2), gd));
    }

    public static <T extends cqkp> cqnf<T> b(cqtd cqtdVar) {
        return cqgr.x(cqtt.e(cqtdVar, cqrp.d(dcyn.a), cqrp.d(6.0d), cqrp.d(dcyn.a), cqrp.d(6.0d)));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqlc<T, ?> cqlcVar, final cqlc<T, View.OnClickListener> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.dQ(cqrp.d(16.0d)), cqgr.dF(cqrp.d(16.0d)), cqgr.cd(-2), cqgr.bq(irh.a()), cqgr.aJ(16), b(iva.e(irm.m, irm.q)), iuy.c(), irn.p(), cqgr.eM(cqlcVar), cqgr.cW(cqlcVar2), cqgr.K(new cqlc(cqlcVar2) { // from class: itr
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return Boolean.valueOf(!cqjv.v((View.OnClickListener) this.a.a(cqkpVar)).booleanValue());
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        gq.f(cqmpVarArr);
        return gq;
    }
}
