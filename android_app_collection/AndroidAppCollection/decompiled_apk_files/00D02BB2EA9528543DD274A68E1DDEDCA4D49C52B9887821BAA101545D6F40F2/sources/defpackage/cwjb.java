package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwjb  reason: default package */
/* loaded from: classes5.dex */
public final class cwjb implements View.OnAttachStateChangeListener {
    final /* synthetic */ RecyclerView a;
    final /* synthetic */ abg b;

    public cwjb(RecyclerView recyclerView, abg abgVar) {
        this.a = recyclerView;
        this.b = abgVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.setAdapter(this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.setAdapter(null);
    }
}
