package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: acmz  reason: default package */
/* loaded from: classes2.dex */
final class acmz implements View.OnAttachStateChangeListener {
    final /* synthetic */ acmy a;
    final /* synthetic */ cpny b;

    public acmz(acmy acmyVar, cpny cpnyVar) {
        this.a = acmyVar;
        this.b = cpnyVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        acnd.c(this.a, this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        acnd.d(this.b, this.a);
    }
}
