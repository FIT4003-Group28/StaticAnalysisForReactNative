package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cplv  reason: default package */
/* loaded from: classes5.dex */
final class cplv implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ int a;
    final /* synthetic */ ViewTreeObserver b;
    final /* synthetic */ cplw c;

    public cplv(cplw cplwVar, int i, ViewTreeObserver viewTreeObserver) {
        this.c = cplwVar;
        this.a = i;
        this.b = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        cplw cplwVar = this.c;
        int scrollX = cplwVar.ag.getScrollX();
        int i = this.a;
        if (cplwVar.f()) {
            if (scrollX < i) {
                return;
            }
        } else if (scrollX > i) {
            return;
        }
        this.b.removeOnScrollChangedListener(this);
        cplw cplwVar2 = this.c;
        cplwVar2.ae.removeViewAt(cplwVar2.ai);
    }
}
