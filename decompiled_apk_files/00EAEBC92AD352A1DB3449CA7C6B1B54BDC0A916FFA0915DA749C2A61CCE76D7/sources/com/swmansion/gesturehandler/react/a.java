package com.swmansion.gesturehandler.react;

import android.os.Bundle;
import android.view.MotionEvent;
import com.facebook.react.r;
import com.facebook.react.y;
/* loaded from: classes.dex */
public class a extends y {
    private r t;
    private g u;

    @Override // com.facebook.react.y
    public void a(r rVar, String str, Bundle bundle) {
        super.a(rVar, str, bundle);
        this.t = rVar;
    }

    public void d() {
        if (this.u == null) {
            this.u = new g(this.t.b(), this);
            return;
        }
        throw new IllegalStateException("GestureHandler already initialized for root view " + this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g gVar = this.u;
        if (gVar == null || !gVar.a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public void e() {
        g gVar = this.u;
        if (gVar != null) {
            gVar.b();
            this.u = null;
        }
    }

    @Override // com.facebook.react.y, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        g gVar = this.u;
        if (gVar != null) {
            gVar.a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
