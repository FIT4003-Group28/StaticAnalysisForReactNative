package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: blxj  reason: default package */
/* loaded from: classes3.dex */
final class blxj implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ blxl b;

    public blxj(blxl blxlVar, View view) {
        this.b = blxlVar;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f = 0.0f;
        if (this.b.c) {
            ((ViewGroup) this.a.getParent()).setAlpha(1.0f);
            ((ViewGroup) this.a.getParent()).animate().alpha(0.0f).setDuration(160L).start();
            blxo.U(this.b.e);
        }
        if (this.b.d) {
            this.a.animate().scaleX(0.0f);
            blxo.U(this.b.e);
        }
        View view = this.a;
        if (view.getRootView().getLayoutDirection() != 0) {
            f = this.a.getWidth();
        }
        view.setPivotX(f);
    }
}
