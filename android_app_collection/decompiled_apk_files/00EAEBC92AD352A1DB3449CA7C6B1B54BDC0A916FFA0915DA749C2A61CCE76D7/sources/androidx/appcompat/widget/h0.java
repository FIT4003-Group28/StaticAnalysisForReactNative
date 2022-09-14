package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
/* loaded from: classes.dex */
public abstract class h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final float f1258b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1259c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1260d;

    /* renamed from: e  reason: collision with root package name */
    final View f1261e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f1262f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f1263g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1264h;
    private int i;
    private final int[] j = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = h0.this.f1261e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h0.this.d();
        }
    }

    public h0(View view) {
        this.f1261e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1258b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1259c = ViewConfiguration.getTapTimeout();
        this.f1260d = (this.f1259c + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private boolean a(MotionEvent motionEvent) {
        f0 f0Var;
        View view = this.f1261e;
        androidx.appcompat.view.menu.q a2 = a();
        if (a2 == null || !a2.b() || (f0Var = (f0) a2.e()) == null || !f0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        a(view, obtainNoHistory);
        b(f0Var, obtainNoHistory);
        boolean a3 = f0Var.a(obtainNoHistory, this.i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return a3 && (actionMasked != 1 && actionMasked != 3);
    }

    private static boolean a(View view, float f2, float f3, float f4) {
        float f5 = -f4;
        return f2 >= f5 && f3 >= f5 && f2 < ((float) (view.getRight() - view.getLeft())) + f4 && f3 < ((float) (view.getBottom() - view.getTop())) + f4;
    }

    private boolean a(View view, MotionEvent motionEvent) {
        int[] iArr = this.j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1261e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1258b
            boolean r6 = a(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.e()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.i = r6
            java.lang.Runnable r6 = r5.f1262f
            if (r6 != 0) goto L52
            androidx.appcompat.widget.h0$a r6 = new androidx.appcompat.widget.h0$a
            r6.<init>()
            r5.f1262f = r6
        L52:
            java.lang.Runnable r6 = r5.f1262f
            int r1 = r5.f1259c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1263g
            if (r6 != 0) goto L65
            androidx.appcompat.widget.h0$b r6 = new androidx.appcompat.widget.h0$b
            r6.<init>()
            r5.f1263g = r6
        L65:
            java.lang.Runnable r6 = r5.f1263g
            int r1 = r5.f1260d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h0.b(android.view.MotionEvent):boolean");
    }

    private boolean b(View view, MotionEvent motionEvent) {
        int[] iArr = this.j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    private void e() {
        Runnable runnable = this.f1263g;
        if (runnable != null) {
            this.f1261e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1262f;
        if (runnable2 != null) {
            this.f1261e.removeCallbacks(runnable2);
        }
    }

    public abstract androidx.appcompat.view.menu.q a();

    protected abstract boolean b();

    protected boolean c() {
        androidx.appcompat.view.menu.q a2 = a();
        if (a2 == null || !a2.b()) {
            return true;
        }
        a2.dismiss();
        return true;
    }

    void d() {
        e();
        View view = this.f1261e;
        if (!view.isEnabled() || view.isLongClickable() || !b()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        this.f1264h = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1264h;
        if (z2) {
            z = a(motionEvent) || !c();
        } else {
            z = b(motionEvent) && b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1261e.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1264h = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1264h = false;
        this.i = -1;
        Runnable runnable = this.f1262f;
        if (runnable != null) {
            this.f1261e.removeCallbacks(runnable);
        }
    }
}
