package defpackage;

import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lvi  reason: default package */
/* loaded from: classes3.dex */
public final class lvi implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ViewTreeObserver a;
    final /* synthetic */ lvj b;

    public lvi(lvj lvjVar, ViewTreeObserver viewTreeObserver) {
        this.b = lvjVar;
        this.a = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.removeOnGlobalLayoutListener(this);
        this.b.l();
    }
}
