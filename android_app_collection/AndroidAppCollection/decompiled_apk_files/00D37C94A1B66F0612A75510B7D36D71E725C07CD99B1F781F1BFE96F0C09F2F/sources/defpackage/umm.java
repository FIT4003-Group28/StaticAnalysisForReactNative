package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: umm  reason: default package */
/* loaded from: classes4.dex */
public final class umm implements View.OnAttachStateChangeListener {
    final /* synthetic */ RecyclerView a;
    final /* synthetic */ xo b;

    public umm(RecyclerView recyclerView, xo xoVar) {
        this.a = recyclerView;
        this.b = xoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.ad(this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.ad(null);
    }
}
