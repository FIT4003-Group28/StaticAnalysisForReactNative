package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bizc  reason: default package */
/* loaded from: classes3.dex */
final class bizc implements View.OnAttachStateChangeListener {
    final /* synthetic */ bizd a;

    public bizc(bizd bizdVar) {
        this.a = bizdVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (!this.a.k()) {
            return;
        }
        this.a.g = new bizb(this);
        bizd bizdVar = this.a;
        bizdVar.d.z(bizdVar.g);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        bizd bizdVar = this.a;
        cjqv cjqvVar = bizdVar.g;
        if (cjqvVar != null) {
            bizdVar.d.A(cjqvVar);
            this.a.g = null;
        }
    }
}
