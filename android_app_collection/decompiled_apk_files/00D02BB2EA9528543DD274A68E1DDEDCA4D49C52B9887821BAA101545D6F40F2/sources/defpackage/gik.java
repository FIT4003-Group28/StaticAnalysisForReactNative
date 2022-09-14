package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: gik  reason: default package */
/* loaded from: classes.dex */
public final class gik {
    public final List<View> a;
    private final View f;
    private final int i;
    private boolean c = false;
    private boolean d = false;
    @dzsi
    private MotionEvent e = null;
    private final int[] g = new int[2];
    private final int[] h = new int[2];
    boolean b = false;

    public gik(View view, List<View> list, int i) {
        this.f = view;
        this.a = new ArrayList(list);
        this.i = i;
    }

    private final void d() {
        this.c = false;
        this.d = false;
        this.e = null;
    }

    private final void e(@dzsi MotionEvent motionEvent) {
        if (motionEvent != null && od.ak(this.f)) {
            this.f.getLocationOnScreen(this.h);
            int[] iArr = this.h;
            int i = iArr[0];
            int i2 = iArr[1];
            int rawX = i - ((int) (motionEvent.getRawX() - motionEvent.getX()));
            int rawY = i2 - ((int) (motionEvent.getRawY() - motionEvent.getY()));
            motionEvent.offsetLocation(-rawX, -rawY);
            this.f.dispatchTouchEvent(motionEvent);
            motionEvent.offsetLocation(rawX, rawY);
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            for (View view : this.a) {
                if (view != null && b(motionEvent.getRawX(), motionEvent.getRawY(), view)) {
                    this.c = true;
                    this.d = false;
                    this.e = MotionEvent.obtain(motionEvent);
                    return false;
                }
            }
            d();
            return false;
        }
        return c(motionEvent);
    }

    final boolean b(float f, float f2, View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        if (view.isClickable()) {
            view.getLocationOnScreen(this.g);
            int[] iArr = this.g;
            int i = iArr[0];
            int i2 = iArr[1];
            if (f >= i && f < i + view.getWidth() && f2 >= i2 && f2 < i2 + view.getHeight()) {
                return true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                }
            } while (!b(f, f2, viewGroup.getChildAt(childCount)));
            return true;
        }
        return false;
    }

    public final boolean c(MotionEvent motionEvent) {
        if (!this.b && od.ak(this.f)) {
            try {
                this.b = true;
                if (!this.c) {
                    return false;
                }
                int actionMasked = motionEvent.getActionMasked();
                if (!this.d) {
                    if (motionEvent.getActionMasked() != 5) {
                        MotionEvent motionEvent2 = this.e;
                        if (motionEvent2 != null) {
                            if (motionEvent.getActionMasked() == 2) {
                                if (Math.abs(motionEvent.getX() - motionEvent2.getX()) <= this.i && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= this.i) {
                                }
                            }
                        }
                        if (actionMasked == 1 || actionMasked == 3) {
                            d();
                        }
                        return false;
                    }
                    motionEvent.getActionMasked();
                    this.d = true;
                    e(this.e);
                    e(motionEvent);
                    return true;
                }
                e(motionEvent);
                if (actionMasked == 1 || actionMasked == 3) {
                    d();
                }
                return true;
            } finally {
                this.b = false;
            }
        }
        return false;
    }
}
