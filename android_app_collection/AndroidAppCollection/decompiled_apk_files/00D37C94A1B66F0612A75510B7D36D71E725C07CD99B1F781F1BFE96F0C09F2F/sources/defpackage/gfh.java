package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gfh  reason: default package */
/* loaded from: classes3.dex */
public final class gfh extends ne {
    final /* synthetic */ gfm a;

    public gfh(gfm gfmVar) {
        this.a = gfmVar;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        View a;
        if (i == 0) {
            gfm gfmVar = this.a;
            if (!emn.F(gfmVar.d.u(), 32)) {
                return;
            }
            gfl gflVar = gfmVar.h;
            if (gflVar.e || gflVar.f || (a = gfmVar.a(gfmVar.a.n)) == null) {
                return;
            }
            float e = gfm.e(a, gfmVar.g);
            if (e <= 0.0f || e >= 1.0f) {
                return;
            }
            gfmVar.h.b = gfmVar.d.v();
            gfl gflVar2 = gfmVar.h;
            gflVar2.a = e < 0.5f ? (int) gfmVar.g : 0;
            gfmVar.a.n.bd(gflVar2);
        }
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        this.a.d();
    }
}
