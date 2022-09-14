package com.facebook.react.g0;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private volatile int f5540a = -1;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f5541b;

    private void b() {
        ViewParent viewParent = this.f5541b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
            this.f5541b = null;
        }
    }

    public void a() {
        this.f5540a = -1;
        b();
    }

    public void a(int i, ViewParent viewParent) {
        this.f5540a = i;
        b();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f5541b = viewParent;
        }
    }

    @Override // com.facebook.react.g0.b
    public boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        int i = this.f5540a;
        return (i == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i) ? false : true;
    }
}
