package defpackage;

import android.widget.AbsListView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wu  reason: default package */
/* loaded from: classes4.dex */
public final class wu implements AbsListView.OnScrollListener {
    final /* synthetic */ ww a;

    public wu(ww wwVar) {
        this.a = wwVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 1 || this.a.x() || this.a.p.getContentView() == null) {
            return;
        }
        ww wwVar = this.a;
        wwVar.n.removeCallbacks(wwVar.q);
        this.a.q.run();
    }
}
