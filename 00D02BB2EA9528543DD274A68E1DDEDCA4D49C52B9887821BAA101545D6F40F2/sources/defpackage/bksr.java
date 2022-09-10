package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bksr  reason: default package */
/* loaded from: classes3.dex */
final class bksr extends cqqw {
    final /* synthetic */ bksv a;
    private boolean b = false;

    public bksr(bksv bksvVar) {
        this.a = bksvVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
        if (i == 1) {
            this.b = true;
        } else if (i != 0) {
        } else {
            bkry bkryVar = this.a.c;
            if (bkryVar != null) {
                ((blod) bkryVar).a.l(this.b);
            }
            this.b = false;
        }
    }
}
