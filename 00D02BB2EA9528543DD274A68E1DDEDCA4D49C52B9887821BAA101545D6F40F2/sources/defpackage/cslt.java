package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: cslt  reason: default package */
/* loaded from: classes5.dex */
final class cslt extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ csme a;

    public cslt(csme csmeVar) {
        this.a = csmeVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.g();
        return true;
    }
}
