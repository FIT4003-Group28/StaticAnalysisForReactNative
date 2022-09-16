package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: atoo  reason: default package */
/* loaded from: classes2.dex */
final class atoo implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        cqkf<?> a = cqke.a(view);
        if (a != null) {
            a.e(null);
        }
    }
}
