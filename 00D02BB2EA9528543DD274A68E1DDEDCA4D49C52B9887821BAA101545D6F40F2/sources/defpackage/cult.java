package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cult  reason: default package */
/* loaded from: classes5.dex */
final class cult implements View.OnAttachStateChangeListener {
    final /* synthetic */ culw a;

    public cult(culw culwVar) {
        this.a = culwVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.c();
        culw culwVar = this.a;
        culwVar.g(culwVar.a.d());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.f();
    }
}
