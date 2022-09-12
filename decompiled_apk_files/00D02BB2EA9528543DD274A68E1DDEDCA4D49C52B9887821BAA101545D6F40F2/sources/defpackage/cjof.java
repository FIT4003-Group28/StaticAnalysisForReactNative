package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cjof  reason: default package */
/* loaded from: classes4.dex */
final class cjof implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ RecyclerView a;

    public cjof(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.n(0);
    }
}
