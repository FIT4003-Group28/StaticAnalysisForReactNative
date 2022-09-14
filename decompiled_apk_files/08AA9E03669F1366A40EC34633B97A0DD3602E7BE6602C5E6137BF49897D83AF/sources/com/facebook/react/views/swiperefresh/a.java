package com.facebook.react.views.swiperefresh;

import android.support.v4.widget.n;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.aj;
import com.facebook.react.uimanager.events.e;
import com.facebook.react.uimanager.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: ReactSwipeRefreshLayout.java */
/* loaded from: classes.dex */
public class a extends n {
    private boolean m;
    private boolean n;
    private float o;
    private int p;
    private float q;
    private boolean r;

    public a(aj ajVar) {
        super(ajVar);
        this.m = false;
        this.n = false;
        this.o = BitmapDescriptorFactory.HUE_RED;
        this.p = ViewConfiguration.get(ajVar).getScaledTouchSlop();
    }

    @Override // android.support.v4.widget.n
    public void setRefreshing(boolean z) {
        this.n = z;
        if (this.m) {
            super.setRefreshing(z);
        }
    }

    public void setProgressViewOffset(float f) {
        this.o = f;
        if (this.m) {
            int progressCircleDiameter = getProgressCircleDiameter();
            a(false, Math.round(o.a(f)) - progressCircleDiameter, Math.round(o.a(f + 64.0f) - progressCircleDiameter));
        }
    }

    @Override // android.support.v4.widget.n, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.m) {
            this.m = true;
            setProgressViewOffset(this.o);
            setRefreshing(this.n);
        }
    }

    @Override // android.support.v4.widget.n, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.support.v4.widget.n, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        e.a(this, motionEvent);
        return true;
    }

    private boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.q = motionEvent.getX();
            this.r = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.q);
            if (this.r || abs > this.p) {
                this.r = true;
                return false;
            }
        }
        return true;
    }
}
