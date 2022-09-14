package com.facebook.react;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.ak;
import com.facebook.react.bridge.ap;
import com.facebook.react.bridge.ar;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.aa;
import com.facebook.react.uimanager.ad;
/* compiled from: ReactRootView.java */
/* loaded from: classes.dex */
public class p extends ad implements aa, com.facebook.react.uimanager.j {

    /* renamed from: a  reason: collision with root package name */
    private j f3713a;

    /* renamed from: b  reason: collision with root package name */
    private String f3714b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f3715c;

    /* renamed from: d  reason: collision with root package name */
    private a f3716d;
    private b e;
    private int f;
    private boolean g;
    private boolean h;
    private final com.facebook.react.uimanager.f i;
    private boolean j;
    private int k;
    private int l;
    private Runnable m;

    /* compiled from: ReactRootView.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(p pVar);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public p(Context context) {
        super(context);
        this.i = new com.facebook.react.uimanager.f(this);
        this.j = false;
        this.k = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.l = View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x0096, LOOP:0: B:19:0x0052->B:21:0x0058, LOOP_END, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x0007, B:7:0x0017, B:13:0x0043, B:17:0x004c, B:22:0x0076, B:24:0x0080, B:26:0x0084, B:28:0x008f, B:27:0x0088, B:19:0x0052, B:21:0x0058, B:9:0x001e, B:11:0x0024), top: B:34:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x0007, B:7:0x0017, B:13:0x0043, B:17:0x004c, B:22:0x0076, B:24:0x0080, B:26:0x0084, B:28:0x008f, B:27:0x0088, B:19:0x0052, B:21:0x0058, B:9:0x001e, B:11:0x0024), top: B:34:0x0007 }] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "ReactRootView.onMeasure"
            r1 = 0
            com.facebook.m.a.a(r1, r0)
            r8.k = r9     // Catch: java.lang.Throwable -> L96
            r8.l = r10     // Catch: java.lang.Throwable -> L96
            int r0 = android.view.View.MeasureSpec.getMode(r9)     // Catch: java.lang.Throwable -> L96
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            if (r0 == r3) goto L1c
            if (r0 != 0) goto L17
            goto L1c
        L17:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch: java.lang.Throwable -> L96
            goto L43
        L1c:
            r9 = 0
            r0 = 0
        L1e:
            int r5 = r8.getChildCount()     // Catch: java.lang.Throwable -> L96
            if (r9 >= r5) goto L42
            android.view.View r5 = r8.getChildAt(r9)     // Catch: java.lang.Throwable -> L96
            int r6 = r5.getLeft()     // Catch: java.lang.Throwable -> L96
            int r7 = r5.getMeasuredWidth()     // Catch: java.lang.Throwable -> L96
            int r6 = r6 + r7
            int r7 = r5.getPaddingLeft()     // Catch: java.lang.Throwable -> L96
            int r6 = r6 + r7
            int r5 = r5.getPaddingRight()     // Catch: java.lang.Throwable -> L96
            int r6 = r6 + r5
            int r0 = java.lang.Math.max(r0, r6)     // Catch: java.lang.Throwable -> L96
            int r9 = r9 + 1
            goto L1e
        L42:
            r9 = r0
        L43:
            int r0 = android.view.View.MeasureSpec.getMode(r10)     // Catch: java.lang.Throwable -> L96
            if (r0 == r3) goto L51
            if (r0 != 0) goto L4c
            goto L51
        L4c:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch: java.lang.Throwable -> L96
            goto L76
        L51:
            r10 = 0
        L52:
            int r0 = r8.getChildCount()     // Catch: java.lang.Throwable -> L96
            if (r4 >= r0) goto L76
            android.view.View r0 = r8.getChildAt(r4)     // Catch: java.lang.Throwable -> L96
            int r3 = r0.getTop()     // Catch: java.lang.Throwable -> L96
            int r5 = r0.getMeasuredHeight()     // Catch: java.lang.Throwable -> L96
            int r3 = r3 + r5
            int r5 = r0.getPaddingTop()     // Catch: java.lang.Throwable -> L96
            int r3 = r3 + r5
            int r0 = r0.getPaddingBottom()     // Catch: java.lang.Throwable -> L96
            int r3 = r3 + r0
            int r10 = java.lang.Math.max(r10, r3)     // Catch: java.lang.Throwable -> L96
            int r4 = r4 + 1
            goto L52
        L76:
            r8.setMeasuredDimension(r9, r10)     // Catch: java.lang.Throwable -> L96
            r9 = 1
            r8.j = r9     // Catch: java.lang.Throwable -> L96
            com.facebook.react.j r9 = r8.f3713a     // Catch: java.lang.Throwable -> L96
            if (r9 == 0) goto L88
            boolean r9 = r8.g     // Catch: java.lang.Throwable -> L96
            if (r9 != 0) goto L88
            r8.f()     // Catch: java.lang.Throwable -> L96
            goto L8f
        L88:
            int r9 = r8.k     // Catch: java.lang.Throwable -> L96
            int r10 = r8.l     // Catch: java.lang.Throwable -> L96
            r8.a(r9, r10)     // Catch: java.lang.Throwable -> L96
        L8f:
            r8.d()     // Catch: java.lang.Throwable -> L96
            com.facebook.m.a.b(r1)
            return
        L96:
            r9 = move-exception
            com.facebook.m.a.b(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.p.onMeasure(int, int):void");
    }

    @Override // com.facebook.react.uimanager.j
    public int getWidthMeasureSpec() {
        if (!this.j && getLayoutParams() != null && getLayoutParams().width > 0) {
            return View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824);
        }
        return this.k;
    }

    @Override // com.facebook.react.uimanager.j
    public int getHeightMeasureSpec() {
        if (!this.j && getLayoutParams() != null && getLayoutParams().height > 0) {
            return View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824);
        }
        return this.l;
    }

    @Override // com.facebook.react.uimanager.aa
    public void a(MotionEvent motionEvent) {
        if (this.f3713a == null || !this.g || this.f3713a.j() == null) {
            com.facebook.common.e.a.c("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        this.i.a(motionEvent, ((UIManagerModule) this.f3713a.j().b(UIManagerModule.class)).getEventDispatcher());
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    private void b(MotionEvent motionEvent) {
        if (this.f3713a == null || !this.g || this.f3713a.j() == null) {
            com.facebook.common.e.a.c("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        this.i.b(motionEvent, ((UIManagerModule) this.f3713a.j().b(UIManagerModule.class)).getEventDispatcher());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.g) {
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.g) {
            if (Build.VERSION.SDK_INT >= 16) {
                getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
            } else {
                getViewTreeObserver().removeGlobalOnLayoutListener(getCustomGlobalLayoutListener());
            }
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.h) {
            this.h = false;
            if (this.f3714b == null) {
                return;
            }
            ReactMarker.logMarker(ak.CONTENT_APPEARED, this.f3714b, this.f);
        }
    }

    public void a(j jVar, String str, Bundle bundle) {
        com.facebook.m.a.a(0L, "startReactApplication");
        try {
            ap.b();
            com.facebook.j.a.a.a(this.f3713a == null, "This root view has already been attached to a catalyst instance manager");
            this.f3713a = jVar;
            this.f3714b = str;
            this.f3715c = bundle;
            if (!this.f3713a.d()) {
                this.f3713a.c();
            }
            f();
        } finally {
            com.facebook.m.a.b(0L);
        }
    }

    private void d() {
        if (this.f3713a == null) {
            com.facebook.common.e.a.c("ReactNative", "Unable to enable layout calculation for uninitialized ReactInstanceManager");
            return;
        }
        aj j = this.f3713a.j();
        if (j == null) {
            return;
        }
        ((UIManagerModule) j.a().getNativeModule(UIManagerModule.class)).getUIImplementation().g(getRootViewTag());
    }

    private void a(final int i, final int i2) {
        if (this.f3713a == null) {
            com.facebook.common.e.a.c("ReactNative", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        final aj j = this.f3713a.j();
        if (j == null) {
            return;
        }
        j.b(new com.facebook.react.bridge.l(j) { // from class: com.facebook.react.p.1
            @Override // com.facebook.react.bridge.l
            public void a() {
                ((UIManagerModule) j.a().getNativeModule(UIManagerModule.class)).updateRootLayoutSpecs(p.this.getRootViewTag(), i, i2);
            }
        });
    }

    public void a() {
        if (this.f3713a != null && this.g) {
            this.f3713a.b(this);
            this.g = false;
        }
        this.h = false;
    }

    public void b() {
        if (this.e != null) {
            this.e.a(this);
        }
    }

    public void setEventListener(b bVar) {
        this.e = bVar;
    }

    String getJSModuleName() {
        return (String) com.facebook.j.a.a.b(this.f3714b);
    }

    public Bundle getAppProperties() {
        return this.f3715c;
    }

    public void setAppProperties(Bundle bundle) {
        ap.b();
        this.f3715c = bundle;
        if (getRootViewTag() != 0) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.m == null) {
            e();
        } else {
            this.m.run();
        }
    }

    public void setJSEntryPoint(Runnable runnable) {
        this.m = runnable;
    }

    private void e() {
        com.facebook.m.a.a(0L, "ReactRootView.runApplication");
        try {
            if (this.f3713a != null && this.g) {
                aj j = this.f3713a.j();
                if (j == null) {
                    return;
                }
                CatalystInstance a2 = j.a();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.a("initialProps", com.facebook.react.bridge.b.b(appProperties));
                }
                this.h = true;
                ((AppRegistry) a2.getJSModule(AppRegistry.class)).runApplication(getJSModuleName(), writableNativeMap);
            }
        } finally {
            com.facebook.m.a.b(0L);
        }
    }

    private a getCustomGlobalLayoutListener() {
        if (this.f3716d == null) {
            this.f3716d = new a();
        }
        return this.f3716d;
    }

    private void f() {
        com.facebook.m.a.a(0L, "attachToReactInstanceManager");
        try {
            if (this.g) {
                return;
            }
            this.g = true;
            ((j) com.facebook.j.a.a.b(this.f3713a)).a(this);
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        } finally {
            com.facebook.m.a.b(0L);
        }
    }

    protected void finalize() {
        super.finalize();
        com.facebook.j.a.a.a(!this.g, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    public int getRootViewTag() {
        return this.f;
    }

    public void setRootViewTag(int i) {
        this.f = i;
    }

    public j getReactInstanceManager() {
        return this.f3713a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactRootView.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b  reason: collision with root package name */
        private final Rect f3722b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3723c;

