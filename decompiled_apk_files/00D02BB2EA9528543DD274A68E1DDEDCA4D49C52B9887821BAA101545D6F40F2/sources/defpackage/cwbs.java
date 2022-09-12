package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cwbs  reason: default package */
/* loaded from: classes5.dex */
final class cwbs implements View.OnAttachStateChangeListener {
    final /* synthetic */ cwbt a;
    private m b;

    public cwbs(cwbt cwbtVar) {
        this.a = cwbtVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        m a = cwio.a(view);
        this.b = a;
        this.a.d(a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.e(this.b);
    }
}
