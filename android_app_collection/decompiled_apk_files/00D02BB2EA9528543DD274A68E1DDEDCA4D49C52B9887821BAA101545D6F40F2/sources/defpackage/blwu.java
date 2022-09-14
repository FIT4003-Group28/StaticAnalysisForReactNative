package defpackage;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: blwu  reason: default package */
/* loaded from: classes3.dex */
final class blwu extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ Activity a;
    final /* synthetic */ blww b;

    public blwu(blww blwwVar, Activity activity) {
        this.b = blwwVar;
        this.a = activity;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
        float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        blww blwwVar = this.b;
        if (!bvox.b(this.a) ? rawX < 0.0f : rawX > 0.0f) {
            if (Math.abs(rawX) > Math.abs(rawY)) {
                z = true;
                blwwVar.a = z;
                return false;
            }
        }
        z = false;
        blwwVar.a = z;
        return false;
    }
}
