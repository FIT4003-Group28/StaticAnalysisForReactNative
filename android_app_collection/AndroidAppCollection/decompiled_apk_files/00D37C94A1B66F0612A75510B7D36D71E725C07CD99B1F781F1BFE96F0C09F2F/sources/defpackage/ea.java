package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ea  reason: default package */
/* loaded from: classes3.dex */
public final class ea implements View.OnAttachStateChangeListener {
    final /* synthetic */ et a;
    final /* synthetic */ eb b;

    public ea(eb ebVar, et etVar) {
        this.b = ebVar;
        this.a = etVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        et etVar = this.a;
        dp dpVar = etVar.b;
        etVar.e();
        fy.b((ViewGroup) dpVar.O.getParent(), this.b.a).c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
