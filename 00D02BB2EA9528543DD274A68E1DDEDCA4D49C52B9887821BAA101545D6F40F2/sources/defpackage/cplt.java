package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cplt  reason: default package */
/* loaded from: classes5.dex */
final class cplt implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ViewTreeObserver a;
    final /* synthetic */ cplw b;

    public cplt(cplw cplwVar, ViewTreeObserver viewTreeObserver) {
        this.b = cplwVar;
        this.a = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.removeOnGlobalLayoutListener(this);
        if (this.b.f()) {
            cplw cplwVar = this.b;
            cplwVar.ag.setScrollX(cplwVar.e());
        }
        cplw cplwVar2 = this.b;
        cplwVar2.ag.smoothScrollBy(cplwVar2.g(), 0);
    }
}
