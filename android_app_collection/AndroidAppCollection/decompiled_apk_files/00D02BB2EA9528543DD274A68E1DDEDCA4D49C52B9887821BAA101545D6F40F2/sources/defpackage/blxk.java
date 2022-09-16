package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: blxk  reason: default package */
/* loaded from: classes3.dex */
final class blxk implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ blxl b;

    public blxk(blxl blxlVar, View view) {
        this.b = blxlVar;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.b) {
            ((ViewGroup) this.a.getParent()).setAlpha(0.0f);
            ((ViewGroup) this.a.getParent()).animate().alpha(1.0f).setDuration(160L).start();
        }
    }
}
