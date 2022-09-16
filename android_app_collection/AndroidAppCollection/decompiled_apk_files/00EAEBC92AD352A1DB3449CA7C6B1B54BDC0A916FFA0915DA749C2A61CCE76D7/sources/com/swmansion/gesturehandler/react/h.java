package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
/* loaded from: classes.dex */
public class h extends com.facebook.react.views.view.f {

    /* renamed from: b  reason: collision with root package name */
    private boolean f9932b;

    /* renamed from: c  reason: collision with root package name */
    private g f9933c;

    public h(Context context) {
        super(context);
    }

    private static boolean a(ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof a) || (parent instanceof h)) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        g gVar = this.f9933c;
        if (gVar != null) {
            gVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f9932b) {
            g gVar = this.f9933c;
            c.d.k.a.a.a(gVar);
            if (gVar.a(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9932b = !a(this);
        if (!this.f9932b) {
            Log.i("ReactNative", "[GESTURE HANDLER] Gesture handler is already enabled for a parent view");
        }
        if (!this.f9932b || this.f9933c != null) {
            return;
        }
        this.f9933c = new g((ReactContext) getContext(), this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.f9932b) {
            g gVar = this.f9933c;
            c.d.k.a.a.a(gVar);
            gVar.a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
