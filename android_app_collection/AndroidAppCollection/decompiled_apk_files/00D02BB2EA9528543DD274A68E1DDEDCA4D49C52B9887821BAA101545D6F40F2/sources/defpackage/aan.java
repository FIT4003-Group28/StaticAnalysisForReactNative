package defpackage;

import android.widget.AbsListView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aan  reason: default package */
/* loaded from: classes2.dex */
public final class aan implements AbsListView.OnScrollListener {
    final /* synthetic */ aaq a;

    public aan(aaq aaqVar) {
        this.a = aaqVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 1 || this.a.u() || this.a.q.getContentView() == null) {
            return;
        }
        aaq aaqVar = this.a;
        aaqVar.o.removeCallbacks(aaqVar.n);
        this.a.n.run();
    }
}
