package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cwah  reason: default package */
/* loaded from: classes5.dex */
public final class cwah implements View.OnAttachStateChangeListener {
    final /* synthetic */ cvxj a;
    final /* synthetic */ cwai b;

    public cwah(cwai cwaiVar, cvxj cvxjVar) {
        this.b = cwaiVar;
        this.a = cvxjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.b.i(this.a);
        if (this.b.b.a) {
            this.a.b();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.b.k(this.a);
    }
}
