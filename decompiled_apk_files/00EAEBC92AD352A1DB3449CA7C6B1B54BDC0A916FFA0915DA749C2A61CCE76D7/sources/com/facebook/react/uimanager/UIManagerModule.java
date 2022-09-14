package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.systrace.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
@com.facebook.react.d0.a.a(name = UIManagerModule.NAME)
/* loaded from: classes.dex */
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    private static final boolean DEBUG = c.d.f.b.c.a().a(c.d.f.c.a.f2910d);
    public static final String NAME = "UIManager";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final com.facebook.react.uimanager.events.d mEventDispatcher;
    private final List<t0> mListeners;
    private final f mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final o0 mUIImplementation;
    private Map<String, WritableMap> mViewManagerConstantsCache;
    private volatile int mViewManagerConstantsCacheSize;
    private final a1 mViewManagerRegistry;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements e {
        a() {
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.e
        public String a(String str) {
            Map map = (Map) UIManagerModule.this.mCustomDirectEvents.get(str);
            return map != null ? (String) map.get("registrationName") : str;
        }
    }

    /* loaded from: classes.dex */
    class b extends GuardedRunnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5853b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f5854c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, int i, Object obj) {
            super(reactContext);
            this.f5853b = i;
            this.f5854c = obj;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.a(this.f5853b, this.f5854c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UIManager f5856b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5857c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReadableMap f5858d;

        c(UIManagerModule uIManagerModule, UIManager uIManager, int i, ReadableMap readableMap) {
            this.f5856b = uIManager;
            this.f5857c = i;
            this.f5858d = readableMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5856b.synchronouslyUpdateViewOnUIThread(this.f5857c, this.f5858d);
        }
    }

    /* loaded from: classes.dex */
    class d extends GuardedRunnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5859b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5860c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5861d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, int i, int i2, int i3) {
            super(reactContext);
            this.f5859b = i;
            this.f5860c = i2;
            this.f5861d = i3;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule.this.mUIImplementation.b(this.f5859b, this.f5860c, this.f5861d);
            UIManagerModule.this.mUIImplementation.a(-1);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        String a(String str);
    }

    /* loaded from: classes.dex */
    private class f implements ComponentCallbacks2 {
        private f(UIManagerModule uIManagerModule) {
        }

        /* synthetic */ f(UIManagerModule uIManagerModule, a aVar) {
            this(uIManagerModule);
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i >= 60) {
                d1.a().b();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        ViewManager a(String str);

        List<String> a();
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, g gVar, int i) {
        this(reactApplicationContext, gVar, new p0(), i);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, g gVar, p0 p0Var, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new f(this, null);
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        com.facebook.react.uimanager.c.b(reactApplicationContext);
        this.mEventDispatcher = new com.facebook.react.uimanager.events.d(reactApplicationContext);
        this.mModuleConstants = createConstants(gVar);
        this.mCustomDirectEvents = r0.c();
        this.mViewManagerRegistry = new a1(gVar);
        this.mUIImplementation = p0Var.a(reactApplicationContext, this.mViewManagerRegistry, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        this(reactApplicationContext, list, new p0(), i);
    }

    @Deprecated
    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, p0 p0Var, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new f(this, null);
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        com.facebook.react.uimanager.c.b(reactApplicationContext);
        this.mEventDispatcher = new com.facebook.react.uimanager.events.d(reactApplicationContext);
        this.mCustomDirectEvents = com.facebook.react.common.f.b();
        this.mModuleConstants = createConstants(list, null, this.mCustomDirectEvents);
        this.mViewManagerRegistry = new a1(list);
        this.mUIImplementation = p0Var.a(reactApplicationContext, this.mViewManagerRegistry, this.mEventDispatcher, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private WritableMap computeConstantsForViewManager(String str) {
        ViewManager b2 = str != null ? this.mUIImplementation.b(str) : null;
        if (b2 == null) {
            return null;
        }
        b.AbstractC0140b a2 = com.facebook.systrace.b.a(0L, "UIManagerModule.getConstantsForViewManager");
        a2.a("ViewManager", b2.getName());
        a2.a("Lazy", (Object) true);
        a2.a();
        try {
            Map<String, Object> a3 = s0.a(b2, null, null, null, this.mCustomDirectEvents);
            if (a3 == null) {
                return null;
            }
            return Arguments.makeNativeMap(a3);
        } finally {
            com.facebook.systrace.b.a(0L).a();
        }
    }

    private static Map<String, Object> createConstants(g gVar) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        b.AbstractC0140b a2 = com.facebook.systrace.b.a(0L, "CreateUIManagerConstants");
        a2.a("Lazy", (Object) true);
        a2.a();
        try {
            return s0.a(gVar);
        } finally {
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    private static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        b.AbstractC0140b a2 = com.facebook.systrace.b.a(0L, "CreateUIManagerConstants");
        a2.a("Lazy", (Object) false);
        a2.a();
        try {
            return s0.a(list, map, map2);
        } finally {
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends View> int addRootView(T t) {
        return addRootView(t, null, null);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t, WritableMap writableMap, String str) {
        com.facebook.systrace.a.a(0L, "UIManagerModule.addRootView");
        int a2 = z.a();
        this.mUIImplementation.a((o0) t, a2, new k0(getReactApplicationContext(), t.getContext(), ((y) t).getSurfaceID()));
        com.facebook.systrace.a.a(0L);
        return a2;
    }

    public void addUIBlock(n0 n0Var) {
        this.mUIImplementation.a(n0Var);
    }

    public void addUIManagerListener(t0 t0Var) {
        this.mListeners.add(t0Var);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.a();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.a(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i + ", class: " + str + ", props: " + readableMap;
            c.d.d.e.a.a("ReactNative", str2);
            c.d.f.b.c.a().a(c.d.f.c.a.f2910d, str2);
        }
        this.mUIImplementation.a(i, str, i2, readableMap);
    }

    @ReactMethod
    public void dismissPopupMenu() {
        this.mUIImplementation.c();
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        this.mUIImplementation.a(i, i2, readableArray);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        this.mUIImplementation.a(i, str, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, Dynamic dynamic, ReadableArray readableArray) {
        if (dynamic.getType() == ReadableType.Number) {
            int asInt = dynamic.asInt();
            UIManager a2 = q0.a(getReactApplicationContext(), com.facebook.react.uimanager.f1.a.a(i));
            if (a2 == null) {
                return;
            }
            a2.dispatchCommand(i, asInt, readableArray);
        } else if (dynamic.getType() != ReadableType.String) {
        } else {
            String asString = dynamic.asString();
            UIManager a3 = q0.a(getReactApplicationContext(), com.facebook.react.uimanager.f1.a.a(i));
            if (a3 == null) {
                return;
            }
            a3.dispatchCommand(i, asString, readableArray);
        }
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.a(i, Math.round(q.a(readableArray.getDouble(0))), Math.round(q.a(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        Map<String, WritableMap> map = this.mViewManagerConstantsCache;
        if (map == null || !map.containsKey(str)) {
            return computeConstantsForViewManager(str);
        }
        WritableMap writableMap = this.mViewManagerConstantsCache.get(str);
        int i = this.mViewManagerConstantsCacheSize - 1;
        this.mViewManagerConstantsCacheSize = i;
        if (i <= 0) {
            this.mViewManagerConstantsCache = null;
        }
        return writableMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(s0.a());
    }

    public e getDirectEventNamesResolver() {
        return new a();
    }

    public com.facebook.react.uimanager.events.d getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.d();
    }

    public o0 getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public a1 getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        this.mEventDispatcher.a(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    public void invalidateNodeLayout(int i) {
        a0 f2 = this.mUIImplementation.f(i);
        if (f2 != null) {
            f2.g();
            this.mUIImplementation.a(-1);
            return;
        }
        c.d.d.e.a.d("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i);
    }

    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            c.d.d.e.a.a("ReactNative", str);
            c.d.f.b.c.a().a(c.d.f.c.a.f2910d, str);
        }
        this.mUIImplementation.a(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        this.mUIImplementation.a(i, callback);
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        this.mUIImplementation.b(i, callback);
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        this.mUIImplementation.a(i, i2, callback, callback2);
    }

    @ReactMethod
    @Deprecated
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        this.mUIImplementation.a(i, callback, callback2);
    }

    @Override // com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        b.AbstractC0140b a2 = com.facebook.systrace.b.a(0L, "onBatchCompleteUI");
        a2.a("BatchId", i);
        a2.a();
        for (t0 t0Var : this.mListeners) {
            t0Var.willDispatchViewUpdates(this);
        }
        try {
            this.mUIImplementation.a(i);
        } finally {
            com.facebook.systrace.a.a(0L);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.b();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        d1.a().b();
        z0.a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.f();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.g();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.h();
    }

    @ReactMethod
    @Deprecated
    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }

    @Deprecated
    public void preComputeConstantsForViewManager(List<String> list) {
        a.e.a aVar = new a.e.a();
        for (String str : list) {
            WritableMap computeConstantsForViewManager = computeConstantsForViewManager(str);
            if (computeConstantsForViewManager != null) {
                aVar.put(str, computeConstantsForViewManager);
            }
        }
        this.mViewManagerConstantsCacheSize = list.size();
        this.mViewManagerConstantsCache = Collections.unmodifiableMap(aVar);
    }

    public void prependUIBlock(n0 n0Var) {
        this.mUIImplementation.b(n0Var);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.i();
    }

    @ReactMethod
    public void removeRootView(int i) {
        this.mUIImplementation.c(i);
    }

    @ReactMethod
    @Deprecated
    public void removeSubviewsFromContainerWithID(int i) {
        this.mUIImplementation.d(i);
    }

    public void removeUIManagerListener(t0 t0Var) {
        this.mListeners.remove(t0Var);
    }

    @ReactMethod
    @Deprecated
    public void replaceExistingNonRootView(int i, int i2) {
        this.mUIImplementation.a(i, i2);
    }

    public int resolveRootTagFromReactTag(int i) {
        return com.facebook.react.uimanager.f1.a.b(i) ? i : this.mUIImplementation.e(i);
    }

    public View resolveView(int i) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.e().c().b(i);
    }

    @Override // com.facebook.react.bridge.UIManager
    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        int a2 = com.facebook.react.uimanager.f1.a.a(i);
        if (a2 != 2) {
            this.mUIImplementation.b(i, i2);
            return;
        }
        UIManager a3 = q0.a(getReactApplicationContext(), a2);
        if (a3 == null) {
            return;
        }
        a3.sendAccessibilityEvent(i, i2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void setAllowImmediateUIOperationExecution(boolean z) {
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i + ", children: " + readableArray;
            c.d.d.e.a.a("ReactNative", str);
            c.d.f.b.c.a().a(c.d.f.c.a.f2910d, str);
        }
        this.mUIImplementation.a(i, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        this.mUIImplementation.a(i, z);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mUIImplementation.a(z);
    }

    public void setViewHierarchyUpdateDebugListener(com.facebook.react.uimanager.g1.a aVar) {
        this.mUIImplementation.a(aVar);
    }

    public void setViewLocalData(int i, Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new b(reactApplicationContext, i, obj));
    }

    @ReactMethod
    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.a(i, readableArray, callback, callback2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) {
        int a2 = com.facebook.react.uimanager.f1.a.a(i);
        if (a2 != 2) {
            this.mUIImplementation.a(i, new c0(readableMap));
            return;
        }
        UIManager a3 = q0.a(getReactApplicationContext(), a2);
        if (a3 == null) {
            return;
        }
        a3.synchronouslyUpdateViewOnUIThread(i, readableMap);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.a(i, i2, i3);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i, int i2, int i3) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new d(reactApplicationContext, i, i2, i3));
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        UIManager a2;
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i + ", class: " + str + ", props: " + readableMap;
            c.d.d.e.a.a("ReactNative", str2);
            c.d.f.b.c.a().a(c.d.f.c.a.f2910d, str2);
        }
        int a3 = com.facebook.react.uimanager.f1.a.a(i);
        if (a3 != 2) {
            this.mUIImplementation.a(i, str, readableMap);
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (!reactApplicationContext.hasActiveCatalystInstance() || (a2 = q0.a(reactApplicationContext, a3)) == null) {
            return;
        }
        reactApplicationContext.runOnUiQueueThread(new c(this, a2, i, readableMap));
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        this.mUIImplementation.a(i, i2, callback);
    }
}
