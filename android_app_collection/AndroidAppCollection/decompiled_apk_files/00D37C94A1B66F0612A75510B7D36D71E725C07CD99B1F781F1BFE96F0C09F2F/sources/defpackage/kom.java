package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: kom  reason: default package */
/* loaded from: classes3.dex */
final class kom extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ koo a;

    public kom(koo kooVar) {
        this.a = kooVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        koo kooVar = this.a;
        double hypot = Math.hypot(f, f2);
        boolean z = false;
        if (kooVar.a && hypot >= 1500.0d) {
            z = true;
        }
        kooVar.b = z;
        return true;
    }
}
