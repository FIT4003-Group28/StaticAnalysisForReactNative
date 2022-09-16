package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cqfh  reason: default package */
/* loaded from: classes.dex */
final class cqfh implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestFocus();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.clearFocus();
    }
}
