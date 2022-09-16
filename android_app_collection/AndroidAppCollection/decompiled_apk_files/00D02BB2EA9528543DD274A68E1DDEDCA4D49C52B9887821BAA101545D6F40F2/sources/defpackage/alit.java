package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
/* compiled from: PG */
/* renamed from: alit  reason: default package */
/* loaded from: classes.dex */
public final class alit {
    public static final int g = ViewConfiguration.getLongPressTimeout();
    public static final int h = ViewConfiguration.getTapTimeout();
    public static final int i = ViewConfiguration.getDoubleTapTimeout();
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Handler j;
    public final alir k;
    @dzsi
    public GestureDetector.OnDoubleTapListener l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    @dzsi
    public MotionEvent q;
    @dzsi
    public MotionEvent r;
    public boolean s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    @dzsi
    public VelocityTracker y;

    public alit(Context context, alir alirVar, @dzsi Handler handler) {
        int scaledTouchSlop;
        int i2;
        int i3;
        if (handler != null) {
            this.j = new aliq(this, handler);
        } else {
            this.j = new aliq(this);
        }
        this.k = alirVar;
        if (alirVar instanceof GestureDetector.OnDoubleTapListener) {
            this.l = (GestureDetector.OnDoubleTapListener) alirVar;
        }
        if (context == null) {
            ViewConfiguration.getTouchSlop();
        } else {
            ViewConfiguration.get(context).getScaledTouchSlop();
        }
        if (alirVar != null) {
            this.x = true;
            if (context == null) {
                i2 = ViewConfiguration.getTouchSlop();
                i3 = i2 + i2;
                this.e = ViewConfiguration.getMinimumFlingVelocity();
                this.f = ViewConfiguration.getMaximumFlingVelocity();
                scaledTouchSlop = i2;
            } else {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop2 = viewConfiguration.getScaledTouchSlop();
                scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.e = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f = viewConfiguration.getScaledMaximumFlingVelocity();
                i2 = scaledTouchSlop2;
                i3 = scaledDoubleTapSlop;
            }
            this.a = i2;
            this.b = i2 * i2;
            this.c = scaledTouchSlop * scaledTouchSlop;
            this.d = i3 * i3;
            return;
        }
        throw new NullPointerException("OnGestureListener must not be null");
    }

    public final void a(MotionEvent motionEvent) {
        this.j.removeMessages(1);
        this.j.removeMessages(2);
        this.j.removeMessages(3);
        if (this.s && this.l != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getMetaState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags());
            GestureDetector.OnDoubleTapListener onDoubleTapListener = this.l;
            dbsk.s(onDoubleTapListener);
            onDoubleTapListener.onDoubleTapEvent(obtain);
        }
        this.s = false;
        this.o = false;
        this.p = false;
        if (this.n) {
            this.n = false;
        }
    }
}
