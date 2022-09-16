package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nvn  reason: default package */
/* loaded from: classes3.dex */
public final class nvn implements View.OnAttachStateChangeListener {
    final /* synthetic */ nvo a;

    public nvn(nvo nvoVar) {
        this.a = nvoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a();
    }
}
