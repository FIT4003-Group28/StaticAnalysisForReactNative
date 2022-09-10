package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqee  reason: default package */
/* loaded from: classes2.dex */
public final class aqee implements View.OnAttachStateChangeListener {
    final /* synthetic */ aqeg a;

    public aqee(aqeg aqegVar) {
        this.a = aqegVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [V extends android.view.View & cuvv<P>, android.view.View] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        aqeg aqegVar = this.a;
        ?? e = cqkx.e(view, aqegVar.b, aqegVar.c);
        aqeg aqegVar2 = this.a;
        if (aqegVar2.h != e) {
            aqegVar2.h = e;
            aqegVar2.b();
            this.a.c();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        P p = this.a.g;
        if (p != 0) {
            p.A();
            P p2 = this.a.g;
            dbsk.s(p2);
            p2.B();
        }
        aqeg aqegVar = this.a;
        aqegVar.h = null;
        aqegVar.g = null;
    }
}
