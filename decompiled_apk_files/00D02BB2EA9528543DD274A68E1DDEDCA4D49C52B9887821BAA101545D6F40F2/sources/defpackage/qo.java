package defpackage;

import android.view.View;
import android.widget.AbsListView;
/* compiled from: PG */
/* renamed from: qo  reason: default package */
/* loaded from: classes7.dex */
final class qo implements AbsListView.OnScrollListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;

    public qo(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        qw.e(absListView, this.a, this.b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
