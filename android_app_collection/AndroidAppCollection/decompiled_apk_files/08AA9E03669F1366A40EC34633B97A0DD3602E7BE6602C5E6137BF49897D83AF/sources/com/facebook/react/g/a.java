package com.facebook.react.g;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
/* compiled from: JSResponderHandler.java */
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private volatile int f3438a = -1;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f3439b;

    public void a(int i, ViewParent viewParent) {
        this.f3438a = i;
        b();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f3439b = viewParent;
        }
    }

    public void a() {
        this.f3438a = -1;
        b();
    }

    private void b() {
        if (this.f3439b != null) {
            this.f3439b.requestDisallowInterceptTouchEvent(false);
            this.f3439b = null;
        }
    }

    @Override // com.facebook.react.g.b
    public boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        int i = this.f3438a;
        return (i == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i) ? false : true;
    }
}
