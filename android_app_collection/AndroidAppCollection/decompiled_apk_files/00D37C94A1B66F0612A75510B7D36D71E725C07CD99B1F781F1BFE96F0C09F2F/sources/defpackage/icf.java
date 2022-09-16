package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: icf  reason: default package */
/* loaded from: classes3.dex */
final class icf implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ ViewTreeObserver c;
    final /* synthetic */ ico d;

    public icf(ico icoVar, int i, int i2, ViewTreeObserver viewTreeObserver) {
        this.d = icoVar;
        this.a = i;
        this.b = i2;
        this.c = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a == this.d.bh.getWidth() && this.b == this.d.bh.getHeight()) {
            return;
        }
        if (this.c.isAlive()) {
            this.c.removeOnGlobalLayoutListener(this);
        }
        this.d.c.notifyObservers();
    }
}
