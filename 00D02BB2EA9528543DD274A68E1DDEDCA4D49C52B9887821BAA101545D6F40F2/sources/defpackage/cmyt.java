package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cmyt  reason: default package */
/* loaded from: classes5.dex */
final class cmyt implements ViewTreeObserver.OnTouchModeChangeListener {
    final /* synthetic */ cmyy a;

    public cmyt(cmyy cmyyVar) {
        this.a = cmyyVar;
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        int i = cnjc.a;
        cmyy cmyyVar = this.a;
        if (cmyyVar.i) {
            boolean z2 = cmyyVar.k;
            if (z != z2) {
                cmyyVar.n(cmyyVar.j, z2);
            } else if (!cmyyVar.t) {
            } else {
                cmyyVar.r(cmyyVar.c().getDecorView());
            }
        }
    }
}
