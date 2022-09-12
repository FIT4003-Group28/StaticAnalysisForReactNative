package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: bjgn  reason: default package */
/* loaded from: classes3.dex */
public final class bjgn extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ cjtd a;
    final /* synthetic */ bjgo b;

    public bjgn(bjgo bjgoVar, cjtd cjtdVar) {
        this.b = bjgoVar;
        this.a = cjtdVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.b.b.m(new cjte(deaf.DOUBLE_TAP), this.a);
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.b.m(new cjte(deaf.LONG_PRESS), this.a);
        super.onLongPress(motionEvent);
    }
}
