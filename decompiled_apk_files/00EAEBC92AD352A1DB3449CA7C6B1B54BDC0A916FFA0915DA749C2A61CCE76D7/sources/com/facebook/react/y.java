package com.facebook.react;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.q0;
/* loaded from: classes.dex */
public class y extends FrameLayout implements f0, com.facebook.react.uimanager.y {

    /* renamed from: b  reason: collision with root package name */
    private r f6416b;

    /* renamed from: c  reason: collision with root package name */
    private String f6417c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f6418d;

    /* renamed from: e  reason: collision with root package name */
    private String f6419e;

    /* renamed from: f  reason: collision with root package name */
    private a f6420f;

    /* renamed from: g  reason: collision with root package name */
    private b f6421g;

    /* renamed from: h  reason: collision with root package name */
    private int f6422h;
    private boolean i;
    private boolean j;
    private com.facebook.react.uimanager.h k;
    private final o l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final boolean s;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b  reason: collision with root package name */
        private final Rect f6423b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6424c;

        /* renamed from: d  reason: collision with root package name */
        private int f6425d = 0;

        /* renamed from: e  reason: collision with root package name */
        private int f6426e = 0;

        /* renamed from: f  reason: collision with root package name */
        private DisplayMetrics f6427f = new DisplayMetrics();

        /* renamed from: g  reason: collision with root package name */
        private DisplayMetrics f6428g = new DisplayMetrics();

        a() {
            com.facebook.react.uimanager.c.b(y.this.getContext().getApplicationContext());
            this.f6423b = new Rect();
            this.f6424c = (int) com.facebook.react.uimanager.q.b(60.0f);
        }

        private WritableMap a(double d2, double d3, double d4, double d5) {
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble("height", d5);
            createMap2.putDouble("screenX", d3);
            createMap2.putDouble("width", d4);
            createMap2.putDouble("screenY", d2);
            createMap.putMap("endCoordinates", createMap2);
            createMap.putString("easing", "keyboard");
            createMap.putDouble("duration", 0.0d);
            return createMap;
        }

        private void a() {
            com.facebook.react.uimanager.c.a(y.this.getContext());
            if (!a(this.f6427f, com.facebook.react.uimanager.c.b()) || !a(this.f6428g, com.facebook.react.uimanager.c.a())) {
                this.f6427f.setTo(com.facebook.react.uimanager.c.b());
                this.f6428g.setTo(com.facebook.react.uimanager.c.a());
                d();
            }
        }

