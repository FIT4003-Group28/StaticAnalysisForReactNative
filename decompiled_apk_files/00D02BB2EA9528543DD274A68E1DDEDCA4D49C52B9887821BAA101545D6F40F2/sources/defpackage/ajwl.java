package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ajwl  reason: default package */
/* loaded from: classes2.dex */
final class ajwl implements View.OnAttachStateChangeListener {
    private final eif a = new eif();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.b(view);
    }
}
