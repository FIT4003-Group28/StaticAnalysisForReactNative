package defpackage;

import android.widget.AbsListView;
/* compiled from: PG */
/* renamed from: bsan  reason: default package */
/* loaded from: classes4.dex */
final class bsan implements AbsListView.OnScrollListener {
    final /* synthetic */ bsas a;

    public bsan(bsas bsasVar) {
        this.a = bsasVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.a.al.setVisibility(0);
        this.a.al.setAlpha(1.0f);
    }
}