        private void a(int i) {
            double d2;
            String str;
            double d3;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    d3 = -90.0d;
                    str = "landscape-primary";
                } else if (i == 2) {
                    d2 = 180.0d;
                    str = "portrait-secondary";
                } else if (i != 3) {
                    return;
                } else {
                    d3 = 90.0d;
                    str = "landscape-secondary";
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("name", str);
                createMap.putDouble("rotationDegrees", d3);
                createMap.putBoolean("isLandscape", z);
                y.this.a("namedOrientationDidChange", createMap);
            }
            d2 = 0.0d;
            str = "portrait-primary";
            d3 = d2;
            z = false;
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putString("name", str);
            createMap2.putDouble("rotationDegrees", d3);
            createMap2.putBoolean("isLandscape", z);
            y.this.a("namedOrientationDidChange", createMap2);
        }

        private boolean a(DisplayMetrics displayMetrics, DisplayMetrics displayMetrics2) {
            return Build.VERSION.SDK_INT >= 17 ? displayMetrics.equals(displayMetrics2) : displayMetrics.widthPixels == displayMetrics2.widthPixels && displayMetrics.heightPixels == displayMetrics2.heightPixels && displayMetrics.density == displayMetrics2.density && displayMetrics.densityDpi == displayMetrics2.densityDpi && displayMetrics.scaledDensity == displayMetrics2.scaledDensity && displayMetrics.xdpi == displayMetrics2.xdpi && displayMetrics.ydpi == displayMetrics2.ydpi;
        }

        private void b() {
            int rotation = ((WindowManager) y.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f6426e == rotation) {
                return;
            }
            this.f6426e = rotation;
            a(rotation);
        }

        private void c() {
            y.this.getRootView().getWindowVisibleDisplayFrame(this.f6423b);
            int i = com.facebook.react.uimanager.c.b().heightPixels - this.f6423b.bottom;
            boolean z = true;
            if (this.f6425d != i && i > this.f6424c) {
                this.f6425d = i;
                y.this.a("keyboardDidShow", a(com.facebook.react.uimanager.q.a(this.f6423b.bottom), com.facebook.react.uimanager.q.a(this.f6423b.left), com.facebook.react.uimanager.q.a(this.f6423b.width()), com.facebook.react.uimanager.q.a(this.f6425d)));
                return;
            }
            if (this.f6425d == 0 || i > this.f6424c) {
                z = false;
            }
            if (!z) {
                return;
            }
            this.f6425d = 0;
            y.this.a("keyboardDidHide", a(com.facebook.react.uimanager.q.a(this.f6423b.height()), 0.0d, com.facebook.react.uimanager.q.a(this.f6423b.width()), 0.0d));
        }

        private void d() {
            ((DeviceInfoModule) y.this.f6416b.b().getNativeModule(DeviceInfoModule.class)).emitUpdateDimensionsEvent();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (y.this.f6416b == null || !y.this.i || y.this.f6416b.b() == null) {
                return;
            }
            c();
            b();
            a();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(y yVar);
    }

    public y(Context context) {
        super(context);
        this.l = new o(this);
        this.m = false;
        this.n = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.o = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.p = 0;
        this.q = 0;
        this.r = 1;
        this.s = false;
        e();
    }

    private void a(int i, int i2) {
        r rVar = this.f6416b;
        if (rVar == null) {
            c.d.d.e.a.d("ReactNative", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        ReactContext b2 = rVar.b();
        if (b2 == null) {
            return;
        }
        q0.a(b2, getUIManagerType()).updateRootLayoutSpecs(getRootViewTag(), i, i2);
    }

    private void b(MotionEvent motionEvent) {
        r rVar = this.f6416b;
        if (rVar == null || !this.i || rVar.b() == null) {
            c.d.d.e.a.d("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.k == null) {
            c.d.d.e.a.d("ReactNative", "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.k.a(motionEvent, ((UIManagerModule) this.f6416b.b().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    private void d() {
        com.facebook.systrace.a.a(0L, "attachToReactInstanceManager");
        if (this.i) {
            return;
        }
        try {
            this.i = true;
            r rVar = this.f6416b;
            c.d.k.a.a.a(rVar);
            rVar.a(this);
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        } finally {
            com.facebook.systrace.a.a(0L);
        }
    }

    private void e() {
        setClipChildren(false);
    }

    private void f() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private a getCustomGlobalLayoutListener() {
        if (this.f6420f == null) {
            this.f6420f = new a();
        }
        return this.f6420f;
    }

    private void setAllowImmediateUIOperationExecution(boolean z) {
        ReactContext b2;
        r rVar = this.f6416b;
        if (rVar == null || (b2 = rVar.b()) == null) {
            return;
        }
        q0.a(b2, getUIManagerType()).setAllowImmediateUIOperationExecution(z);
    }

    @Override // com.facebook.react.uimanager.y
    public void a() {
        com.facebook.systrace.a.a(0L, "ReactRootView.runApplication");
        try {
            if (this.f6416b != null && this.i) {
                ReactContext b2 = this.f6416b.b();
                if (b2 == null) {
                    return;
                }
                CatalystInstance catalystInstance = b2.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (!this.s) {
                    if (this.m) {
                        a(this.n, this.o);
                    }
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("rootTag", getRootViewTag());
                    Bundle appProperties = getAppProperties();
                    if (appProperties != null) {
                        writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                    }
                    this.j = true;
                    ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
                }
            }
        } finally {
            com.facebook.systrace.a.a(0L);
        }
    }

    @Override // com.facebook.react.uimanager.y
    public void a(int i) {
        if (i != 101) {
            return;
        }
        b();
    }

    @Override // com.facebook.react.uimanager.f0
    public void a(MotionEvent motionEvent) {
        r rVar = this.f6416b;
        if (rVar == null || !this.i || rVar.b() == null) {
            c.d.d.e.a.d("ReactNative", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.k == null) {
            c.d.d.e.a.d("ReactNative", "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            this.k.b(motionEvent, ((UIManagerModule) this.f6416b.b().getNativeModule(UIManagerModule.class)).getEventDispatcher());
        }
    }

    public void a(r rVar, String str, Bundle bundle) {
        a(rVar, str, bundle, null);
    }

    public void a(r rVar, String str, Bundle bundle, String str2) {
        com.facebook.systrace.a.a(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            c.d.k.a.a.a(this.f6416b == null, "This root view has already been attached to a catalyst instance manager");
            this.f6416b = rVar;
            this.f6417c = str;
            this.f6418d = bundle;
            this.f6419e = str2;
            this.f6416b.a();
            d();
        } finally {
            com.facebook.systrace.a.a(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, WritableMap writableMap) {
        r rVar = this.f6416b;
        if (rVar != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) rVar.b().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    @Override // com.facebook.react.uimanager.f0
    public void a(Throwable th) {
        r rVar = this.f6416b;
        if (rVar == null || rVar.b() == null) {
            throw new RuntimeException(th);
        }
        this.f6416b.b().handleException(new com.facebook.react.uimanager.g(th.getMessage(), this, th));
    }

    public void b() {
        this.k = new com.facebook.react.uimanager.h(this);
        b bVar = this.f6421g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void c() {
        UiThreadUtil.assertOnUiThread();
        r rVar = this.f6416b;
        if (rVar != null && this.i) {
            rVar.b(this);
            this.i = false;
        }
        this.f6416b = null;
        this.j = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e2) {
            a(e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        r rVar = this.f6416b;
        if (rVar == null || !this.i || rVar.b() == null) {
            c.d.d.e.a.d("ReactNative", "Unable to handle key event as the catalyst instance has not been attached");
        } else {
            this.l.a(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    protected void finalize() {
        super.finalize();
        c.d.k.a.a.a(!this.i, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    @Override // com.facebook.react.uimanager.y
    public Bundle getAppProperties() {
        return this.f6418d;
    }

    @Override // com.facebook.react.uimanager.y
    public int getHeightMeasureSpec() {
        return this.o;
    }

    @Override // com.facebook.react.uimanager.y
    public String getInitialUITemplate() {
        return this.f6419e;
    }

    @Override // com.facebook.react.uimanager.y
    public String getJSModuleName() {
        String str = this.f6417c;
        c.d.k.a.a.a(str);
        return str;
    }

    public r getReactInstanceManager() {
        return this.f6416b;
    }

    @Override // com.facebook.react.uimanager.y
    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // com.facebook.react.uimanager.y
    public int getRootViewTag() {
        return this.f6422h;
    }

    @Override // com.facebook.react.uimanager.y
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.y
    public int getUIManagerType() {
        return this.r;
    }

    @Override // com.facebook.react.uimanager.y
    public int getWidthMeasureSpec() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i) {
            f();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.i) {
            f();
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        r rVar = this.f6416b;
        if (rVar == null || !this.i || rVar.b() == null) {
            c.d.d.e.a.d("ReactNative", "Unable to handle focus changed event as the catalyst instance has not been attached");
        } else {
            this.l.a();
        }
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.s) {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003f A[Catch: all -> 0x00be, LOOP:1: B:20:0x0039->B:22:0x003f, LOOP_END, TryCatch #0 {all -> 0x00be, blocks: (B:7:0x0017, B:9:0x001b, B:14:0x0023, B:18:0x0032, B:24:0x005e, B:28:0x0067, B:33:0x0091, B:35:0x009a, B:37:0x009e, B:44:0x00b3, B:39:0x00a4, B:41:0x00a8, B:43:0x00ac, B:30:0x006d, B:32:0x0073, B:20:0x0039, B:22:0x003f), top: B:50:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073 A[Catch: all -> 0x00be, LOOP:0: B:30:0x006d->B:32:0x0073, LOOP_END, TryCatch #0 {all -> 0x00be, blocks: (B:7:0x0017, B:9:0x001b, B:14:0x0023, B:18:0x0032, B:24:0x005e, B:28:0x0067, B:33:0x0091, B:35:0x009a, B:37:0x009e, B:44:0x00b3, B:39:0x00a4, B:41:0x00a8, B:43:0x00ac, B:30:0x006d, B:32:0x0073, B:20:0x0039, B:22:0x003f), top: B:50:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[Catch: all -> 0x00be, TryCatch #0 {all -> 0x00be, blocks: (B:7:0x0017, B:9:0x001b, B:14:0x0023, B:18:0x0032, B:24:0x005e, B:28:0x0067, B:33:0x0091, B:35:0x009a, B:37:0x009e, B:44:0x00b3, B:39:0x00a4, B:41:0x00a8, B:43:0x00ac, B:30:0x006d, B:32:0x0073, B:20:0x0039, B:22:0x003f), top: B:50:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4 A[Catch: all -> 0x00be, TryCatch #0 {all -> 0x00be, blocks: (B:7:0x0017, B:9:0x001b, B:14:0x0023, B:18:0x0032, B:24:0x005e, B:28:0x0067, B:33:0x0091, B:35:0x009a, B:37:0x009e, B:44:0x00b3, B:39:0x00a4, B:41:0x00a8, B:43:0x00ac, B:30:0x006d, B:32:0x0073, B:20:0x0039, B:22:0x003f), top: B:50:0x0017 }] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            r10.setAllowImmediateUIOperationExecution(r0)
            boolean r1 = r10.s
            r2 = 1
            if (r1 == 0) goto L10
            super.onMeasure(r11, r12)
            r10.setAllowImmediateUIOperationExecution(r2)
            return
        L10:
            r3 = 0
            java.lang.String r1 = "ReactRootView.onMeasure"
            com.facebook.systrace.a.a(r3, r1)
            int r1 = r10.n     // Catch: java.lang.Throwable -> Lbe
            if (r11 != r1) goto L22
            int r1 = r10.o     // Catch: java.lang.Throwable -> Lbe
            if (r12 == r1) goto L20
            goto L22
        L20:
            r1 = 0
            goto L23
        L22:
            r1 = 1
        L23:
            r10.n = r11     // Catch: java.lang.Throwable -> Lbe
            r10.o = r12     // Catch: java.lang.Throwable -> Lbe
            int r5 = android.view.View.MeasureSpec.getMode(r11)     // Catch: java.lang.Throwable -> Lbe
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L37
            if (r5 != 0) goto L32
            goto L37
        L32:
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch: java.lang.Throwable -> Lbe
            goto L5e
        L37:
            r11 = 0
            r5 = 0
        L39:
            int r7 = r10.getChildCount()     // Catch: java.lang.Throwable -> Lbe
            if (r11 >= r7) goto L5d
            android.view.View r7 = r10.getChildAt(r11)     // Catch: java.lang.Throwable -> Lbe
            int r8 = r7.getLeft()     // Catch: java.lang.Throwable -> Lbe
            int r9 = r7.getMeasuredWidth()     // Catch: java.lang.Throwable -> Lbe
            int r8 = r8 + r9
            int r9 = r7.getPaddingLeft()     // Catch: java.lang.Throwable -> Lbe
            int r8 = r8 + r9
            int r7 = r7.getPaddingRight()     // Catch: java.lang.Throwable -> Lbe
            int r8 = r8 + r7
            int r5 = java.lang.Math.max(r5, r8)     // Catch: java.lang.Throwable -> Lbe
            int r11 = r11 + 1
            goto L39
        L5d:
            r11 = r5
        L5e:
            int r5 = android.view.View.MeasureSpec.getMode(r12)     // Catch: java.lang.Throwable -> Lbe
            if (r5 == r6) goto L6c
            if (r5 != 0) goto L67
            goto L6c
        L67:
            int r12 = android.view.View.MeasureSpec.getSize(r12)     // Catch: java.lang.Throwable -> Lbe
            goto L91
        L6c:
            r12 = 0
        L6d:
            int r5 = r10.getChildCount()     // Catch: java.lang.Throwable -> Lbe
            if (r0 >= r5) goto L91
            android.view.View r5 = r10.getChildAt(r0)     // Catch: java.lang.Throwable -> Lbe
            int r6 = r5.getTop()     // Catch: java.lang.Throwable -> Lbe
            int r7 = r5.getMeasuredHeight()     // Catch: java.lang.Throwable -> Lbe
            int r6 = r6 + r7
            int r7 = r5.getPaddingTop()     // Catch: java.lang.Throwable -> Lbe
            int r6 = r6 + r7
            int r5 = r5.getPaddingBottom()     // Catch: java.lang.Throwable -> Lbe
            int r6 = r6 + r5
            int r12 = java.lang.Math.max(r12, r6)     // Catch: java.lang.Throwable -> Lbe
            int r0 = r0 + 1
            goto L6d
        L91:
            r10.setMeasuredDimension(r11, r12)     // Catch: java.lang.Throwable -> Lbe
            r10.m = r2     // Catch: java.lang.Throwable -> Lbe
            com.facebook.react.r r0 = r10.f6416b     // Catch: java.lang.Throwable -> Lbe
            if (r0 == 0) goto La2
            boolean r0 = r10.i     // Catch: java.lang.Throwable -> Lbe
            if (r0 != 0) goto La2
            r10.d()     // Catch: java.lang.Throwable -> Lbe
            goto Lb3
        La2:
            if (r1 != 0) goto Lac
            int r0 = r10.p     // Catch: java.lang.Throwable -> Lbe
            if (r0 != r11) goto Lac
            int r0 = r10.q     // Catch: java.lang.Throwable -> Lbe
            if (r0 == r12) goto Lb3
        Lac:
            int r0 = r10.n     // Catch: java.lang.Throwable -> Lbe
            int r1 = r10.o     // Catch: java.lang.Throwable -> Lbe
            r10.a(r0, r1)     // Catch: java.lang.Throwable -> Lbe
        Lb3:
            r10.p = r11     // Catch: java.lang.Throwable -> Lbe
            r10.q = r12     // Catch: java.lang.Throwable -> Lbe
            r10.setAllowImmediateUIOperationExecution(r2)
            com.facebook.systrace.a.a(r3)
            return
        Lbe:
            r11 = move-exception
            r10.setAllowImmediateUIOperationExecution(r2)
            com.facebook.systrace.a.a(r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.y.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b(motionEvent);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.j) {
            this.j = false;
            String str = this.f6417c;
            if (str == null) {
                return;
            }
            ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, str, this.f6422h);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        r rVar = this.f6416b;
        if (rVar == null || !this.i || rVar.b() == null) {
            c.d.d.e.a.d("ReactNative", "Unable to handle child focus changed event as the catalyst instance has not been attached");
        } else {
            this.l.a(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f6418d = bundle;
        if (getRootViewTag() != 0) {
            a();
        }
    }

    public void setEventListener(b bVar) {
        this.f6421g = bVar;
    }

    public void setIsFabric(boolean z) {
        this.r = z ? 2 : 1;
    }

    @Override // com.facebook.react.uimanager.y
    public void setRootViewTag(int i) {
        this.f6422h = i;
    }

    @Override // com.facebook.react.uimanager.y
    public void setShouldLogContentAppeared(boolean z) {
        this.j = z;
    }
}