        /* renamed from: d  reason: collision with root package name */
        private int f3724d = 0;
        private int e = 0;
        private DisplayMetrics f = new DisplayMetrics();
        private DisplayMetrics g = new DisplayMetrics();

        a() {
            com.facebook.react.uimanager.b.a(p.this.getContext().getApplicationContext());
            this.f3722b = new Rect();
            this.f3723c = (int) com.facebook.react.uimanager.o.a(60.0f);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (p.this.f3713a == null || !p.this.g || p.this.f3713a.j() == null) {
                return;
            }
            a();
            b();
            c();
        }

        private void a() {
            p.this.getRootView().getWindowVisibleDisplayFrame(this.f3722b);
            int i = com.facebook.react.uimanager.b.a().heightPixels - this.f3722b.bottom;
            if (this.f3724d != i && i > this.f3723c) {
                this.f3724d = i;
                ar b2 = com.facebook.react.bridge.b.b();
                ar b3 = com.facebook.react.bridge.b.b();
                b3.putDouble("screenY", com.facebook.react.uimanager.o.c(this.f3722b.bottom));
                b3.putDouble("screenX", com.facebook.react.uimanager.o.c(this.f3722b.left));
                b3.putDouble("width", com.facebook.react.uimanager.o.c(this.f3722b.width()));
                b3.putDouble("height", com.facebook.react.uimanager.o.c(this.f3724d));
                b2.a("endCoordinates", b3);
                a("keyboardDidShow", b2);
            } else if (this.f3724d == 0 || i > this.f3723c) {
            } else {
                this.f3724d = 0;
                a("keyboardDidHide", (ar) null);
            }
        }

