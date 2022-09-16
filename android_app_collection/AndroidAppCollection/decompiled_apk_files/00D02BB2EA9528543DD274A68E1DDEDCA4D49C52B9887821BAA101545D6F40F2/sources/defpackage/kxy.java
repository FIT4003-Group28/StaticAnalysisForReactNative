package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kxy  reason: default package */
/* loaded from: classes7.dex */
final class kxy implements View.OnAttachStateChangeListener {
    final /* synthetic */ kya a;

    public kxy(kya kyaVar) {
        this.a = kyaVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.c(view.isLaidOut(), true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.c(view.isLaidOut(), false);
    }
}
