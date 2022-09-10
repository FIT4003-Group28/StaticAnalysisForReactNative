package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bksu  reason: default package */
/* loaded from: classes3.dex */
public final class bksu implements View.OnAttachStateChangeListener {
    final /* synthetic */ bksv a;

    public bksu(bksv bksvVar) {
        this.a = bksvVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.d.c();
        bksv bksvVar = this.a;
        bksvVar.b.a(bksvVar.e, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
