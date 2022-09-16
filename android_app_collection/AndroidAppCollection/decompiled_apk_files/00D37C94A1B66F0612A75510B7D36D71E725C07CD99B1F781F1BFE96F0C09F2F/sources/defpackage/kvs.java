package defpackage;

import android.widget.AbsListView;
/* compiled from: PG */
/* renamed from: kvs  reason: default package */
/* loaded from: classes3.dex */
final class kvs implements AbsListView.OnScrollListener {
    final /* synthetic */ kvz a;

    public kvs(kvz kvzVar) {
        this.a = kvzVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        kvz kvzVar = this.a;
        kvzVar.aK = Math.max(kvzVar.aK, kvzVar.aI.getLastVisiblePosition());
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            zag.i(this.a.aH);
        }
    }
}
