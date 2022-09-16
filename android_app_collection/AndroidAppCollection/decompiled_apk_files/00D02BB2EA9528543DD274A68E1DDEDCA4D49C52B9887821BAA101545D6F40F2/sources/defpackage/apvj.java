package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: apvj  reason: default package */
/* loaded from: classes2.dex */
public final class apvj extends cqiw<apvm> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, apvm apvmVar, Context context, cqiv cqivVar) {
        apvm apvmVar2 = apvmVar;
        List<apvl> d = apvmVar2.d();
        if (apvmVar2.e()) {
            cqivVar.a(new apvi(), apvmVar2);
            return;
        }
        for (int i2 = 0; i2 < d.size(); i2++) {
            cqivVar.a(new apvg(), d.get(i2));
            cqivVar.a(new gvb(), cqkp.T);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<apvm> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.z(irg.a()), hxc.a(hxc.b(apvh.a)), GmmRecyclerView.aw(C(), cqgr.aR(Integer.valueOf((int) R.id.business_items_list)), cqgr.er(true), cqgr.bp(-2), cqgr.cd(-1)));
    }
}
