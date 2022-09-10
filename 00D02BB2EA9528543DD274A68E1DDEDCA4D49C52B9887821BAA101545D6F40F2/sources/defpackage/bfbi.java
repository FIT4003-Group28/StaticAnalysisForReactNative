package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfbi  reason: default package */
/* loaded from: classes3.dex */
public final class bfbi implements View.OnAttachStateChangeListener {
    public boolean a = false;
    final /* synthetic */ bfbj b;

    public bfbi(bfbj bfbjVar) {
        this.b = bfbjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a = true;
        this.b.a.n();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a = false;
    }
}
