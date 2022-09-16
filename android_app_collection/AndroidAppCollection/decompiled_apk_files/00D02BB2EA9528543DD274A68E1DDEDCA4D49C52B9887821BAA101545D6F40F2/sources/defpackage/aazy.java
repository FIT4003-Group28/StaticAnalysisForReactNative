package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aazy  reason: default package */
/* loaded from: classes2.dex */
final class aazy implements View.OnAttachStateChangeListener {
    final /* synthetic */ aazz a;

    public aazy(aazz aazzVar) {
        this.a = aazzVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a.d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a.e();
    }
}
