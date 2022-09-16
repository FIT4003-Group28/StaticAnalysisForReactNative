package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: sca  reason: default package */
/* loaded from: classes4.dex */
public final class sca implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public final sai a;
    public final List b = sbv.d();
    private final List c = sbv.d();

    public sca(sai saiVar) {
        this.a = saiVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        for (sbx sbxVar : this.c) {
            if (sbxVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        for (sbx sbxVar : this.c) {
            if (sbxVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        for (shp shpVar : this.b) {
        }
        return !this.b.isEmpty();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (shp shpVar : this.b) {
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        for (shp shpVar : this.b) {
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        for (shp shpVar : this.b) {
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        for (shp shpVar : this.b) {
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        for (shp shpVar : this.b) {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (shp shpVar : this.b) {
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        for (shp shpVar : this.b) {
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!this.c.isEmpty()) {
            for (shp shpVar : this.b) {
                if (shpVar.a(motionEvent)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        Iterator it = this.b.iterator();
        loop0: while (true) {
            z = false;
            while (!z && it.hasNext()) {
                shp shpVar = (shp) it.next();
                boolean b = shpVar.b();
                if (!this.c.isEmpty()) {
                    z = b;
                } else if (b || shpVar.a(motionEvent)) {
                    z = true;
                }
            }
        }
        return z;
    }
}
