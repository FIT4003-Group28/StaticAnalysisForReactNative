package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: npl  reason: default package */
/* loaded from: classes3.dex */
final class npl extends ne {
    final /* synthetic */ npm a;

    public npl(npm npmVar) {
        this.a = npmVar;
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        if ((recyclerView.n instanceof LinearLayoutManager) && hqs.k(recyclerView)) {
            int a = this.a.c.a.a();
            npm npmVar = this.a;
            if (a == npmVar.n) {
                return;
            }
            npmVar.n = a;
            npmVar.j.lD(ajfy.NEXT);
        }
    }
}
