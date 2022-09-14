package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;
/* compiled from: VelocityHelper.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private VelocityTracker f4046a;

    /* renamed from: b  reason: collision with root package name */
    private float f4047b;

    /* renamed from: c  reason: collision with root package name */
    private float f4048c;

    public void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f4046a == null) {
            this.f4046a = VelocityTracker.obtain();
        }
        this.f4046a.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.f4046a.computeCurrentVelocity(1);
            this.f4047b = this.f4046a.getXVelocity();
            this.f4048c = this.f4046a.getYVelocity();
            if (this.f4046a == null) {
                return;
            }
            this.f4046a.recycle();
            this.f4046a = null;
        }
    }

    public float a() {
        return this.f4047b;
    }

    public float b() {
        return this.f4048c;
    }
}
