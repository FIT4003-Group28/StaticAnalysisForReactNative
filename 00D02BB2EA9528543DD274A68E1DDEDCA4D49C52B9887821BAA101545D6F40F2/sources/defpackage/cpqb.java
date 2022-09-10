package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpqb  reason: default package */
/* loaded from: classes5.dex */
public final class cpqb<T, D> implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public final cpoj<T, D> a;
    public final List<cppy> b = cpwi.a();
    private final List<cppv<T, D>> c = cpwi.a();

    public cpqb(cpoj<T, D> cpojVar) {
        this.a = cpojVar;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        for (cppv<T, D> cppvVar : this.c) {
            if (cppvVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        for (cppv<T, D> cppvVar : this.c) {
            if (cppvVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        for (cppy cppyVar : this.b) {
        }
        return !this.b.isEmpty();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (cppy cppyVar : this.b) {
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        for (cppy cppyVar : this.b) {
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        for (cppy cppyVar : this.b) {
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        for (cppy cppyVar : this.b) {
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        for (cppy cppyVar : this.b) {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (cppy cppyVar : this.b) {
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        for (cppy cppyVar : this.b) {
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!this.c.isEmpty()) {
            for (cppy cppyVar : this.b) {
                if (cppyVar.a(motionEvent)) {
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
        Iterator<cppy> it = this.b.iterator();
        loop0: while (true) {
            z = false;
            while (!z && it.hasNext()) {
                cppy next = it.next();
                boolean b = next.b();
                if (!this.c.isEmpty()) {
                    z = b;
                } else if (b || next.a(motionEvent)) {
                    z = true;
                }
            }
        }
        return z;
    }
}
