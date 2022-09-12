package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: vhm  reason: default package */
/* loaded from: classes7.dex */
final class vhm implements View.OnAttachStateChangeListener {
    final /* synthetic */ vho a;

    public vhm(vho vhoVar) {
        this.a = vhoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a.a(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a.b(view);
    }
}
