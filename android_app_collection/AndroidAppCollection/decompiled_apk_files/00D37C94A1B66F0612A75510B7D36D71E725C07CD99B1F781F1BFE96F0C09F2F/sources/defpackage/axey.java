package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axey  reason: default package */
/* loaded from: classes2.dex */
public final class axey implements View.OnClickListener {
    final /* synthetic */ axfc a;
    private final /* synthetic */ int b;

    public axey(axfc axfcVar) {
        this.a = axfcVar;
    }

    public axey(axfc axfcVar, int i) {
        this.b = i;
        this.a = axfcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            Runnable runnable = this.a.m;
            Runnable runnable2 = this.a.k;
            if (runnable2 != null) {
                runnable2.run();
            } else if (runnable == null) {
            } else {
                runnable.run();
            }
        } else if (i == 1) {
            Runnable runnable3 = this.a.k;
            if (runnable3 == null) {
                return;
            }
            runnable3.run();
        } else if (i == 2) {
            Runnable runnable4 = this.a.k;
            if (runnable4 == null) {
                return;
            }
            runnable4.run();
        } else {
            Runnable runnable5 = this.a.l;
            Runnable runnable6 = this.a.k;
            if (runnable6 != null) {
                runnable6.run();
            } else if (runnable5 == null) {
            } else {
                runnable5.run();
            }
        }
    }
}
