package defpackage;

import android.view.View;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
/* compiled from: PG */
/* renamed from: unq  reason: default package */
/* loaded from: classes4.dex */
final class unq implements View.OnAttachStateChangeListener {
    final /* synthetic */ uoc a;
    final /* synthetic */ ujw b;
    final /* synthetic */ ExpressSignInLayout c;

    public unq(ExpressSignInLayout expressSignInLayout, uoc uocVar, ujw ujwVar) {
        this.c = expressSignInLayout;
        this.a = uocVar;
        this.b = ujwVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.b.b(this.c.r);
        if (this.a.b.d) {
            this.c.g(false);
            this.c.r.b(this.a.b.a());
        }
        this.c.h.i.c(this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.b.c(this.c.r);
        this.c.h.i.d(this.b);
    }
}
