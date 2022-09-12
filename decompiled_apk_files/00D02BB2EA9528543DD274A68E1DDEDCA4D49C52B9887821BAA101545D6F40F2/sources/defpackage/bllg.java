package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bllg  reason: default package */
/* loaded from: classes3.dex */
public final class bllg implements View.OnAttachStateChangeListener {
    final /* synthetic */ bllh a;

    public bllg(bllh bllhVar) {
        this.a = bllhVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a.c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
