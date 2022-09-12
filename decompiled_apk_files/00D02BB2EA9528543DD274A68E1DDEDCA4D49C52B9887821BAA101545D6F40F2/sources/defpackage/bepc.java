package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bepc  reason: default package */
/* loaded from: classes3.dex */
public final class bepc implements View.OnAttachStateChangeListener {
    final /* synthetic */ bepe a;

    public bepc(bepe bepeVar) {
        this.a = bepeVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.i = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.i = false;
    }
}
