package android.support.v7.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: ForwardingListener.java */
/* loaded from: classes.dex */
public abstract class x implements View.OnAttachStateChangeListener, View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f1023a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1024b;

    /* renamed from: c  reason: collision with root package name */
    final View f1025c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1026d;
    private Runnable e;
    private Runnable f;
    private boolean g;
    private int h;
    private final int[] i = new int[2];

    public abstract android.support.v7.view.menu.q a();

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    public x(View view) {
        this.f1025c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1023a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1024b = ViewConfiguration.getTapTimeout();
        this.f1026d = (this.f1024b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.g;
        if (z2) {
            z = b(motionEvent) || !c();
        } else {
            z = a(motionEvent) && b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                this.f1025c.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.h = -1;
        if (this.e != null) {
            this.f1025c.removeCallbacks(this.e);
        }
    }

    protected boolean b() {
        android.support.v7.view.menu.q a2 = a();
        if (a2 == null || a2.d()) {
            return true;
        }
        a2.a();
        return true;
    }

    protected boolean c() {
        android.support.v7.view.menu.q a2 = a();
        if (a2 == null || !a2.d()) {
            return true;
        }
        a2.c();
        return true;
    }

    private boolean a(MotionEvent motionEvent) {
        View view = this.f1025c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.h = motionEvent.getPointerId(0);
                if (this.e == null) {
                    this.e = new a();
                }
                view.postDelayed(this.e, this.f1024b);
                if (this.f == null) {
                    this.f = new b();
                }
                view.postDelayed(this.f, this.f1026d);
                break;
            case 1:
            case 3:
                e();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.h);
                if (findPointerIndex >= 0 && !a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f1023a)) {
                    e();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                break;
        }
        return false;
    }

    private void e() {
        if (this.f != null) {
            this.f1025c.removeCallbacks(this.f);
        }
        if (this.e != null) {
            this.f1025c.removeCallbacks(this.e);
        }
    }

    void d() {
        e();
        View view = this.f1025c;
        if (!view.isEnabled() || view.isLongClickable() || !b()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        this.g = true;
    }

    private boolean b(MotionEvent motionEvent) {
        v vVar;
        View view = this.f1025c;
        android.support.v7.view.menu.q a2 = a();
        if (a2 == null || !a2.d() || (vVar = (v) a2.e()) == null || !vVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        b(view, obtainNoHistory);
        a(vVar, obtainNoHistory);
        boolean a3 = vVar.a(obtainNoHistory, this.h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return a3 && (actionMasked != 1 && actionMasked != 3);
    }

    private static boolean a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean a(View view, MotionEvent motionEvent) {
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    private boolean b(View view, MotionEvent motionEvent) {
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = x.this.f1025c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.d();
        }
    }
}
