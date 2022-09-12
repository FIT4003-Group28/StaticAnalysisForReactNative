package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* renamed from: czvi  reason: default package */
/* loaded from: classes5.dex */
public class czvi<V extends View> extends czvl<V> {
    private Runnable a;
    OverScroller b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;

    public czvi() {
        this.d = -1;
        this.f = -1;
    }

    public final int A(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return x(coordinatorLayout, v, s() - i, i2, i3);
    }

    public final void B(CoordinatorLayout coordinatorLayout, V v, int i) {
        x(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // defpackage.aji
    public final boolean c(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.c) {
            int i = this.d;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.e) > this.f) {
                this.e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.d = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = v(v) && coordinatorLayout.m(v, x, y2);
            this.c = z;
            if (z) {
                this.e = y2;
                this.d = motionEvent.getPointerId(0);
                if (this.g == null) {
                    this.g = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.b;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.b.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[ADDED_TO_REGION] */
    @Override // defpackage.aji
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czvi.d(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public int s() {
        throw null;
    }

    public int t(V v) {
        throw null;
    }

    public int u(V v) {
        throw null;
    }

    public boolean v(V v) {
        throw null;
    }

    public void w(CoordinatorLayout coordinatorLayout, V v) {
        throw null;
    }

    public int x(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        throw null;
    }

    public czvi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = -1;
    }
}
