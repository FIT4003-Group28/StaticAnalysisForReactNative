package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: allk  reason: default package */
/* loaded from: classes.dex */
public final class allk implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        lj.K(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
