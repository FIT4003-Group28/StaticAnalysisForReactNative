package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
/* compiled from: PG */
/* renamed from: bsoq  reason: default package */
/* loaded from: classes4.dex */
public final class bsoq extends ExpandingScrollView {
    public int C;
    int D;
    int E;
    private final Context F;
    private final int G;
    private final boolean H;

    public bsoq(Context context, int i, int i2, int i3, boolean z) {
        super(context);
        this.F = context;
        this.C = i;
        this.D = jmj.a(context, i2);
        this.E = jmj.a(context, i3);
        this.G = cqrp.d((true != z ? 0 : 10) + 80).e(context);
        this.H = z;
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, defpackage.jkj
    public final int C(jjn jjnVar) {
        return jjnVar == jjn.COLLAPSED ? this.C == 2 ? this.E : this.D : jjnVar == jjn.HIDDEN ? this.G : super.C(jjnVar);
    }

    public final void Y(int i, int i2) {
        this.D = jmj.a(this.F, i);
        this.E = jmj.a(this.F, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Z(boolean z) {
        jkc jkcVar;
        if (z) {
            jkcVar = jkc.g;
        } else {
            jkcVar = jkc.h;
        }
        setExpandingStateTransition(jkcVar, jkc.h);
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, defpackage.jet, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (u(motionEvent)) {
            View view = this.n;
            if (this.s != 5) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                float f = iArr[0] - iArr2[0];
                float f2 = iArr[1] - iArr2[1];
                motionEvent.offsetLocation(f, f2);
                boolean dispatchTouchEvent = onTouchEvent | view.dispatchTouchEvent(motionEvent);
                motionEvent.offsetLocation(-f, -f2);
                return dispatchTouchEvent;
            }
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            obtainNoHistory.setAction(3);
            view.dispatchTouchEvent(obtainNoHistory);
            obtainNoHistory.recycle();
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView
    protected final void p() {
        q();
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, defpackage.jet
    protected final void x(float f) {
        y(f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView
    public final void y(float f) {
        jjn jjnVar = this.f;
        if (!this.H || jjnVar != jjn.COLLAPSED || Math.abs(f) >= ((ExpandingScrollView) this).a || getScrollY() <= C(jjnVar)) {
            super.y(f);
            return;
        }
        jjn jjnVar2 = jjn.EXPANDED;
        int C = C(jjnVar);
        if ((getScrollY() - C) / (C(jjnVar2) - C) > 0.33f) {
            jjnVar = jjnVar2;
        }
        B(jjnVar);
    }
}
