package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bdum  reason: default package */
/* loaded from: classes3.dex */
final class bdum implements View.OnAttachStateChangeListener {
    final /* synthetic */ bdun a;

    public bdum(bdun bdunVar) {
        this.a = bdunVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.e = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
