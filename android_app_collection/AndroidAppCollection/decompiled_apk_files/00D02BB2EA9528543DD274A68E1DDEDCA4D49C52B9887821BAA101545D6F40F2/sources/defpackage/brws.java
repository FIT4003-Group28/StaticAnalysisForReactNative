package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: brws  reason: default package */
/* loaded from: classes4.dex */
final class brws implements View.OnAttachStateChangeListener {
    final /* synthetic */ brwu a;

    public brws(brwu brwuVar) {
        this.a = brwuVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.setAccessibilityDelegate(this.a.d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.setAccessibilityDelegate(null);
    }
}
