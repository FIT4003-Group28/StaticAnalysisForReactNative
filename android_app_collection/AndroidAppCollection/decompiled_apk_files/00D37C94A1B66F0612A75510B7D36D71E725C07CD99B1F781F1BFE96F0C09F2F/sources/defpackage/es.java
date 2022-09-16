package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: es  reason: default package */
/* loaded from: classes3.dex */
public final class es implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;

    public es(View view) {
        this.a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        lj.K(this.a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
