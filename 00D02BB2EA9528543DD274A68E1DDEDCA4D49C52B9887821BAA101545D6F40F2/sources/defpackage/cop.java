package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: cop  reason: default package */
/* loaded from: classes5.dex */
final class cop extends abx {
    final /* synthetic */ cov a;

    public cop(cov covVar) {
        this.a = covVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 0) {
            cov covVar = this.a;
            covVar.c.postDelayed(covVar.g, 400L);
        }
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        cou couVar = this.a.f;
        if (couVar != null) {
            couVar.a();
            if ((this.a.b.G() || !this.a.b.H()) && !this.a.b.G()) {
                this.a.b.H();
            }
        }
        this.a.d(false);
    }
}
