package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: ni  reason: default package */
/* loaded from: classes.dex */
public final class ni {
    private final nh a;

    public ni(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new nh(context, onGestureListener);
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.a.a.onTouchEvent(motionEvent);
    }

    public final void b(boolean z) {
        this.a.a.setIsLongpressEnabled(z);
    }
}
