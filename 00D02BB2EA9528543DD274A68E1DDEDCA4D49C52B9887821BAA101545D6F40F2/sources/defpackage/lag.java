package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: lag  reason: default package */
/* loaded from: classes7.dex */
final class lag extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ lai a;

    public lag(lai laiVar) {
        this.a = laiVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.c.b();
        return true;
    }
}
