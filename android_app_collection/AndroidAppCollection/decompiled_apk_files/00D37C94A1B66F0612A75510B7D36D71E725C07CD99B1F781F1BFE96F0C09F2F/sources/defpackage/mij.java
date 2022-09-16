package defpackage;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: mij  reason: default package */
/* loaded from: classes3.dex */
final class mij implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ float a;
    final /* synthetic */ mim b;

    public mij(mim mimVar, float f) {
        this.b = mimVar;
        this.a = f;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.d.getViewTreeObserver().removeOnPreDrawListener(this);
        int ceil = (int) Math.ceil(this.b.d.getMeasuredHeight() * this.a);
        zgd.u(this.b.p, new mfm(ceil, 3), zgd.s(ceil, -1), FrameLayout.LayoutParams.class);
        float measuredWidth = (this.b.d.getMeasuredWidth() - ceil) / 2.0f;
        if (lj.e(this.b.d) == 1) {
            measuredWidth = -measuredWidth;
        }
        this.b.p.setX(measuredWidth);
        return true;
    }
}
