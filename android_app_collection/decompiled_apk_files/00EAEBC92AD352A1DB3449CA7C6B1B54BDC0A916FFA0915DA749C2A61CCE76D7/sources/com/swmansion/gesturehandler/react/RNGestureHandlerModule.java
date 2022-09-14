package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import c.f.a.k;
import c.f.a.n;
import c.f.a.o;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.q;
import com.facebook.react.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@com.facebook.react.d0.a.a(name = RNGestureHandlerModule.MODULE_NAME)
/* loaded from: classes.dex */
public class RNGestureHandlerModule extends ReactContextBaseJavaModule {
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String MODULE_NAME = "RNGestureHandlerModule";
    private List<Integer> mEnqueuedRootViewInit;
    private c.f.a.i mEventListener;
    private d[] mHandlerFactories;
    private com.swmansion.gesturehandler.react.d mInteractionManager;
    private final com.swmansion.gesturehandler.react.f mRegistry;
    private List<com.swmansion.gesturehandler.react.g> mRoots;

    /* loaded from: classes.dex */
    class a implements c.f.a.i {
        a() {
        }

        @Override // c.f.a.i
        public void a(c.f.a.b bVar, int i, int i2) {
            RNGestureHandlerModule.this.onStateChange(bVar, i, i2);
        }

