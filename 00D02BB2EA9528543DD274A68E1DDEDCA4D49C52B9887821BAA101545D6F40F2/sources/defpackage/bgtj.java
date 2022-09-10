package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bgtj  reason: default package */
/* loaded from: classes3.dex */
final class bgtj extends cqqw {
    final /* synthetic */ bgtm a;

    public bgtj(bgtm bgtmVar) {
        this.a = bgtmVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        cjql e = cjqg.e(recyclerView);
        if (i != 1 || e == null) {
            return;
        }
        this.a.f.n(e, new cjte(deaf.DRAG), cjtd.a(dtxn.ey));
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
    }
}
