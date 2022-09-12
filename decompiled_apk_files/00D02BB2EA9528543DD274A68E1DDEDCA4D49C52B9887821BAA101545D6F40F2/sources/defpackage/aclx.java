package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aclx  reason: default package */
/* loaded from: classes2.dex */
final class aclx implements View.OnAttachStateChangeListener {
    final /* synthetic */ View.OnTouchListener a;

    public aclx(View.OnTouchListener onTouchListener) {
        this.a = onTouchListener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.setOnTouchListener(this.a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.setOnTouchListener(null);
    }
}
