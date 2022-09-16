package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: bjjl  reason: default package */
/* loaded from: classes3.dex */
final class bjjl extends cqiw<bjjm> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bjjm bjjmVar, Context context, cqiv cqivVar) {
        bjjm bjjmVar2 = bjjmVar;
        bjwo a = bjjmVar2.a();
        if (a != null) {
            cqivVar.a(new bjto(true, null), a);
            if (!bjjmVar2.b().isEmpty()) {
                cqivVar.c(new bjjk());
            }
        }
        gva.b(cqivVar, bjjmVar2.b(), new bjto(false, null), new bjjk());
        cqkp d = bjjmVar2.d();
        if (d != null) {
            cqivVar.a(new bjsb(), d);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bjjm> a() {
        return cqgr.gd(cqgr.bp(-2), cqgr.dr(1), cqgr.x(irg.a()), cqgr.fP(new hxj(), bjjg.a, new cqmp[0]), GmmRecyclerView.aw(C(), cqqx.x(bjjh.a), cqgr.bq(cqrp.d(dcyn.a)), cqgr.ca(Float.valueOf(1.0f)), cqgr.ep(false)), cqgr.fP(new bjiw(), bjji.a, new cqmp[0]));
    }
}
