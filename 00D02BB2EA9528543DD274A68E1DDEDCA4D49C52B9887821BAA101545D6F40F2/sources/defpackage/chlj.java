package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: chlj  reason: default package */
/* loaded from: classes4.dex */
final class chlj extends cqqw {
    final /* synthetic */ chls a;

    public chlj(chls chlsVar) {
        this.a = chlsVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        View c;
        int bm;
        if (i == 0) {
            abs absVar = recyclerView.l;
            adz a = cqre.a(recyclerView);
            if (absVar == null || a == null || (c = a.c(absVar)) == null || (bm = abs.bm(c)) == -1 || bm == this.a.c.intValue()) {
                return;
            }
            if (bm == 1) {
                if (this.a.d.intValue() == 1) {
                    this.a.d = 2;
                }
                bm = 1;
            }
            this.a.c = Integer.valueOf(bm);
            cqkx.p(this.a);
        }
    }
}
