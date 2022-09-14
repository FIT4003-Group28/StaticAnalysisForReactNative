package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: lah  reason: default package */
/* loaded from: classes7.dex */
final class lah extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ lai a;

    public lah(lai laiVar) {
        this.a = laiVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        kzj kzjVar = this.a.i;
        if (kzjVar != null) {
            kzjVar.a.g.c(f2 * 0.01f);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        kzj kzjVar = this.a.i;
        if (kzjVar != null) {
            kzjVar.a.g.a(false);
            return true;
        }
        return true;
    }
}
