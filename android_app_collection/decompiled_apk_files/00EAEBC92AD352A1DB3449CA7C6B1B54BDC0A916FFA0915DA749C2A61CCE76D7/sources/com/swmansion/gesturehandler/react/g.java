package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.y;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final ReactContext f9925a;

    /* renamed from: b  reason: collision with root package name */
    private final c.f.a.d f9926b;

    /* renamed from: c  reason: collision with root package name */
    private final c.f.a.b f9927c;

    /* renamed from: d  reason: collision with root package name */
    private final ViewGroup f9928d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9929e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9930f = false;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.c();
        }
    }

    /* loaded from: classes.dex */
    private class b extends c.f.a.b {
        private b() {
        }

        /* synthetic */ b(g gVar, a aVar) {
            this();
        }

        @Override // c.f.a.b
        protected void c(MotionEvent motionEvent) {
            if (k() == 0) {
                b();
                g.this.f9929e = false;
            }
            if (motionEvent.getActionMasked() == 1) {
                d();
            }
        }

        @Override // c.f.a.b
        protected void p() {
            g.this.f9929e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            if (g.this.f9928d instanceof y) {
                ((y) g.this.f9928d).a(obtain);
            } else {
                com.facebook.react.views.modal.c.a(g.this.f9928d, obtain);
            }
        }
    }

    public g(ReactContext reactContext, ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        if (id < 1) {
            throw new IllegalStateException("Expect view tag to be set for " + viewGroup);
        }
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) reactContext.getNativeModule(RNGestureHandlerModule.class);
        f registry = rNGestureHandlerModule.getRegistry();
        this.f9928d = a(viewGroup);
        Log.i("ReactNative", "[GESTURE HANDLER] Initialize gesture handler for root view " + this.f9928d);
        this.f9925a = reactContext;
        this.f9926b = new c.f.a.d(viewGroup, registry, new j());
        this.f9926b.a(0.1f);
        this.f9927c = new b(this, null);
        this.f9927c.a(-id);
        registry.a(this.f9927c);
        registry.a(this.f9927c.l(), id);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        return (android.view.ViewGroup) r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.view.ViewGroup a(android.view.ViewGroup r3) {
        /*
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            r0 = r3
        L4:
            if (r0 == 0) goto L15
            boolean r1 = r0 instanceof com.facebook.react.y
            if (r1 != 0) goto L15
            boolean r1 = com.facebook.react.views.modal.c.a(r0)
            if (r1 != 0) goto L15
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L15:
            if (r0 == 0) goto L1a
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " has not been mounted under ReactRootView"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.g.a(android.view.ViewGroup):android.view.ViewGroup");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        c.f.a.b bVar = this.f9927c;
        if (bVar == null || bVar.k() != 2) {
            return;
        }
        this.f9927c.a();
        this.f9927c.d();
    }

    public ViewGroup a() {
        return this.f9928d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, boolean z) {
        if (z) {
            UiThreadUtil.runOnUiThread(new a());
        }
    }

    public void a(boolean z) {
        if (this.f9926b == null || this.f9930f) {
            return;
        }
        c();
    }

    public boolean a(MotionEvent motionEvent) {
        this.f9930f = true;
        this.f9926b.b(motionEvent);
        this.f9930f = false;
        return this.f9929e;
    }

    public void b() {
        Log.i("ReactNative", "[GESTURE HANDLER] Tearing down gesture handler registered for root view " + this.f9928d);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) this.f9925a.getNativeModule(RNGestureHandlerModule.class);
        rNGestureHandlerModule.getRegistry().a(this.f9927c.l());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }
}
