package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: actq  reason: default package */
/* loaded from: classes2.dex */
final class actq implements View.OnAttachStateChangeListener {
    final /* synthetic */ acts a;

    public actq(acts actsVar) {
        this.a = actsVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.setOnTouchListener(this.a.A());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.setOnTouchListener(null);
    }
}
