package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: aegm  reason: default package */
/* loaded from: classes.dex */
final class aegm extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ aego a;

    public aegm(aego aegoVar) {
        this.a = aegoVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float abs = Math.abs(f2);
        aego aegoVar = this.a;
        if (abs > aegoVar.d) {
            aegoVar.c = true;
            aegoVar.a.c(f2);
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        aego aegoVar = this.a;
        if (aegoVar.b) {
            float x = motionEvent.getX() - motionEvent2.getX();
            float y = motionEvent.getY() - motionEvent2.getY();
            if (Math.abs(y) <= this.a.e || Math.abs(y) <= Math.abs(x)) {
                return false;
            }
            this.a.b(y);
            return true;
        }
        aegoVar.b(f2);
        return true;
    }
}
