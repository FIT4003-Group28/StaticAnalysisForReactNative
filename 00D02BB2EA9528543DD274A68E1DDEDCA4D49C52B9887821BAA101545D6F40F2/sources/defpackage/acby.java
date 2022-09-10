package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: acby  reason: default package */
/* loaded from: classes2.dex */
public final class acby implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ RecyclerView a;

    public acby(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a.n(0);
    }
}