        @Override // c.f.a.i
        public void a(c.f.a.b bVar, MotionEvent motionEvent) {
            RNGestureHandlerModule.this.onTouchEvent(bVar, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements n0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9916a;

        b(int i) {
            this.f9916a = i;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(m mVar) {
            View b2 = mVar.b(this.f9916a);
            if (b2 instanceof com.swmansion.gesturehandler.react.a) {
                ((com.swmansion.gesturehandler.react.a) b2).d();
            }
            synchronized (RNGestureHandlerModule.this.mEnqueuedRootViewInit) {
                RNGestureHandlerModule.this.mEnqueuedRootViewInit.remove(new Integer(this.f9916a));
            }
        }
    }

    /* loaded from: classes.dex */
    private static class c extends d<c.f.a.a> {
        private c() {
            super(null);
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: a */
        public c.f.a.a mo311a(Context context) {
            return new c.f.a.a();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String a() {
            return "FlingGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public void a(c.f.a.a aVar, ReadableMap readableMap) {
            super.a((c) aVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                aVar.e(readableMap.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                aVar.d(readableMap.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        public void a(c.f.a.a aVar, WritableMap writableMap) {
            super.a((c) aVar, writableMap);
            writableMap.putDouble("x", q.a(aVar.h()));
            writableMap.putDouble("y", q.a(aVar.i()));
            writableMap.putDouble("absoluteX", q.a(aVar.f()));
            writableMap.putDouble("absoluteY", q.a(aVar.g()));
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<c.f.a.a> b() {
            return c.f.a.a.class;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class d<T extends c.f.a.b> implements com.swmansion.gesturehandler.react.c<T> {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        /* renamed from: a */
        public abstract T mo311a(Context context);

        public abstract String a();

        public void a(T t, ReadableMap readableMap) {
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                t.b(readableMap.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_ENABLED)) {
                t.a(readableMap.getBoolean(RNGestureHandlerModule.KEY_ENABLED));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.handleHitSlopProperty(t, readableMap);
            }
        }

        @Override // com.swmansion.gesturehandler.react.c
        public void a(T t, WritableMap writableMap) {
            writableMap.putDouble(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS, t.j());
        }

        public abstract Class<T> b();
    }

    /* loaded from: classes.dex */
    private static class e extends d<c.f.a.g> {
        private e() {
            super(null);
        }

        /* synthetic */ e(a aVar) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: a  reason: collision with other method in class */
        public c.f.a.g mo311a(Context context) {
            return new c.f.a.g(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String a() {
            return "LongPressGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public void a(c.f.a.g gVar, ReadableMap readableMap) {
            super.a((e) gVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                gVar.a(readableMap.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (readableMap.hasKey("maxDist")) {
                gVar.a(q.a(readableMap.getDouble("maxDist")));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        public void a(c.f.a.g gVar, WritableMap writableMap) {
            super.a((e) gVar, writableMap);
            writableMap.putDouble("x", q.a(gVar.h()));
            writableMap.putDouble("y", q.a(gVar.i()));
            writableMap.putDouble("absoluteX", q.a(gVar.f()));
            writableMap.putDouble("absoluteY", q.a(gVar.g()));
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<c.f.a.g> b() {
            return c.f.a.g.class;
        }
    }

    /* loaded from: classes.dex */
    private static class f extends d<c.f.a.h> {
        private f() {
            super(null);
        }

        /* synthetic */ f(a aVar) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: a  reason: collision with other method in class */
        public c.f.a.h mo311a(Context context) {
            return new c.f.a.h();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String a() {
            return "NativeViewGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public void a(c.f.a.h hVar, ReadableMap readableMap) {
            super.a((f) hVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                hVar.d(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                hVar.c(readableMap.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        public void a(c.f.a.h hVar, WritableMap writableMap) {
            super.a((f) hVar, writableMap);
            writableMap.putBoolean("pointerInside", hVar.o());
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<c.f.a.h> b() {
            return c.f.a.h.class;
        }
    }

    /* loaded from: classes.dex */
    private static class g extends d<c.f.a.j> {
        private g() {
            super(null);
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: a  reason: collision with other method in class */
        public c.f.a.j mo311a(Context context) {
            return new c.f.a.j(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String a() {
            return "PanGestureHandler";
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(c.f.a.j r5, com.facebook.react.bridge.ReadableMap r6) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerModule.g.a(c.f.a.j, com.facebook.react.bridge.ReadableMap):void");
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        public void a(c.f.a.j jVar, WritableMap writableMap) {
            super.a((g) jVar, writableMap);
            writableMap.putDouble("x", q.a(jVar.h()));
            writableMap.putDouble("y", q.a(jVar.i()));
            writableMap.putDouble("absoluteX", q.a(jVar.f()));
            writableMap.putDouble("absoluteY", q.a(jVar.g()));
            writableMap.putDouble("translationX", q.a(jVar.t()));
            writableMap.putDouble("translationY", q.a(jVar.u()));
            writableMap.putDouble("velocityX", q.a(jVar.v()));
            writableMap.putDouble("velocityY", q.a(jVar.w()));
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<c.f.a.j> b() {
            return c.f.a.j.class;
        }
    }

    /* loaded from: classes.dex */
    private static class h extends d<k> {
        private h() {
            super(null);
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: a  reason: collision with other method in class */
        public k mo311a(Context context) {
            return new k();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String a() {
            return "PinchGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        public void a(k kVar, WritableMap writableMap) {
            super.a((h) kVar, writableMap);
            writableMap.putDouble("scale", kVar.v());
            writableMap.putDouble("focalX", q.a(kVar.t()));
            writableMap.putDouble("focalY", q.a(kVar.u()));
            writableMap.putDouble("velocity", kVar.w());
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<k> b() {
            return k.class;
        }
    }

    /* loaded from: classes.dex */
    private static class i extends d<n> {
        private i() {
            super(null);
        }

        /* synthetic */ i(a aVar) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: a  reason: collision with other method in class */
        public n mo311a(Context context) {
            return new n();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String a() {
            return "RotationGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        public void a(n nVar, WritableMap writableMap) {
            super.a((i) nVar, writableMap);
            writableMap.putDouble("rotation", nVar.v());
            writableMap.putDouble("anchorX", q.a(nVar.t()));
            writableMap.putDouble("anchorY", q.a(nVar.u()));
            writableMap.putDouble("velocity", nVar.w());
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<n> b() {
            return n.class;
        }
    }

    /* loaded from: classes.dex */
    private static class j extends d<o> {
        private j() {
            super(null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        /* renamed from: a  reason: collision with other method in class */
        public o mo311a(Context context) {
            return new o();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public String a() {
            return "TapGestureHandler";
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public void a(o oVar, ReadableMap readableMap) {
            super.a((j) oVar, readableMap);
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                oVar.e(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                oVar.b(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                oVar.a(readableMap.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                oVar.b(q.a(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (readableMap.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                oVar.c(q.a(readableMap.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (readableMap.hasKey("maxDist")) {
                oVar.a(q.a(readableMap.getDouble("maxDist")));
            }
            if (readableMap.hasKey("minPointers")) {
                oVar.d(readableMap.getInt("minPointers"));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d, com.swmansion.gesturehandler.react.c
        public void a(o oVar, WritableMap writableMap) {
            super.a((j) oVar, writableMap);
            writableMap.putDouble("x", q.a(oVar.h()));
            writableMap.putDouble("y", q.a(oVar.i()));
            writableMap.putDouble("absoluteX", q.a(oVar.f()));
            writableMap.putDouble("absoluteY", q.a(oVar.g()));
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.d
        public Class<o> b() {
            return o.class;
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEventListener = new a();
        this.mHandlerFactories = new d[]{new f(null), new j(null), new e(null), new g(null), new h(null), new i(null), new c(null)};
        this.mRegistry = new com.swmansion.gesturehandler.react.f();
        this.mInteractionManager = new com.swmansion.gesturehandler.react.d();
        this.mRoots = new ArrayList();
        this.mEnqueuedRootViewInit = new ArrayList();
    }

    private d findFactoryForHandler(c.f.a.b bVar) {
        int i2 = 0;
        while (true) {
            d[] dVarArr = this.mHandlerFactories;
            if (i2 < dVarArr.length) {
                d dVar = dVarArr[i2];
                if (dVar.b().equals(bVar.getClass())) {
                    return dVar;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    private com.swmansion.gesturehandler.react.g findRootHelperForViewAncestor(int i2) {
        int resolveRootTagFromReactTag = ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).resolveRootTagFromReactTag(i2);
        if (resolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.mRoots) {
            for (int i3 = 0; i3 < this.mRoots.size(); i3++) {
                com.swmansion.gesturehandler.react.g gVar = this.mRoots.get(i3);
                ViewGroup a2 = gVar.a();
                if ((a2 instanceof y) && ((y) a2).getRootViewTag() == resolveRootTagFromReactTag) {
                    return gVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleHitSlopProperty(c.f.a.b bVar, ReadableMap readableMap) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (readableMap.getType(KEY_HIT_SLOP) == ReadableType.Number) {
            float a2 = q.a(readableMap.getDouble(KEY_HIT_SLOP));
            bVar.a(a2, a2, a2, a2, Float.NaN, Float.NaN);
            return;
        }
        ReadableMap mo210getMap = readableMap.mo210getMap(KEY_HIT_SLOP);
        if (mo210getMap.hasKey(KEY_HIT_SLOP_HORIZONTAL)) {
            f2 = q.a(mo210getMap.getDouble(KEY_HIT_SLOP_HORIZONTAL));
            f3 = f2;
        } else {
            f2 = Float.NaN;
            f3 = Float.NaN;
        }
        if (mo210getMap.hasKey(KEY_HIT_SLOP_VERTICAL)) {
            f4 = q.a(mo210getMap.getDouble(KEY_HIT_SLOP_VERTICAL));
            f5 = f4;
        } else {
            f4 = Float.NaN;
            f5 = Float.NaN;
        }
        if (mo210getMap.hasKey(KEY_HIT_SLOP_LEFT)) {
            f2 = q.a(mo210getMap.getDouble(KEY_HIT_SLOP_LEFT));
        }
        float f6 = f2;
        if (mo210getMap.hasKey(KEY_HIT_SLOP_TOP)) {
            f5 = q.a(mo210getMap.getDouble(KEY_HIT_SLOP_TOP));
        }
        float f7 = f5;
        if (mo210getMap.hasKey(KEY_HIT_SLOP_RIGHT)) {
            f3 = q.a(mo210getMap.getDouble(KEY_HIT_SLOP_RIGHT));
        }
        float f8 = f3;
        if (mo210getMap.hasKey(KEY_HIT_SLOP_BOTTOM)) {
            f4 = q.a(mo210getMap.getDouble(KEY_HIT_SLOP_BOTTOM));
        }
        bVar.a(f6, f7, f8, f4, mo210getMap.hasKey(KEY_HIT_SLOP_WIDTH) ? q.a(mo210getMap.getDouble(KEY_HIT_SLOP_WIDTH)) : Float.NaN, mo210getMap.hasKey(KEY_HIT_SLOP_HEIGHT) ? q.a(mo210getMap.getDouble(KEY_HIT_SLOP_HEIGHT)) : Float.NaN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStateChange(c.f.a.b bVar, int i2, int i3) {
        if (bVar.l() < 0) {
            return;
        }
        ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().a(com.swmansion.gesturehandler.react.i.b(bVar, i2, i3, findFactoryForHandler(bVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTouchEvent(c.f.a.b bVar, MotionEvent motionEvent) {
        if (bVar.l() >= 0 && bVar.k() == 4) {
            ((UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class)).getEventDispatcher().a(com.swmansion.gesturehandler.react.b.b(bVar, findFactoryForHandler(bVar)));
        }
    }

    private void tryInitializeHandlerForReactRootView(int i2) {
        UIManagerModule uIManagerModule = (UIManagerModule) getReactApplicationContext().getNativeModule(UIManagerModule.class);
        int resolveRootTagFromReactTag = uIManagerModule.resolveRootTagFromReactTag(i2);
        if (resolveRootTagFromReactTag < 1) {
            throw new JSApplicationIllegalArgumentException("Could find root view for a given ancestor with tag " + i2);
        }
        synchronized (this.mRoots) {
            for (int i3 = 0; i3 < this.mRoots.size(); i3++) {
                ViewGroup a2 = this.mRoots.get(i3).a();
                if ((a2 instanceof y) && ((y) a2).getRootViewTag() == resolveRootTagFromReactTag) {
                    return;
                }
            }
            synchronized (this.mEnqueuedRootViewInit) {
                if (this.mEnqueuedRootViewInit.contains(Integer.valueOf(resolveRootTagFromReactTag))) {
                    return;
                }
                this.mEnqueuedRootViewInit.add(Integer.valueOf(resolveRootTagFromReactTag));
                uIManagerModule.addUIBlock(new b(resolveRootTagFromReactTag));
            }
        }
    }

    @ReactMethod
    public void attachGestureHandler(int i2, int i3) {
        tryInitializeHandlerForReactRootView(i3);
        if (this.mRegistry.a(i2, i3)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i2 + " does not exists");
    }

    @ReactMethod
    public void createGestureHandler(String str, int i2, ReadableMap readableMap) {
        int i3 = 0;
        while (true) {
            d[] dVarArr = this.mHandlerFactories;
            if (i3 >= dVarArr.length) {
                throw new JSApplicationIllegalArgumentException("Invalid handler name " + str);
            }
            d dVar = dVarArr[i3];
            if (dVar.a().equals(str)) {
                c.f.a.b mo311a = dVar.mo311a(getReactApplicationContext());
                mo311a.a(i2);
                mo311a.a(this.mEventListener);
                this.mRegistry.a(mo311a);
                this.mInteractionManager.a(mo311a, readableMap);
                dVar.a((d) mo311a, readableMap);
                return;
            }
            i3++;
        }
    }

    @ReactMethod
    public void dropGestureHandler(int i2) {
        this.mInteractionManager.a(i2);
        this.mRegistry.a(i2);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map getConstants() {
        return com.facebook.react.common.f.a("State", com.facebook.react.common.f.a("UNDETERMINED", 0, "BEGAN", 2, "ACTIVE", 4, "CANCELLED", 3, "FAILED", 1, "END", 5), "Direction", com.facebook.react.common.f.a("RIGHT", 1, "LEFT", 2, "UP", 4, "DOWN", 8));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public com.swmansion.gesturehandler.react.f getRegistry() {
        return this.mRegistry;
    }

    @ReactMethod
    public void handleClearJSResponder() {
    }

    @ReactMethod
    public void handleSetJSResponder(int i2, boolean z) {
        com.swmansion.gesturehandler.react.g findRootHelperForViewAncestor;
        if (this.mRegistry == null || (findRootHelperForViewAncestor = findRootHelperForViewAncestor(i2)) == null) {
            return;
        }
        findRootHelperForViewAncestor.a(i2, z);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mRegistry.a();
        this.mInteractionManager.a();
        synchronized (this.mRoots) {
            while (!this.mRoots.isEmpty()) {
                int size = this.mRoots.size();
                com.swmansion.gesturehandler.react.g gVar = this.mRoots.get(0);
                ViewGroup a2 = gVar.a();
                if (a2 instanceof com.swmansion.gesturehandler.react.a) {
                    ((com.swmansion.gesturehandler.react.a) a2).e();
                } else {
                    gVar.b();
                }
                if (this.mRoots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
        }
        super.onCatalystInstanceDestroy();
    }

    public void registerRootHelper(com.swmansion.gesturehandler.react.g gVar) {
        synchronized (this.mRoots) {
            if (this.mRoots.contains(gVar)) {
                throw new IllegalStateException("Root helper" + gVar + " already registered");
            }
            this.mRoots.add(gVar);
        }
    }

    public void unregisterRootHelper(com.swmansion.gesturehandler.react.g gVar) {
        synchronized (this.mRoots) {
            this.mRoots.remove(gVar);
        }
    }

    @ReactMethod
    public void updateGestureHandler(int i2, ReadableMap readableMap) {
        d findFactoryForHandler;
        c.f.a.b b2 = this.mRegistry.b(i2);
        if (b2 == null || (findFactoryForHandler = findFactoryForHandler(b2)) == null) {
            return;
        }
        this.mInteractionManager.a(i2);
        this.mInteractionManager.a(b2, readableMap);
        findFactoryForHandler.a((d) b2, readableMap);
    }
}
