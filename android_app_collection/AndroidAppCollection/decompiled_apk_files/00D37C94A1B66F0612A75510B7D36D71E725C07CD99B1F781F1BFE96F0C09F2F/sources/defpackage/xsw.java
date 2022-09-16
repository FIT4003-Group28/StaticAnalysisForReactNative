package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: xsw  reason: default package */
/* loaded from: classes4.dex */
final class xsw implements View.OnAttachStateChangeListener {
    final /* synthetic */ acti a;
    final /* synthetic */ byte[] b;

    public xsw(acti actiVar, byte[] bArr) {
        this.a = actiVar;
        this.b = bArr;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.u(new acte(this.b), null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
