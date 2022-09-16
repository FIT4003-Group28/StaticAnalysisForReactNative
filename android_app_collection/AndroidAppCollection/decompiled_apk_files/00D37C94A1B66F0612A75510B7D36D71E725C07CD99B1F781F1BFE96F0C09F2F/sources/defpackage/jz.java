package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: jz  reason: default package */
/* loaded from: classes3.dex */
public final class jz {
    public final jy a;

    public jz(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public final void a(MotionEvent motionEvent) {
        this.a.a.onTouchEvent(motionEvent);
    }

    public jz(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.a = new jy(context, onGestureListener, handler);
    }
}
