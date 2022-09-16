package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ssj  reason: default package */
/* loaded from: classes4.dex */
final class ssj implements View.OnAttachStateChangeListener {
    final /* synthetic */ awqe a;
    final /* synthetic */ ssl b;

    public ssj(ssl sslVar, awqe awqeVar) {
        this.b = sslVar;
        this.a = awqeVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        synchronized (this.b.e) {
            this.b.a(this.a.d);
            this.b.a.remove(this.a.d);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
