package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: abnr  reason: default package */
/* loaded from: classes2.dex */
public final class abnr extends cqiw<izf<abnb>> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, izf<abnb> izfVar, Context context, cqiv cqivVar) {
        List<abnb> Pd = izfVar.Pd();
        int i2 = 0;
        while (i2 < Pd.size()) {
            cqivVar.a(new abna(), Pd.get(i2));
            i2++;
            if (i2 < Pd.size()) {
                cqivVar.c(ict.p(false, new cqmp[0]));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<izf<abnb>> a() {
        return cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), GmmRecyclerView.aw(C(), cqgr.bp(-2), cqgr.cd(-1)));
    }
}
