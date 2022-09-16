package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: bizm  reason: default package */
/* loaded from: classes3.dex */
public final class bizm extends cqiw<bizn> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bizn biznVar, Context context, cqiv cqivVar) {
        bizn biznVar2 = biznVar;
        cqivVar.a(new bjcf(), biznVar2.a());
        bjbd d = biznVar2.d();
        if (d != null) {
            cqivVar.a(ict.p(false, new cqmp[0]), cqkp.T);
            cqivVar.a(new bjbc(), d);
            cqivVar.a(ict.p(false, new cqmp[0]), cqkp.T);
        }
        cqkp f = biznVar2.f();
        List<bjap> c = biznVar2.c();
        if (c.isEmpty() && f == null) {
            cqivVar.a(new bjbm(), biznVar2.b());
            return;
        }
        gva.b(cqivVar, c, new bjao(), ict.p(false, new cqmp[0]));
        if (f == null) {
            return;
        }
        cqivVar.a(new bjsb(), f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bizn> a() {
        return cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.x(irg.a()), cqgr.fP(new hxj(), bizk.a, new cqmp[0]), GmmRecyclerView.aw(C(), cqqx.x(bizl.a), cqgr.ep(false)));
    }
}
