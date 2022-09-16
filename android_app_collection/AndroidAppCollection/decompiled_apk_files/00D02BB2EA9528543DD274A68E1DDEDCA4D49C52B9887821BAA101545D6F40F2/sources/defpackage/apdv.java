package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apdv  reason: default package */
/* loaded from: classes2.dex */
public final class apdv extends cqiw<apeb> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, apeb apebVar, Context context, cqiv cqivVar) {
        apeb apebVar2 = apebVar;
        cqivVar.a(new apdy(), apebVar2.e());
        for (apdz apdzVar : apebVar2.a()) {
            if (apdzVar.j().booleanValue()) {
                cqivVar.a(new apds(), apdzVar);
            }
        }
        if (!apebVar2.c().booleanValue() && apebVar2.b().booleanValue()) {
            for (int i2 = 0; i2 < 4; i2++) {
                cqivVar.a(new apdt(), cqkp.T);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<apeb> a() {
        return cqqx.E(cqqx.d(ibm.b()), cqqx.i(cqrp.d(2.0d)), cqqx.g(cqrp.d(8.0d)), cqqx.B(false), cqgr.cd(-1), cqgr.bp(-1), cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), GmmRecyclerView.aw(C(), cqgr.aT(apkj.a), cqgr.aR(Integer.valueOf((int) R.id.recycler_view)), cqgr.cd(-1), cqgr.bp(-2), cqgr.ep(false), cqqx.F(), cqqx.v(apdu.a), cqgr.ck(C())))));
    }
}
