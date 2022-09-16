package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.fabric.ReactFabric;
import com.facebook.react.turbomodule.core.interfaces.TurboModuleRegistry;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.p0;
import com.facebook.react.uimanager.q0;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class r {

    /* renamed from: b  reason: collision with root package name */
    private volatile LifecycleState f5821b;

    /* renamed from: c  reason: collision with root package name */
    private j f5822c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Thread f5823d;

    /* renamed from: e  reason: collision with root package name */
    private final JavaScriptExecutorFactory f5824e;

    /* renamed from: f  reason: collision with root package name */
    private final JSBundleLoader f5825f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5826g;

    /* renamed from: h  reason: collision with root package name */
    private final List<v> f5827h;
    private final com.facebook.react.devsupport.h.c i;
    private final boolean j;
    private final NotThreadSafeBridgeIdleDebugListener k;
    private volatile ReactContext m;
    private final Context n;
    private com.facebook.react.modules.core.b o;
    private Activity p;
    private final com.facebook.react.e t;
    private final NativeModuleCallExceptionHandler u;
    private final JSIModulePackage v;
    private List<ViewManager> w;

    /* renamed from: a  reason: collision with root package name */
    private final Set<com.facebook.react.uimanager.y> f5820a = Collections.synchronizedSet(new HashSet());
    private final Object l = new Object();
    private final Collection<k> q = Collections.synchronizedList(new ArrayList());
    private volatile boolean r = false;
    private volatile Boolean s = false;

    /* loaded from: classes.dex */
    class a implements com.facebook.react.modules.core.b {
        a() {
        }

        @Override // com.facebook.react.modules.core.b
        public void e() {
            r.this.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements com.facebook.react.devsupport.e {
        b(r rVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements com.facebook.react.devsupport.h.d {
        c(r rVar, com.facebook.react.modules.debug.c.a aVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f5829b;

        d(View view) {
            this.f5829b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f5829b.removeOnAttachStateChangeListener(this);
            r.this.i.d(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f5831b;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (r.this.f5822c != null) {
                    r rVar = r.this;
                    rVar.a(rVar.f5822c);
                    r.this.f5822c = null;
                }
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ReactApplicationContext f5834b;

            b(ReactApplicationContext reactApplicationContext) {
                this.f5834b = reactApplicationContext;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    r.this.b(this.f5834b);
                } catch (Exception e2) {
                    r.this.i.handleException(e2);
                }
            }
        }

        e(j jVar) {
            this.f5831b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_END);
            synchronized (r.this.s) {
                while (r.this.s.booleanValue()) {
                    try {
                        r.this.s.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            r.this.r = true;
            try {
                Process.setThreadPriority(-4);
                ReactMarker.logMarker(ReactMarkerConstants.VM_INIT);
                ReactApplicationContext a2 = r.this.a(this.f5831b.b().create(), this.f5831b.a());
                r.this.f5823d = null;
                ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_START);
                a aVar = new a();
                a2.runOnNativeModulesQueueThread(new b(a2));
                UiThreadUtil.runOnUiThread(aVar);
            } catch (Exception e2) {
                r.this.i.handleException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k[] f5836b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f5837c;

        f(r rVar, k[] kVarArr, ReactApplicationContext reactApplicationContext) {
            this.f5836b = kVarArr;
            this.f5837c = reactApplicationContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            k[] kVarArr;
            for (k kVar : this.f5836b) {
                if (kVar != null) {
                    kVar.a(this.f5837c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g(r rVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(0);
            ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements Runnable {
        h(r rVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5838b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.y f5839c;

        i(r rVar, int i, com.facebook.react.uimanager.y yVar) {
            this.f5838b = i;
            this.f5839c = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.facebook.systrace.a.c(0L, "pre_rootView.onAttachedToReactInstance", this.f5838b);
            this.f5839c.a(101);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class j {

        /* renamed from: a  reason: collision with root package name */
        private final JavaScriptExecutorFactory f5840a;

        /* renamed from: b  reason: collision with root package name */
        private final JSBundleLoader f5841b;

        public j(r rVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
            c.d.k.a.a.a(javaScriptExecutorFactory);
            this.f5840a = javaScriptExecutorFactory;
            c.d.k.a.a.a(jSBundleLoader);
            this.f5841b = jSBundleLoader;
        }

        public JSBundleLoader a() {
            return this.f5841b;
        }

        public JavaScriptExecutorFactory b() {
            return this.f5840a;
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(ReactContext reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Context context, Activity activity, com.facebook.react.modules.core.b bVar, JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader, String str, List<v> list, boolean z, NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener, LifecycleState lifecycleState, p0 p0Var, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler, com.facebook.react.devsupport.f fVar, boolean z2, com.facebook.react.devsupport.h.a aVar, int i2, int i3, JSIModulePackage jSIModulePackage, Map<String, Object> map) {
        Log.d("ReactNative", "ReactInstanceManager.ctor()");
        a(context);
        com.facebook.react.uimanager.c.b(context);
        this.n = context;
        this.p = activity;
        this.o = bVar;
        this.f5824e = javaScriptExecutorFactory;
        this.f5825f = jSBundleLoader;
        this.f5826g = str;
        this.f5827h = new ArrayList();
        this.j = z;
        com.facebook.systrace.a.a(0L, "ReactInstanceManager.initDevSupportManager");
        this.i = com.facebook.react.devsupport.a.a(context, l(), this.f5826g, z, fVar, aVar, i2, map);
        com.facebook.systrace.a.a(0L);
        this.k = notThreadSafeBridgeIdleDebugListener;
        this.f5821b = lifecycleState;
        this.t = new com.facebook.react.e(context);
        this.u = nativeModuleCallExceptionHandler;
        synchronized (this.f5827h) {
            c.d.f.b.c.a().a(c.d.f.c.a.f2907a, "RNCore: Use Split Packages");
            this.f5827h.add(new com.facebook.react.a(this, new a(), p0Var, z2, i3));
            if (this.j) {
                this.f5827h.add(new com.facebook.react.b());
            }
            this.f5827h.addAll(list);
        }
        this.v = jSIModulePackage;
        com.facebook.react.modules.core.g.b();
        if (this.j) {
            this.i.f();
        }
    }

    private NativeModuleRegistry a(ReactApplicationContext reactApplicationContext, List<v> list, boolean z) {
        com.facebook.react.f fVar = new com.facebook.react.f(reactApplicationContext, this);
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_START);
        synchronized (this.f5827h) {
            Iterator<v> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    v next = it.next();
                    if (!z || !this.f5827h.contains(next)) {
                        com.facebook.systrace.a.a(0L, "createAndProcessCustomReactPackage");
                        if (z) {
                            this.f5827h.add(next);
                        }
                        a(next, fVar);
                        com.facebook.systrace.a.a(0L);
                    }
                }
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_PACKAGES_END);
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_START);
        com.facebook.systrace.a.a(0L, "buildNativeModuleRegistry");
        try {
            return fVar.a();
        } finally {
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.BUILD_NATIVE_MODULE_REGISTRY_END);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReactApplicationContext a(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        Log.d("ReactNative", "ReactInstanceManager.createReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_REACT_CONTEXT_START, javaScriptExecutor.getName());
        ReactApplicationContext reactApplicationContext = new ReactApplicationContext(this.n);
        NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler = this.u;
        if (nativeModuleCallExceptionHandler == null) {
            nativeModuleCallExceptionHandler = this.i;
        }
        reactApplicationContext.setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        CatalystInstanceImpl.Builder nativeModuleCallExceptionHandler2 = new CatalystInstanceImpl.Builder().setReactQueueConfigurationSpec(ReactQueueConfigurationSpec.createDefault()).setJSExecutor(javaScriptExecutor).setRegistry(a(reactApplicationContext, this.f5827h, false)).setJSBundleLoader(jSBundleLoader).setNativeModuleCallExceptionHandler(nativeModuleCallExceptionHandler);
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_START);
        com.facebook.systrace.a.a(0L, "createCatalystInstance");
        try {
            CatalystInstanceImpl build = nativeModuleCallExceptionHandler2.build();
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            reactApplicationContext.initializeWithInstance(build);
            JSIModulePackage jSIModulePackage = this.v;
            if (jSIModulePackage != null) {
                build.addJSIModules(jSIModulePackage.getJSIModules(reactApplicationContext, build.getJavaScriptContextHolder()));
                if (com.facebook.react.b0.a.f5410b) {
                    JSIModule jSIModule = build.getJSIModule(JSIModuleType.TurboModuleManager);
                    build.setTurboModuleManager(jSIModule);
                    TurboModuleRegistry turboModuleRegistry = (TurboModuleRegistry) jSIModule;
                    for (String str : turboModuleRegistry.b()) {
                        turboModuleRegistry.b(str);
                    }
                }
            }
            NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.k;
            if (notThreadSafeBridgeIdleDebugListener != null) {
                build.addBridgeIdleDebugListener(notThreadSafeBridgeIdleDebugListener);
            }
            if (com.facebook.systrace.a.b(0L)) {
                build.setGlobalVariable("__RCTProfileIsProfiling", "true");
            }
            ReactMarker.logMarker(ReactMarkerConstants.PRE_RUN_JS_BUNDLE_START);
            com.facebook.systrace.a.a(0L, "runJSBundle");
            build.runJSBundle();
            com.facebook.systrace.a.a(0L);
            return reactApplicationContext;
        } catch (Throwable th) {
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_CATALYST_INSTANCE_END);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context) {
        SoLoader.a(context, false);
    }

    private void a(JavaScriptExecutorFactory javaScriptExecutorFactory, JSBundleLoader jSBundleLoader) {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        j jVar = new j(this, javaScriptExecutorFactory, jSBundleLoader);
        if (this.f5823d == null) {
            a(jVar);
        } else {
            this.f5822c = jVar;
        }
    }

    private void a(ReactContext reactContext) {
        Log.d("ReactNative", "ReactInstanceManager.tearDownReactContext()");
        UiThreadUtil.assertOnUiThread();
        if (this.f5821b == LifecycleState.RESUMED) {
            reactContext.onHostPause();
        }
        synchronized (this.f5820a) {
            for (com.facebook.react.uimanager.y yVar : this.f5820a) {
                d(yVar);
            }
        }
        this.t.b(reactContext.getCatalystInstance());
        reactContext.destroy();
        this.i.b(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(j jVar) {
        Log.d("ReactNative", "ReactInstanceManager.runCreateReactContextOnNewThread()");
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f5820a) {
            synchronized (this.l) {
                if (this.m != null) {
                    a(this.m);
                    this.m = null;
                }
            }
        }
        this.f5823d = new Thread(null, new e(jVar), "create_react_context");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_CONTEXT_THREAD_START);
        this.f5823d.start();
    }

    private void a(com.facebook.react.uimanager.y yVar, CatalystInstance catalystInstance) {
        Log.d("ReactNative", "ReactInstanceManager.detachViewFromInstance()");
        UiThreadUtil.assertOnUiThread();
        if (yVar.getUIManagerType() == 2) {
            ((ReactFabric) catalystInstance.getJSModule(ReactFabric.class)).unmountComponentAtNode(yVar.getRootViewTag());
        } else {
            ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).unmountApplicationComponentAtRootTag(yVar.getRootViewTag());
        }
    }

    private void a(v vVar, com.facebook.react.f fVar) {
        b.AbstractC0140b a2 = com.facebook.systrace.b.a(0L, "processPackage");
        a2.a("className", vVar.getClass().getSimpleName());
        a2.a();
        boolean z = vVar instanceof x;
        if (z) {
            ((x) vVar).a();
        }
        fVar.a(vVar);
        if (z) {
            ((x) vVar).b();
        }
        com.facebook.systrace.b.a(0L).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ReactApplicationContext reactApplicationContext) {
        Log.d("ReactNative", "ReactInstanceManager.setupReactContext()");
        ReactMarker.logMarker(ReactMarkerConstants.PRE_SETUP_REACT_CONTEXT_END);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_START);
        com.facebook.systrace.a.a(0L, "setupReactContext");
        synchronized (this.f5820a) {
            synchronized (this.l) {
                c.d.k.a.a.a(reactApplicationContext);
                this.m = reactApplicationContext;
            }
            CatalystInstance catalystInstance = reactApplicationContext.getCatalystInstance();
            c.d.k.a.a.a(catalystInstance);
            CatalystInstance catalystInstance2 = catalystInstance;
            catalystInstance2.initialize();
            this.i.a(reactApplicationContext);
            this.t.a(catalystInstance2);
            n();
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_START);
            for (com.facebook.react.uimanager.y yVar : this.f5820a) {
                c(yVar);
            }
            ReactMarker.logMarker(ReactMarkerConstants.ATTACH_MEASURED_ROOT_VIEWS_END);
        }
        UiThreadUtil.runOnUiThread(new f(this, (k[]) this.q.toArray(new k[this.q.size()]), reactApplicationContext));
        com.facebook.systrace.a.a(0L);
        ReactMarker.logMarker(ReactMarkerConstants.SETUP_REACT_CONTEXT_END);
        reactApplicationContext.runOnJSQueueThread(new g(this));
        reactApplicationContext.runOnNativeModulesQueueThread(new h(this));
    }

    private synchronized void b(boolean z) {
        ReactContext b2 = b();
        if (b2 != null && (z || this.f5821b == LifecycleState.BEFORE_RESUME || this.f5821b == LifecycleState.BEFORE_CREATE)) {
            b2.onHostResume(this.p);
        }
        this.f5821b = LifecycleState.RESUMED;
    }

    private void c(com.facebook.react.uimanager.y yVar) {
        Log.d("ReactNative", "ReactInstanceManager.attachRootViewToInstance()");
        com.facebook.systrace.a.a(0L, "attachRootViewToInstance");
        UIManager a2 = q0.a(this.m, yVar.getUIManagerType());
        Bundle appProperties = yVar.getAppProperties();
        int addRootView = a2.addRootView(yVar.getRootViewGroup(), appProperties == null ? new WritableNativeMap() : Arguments.fromBundle(appProperties), yVar.getInitialUITemplate());
        yVar.setRootViewTag(addRootView);
        if (yVar.getUIManagerType() == 2) {
            a2.updateRootLayoutSpecs(addRootView, yVar.getWidthMeasureSpec(), yVar.getHeightMeasureSpec());
            yVar.setShouldLogContentAppeared(true);
        } else {
            yVar.a();
        }
        com.facebook.systrace.a.a(0L, "pre_rootView.onAttachedToReactInstance", addRootView);
        UiThreadUtil.runOnUiThread(new i(this, addRootView, yVar));
        com.facebook.systrace.a.a(0L);
    }

    private void d(com.facebook.react.uimanager.y yVar) {
        yVar.getRootViewGroup().removeAllViews();
        yVar.getRootViewGroup().setId(-1);
    }

    public static s k() {
        return new s();
    }

    private com.facebook.react.devsupport.e l() {
        return new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        UiThreadUtil.assertOnUiThread();
        com.facebook.react.modules.core.b bVar = this.o;
        if (bVar != null) {
            bVar.e();
        }
    }

    private synchronized void n() {
        if (this.f5821b == LifecycleState.RESUMED) {
            b(true);
        }
    }

    private synchronized void o() {
        ReactContext b2 = b();
        if (b2 != null) {
            if (this.f5821b == LifecycleState.RESUMED) {
                b2.onHostPause();
                this.f5821b = LifecycleState.BEFORE_RESUME;
            }
            if (this.f5821b == LifecycleState.BEFORE_RESUME) {
                b2.onHostDestroy();
            }
        }
        this.f5821b = LifecycleState.BEFORE_CREATE;
    }

    private synchronized void p() {
        ReactContext b2 = b();
        if (b2 != null) {
            if (this.f5821b == LifecycleState.BEFORE_CREATE) {
                b2.onHostResume(this.p);
            } else if (this.f5821b == LifecycleState.RESUMED) {
            }
            b2.onHostPause();
        }
        this.f5821b = LifecycleState.BEFORE_RESUME;
    }

    private void q() {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackgroundFromBundleLoader()");
        c.d.f.b.c.a().a(c.d.f.c.a.f2907a, "RNCore: load from BundleLoader");
        a(this.f5824e, this.f5825f);
    }

    private void r() {
        Log.d("ReactNative", "ReactInstanceManager.recreateReactContextInBackgroundInner()");
        c.d.f.b.c.a().a(c.d.f.c.a.f2907a, "RNCore: recreateReactContextInBackground");
        UiThreadUtil.assertOnUiThread();
        if (this.j && this.f5826g != null) {
            com.facebook.react.modules.debug.c.a b2 = this.i.b();
            if (!com.facebook.systrace.a.b(0L)) {
                if (this.f5825f == null) {
                    this.i.d();
                    return;
                } else {
                    this.i.a(new c(this, b2));
                    return;
                }
            }
        }
        q();
    }

    public ViewManager a(String str) {
        ViewManager a2;
        synchronized (this.l) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) b();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
                synchronized (this.f5827h) {
                    for (v vVar : this.f5827h) {
                        if ((vVar instanceof a0) && (a2 = ((a0) vVar).a(reactApplicationContext, str)) != null) {
                            return a2;
                        }
                    }
                    return null;
                }
            }
            return null;
        }
    }

    public List<ViewManager> a(ReactApplicationContext reactApplicationContext) {
        List<ViewManager> list;
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_START);
        com.facebook.systrace.a.a(0L, "createAllViewManagers");
        try {
            if (this.w == null) {
                synchronized (this.f5827h) {
                    if (this.w == null) {
                        this.w = new ArrayList();
                        for (v vVar : this.f5827h) {
                            this.w.addAll(vVar.createViewManagers(reactApplicationContext));
                        }
                        list = this.w;
                    }
                }
                return list;
            }
            list = this.w;
            return list;
        } finally {
            com.facebook.systrace.a.a(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_VIEW_MANAGERS_END);
        }
    }

    public void a() {
        Log.d("ReactNative", "ReactInstanceManager.createReactContextInBackground()");
        UiThreadUtil.assertOnUiThread();
        if (!this.r) {
            this.r = true;
            r();
        }
    }

    public void a(Activity activity) {
        if (activity == this.p) {
            g();
        }
    }

    public void a(Activity activity, int i2, int i3, Intent intent) {
        ReactContext b2 = b();
        if (b2 != null) {
            b2.onActivityResult(activity, i2, i3, intent);
        }
    }

    public void a(Activity activity, com.facebook.react.modules.core.b bVar) {
        UiThreadUtil.assertOnUiThread();
        this.o = bVar;
        c(activity);
    }

    public void a(Intent intent) {
        UiThreadUtil.assertOnUiThread();
        ReactContext b2 = b();
        if (b2 == null) {
            c.d.d.e.a.d("ReactNative", "Instance detached from instance manager");
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && ("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action))) {
            ((DeviceEventManagerModule) b2.getNativeModule(DeviceEventManagerModule.class)).emitNewIntentReceived(data);
        }
        b2.onNewIntent(this.p, intent);
    }

    public void a(k kVar) {
        this.q.add(kVar);
    }

    public void a(com.facebook.react.uimanager.y yVar) {
        UiThreadUtil.assertOnUiThread();
        this.f5820a.add(yVar);
        d(yVar);
        ReactContext b2 = b();
        if (this.f5823d != null || b2 == null) {
            return;
        }
        c(yVar);
    }

    public void a(boolean z) {
        UiThreadUtil.assertOnUiThread();
        ReactContext b2 = b();
        if (b2 != null) {
            b2.onWindowFocusChange(z);
        }
    }

    public ReactContext b() {
        ReactContext reactContext;
        synchronized (this.l) {
            reactContext = this.m;
        }
        return reactContext;
    }

    public void b(Activity activity) {
        c.d.k.a.a.a(this.p);
        boolean z = activity == this.p;
        c.d.k.a.a.a(z, "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + this.p.getClass().getSimpleName() + " Paused activity: " + activity.getClass().getSimpleName());
        h();
    }

    public void b(k kVar) {
        this.q.remove(kVar);
    }

    public void b(com.facebook.react.uimanager.y yVar) {
        UiThreadUtil.assertOnUiThread();
        synchronized (this.f5820a) {
            if (this.f5820a.contains(yVar)) {
                ReactContext b2 = b();
                this.f5820a.remove(yVar);
                if (b2 != null && b2.hasActiveCatalystInstance()) {
                    a(yVar, b2.getCatalystInstance());
                }
            }
        }
    }

    public com.facebook.react.devsupport.h.c c() {
        return this.i;
    }

    public void c(Activity activity) {
        UiThreadUtil.assertOnUiThread();
        this.p = activity;
        if (this.j) {
            View decorView = this.p.getWindow().getDecorView();
            if (!a.g.m.v.H(decorView)) {
                decorView.addOnAttachStateChangeListener(new d(decorView));
            } else {
                this.i.d(true);
            }
        }
        b(false);
    }

    public List<String> d() {
        ArrayList arrayList;
        List<String> a2;
        com.facebook.systrace.a.a(0L, "ReactInstanceManager.getViewManagerNames");
        synchronized (this.l) {
            ReactApplicationContext reactApplicationContext = (ReactApplicationContext) b();
            if (reactApplicationContext != null && reactApplicationContext.hasActiveCatalystInstance()) {
                synchronized (this.f5827h) {
                    HashSet hashSet = new HashSet();
                    for (v vVar : this.f5827h) {
                        b.AbstractC0140b a3 = com.facebook.systrace.b.a(0L, "ReactInstanceManager.getViewManagerName");
                        a3.a("Package", vVar.getClass().getSimpleName());
                        a3.a();
                        if ((vVar instanceof a0) && (a2 = ((a0) vVar).a(reactApplicationContext)) != null) {
                            hashSet.addAll(a2);
                        }
                        com.facebook.systrace.b.a(0L).a();
                    }
                    com.facebook.systrace.a.a(0L);
                    arrayList = new ArrayList(hashSet);
                }
                return arrayList;
            }
            return null;
        }
    }

    public boolean e() {
        return this.r;
    }

    public void f() {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = this.m;
        if (reactContext != null) {
            ((DeviceEventManagerModule) reactContext.getNativeModule(DeviceEventManagerModule.class)).emitHardwareBackPressed();
            return;
        }
        c.d.d.e.a.d("ReactNative", "Instance detached from instance manager");
        m();
    }

    public void g() {
        UiThreadUtil.assertOnUiThread();
        if (this.j) {
            this.i.d(false);
        }
        o();
        this.p = null;
    }

    public void h() {
        UiThreadUtil.assertOnUiThread();
        this.o = null;
        if (this.j) {
            this.i.d(false);
        }
        p();
    }

    public void i() {
        c.d.k.a.a.a(this.r, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
        r();
    }

    public void j() {
        UiThreadUtil.assertOnUiThread();
        this.i.g();
    }
}
