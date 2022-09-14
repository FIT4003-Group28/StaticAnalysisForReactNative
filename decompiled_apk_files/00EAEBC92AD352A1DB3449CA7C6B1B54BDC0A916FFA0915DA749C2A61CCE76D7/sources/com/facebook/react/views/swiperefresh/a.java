package com.facebook.react.views.swiperefresh;

import a.q.a.c;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.f;
import com.facebook.react.uimanager.q;
/* loaded from: classes.dex */
public class a extends c {
    private boolean R;
    private boolean S;
    private float T;
    private int U;
    private float V;
    private boolean W;

    public a(ReactContext reactContext) {
        super(reactContext);
        this.R = false;
        this.S = false;
        this.T = 0.0f;
        this.U = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.V = motionEvent.getX();
            this.W = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.V);
            if (this.W || abs > this.U) {
                this.W = true;
                return false;
            }
        }
        return true;
    }

    @Override // a.q.a.c, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!a(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        f.a(this, motionEvent);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // a.q.a.c, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.R) {
            this.R = true;
            setProgressViewOffset(this.T);
            setRefreshing(this.S);
        }
    }

    @Override // a.q.a.c, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setProgressViewOffset(float f2) {
        this.T = f2;
        if (this.R) {
            int progressCircleDiameter = getProgressCircleDiameter();
            a(false, Math.round(q.b(f2)) - progressCircleDiameter, Math.round(q.b(f2 + 64.0f) - progressCircleDiameter));
        }
    }

    @Override // a.q.a.c
    public void setRefreshing(boolean z) {
        this.S = z;
        if (this.R) {
            super.setRefreshing(z);
        }
    }
}
