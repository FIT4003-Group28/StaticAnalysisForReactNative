package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: axfa  reason: default package */
/* loaded from: classes2.dex */
public final class axfa implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ axfc b;
    private final /* synthetic */ int c;

    public axfa(axfc axfcVar, Runnable runnable) {
        this.b = axfcVar;
        this.a = runnable;
    }

    public axfa(axfc axfcVar, Runnable runnable, int i) {
        this.c = i;
        this.b = axfcVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            if (this.a == null && this.b.h == null) {
                return;
            }
            this.b.b().c = this.a;
            return;
        }
        boolean z = this.a != null;
        this.b.f.setVisibility(axfc.a(z));
        View view = this.b.e;
        if (view != null) {
            view.setVisibility(axfc.a(z));
        }
        axeu axeuVar = this.b.h;
        if (axeuVar == null) {
            return;
        }
        axeuVar.b(this.a);
    }
}
