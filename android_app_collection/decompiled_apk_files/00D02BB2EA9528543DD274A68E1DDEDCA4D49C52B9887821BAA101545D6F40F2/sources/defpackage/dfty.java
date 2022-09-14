package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
/* compiled from: PG */
/* renamed from: dfty  reason: default package */
/* loaded from: classes6.dex */
public final class dfty extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    public final dftx a;
    public final dfqu b;
    @dzsi
    public final Runnable c;
    public boolean d = false;
    public boolean e = false;
    private final dfuo f;

    public dfty(dftx dftxVar, dfqu dfquVar, dfuo dfuoVar, @dzsi Runnable runnable) {
        this.a = dftxVar;
        this.b = dfquVar;
        this.f = dfuoVar;
        this.c = runnable;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.a.onDoubleTap(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        this.e = true;
        this.a.onDoubleTapEvent(motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f.e = false;
        this.a.onDown(motionEvent);
        if (motionEvent.getActionMasked() == 0 && this.b.a(motionEvent)) {
            this.f.e = true;
            this.d = true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.e = true;
        if (this.d) {
            boolean a = this.b.a(motionEvent2);
            this.d = false;
            Runnable runnable = this.c;
            if (runnable != null && a) {
                runnable.run();
            }
            return true;
        }
        this.a.onFling(motionEvent, motionEvent2, f, f2);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.a.onScale(scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return this.a.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.a.onScaleEnd(scaleGestureDetector);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.d) {
            this.b.a(motionEvent2);
            return true;
        }
        this.a.onScroll(motionEvent, motionEvent2, f, f2);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.a.onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.e = true;
        this.a.onSingleTapUp(motionEvent);
        return true;
    }
}
