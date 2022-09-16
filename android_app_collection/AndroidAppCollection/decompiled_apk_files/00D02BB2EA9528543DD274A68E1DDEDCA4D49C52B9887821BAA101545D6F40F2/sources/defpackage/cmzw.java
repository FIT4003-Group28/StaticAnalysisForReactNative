package defpackage;

import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: cmzw  reason: default package */
/* loaded from: classes5.dex */
final class cmzw implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ cmzx a;

    public cmzw(cmzx cmzxVar) {
        this.a = cmzxVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.a.a.requestFocus()) {
            int i = cnjc.a;
            return true;
        }
        int i2 = cnjc.a;
        return true;
    }
}
