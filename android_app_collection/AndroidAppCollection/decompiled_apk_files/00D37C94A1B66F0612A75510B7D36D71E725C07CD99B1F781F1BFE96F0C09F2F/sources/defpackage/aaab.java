package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: aaab  reason: default package */
/* loaded from: classes.dex */
final class aaab extends ne {
    final /* synthetic */ aaag a;

    public aaab(aaag aaagVar) {
        this.a = aaagVar;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        aaar aaarVar = this.a.f;
        if (aaarVar != null) {
            aaarVar.h();
            if (i != 0) {
                return;
            }
            aaag aaagVar = this.a;
            aaar aaarVar2 = aaagVar.f;
            LinearLayoutManager linearLayoutManager = aaagVar.i;
            aaarVar2.n(linearLayoutManager == null ? -1 : linearLayoutManager.I());
        }
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        aaar aaarVar = this.a.f;
        if (aaarVar != null) {
            aaarVar.h();
        }
    }
}
