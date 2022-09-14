package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aqir  reason: default package */
/* loaded from: classes2.dex */
final class aqir implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestLayout();
        view.invalidate();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
