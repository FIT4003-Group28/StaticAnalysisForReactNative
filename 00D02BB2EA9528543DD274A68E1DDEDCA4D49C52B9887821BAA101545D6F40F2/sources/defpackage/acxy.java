package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acxy  reason: default package */
/* loaded from: classes.dex */
public final class acxy implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ acyf a;

    public acxy(acyf acyfVar) {
        this.a = acyfVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View o;
        if (this.a.J() == null) {
            return;
        }
        aegc h = this.a.h();
        if (this.a.g()) {
            o = this.a.i();
        } else {
            o = h == null ? null : h.o();
        }
        if (o == null) {
            return;
        }
        o.post(new Runnable(this, o) { // from class: acxx
            private final acxy a;
            private final View b;

            {
                this.a = this;
                this.b = o;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserver viewTreeObserver;
                acxy acxyVar = this.a;
                View view = this.b;
                acyf acyfVar = acxyVar.a;
                if (!acyfVar.aq.h(acyfVar.bp) || (viewTreeObserver = view.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.removeOnDrawListener(acxyVar);
            }
        });
    }
}
