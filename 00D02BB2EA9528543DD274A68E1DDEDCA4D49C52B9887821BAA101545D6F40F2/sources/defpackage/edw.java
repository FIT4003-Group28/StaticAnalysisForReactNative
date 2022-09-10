package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: edw  reason: default package */
/* loaded from: classes.dex */
final class edw implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ edx a;

    public edw(edx edxVar) {
        this.a = edxVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        try {
            View findViewById = this.a.findViewById(16908290);
            if (findViewById == null) {
                return true;
            }
            findViewById.getViewTreeObserver().removeOnPreDrawListener(this);
            this.a.aC.p(ckoh.d);
            this.a.aC.g(ckoh.k);
            return true;
        } catch (RuntimeException e) {
            this.a.aC.r(ckoh.d);
            bvoo.j(e);
            return true;
        }
    }
}
