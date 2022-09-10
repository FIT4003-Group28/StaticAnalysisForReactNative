package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: aui  reason: default package */
/* loaded from: classes2.dex */
final class aui implements Runnable {
    final /* synthetic */ aup a;

    public aui(aup aupVar) {
        this.a = aupVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a.c;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
