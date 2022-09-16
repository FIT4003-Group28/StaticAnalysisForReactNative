package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdud  reason: default package */
/* loaded from: classes4.dex */
public final class cdud extends cqiw<ceby> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, ceby cebyVar, Context context, cqiv cqivVar) {
        ceby cebyVar2 = cebyVar;
        cqivVar.a(new blap(), cebyVar2.c());
        cqivVar.a(new gvb(), cqkp.T);
        ixw ixwVar = new ixw();
        ixwVar.a = context.getResources().getQuantityString(R.plurals.YOUR_REVIEWS_AND_UPDATES, cebyVar2.b().size());
        cqivVar.a(new hrw(), ixwVar.a());
        List<blla> b = cebyVar2.b();
        boolean z = true;
        int i2 = 0;
        while (i2 < b.size()) {
            blla bllaVar = b.get(i2);
            i2++;
            bllaVar.q(i2);
            if (!z) {
                cqivVar.a(new gvb(), cqkp.T);
            }
            cqivVar.a(bllaVar.p().booleanValue() ? new cdsx() : new blbf(), bllaVar);
            z = false;
        }
        cqivVar.a(new cduc(), cebyVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ceby> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), cqgr.z(ibm.b()), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), hxc.a(hxc.b(cdtx.a))), cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-1), cqgr.aT(bllb.a), cqqx.p(null), cqqx.F(), cqgr.z(ibm.b()), cqqx.v(cdty.a)), bfzu.d(cqgr.aI(cdtz.a))));
    }
}
