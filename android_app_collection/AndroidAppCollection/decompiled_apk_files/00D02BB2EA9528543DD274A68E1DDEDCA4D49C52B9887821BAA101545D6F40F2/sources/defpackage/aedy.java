package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aedy  reason: default package */
/* loaded from: classes.dex */
final class aedy implements View.OnAttachStateChangeListener {
    final /* synthetic */ aeea a;

    public aedy(aeea aeeaVar) {
        this.a = aeeaVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        aeea aeeaVar = this.a;
        if (aeeaVar.h != null) {
            return;
        }
        aeeaVar.h = new aedz(aeeaVar);
        aeeaVar.i.b.z(aeeaVar.h);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aeea aeeaVar = this.a;
        cjqv cjqvVar = aeeaVar.h;
        if (cjqvVar != null) {
            aeeaVar.i.b.A(cjqvVar);
            this.a.h = null;
        }
    }
}
