package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hqr  reason: default package */
/* loaded from: classes3.dex */
final class hqr implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
