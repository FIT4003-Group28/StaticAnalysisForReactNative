package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
/* compiled from: PG */
/* renamed from: bduu  reason: default package */
/* loaded from: classes3.dex */
public final class bduu implements bdus {
    public static final int e = ViewConfiguration.getDoubleTapTimeout();
    public int a;
    public int b;
    public int c;
    public int d;
    public final Handler f = new bdut(this);
    public final GestureDetector.OnGestureListener g;
    public GestureDetector.OnDoubleTapListener h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public MotionEvent n;
    public MotionEvent o;
    public boolean p;
    public float q;
    public float r;
    public float s;
    public float t;
    public boolean u;
    public VelocityTracker v;

    /* JADX WARN: Multi-variable type inference failed */
    public bduu(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.g = onGestureListener;
        if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
            this.h = onGestureListener;
        }
        if (context != null) {
            if (onGestureListener != 0) {
                this.u = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.a = scaledTouchSlop * scaledTouchSlop;
                this.b = scaledDoubleTapSlop * scaledDoubleTapSlop;
                return;
            }
            throw new IllegalArgumentException("OnGestureListener must not be null");
        }
        throw new IllegalArgumentException("Context must not be null");
    }
}
