package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: kbs  reason: default package */
/* loaded from: classes3.dex */
public final class kbs implements View.OnAttachStateChangeListener {
    final /* synthetic */ kbu a;

    public kbs(kbu kbuVar) {
        this.a = kbuVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.c(null);
        this.a.d(false);
    }
}
