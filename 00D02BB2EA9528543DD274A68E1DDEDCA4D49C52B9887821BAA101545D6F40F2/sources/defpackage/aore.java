package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aore  reason: default package */
/* loaded from: classes2.dex */
public final class aore extends cqiw<aorf> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aorf aorfVar, Context context, cqiv cqivVar) {
        aorf aorfVar2 = aorfVar;
        cqivVar.a(new anrl(), aorfVar2);
        List<dcdc<jbf>> d = aorfVar2.d();
        for (int i2 = 0; i2 < d.size(); i2++) {
            if (i2 != 0) {
                cqivVar.a(new aord(), aorfVar2);
            }
            cqivVar.f(new anpq(), d.get(i2));
        }
        if (aorfVar2.g().booleanValue()) {
            cqivVar.a(new acnn(), aorfVar2);
        }
        cqivVar.f(new hax(), aorfVar2.e());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aorf> a() {
        cqmj fY = cqgr.fY(cqgr.aR(Integer.valueOf((int) R.id.header)), cqgr.cd(-1), cqgr.bp(-2), iue.c(aoqz.a), cqgr.B(aora.a), cqgr.cW(cqgr.q(aorb.a)), cqgr.fP(new aoqw(), aorc.a, new cqmp[0]));
        cqjd[] cqjdVarArr = {cqjd.v(fY)};
        cqjb<aorf, cqiv> C = C();
        Integer valueOf = Integer.valueOf((int) R.id.timeline_segment_editing_list_view);
        return cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqgr.dU(ird.b()), cqgr.aT(aplg.a), fY, cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.bY(cqjdVarArr), GmmRecyclerView.aw(C, cqgr.z(irg.a()), cqgr.aR(valueOf), cqgr.aT(apkj.a)), jdx.b(jdx.c(valueOf))));
    }
}
