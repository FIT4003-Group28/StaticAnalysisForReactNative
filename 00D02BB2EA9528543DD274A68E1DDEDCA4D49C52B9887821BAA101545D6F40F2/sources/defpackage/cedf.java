package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cedf  reason: default package */
/* loaded from: classes4.dex */
final class cedf implements View.OnAttachStateChangeListener {
    final /* synthetic */ cedh a;

    public cedf(cedh cedhVar) {
        this.a = cedhVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.c.c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
