package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
/* compiled from: PG */
/* renamed from: clbb  reason: default package */
/* loaded from: classes5.dex */
final class clbb extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    final /* synthetic */ clbf a;

    public clbb(clbf clbfVar) {
        this.a = clbfVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.a.f == clbd.FIRST_TAP) {
            this.a.e(clbd.DOUBLE_TAP);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        clbe clbeVar;
        this.a.e(clbd.FLING);
        clbf clbfVar = this.a;
        if (!clbfVar.e || (clbeVar = clbfVar.b) == null) {
            return false;
        }
        clbeVar.onFling(motionEvent, motionEvent2, f, f2);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        clbe clbeVar;
        this.a.e(clbd.LONG_PRESS);
        clbf clbfVar = this.a;
        if (!clbfVar.e || (clbeVar = clbfVar.b) == null) {
            return;
        }
        clbeVar.onLongPress(motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        clbe clbeVar;
        clbf clbfVar = this.a;
        if (!clbfVar.e || (clbeVar = clbfVar.b) == null) {
            return true;
        }
        clbeVar.onScale(scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.a.e(clbd.ZOOM);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        clbe clbeVar;
        clbf clbfVar = this.a;
        if (!clbfVar.e || (clbeVar = clbfVar.b) == null) {
            return;
        }
        clbeVar.onScaleEnd(scaleGestureDetector);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        clbe clbeVar;
        float d = this.a.d(motionEvent2, 0);
        float d2 = this.a.d(motionEvent2, 1);
        clbf clbfVar = this.a;
        float f3 = clbfVar.a;
        if (d > f3 && d > d2) {
            clbfVar.e(clbd.DRAG_X);
        } else if (d2 <= f3 || d2 <= d * 3.0f) {
            float d3 = clbfVar.d(motionEvent2, -1);
            clbf clbfVar2 = this.a;
            if (d3 > clbfVar2.a) {
                clbfVar2.e(clbd.DRAG);
            }
        } else {
            clbfVar.e(clbd.DRAG_Y);
        }
        clbf clbfVar3 = this.a;
        if (clbfVar3.e && (clbeVar = clbfVar3.b) != null) {
            clbeVar.onScroll(motionEvent, motionEvent2, f, f2);
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        clbe clbeVar;
        clbf clbfVar = this.a;
        if (!clbfVar.e || (clbeVar = clbfVar.b) == null) {
            return;
        }
        clbeVar.onShowPress(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        clbe clbeVar;
        this.a.e(clbd.SINGLE_TAP);
        clbf clbfVar = this.a;
        if (clbfVar.e && (clbeVar = clbfVar.b) != null) {
            clbeVar.onSingleTapConfirmed(motionEvent);
        }
        this.a.b();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        clbe clbeVar;
        this.a.e(clbd.FIRST_TAP);
        clbf clbfVar = this.a;
        if (!clbfVar.e || (clbeVar = clbfVar.b) == null) {
            return true;
        }
        clbeVar.onSingleTapUp(motionEvent);
        return true;
    }
}
