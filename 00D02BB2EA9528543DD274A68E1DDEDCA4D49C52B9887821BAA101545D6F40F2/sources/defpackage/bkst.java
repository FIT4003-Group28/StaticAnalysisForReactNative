package defpackage;

import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bkst  reason: default package */
/* loaded from: classes3.dex */
public final class bkst implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ViewTreeObserver a;
    final /* synthetic */ bksv b;

    public bkst(bksv bksvVar, ViewTreeObserver viewTreeObserver) {
        this.b = bksvVar;
        this.a = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.d.c();
        this.a.removeOnPreDrawListener(this);
        bksv bksvVar = this.b;
        bksvVar.b.a(bksvVar.e, null);
        return true;
    }
}
