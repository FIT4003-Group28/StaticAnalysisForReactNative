package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: abkk  reason: default package */
/* loaded from: classes.dex */
final class abkk implements View.OnAttachStateChangeListener {
    @dzsi
    private final eif a = new eif();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.b(view);
    }
}
