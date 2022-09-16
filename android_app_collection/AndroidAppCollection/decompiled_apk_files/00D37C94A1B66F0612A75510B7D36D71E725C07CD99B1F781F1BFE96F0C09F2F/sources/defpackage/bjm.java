package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: bjm  reason: default package */
/* loaded from: classes2.dex */
final class bjm implements Runnable {
    final /* synthetic */ bjr a;

    public bjm(bjr bjrVar) {
        this.a = bjrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a.b;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
