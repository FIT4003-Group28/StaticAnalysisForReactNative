package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mil  reason: default package */
/* loaded from: classes3.dex */
final class mil implements View.OnAttachStateChangeListener {
    final /* synthetic */ int a;
    final /* synthetic */ mim b;

    public mil(mim mimVar, int i) {
        this.b = mimVar;
        this.a = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.d.removeOnAttachStateChangeListener(this);
        this.b.d.measure(0, 0);
        this.b.o(this.a);
        this.b.d.requestLayout();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
