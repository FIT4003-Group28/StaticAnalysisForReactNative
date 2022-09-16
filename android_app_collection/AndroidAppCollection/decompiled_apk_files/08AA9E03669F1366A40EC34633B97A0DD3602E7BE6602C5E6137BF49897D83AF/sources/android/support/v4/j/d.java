package android.support.v4.j;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
/* compiled from: GestureDetectorCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final a f507a;

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes.dex */
    interface a {
        boolean a(MotionEvent motionEvent);
    }

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes.dex */
    static class b implements a {
        private static final int j = ViewConfiguration.getLongPressTimeout();
        private static final int k = ViewConfiguration.getTapTimeout();
        private static final int l = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a  reason: collision with root package name */
        final GestureDetector.OnGestureListener f508a;

        /* renamed from: b  reason: collision with root package name */
        GestureDetector.OnDoubleTapListener f509b;

        /* renamed from: c  reason: collision with root package name */
        boolean f510c;

        /* renamed from: d  reason: collision with root package name */
        boolean f511d;
        MotionEvent e;
        private int f;
        private int g;
        private int h;
        private int i;
        private final Handler m;
        private boolean n;
        private boolean o;
        private boolean p;
        private MotionEvent q;
        private boolean r;
        private float s;
        private float t;
        private float u;
        private float v;
        private boolean w;
        private VelocityTracker x;

        /* compiled from: GestureDetectorCompat.java */
        /* loaded from: classes.dex */
        private class a extends Handler {
            a() {
            }

            a(Handler handler) {
                super(handler.getLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        b.this.f508a.onShowPress(b.this.e);
                        return;
                    case 2:
                        b.this.a();
                        return;
                    case 3:
                        if (b.this.f509b == null) {
                            return;
                        }
                        if (!b.this.f510c) {
                            b.this.f509b.onSingleTapConfirmed(b.this.e);
                            return;
                        } else {
                            b.this.f511d = true;
                            return;
                        }
                    default:
                        throw new RuntimeException("Unknown message " + message);
                }
            }
        }

        b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.m = new a(handler);
            } else {
                this.m = new a();
            }
            this.f508a = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                a((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            a(context);
        }

        private void a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            }
            if (this.f508a == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
            this.w = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.h = viewConfiguration.getScaledMinimumFlingVelocity();
            this.i = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f = scaledTouchSlop * scaledTouchSlop;
            this.g = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }

        public void a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f509b = onDoubleTapListener;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0221  */
        @Override // android.support.v4.j.d.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.view.MotionEvent r12) {
            /*
                Method dump skipped, instructions count: 612
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.j.d.b.a(android.view.MotionEvent):boolean");
        }

        private void b() {
            this.m.removeMessages(1);
            this.m.removeMessages(2);
            this.m.removeMessages(3);
            this.x.recycle();
            this.x = null;
            this.r = false;
            this.f510c = false;
            this.o = false;
            this.p = false;
            this.f511d = false;
            if (this.n) {
                this.n = false;
            }
        }

        private void c() {
            this.m.removeMessages(1);
            this.m.removeMessages(2);
            this.m.removeMessages(3);
            this.r = false;
            this.o = false;
            this.p = false;
            this.f511d = false;
            if (this.n) {
                this.n = false;
            }
        }

        private boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (this.p && motionEvent3.getEventTime() - motionEvent2.getEventTime() <= l) {
                int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
                int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
                return (x * x) + (y * y) < this.g;
            }
            return false;
        }

        void a() {
            this.m.removeMessages(3);
            this.f511d = false;
            this.n = true;
            this.f508a.onLongPress(this.e);
        }
    }

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes.dex */
    static class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final GestureDetector f513a;

        c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f513a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // android.support.v4.j.d.a
        public boolean a(MotionEvent motionEvent) {
            return this.f513a.onTouchEvent(motionEvent);
        }
    }

    public d(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public d(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.f507a = new c(context, onGestureListener, handler);
        } else {
            this.f507a = new b(context, onGestureListener, handler);
        }
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f507a.a(motionEvent);
    }
}
