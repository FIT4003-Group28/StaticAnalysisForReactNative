package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private VelocityTracker f6239a;

    /* renamed from: b  reason: collision with root package name */
    private float f6240b;

    /* renamed from: c  reason: collision with root package name */
    private float f6241c;

    public float a() {
        return this.f6240b;
    }

    public void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f6239a == null) {
            this.f6239a = VelocityTracker.obtain();
        }
        this.f6239a.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.f6239a.computeCurrentVelocity(1);
            this.f6240b = this.f6239a.getXVelocity();
            this.f6241c = this.f6239a.getYVelocity();
            VelocityTracker velocityTracker = this.f6239a;
            if (velocityTracker == null) {
                return;
            }
            velocityTracker.recycle();
            this.f6239a = null;
        }
    }

    public float b() {
        return this.f6241c;
    }
}
