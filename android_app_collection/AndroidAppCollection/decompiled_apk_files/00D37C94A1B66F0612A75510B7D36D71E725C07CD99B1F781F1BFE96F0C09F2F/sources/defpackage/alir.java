package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: alir  reason: default package */
/* loaded from: classes.dex */
public class alir extends aliu {
    private Runnable a;
    private boolean b;
    OverScroller c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;

    public alir() {
        this.d = -1;
        this.f = -1;
    }

    public final int A(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return w(coordinatorLayout, view, v() - i, i2, i3);
    }

    public final void B(CoordinatorLayout coordinatorLayout, View view, int i) {
        w(coordinatorLayout, view, i, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, Integer.MAX_VALUE);
    }

    @Override // defpackage.ajc
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.b) {
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
            boolean z = y(view) && coordinatorLayout.m(view, x, y2);
            this.b = z;
            if (z) {
                this.e = y2;
                this.d = motionEvent.getPointerId(0);
                if (this.g == null) {
                    this.g = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.c;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.c.abortAnimation();
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
    @Override // defpackage.ajc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout r20, android.view.View r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alir.m(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public int t(View view) {
        throw null;
    }

    public int u(View view) {
        throw null;
    }

    public int v() {
        throw null;
    }

    public int w(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    public boolean y(View view) {
        throw null;
    }

    public alir(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = -1;
    }
}
