package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: qmp  reason: default package */
/* loaded from: classes7.dex */
public final class qmp extends cqiw<qnd> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, qnd qndVar, Context context, cqiv cqivVar) {
        qnd qndVar2 = qndVar;
        int i2 = 0;
        for (int i3 = 0; i3 < qndVar2.t().size(); i3++) {
            if (qndVar2.e(Integer.valueOf(i3)).booleanValue()) {
                qndVar2.t().get(i3).e(i2);
                i2++;
            }
            cqivVar.a(new qmo(), qndVar2.t().get(i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<qnd> a() {
        return cqgr.fY(cqgr.ga(cqgr.dQ(cqrp.d(4.0d)), cqgr.dF(cqrp.d(4.0d)), cqgr.L(false), cqgr.ep(false), cqgr.fP(new qpu(), qmi.a, cqjv.g(qpq.TAB_FILTER, qmj.a, qpv.c), cqjv.i(qpq.SELECTOR_INSET, cqrp.d(9.0d), qpv.c), jgq.c(cqrp.d(-9.0d)), zxc.m(vyt.d), cqgr.ck(C()))), cqgr.fP(new qip(), qmk.a, cqgr.dU(cqrp.d(14.0d)), cqgr.dB(cqrp.d(14.0d)), cqgr.dQ(cqrp.d(17.0d)), cqgr.dF(cqrp.d(17.0d)), cqgr.aI(cqjv.x(qml.a))), cqgr.aF(qmm.a));
    }
}
