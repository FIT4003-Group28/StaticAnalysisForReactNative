package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: trz  reason: default package */
/* loaded from: classes7.dex */
final class trz extends abx {
    final /* synthetic */ tsa a;

    public trz(tsa tsaVar) {
        this.a = tsaVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        ucr ucrVar;
        boolean canScrollVertically = recyclerView.canScrollVertically(-1);
        if (this.a.q() && (ucrVar = this.a.aq) != null) {
            ucrVar.c(canScrollVertically);
        }
        ucm ucmVar = this.a.ap;
        if (ucmVar != null) {
            ucmVar.m(canScrollVertically);
        }
    }
}
