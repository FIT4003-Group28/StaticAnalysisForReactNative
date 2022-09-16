package defpackage;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
/* compiled from: PG */
/* renamed from: mdw  reason: default package */
/* loaded from: classes3.dex */
public final class mdw implements GestureDetector.OnGestureListener {
    final /* synthetic */ PivotBar a;
    private boolean b = false;
    private View c = null;

    public mdw(PivotBar pivotBar) {
        this.a = pivotBar;
    }

    private final void a() {
        View view = this.c;
        if (view != null) {
            view.setPressed(false);
            this.c = null;
        }
    }

    private final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return Math.abs(motionEvent.getY() - motionEvent2.getY()) > ((float) this.a.d);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        a();
        this.b = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        a();
        if (b(motionEvent, motionEvent2) || this.b) {
            if (!this.b) {
                this.a.f(motionEvent);
                this.b = true;
            }
            this.a.f(motionEvent2);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        throw new UnsupportedOperationException("Long presses not supported");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        a();
        if (b(motionEvent, motionEvent2) || this.b) {
            if (!this.b) {
                this.a.f(motionEvent);
                this.b = true;
            }
            this.a.f(motionEvent2);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        Point point = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        ezv.n(point, this.a);
        View k = ezv.k(this.a, point, jny.r);
        a();
        if (k != null) {
            k.setPressed(true);
            this.c = k;
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.b) {
            this.a.f(motionEvent);
            return true;
        }
        a();
        PivotBar pivotBar = this.a;
        Point point = new Point();
        point.set((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        ezv.n(point, pivotBar);
        View k = ezv.k(pivotBar, point, jny.q);
        if (k == null) {
            return true;
        }
        k.performClick();
        return true;
    }
}
