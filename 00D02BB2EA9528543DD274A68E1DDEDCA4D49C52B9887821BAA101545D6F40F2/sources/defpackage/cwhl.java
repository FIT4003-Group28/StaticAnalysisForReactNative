package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cwhl  reason: default package */
/* loaded from: classes5.dex */
final class cwhl implements View.OnAttachStateChangeListener {
    final /* synthetic */ cvzg a;
    final /* synthetic */ cvur b;
    final /* synthetic */ cwhp c;

    public cwhl(cwhp cwhpVar, cvzg cvzgVar, cvur cvurVar) {
        this.c = cwhpVar;
        this.a = cvzgVar;
        this.b = cvurVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.i(this.c.n);
        this.c.n.a(this.a.e());
        this.c.b.c.i(this.b);
        this.b.a();
        cwhp cwhpVar = this.c;
        if (!cwhpVar.h) {
            cwee cweeVar = cwhpVar.i;
            cwio.a(view);
            cweeVar.b();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.k(this.c.n);
        this.c.b.c.j(this.b);
    }
}
