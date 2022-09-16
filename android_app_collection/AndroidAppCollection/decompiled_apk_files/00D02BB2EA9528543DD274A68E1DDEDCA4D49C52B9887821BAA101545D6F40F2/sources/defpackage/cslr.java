package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cslr  reason: default package */
/* loaded from: classes5.dex */
final class cslr implements View.OnAttachStateChangeListener {
    final /* synthetic */ csme a;

    public cslr(csme csmeVar) {
        this.a = csmeVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.h();
    }
}
