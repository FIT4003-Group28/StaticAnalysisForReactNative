package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: abb  reason: default package */
/* loaded from: classes.dex */
public final class abb implements Runnable {
    final /* synthetic */ RecyclerView a;

    public abb(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abn abnVar = this.a.C;
        if (abnVar != null) {
            abnVar.a();
        }
        this.a.M = false;
    }
}
