package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvia  reason: default package */
/* loaded from: classes4.dex */
public final class bvia implements View.OnAttachStateChangeListener {
    final /* synthetic */ bvip a;

    public bvia(bvip bvipVar) {
        this.a = bvipVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        bvip bvipVar = this.a;
        bvipVar.g = true;
        bvipVar.e.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.e.c();
        this.a.g = false;
    }
}
