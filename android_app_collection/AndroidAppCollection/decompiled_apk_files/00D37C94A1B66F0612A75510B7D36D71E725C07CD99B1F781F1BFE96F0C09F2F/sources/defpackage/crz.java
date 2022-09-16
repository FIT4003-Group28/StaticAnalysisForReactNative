package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: crz  reason: default package */
/* loaded from: classes3.dex */
final class crz implements Runnable {
    final /* synthetic */ ViewTreeObserver.OnDrawListener a;
    final /* synthetic */ csa b;

    public crz(csa csaVar, ViewTreeObserver.OnDrawListener onDrawListener) {
        this.b = csaVar;
        this.a = onDrawListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cpq.a().b();
        this.b.b.b = true;
        View view = this.b.a;
        view.getViewTreeObserver().removeOnDrawListener(this.a);
        this.b.b.a.clear();
    }
}
