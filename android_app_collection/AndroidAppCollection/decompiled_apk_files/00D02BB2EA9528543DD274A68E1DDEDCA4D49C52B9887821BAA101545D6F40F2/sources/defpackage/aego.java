package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
/* compiled from: PG */
/* renamed from: aego  reason: default package */
/* loaded from: classes.dex */
public final class aego {
    public final aegn a;
    public boolean b;
    public boolean c;
    public final float d;
    public final int e;
    private final GestureDetector f;
    private boolean g;

    public aego(Context context, aegn aegnVar) {
        GestureDetector gestureDetector = new GestureDetector(context, new aegm(this), new Handler(Looper.getMainLooper()));
        this.f = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.a = aegnVar;
        this.d = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private final boolean d(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.g = false;
            this.c = false;
        }
        boolean onTouchEvent = this.f.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 || !this.g || this.c) {
            return onTouchEvent;
        }
        this.a.b();
        return true;
    }

    public final boolean a(MotionEvent motionEvent) {
        this.b = true;
        boolean d = d(motionEvent);
        this.b = false;
        return d;
    }

    public final void b(float f) {
        this.g = true;
        this.a.a(Math.round(f));
    }

    public final void c(MotionEvent motionEvent) {
        d(motionEvent);
    }
}
