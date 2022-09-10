package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: abqm  reason: default package */
/* loaded from: classes2.dex */
public final class abqm extends cqiw<izf<abqn>> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, izf<abqn> izfVar, Context context, cqiv cqivVar) {
        List<abqn> Pd = izfVar.Pd();
        int i2 = 0;
        while (i2 < Pd.size()) {
            cqivVar.a(new abqj(), Pd.get(i2));
            i2++;
            if (i2 < Pd.size()) {
                cqivVar.c(new ije());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<izf<abqn>> a() {
        return GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-2));
    }
}
