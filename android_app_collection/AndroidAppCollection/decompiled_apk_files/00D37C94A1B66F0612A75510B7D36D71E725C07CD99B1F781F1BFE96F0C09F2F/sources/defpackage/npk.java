package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: npk  reason: default package */
/* loaded from: classes3.dex */
final class npk implements View.OnAttachStateChangeListener {
    final /* synthetic */ npm a;

    public npk(npm npmVar) {
        this.a = npmVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        npm npmVar = this.a;
        npmVar.q = true;
        npmVar.i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        npm npmVar = this.a;
        npmVar.q = false;
        npmVar.o = true;
    }
}
