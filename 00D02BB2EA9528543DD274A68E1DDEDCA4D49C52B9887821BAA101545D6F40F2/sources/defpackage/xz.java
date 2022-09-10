package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: xz  reason: default package */
/* loaded from: classes7.dex */
final class xz implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ yb a;

    public xz(yb ybVar) {
        this.a = ybVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        yb ybVar = this.a;
        ye yeVar = ybVar.d;
        if (!od.ak(yeVar) || !yeVar.getGlobalVisibleRect(ybVar.c)) {
            this.a.k();
            return;
        }
        this.a.n();
        super/*aaq*/.MY();
    }
}
