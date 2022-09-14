package com.facebook.react.views.drawer;

import android.support.v4.widget.g;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.aj;
import com.facebook.react.uimanager.events.e;
/* compiled from: ReactDrawerLayout.java */
/* loaded from: classes.dex */
class a extends g {

    /* renamed from: c  reason: collision with root package name */
    private int f3961c;

    /* renamed from: d  reason: collision with root package name */
    private int f3962d;

    public a(aj ajVar) {
        super(ajVar);
        this.f3961c = 8388611;
        this.f3962d = -1;
    }

    @Override // android.support.v4.widget.g, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (super.onInterceptTouchEvent(motionEvent)) {
            e.a(this, motionEvent);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        e(this.f3961c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        f(this.f3961c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i) {
        this.f3961c = i;
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(int i) {
        this.f3962d = i;
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            g.d dVar = (g.d) childAt.getLayoutParams();
            dVar.f660a = this.f3961c;
            dVar.width = this.f3962d;
            childAt.setLayoutParams(dVar);
            childAt.setClickable(true);
        }
    }
}