        private void b() {
            int rotation = ((WindowManager) p.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.e == rotation) {
                return;
            }
            this.e = rotation;
            a(rotation);
        }

        private void c() {
            com.facebook.react.uimanager.b.b(p.this.getContext());
            if (!a(this.f, com.facebook.react.uimanager.b.a()) || !a(this.g, com.facebook.react.uimanager.b.b())) {
                this.f.setTo(com.facebook.react.uimanager.b.a());
                this.g.setTo(com.facebook.react.uimanager.b.b());
                d();
            }
        }

        private boolean a(DisplayMetrics displayMetrics, DisplayMetrics displayMetrics2) {
            if (Build.VERSION.SDK_INT >= 17) {
                return displayMetrics.equals(displayMetrics2);
            }
            return displayMetrics.widthPixels == displayMetrics2.widthPixels && displayMetrics.heightPixels == displayMetrics2.heightPixels && displayMetrics.density == displayMetrics2.density && displayMetrics.densityDpi == displayMetrics2.densityDpi && displayMetrics.scaledDensity == displayMetrics2.scaledDensity && displayMetrics.xdpi == displayMetrics2.xdpi && displayMetrics.ydpi == displayMetrics2.ydpi;
        }

        private void a(int i) {
            String str;
            double d2;
            double d3;
            boolean z = true;
            switch (i) {
                case 0:
                    str = "portrait-primary";
                    d2 = 0.0d;
                    d3 = d2;
                    z = false;
                    break;
                case 1:
                    str = "landscape-primary";
                    d3 = -90.0d;
                    break;
                case 2:
                    str = "portrait-secondary";
                    d2 = 180.0d;
                    d3 = d2;
                    z = false;
                    break;
                case 3:
                    str = "landscape-secondary";
                    d3 = 90.0d;
                    break;
                default:
                    return;
            }
            ar b2 = com.facebook.react.bridge.b.b();
            b2.putString("name", str);
            b2.putDouble("rotationDegrees", d3);
            b2.putBoolean("isLandscape", z);
            a("namedOrientationDidChange", b2);
        }

        private void d() {
            ((DeviceInfoModule) p.this.f3713a.j().b(DeviceInfoModule.class)).emitUpdateDimensionsEvent();
        }

        private void a(String str, ar arVar) {
            if (p.this.f3713a != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) p.this.f3713a.j().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, arVar);
            }
        }
    }
}
