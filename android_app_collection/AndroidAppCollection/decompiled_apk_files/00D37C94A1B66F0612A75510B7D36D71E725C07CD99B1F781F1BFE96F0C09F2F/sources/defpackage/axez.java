package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: axez  reason: default package */
/* loaded from: classes2.dex */
public final class axez implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ axfc b;
    private final /* synthetic */ int c;

    public axez(axfc axfcVar, boolean z) {
        this.b = axfcVar;
        this.a = z;
    }

    public axez(axfc axfcVar, boolean z, int i) {
        this.c = i;
        this.b = axfcVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.b.b.setVisibility(axfc.a(this.a));
        } else if (i == 1) {
            if (!this.a && this.b.h == null) {
                return;
            }
            this.b.b().setVisibility(axfc.a(this.a));
        } else {
            this.b.d.setVisibility(axfc.a(this.a));
            View view = this.b.c;
            if (view == null) {
                return;
            }
            view.setVisibility(axfc.a(this.a));
        }
    }
}
