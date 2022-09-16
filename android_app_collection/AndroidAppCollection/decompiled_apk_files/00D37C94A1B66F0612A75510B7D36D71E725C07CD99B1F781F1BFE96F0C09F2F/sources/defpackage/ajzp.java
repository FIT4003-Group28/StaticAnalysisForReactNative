package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajzp  reason: default package */
/* loaded from: classes.dex */
public final class ajzp extends ne {
    final /* synthetic */ ajzq a;

    public ajzp(ajzq ajzqVar) {
        this.a = ajzqVar;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        ajzq ajzqVar = this.a;
        Runnable runnable = ajzqVar.o;
        if (runnable != null) {
            if (i == 1) {
                ajzqVar.o = null;
            } else if (i != 0) {
            } else {
                recyclerView.post(runnable);
                ajzqVar.o = null;
            }
        }
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        xw xwVar = recyclerView.n;
        if (!(xwVar instanceof LinearLayoutManager)) {
            return;
        }
        this.a.K = ((LinearLayoutManager) xwVar).J();
    }
}
