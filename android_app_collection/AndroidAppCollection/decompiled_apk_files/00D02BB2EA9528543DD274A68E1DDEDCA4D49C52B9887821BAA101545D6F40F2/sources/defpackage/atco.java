package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
/* compiled from: PG */
/* renamed from: atco  reason: default package */
/* loaded from: classes2.dex */
public final class atco extends ExpandingScrollView {
    private final cjmt C;
    private final Context D;
    private final boolean E;
    private final atlt F;

    public atco(Context context, cjmt cjmtVar, boolean z, atlt atltVar) {
        super(context);
        this.D = context;
        this.C = cjmtVar;
        this.E = z;
        this.F = atltVar;
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, defpackage.jkj
    public final int M() {
        int a;
        int g;
        int i = ((ExpandingScrollView) this).b;
        int i2 = 0;
        if (this.E) {
            if (btpf.c(this.D).f) {
                a = cqrp.d(8.0d).e(this.D);
                g = this.C.g();
            } else {
                a = (int) cqsg.d(atcp.j, cqrp.d(8.0d)).a(this.D);
                g = this.C.g();
            }
            i2 = g + a;
        }
        return i - i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.O(super.C(this.f));
        super.dispatchDraw(canvas);
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.E || !btpf.c(this.D).f) {
            return;
        }
        int i5 = (i4 - i2) / 2;
        int b = this.F.b();
        boolean b2 = bvox.b(this.D);
        int i6 = b2 ? i3 - b : 0;
        if (true != b2) {
            i3 = b;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            childAt.layout(getPaddingLeft() + i6, i5, i3 - getPaddingRight(), childAt.getMeasuredHeight() + i5);
        }
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, defpackage.jet, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int width;
        if (this.E) {
            if (this.m == null) {
                return false;
            }
            if (btpf.c(this.D).f) {
                width = this.F.b();
            } else {
                width = getWidth();
            }
            boolean b = bvox.b(this.D);
            int right = b ? getRight() - width : 0;
            if (b) {
                width = getRight();
            }
            if ((motionEvent.getX() <= right || motionEvent.getX() >= width) && motionEvent.getAction() == 0) {
                r(motionEvent);
                if (s(this.f) || getScrollY() > C(jjn.COLLAPSED)) {
                    t();
                }
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView
    public final boolean s(jjn jjnVar) {
        if (this.E) {
            return this.p && jjnVar.b();
        }
        return super.s(jjnVar);
    }

    @Override // com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView, defpackage.jke
    public void setTwoThirdsHeight(int i) {
    }
}
