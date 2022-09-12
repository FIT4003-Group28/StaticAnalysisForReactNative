package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: aba  reason: default package */
/* loaded from: classes.dex */
public final class aba implements Runnable {
    final /* synthetic */ RecyclerView a;

    public aba(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a;
        if (!recyclerView.r || recyclerView.isLayoutRequested()) {
            return;
        }
        RecyclerView recyclerView2 = this.a;
        if (!recyclerView2.p) {
            recyclerView2.requestLayout();
        } else if (recyclerView2.t) {
            recyclerView2.s = true;
        } else {
            recyclerView2.p();
        }
    }
}
