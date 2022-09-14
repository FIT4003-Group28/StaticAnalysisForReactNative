package com.facebook.react.views.drawer;

import a.j.a.a;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.f;
/* loaded from: classes.dex */
class a extends a.j.a.a {
    private int P;
    private int Q;

    public a(ReactContext reactContext) {
        super(reactContext);
        this.P = 8388611;
        this.Q = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        a(this.P);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        e(this.P);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            a.e eVar = (a.e) childAt.getLayoutParams();
            eVar.f445a = this.P;
            ((ViewGroup.MarginLayoutParams) eVar).width = this.Q;
            childAt.setLayoutParams(eVar);
            childAt.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i) {
        this.P = i;
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(int i) {
        this.Q = i;
        g();
    }

    @Override // a.j.a.a, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            f.a(this, motionEvent);
            return true;
        } catch (IllegalArgumentException e2) {
            Log.w("ReactNative", "Error intercepting touch event.", e2);
            return false;
        }
    }
}
