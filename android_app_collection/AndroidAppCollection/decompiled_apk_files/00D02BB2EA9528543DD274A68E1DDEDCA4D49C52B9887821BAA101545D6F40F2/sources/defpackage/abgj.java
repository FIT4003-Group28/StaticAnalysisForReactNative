package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: abgj  reason: default package */
/* loaded from: classes2.dex */
public final class abgj extends cqiw<absq> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, absq absqVar, Context context, cqiv cqivVar) {
        List<absp> Pd = absqVar.Pd();
        int i2 = 0;
        while (i2 < Pd.size()) {
            cqivVar.a(new abge(), Pd.get(i2));
            i2++;
            if (i2 < Pd.size()) {
                cqivVar.c(new ije());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<absq> a() {
        return GmmRecyclerView.aw(C(), cqgr.aR(Integer.valueOf((int) R.id.explore_modules_list_layout_recyclerView)), cqgr.cd(-1), cqgr.aW(2), cqgr.bp(-1), cqgr.z(ibm.b()), cqqx.v(abgf.a), cqqx.w(abgg.a, cqkz.a(50)), cqgr.ep(false), cqqx.p(null), cqgr.fE(abgh.a));
    }
}
