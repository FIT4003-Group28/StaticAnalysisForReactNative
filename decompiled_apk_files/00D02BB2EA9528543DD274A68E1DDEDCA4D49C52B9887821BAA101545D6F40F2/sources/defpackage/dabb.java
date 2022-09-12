package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: dabb  reason: default package */
/* loaded from: classes5.dex */
public final class dabb implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        od.L(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
