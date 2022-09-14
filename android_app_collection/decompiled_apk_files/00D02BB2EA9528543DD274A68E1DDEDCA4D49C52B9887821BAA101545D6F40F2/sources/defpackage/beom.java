package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: beom  reason: default package */
/* loaded from: classes3.dex */
public final class beom implements View.OnAttachStateChangeListener {
    final /* synthetic */ beoq a;

    public beom(beoq beoqVar) {
        this.a = beoqVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        beoq beoqVar = this.a;
        if (!beoqVar.f || beoqVar.h) {
            return;
        }
        beoqVar.h = true;
        beoqVar.g = beoqVar.c;
        cqkx.p(beoqVar);
    }
}
