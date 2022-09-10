package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: abqj  reason: default package */
/* loaded from: classes2.dex */
public final class abqj extends cqiw<abqn> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, abqn abqnVar, Context context, cqiv cqivVar) {
        List<abql> Pd = abqnVar.Pd();
        int size = (Pd.size() / 2) + (Pd.size() % 2 == 0 ? 0 : 1);
        if (i == 1) {
            for (int i2 = 0; i2 < size; i2++) {
                cqivVar.a(new abqi(), Pd.get(i2));
            }
        } else if (i == 2) {
            while (size < Pd.size()) {
                cqivVar.a(new abqi(), Pd.get(size));
                size++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<abqn> a() {
        cqmp[] cqmpVarArr = {cqgr.bq(cqrp.d(40.0d)), cqgr.cd(-1), cqgr.dr(0), cqgr.dQ(ibn.o()), iue.f(cqic.c(cqjv.x(abqa.a), new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(16), cqgr.eN(5), ibq.m(), ibq.v(), cqgr.eM(abqb.a))};
        Float valueOf = Float.valueOf(1.0f);
        return cqgr.gd(cqgr.dU(cqrp.d(8.0d)), cqgr.dB(cqrp.d(8.0d)), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.gd(cqmpVarArr), cqgr.gd(cqgr.dr(0), cqgr.fY(cqgr.ce(cqrp.d(dcyn.a)), cqgr.bp(-2), cqgr.ca(valueOf), GmmRecyclerView.aw(D(1), cqgr.bR(cqrp.d(16.0d)), cqgr.bD(cqrp.d(8.0d)), cqgr.cd(-1), cqgr.bp(-2))), cqgr.fY(cqgr.ce(cqrp.d(dcyn.a)), cqgr.bp(-2), cqgr.ca(valueOf), GmmRecyclerView.aw(D(2), cqgr.bG(cqrp.d(16.0d)), cqgr.bD(cqrp.d(8.0d)), cqgr.cd(-1), cqgr.bp(-2)))));
    }
}
