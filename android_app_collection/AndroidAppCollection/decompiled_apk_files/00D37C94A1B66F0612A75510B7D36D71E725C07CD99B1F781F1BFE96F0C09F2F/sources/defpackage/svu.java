package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: svu  reason: default package */
/* loaded from: classes4.dex */
final class svu implements GestureDetector.OnGestureListener {
    private final svs a;

    public svu(svs svsVar) {
        this.a = svsVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        svs svsVar;
        List<tdk> list;
        if (!this.a.b() || (list = (svsVar = this.a).g) == null) {
            return;
        }
        for (tdk tdkVar : list) {
            tdkVar.a((View) svsVar.a.get(), new tfi(motionEvent.getX(), motionEvent.getY()));
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
