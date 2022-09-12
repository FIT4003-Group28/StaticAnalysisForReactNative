package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cgk  reason: default package */
/* loaded from: classes4.dex */
final class cgk implements Runnable {
    final /* synthetic */ ViewTreeObserver.OnDrawListener a;
    final /* synthetic */ cgl b;

    public cgk(cgl cglVar, ViewTreeObserver.OnDrawListener onDrawListener) {
        this.b = cglVar;
        this.a = onDrawListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cdr.a().c();
        this.b.b.b = true;
        View view = this.b.a;
        view.getViewTreeObserver().removeOnDrawListener(this.a);
        this.b.b.a.clear();
    }
}
