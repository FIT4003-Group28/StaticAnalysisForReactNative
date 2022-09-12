package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: xyn  reason: default package */
/* loaded from: classes7.dex */
final class xyn implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        xyp.c.a(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        xyp.c.b(view);
    }
}
