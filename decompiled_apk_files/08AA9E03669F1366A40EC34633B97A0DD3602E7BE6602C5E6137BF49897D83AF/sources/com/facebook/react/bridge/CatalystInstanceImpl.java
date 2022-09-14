package com.facebook.react.bridge;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.queue.MessageQueueThread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class CatalystInstanceImpl implements CatalystInstance {
    private static final AtomicInteger sNextInstanceIdForTrace;
    private volatile boolean mAcceptCalls;
    private final CopyOnWriteArrayList<ad> mBridgeIdleListeners;
    private volatile boolean mDestroyed;
    private final HybridData mHybridData;
    private boolean mInitialized;
    private boolean mJSBundleHasLoaded;
    private final o mJSBundleLoader;
    private final ArrayList<e> mJSCallsPendingInit;
    private final Object mJSCallsPendingInitLock;
    private final w mJSModuleRegistry;
    private u mJavaScriptContextHolder;
    private final String mJsPendingCallsTitleForTrace;
    private final ab mNativeModuleCallExceptionHandler;
    private final ac mNativeModuleRegistry;
    private final MessageQueueThread mNativeModulesQueueThread;
    private final AtomicInteger mPendingJSCalls;
    private final com.facebook.react.bridge.queue.e mReactQueueConfiguration;
    private String mSourceURL;
    private final com.facebook.m.c mTraceListener;

    private native long getJavaScriptContext();

    private static native HybridData initHybrid();

    private native void initializeBridge(ReactCallback reactCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    /* JADX INFO: Access modifiers changed from: private */
    public native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniHandleMemoryPressure(int i);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetSourceURL(String str);

    @Override // com.facebook.react.bridge.CatalystInstance
    public native void setGlobalVariable(String str, String str2);

    static {
        ai.a();
        sNextInstanceIdForTrace = new AtomicInteger(1);
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public String f3198a;

        /* renamed from: b  reason: collision with root package name */
        public String f3199b;

        /* renamed from: c  reason: collision with root package name */
        public NativeArray f3200c;

        public e(String str, String str2, NativeArray nativeArray) {
            this.f3198a = str;
            this.f3199b = str2;
            this.f3200c = nativeArray;
        }

        void a(CatalystInstanceImpl catalystInstanceImpl) {
            catalystInstanceImpl.jniCallJSFunction(this.f3198a, this.f3199b, this.f3200c != null ? this.f3200c : new WritableNativeArray());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3198a);
            sb.append(".");
            sb.append(this.f3199b);
            sb.append("(");
            sb.append(this.f3200c == null ? "" : this.f3200c.toString());
            sb.append(")");
            return sb.toString();
        }
    }

    private CatalystInstanceImpl(com.facebook.react.bridge.queue.f fVar, JavaScriptExecutor javaScriptExecutor, ac acVar, o oVar, ab abVar) {
        this.mPendingJSCalls = new AtomicInteger(0);
        this.mJsPendingCallsTitleForTrace = "pending_js_calls_instance" + sNextInstanceIdForTrace.getAndIncrement();
        this.mDestroyed = false;
        this.mJSCallsPendingInit = new ArrayList<>();
        this.mJSCallsPendingInitLock = new Object();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        Log.d("ReactNative", "Initializing React Xplat Bridge.");
        this.mHybridData = initHybrid();
        this.mReactQueueConfiguration = com.facebook.react.bridge.queue.e.a(fVar, new d());
        this.mBridgeIdleListeners = new CopyOnWriteArrayList<>();
        this.mNativeModuleRegistry = acVar;
        this.mJSModuleRegistry = new w();
        this.mJSBundleLoader = oVar;
        this.mNativeModuleCallExceptionHandler = abVar;
        this.mNativeModulesQueueThread = this.mReactQueueConfiguration.b();
        this.mTraceListener = new c(this);
        Log.d("ReactNative", "Initializing React Xplat Bridge before initializeBridge");
        initializeBridge(new a(this), javaScriptExecutor, this.mReactQueueConfiguration.c(), this.mNativeModulesQueueThread, this.mNativeModuleRegistry.a(this), this.mNativeModuleRegistry.a());
        Log.d("ReactNative", "Initializing React Xplat Bridge after initializeBridge");
        this.mJavaScriptContextHolder = new u(getJavaScriptContext());
    }

    /* loaded from: classes.dex */
    private static class a implements ReactCallback {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<CatalystInstanceImpl> f3191a;

        public a(CatalystInstanceImpl catalystInstanceImpl) {
            this.f3191a = new WeakReference<>(catalystInstanceImpl);
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void onBatchComplete() {
            CatalystInstanceImpl catalystInstanceImpl = this.f3191a.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.mNativeModuleRegistry.d();
            }
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void incrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.f3191a.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.incrementPendingJSCalls();
            }
        }

        @Override // com.facebook.react.bridge.ReactCallback
        public void decrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = this.f3191a.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.decrementPendingJSCalls();
            }
        }
    }

    public void extendNativeModules(ac acVar) {
        this.mNativeModuleRegistry.a(acVar);
        jniExtendNativeModules(acVar.a(this), acVar.a());
    }

    void setSourceURLs(String str, String str2) {
        this.mSourceURL = str;
        jniSetSourceURL(str2);
    }

    public void registerSegment(int i, String str) {
        jniRegisterSegment(i, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromAssets(assetManager, str, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void runJSBundle() {
        Log.d("ReactNative", "CatalystInstanceImpl.runJSBundle()");
        com.facebook.j.a.a.a(!this.mJSBundleHasLoaded, "JS bundle was already loaded!");
        this.mJSBundleLoader.a(this);
        synchronized (this.mJSCallsPendingInitLock) {
            this.mAcceptCalls = true;
            Iterator<e> it = this.mJSCallsPendingInit.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            this.mJSCallsPendingInit.clear();
            this.mJSBundleHasLoaded = true;
        }
        com.facebook.m.a.a(this.mTraceListener);
    }

    public boolean hasRunJSBundle() {
        boolean z;
        synchronized (this.mJSCallsPendingInitLock) {
            z = this.mJSBundleHasLoaded && this.mAcceptCalls;
        }
        return z;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public String getSourceURL() {
        return this.mSourceURL;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void callFunction(String str, String str2, NativeArray nativeArray) {
        callFunction(new e(str, str2, nativeArray));
    }

    public void callFunction(e eVar) {
        if (this.mDestroyed) {
            String eVar2 = eVar.toString();
            com.facebook.common.e.a.c("ReactNative", "Calling JS function after bridge has been destroyed: " + eVar2);
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                if (!this.mAcceptCalls) {
                    this.mJSCallsPendingInit.add(eVar);
                    return;
                }
            }
        }
        eVar.a(this);
    }

    @Override // com.facebook.react.bridge.CatalystInstance, com.facebook.react.bridge.q
    public void invokeCallback(int i, NativeArray nativeArray) {
        if (this.mDestroyed) {
            com.facebook.common.e.a.c("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, nativeArray);
        }
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void destroy() {
        Log.d("ReactNative", "CatalystInstanceImpl.destroy() start");
        ap.b();
        if (this.mDestroyed) {
            return;
        }
        ReactMarker.logMarker(ak.DESTROY_CATALYST_INSTANCE_START);
        this.mDestroyed = true;
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                CatalystInstanceImpl.this.mNativeModuleRegistry.b();
                boolean z = false;
                if (CatalystInstanceImpl.this.mPendingJSCalls.getAndSet(0) == 0) {
                    z = true;
                }
                if (!z && !CatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty()) {
                    Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                    while (it.hasNext()) {
                        ((ad) it.next()).a();
                    }
                }
                AsyncTask.execute(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CatalystInstanceImpl.this.mJavaScriptContextHolder.a();
                        CatalystInstanceImpl.this.mHybridData.a();
                        CatalystInstanceImpl.this.getReactQueueConfiguration().d();
                        Log.d("ReactNative", "CatalystInstanceImpl.destroy() end");
                        ReactMarker.logMarker(ak.DESTROY_CATALYST_INSTANCE_END);
                    }
                });
            }
        });
        com.facebook.m.a.b(this.mTraceListener);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void initialize() {
        Log.d("ReactNative", "CatalystInstanceImpl.initialize()");
        com.facebook.j.a.a.a(!this.mInitialized, "This catalyst instance has already been initialized");
        com.facebook.j.a.a.a(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                CatalystInstanceImpl.this.mNativeModuleRegistry.c();
            }
        });
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public com.facebook.react.bridge.queue.d getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        return (T) this.mJSModuleRegistry.a(this, cls);
    }

    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        return this.mNativeModuleRegistry.a(cls);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        return (T) this.mNativeModuleRegistry.b(cls);
    }

    public Collection<NativeModule> getNativeModules() {
        return this.mNativeModuleRegistry.e();
    }

    @Override // com.facebook.react.bridge.y
    public void handleMemoryPressure(int i) {
        if (this.mDestroyed) {
            return;
        }
        jniHandleMemoryPressure(i);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void addBridgeIdleDebugListener(ad adVar) {
        this.mBridgeIdleListeners.add(adVar);
    }

    @Override // com.facebook.react.bridge.CatalystInstance
    public void removeBridgeIdleDebugListener(ad adVar) {
        this.mBridgeIdleListeners.remove(adVar);
    }

    public u getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void incrementPendingJSCalls() {
        int andIncrement = this.mPendingJSCalls.getAndIncrement();
        boolean z = andIncrement == 0;
        com.facebook.m.a.c(0L, this.mJsPendingCallsTitleForTrace, andIncrement + 1);
        if (!z || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.3
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                while (it.hasNext()) {
                    ((ad) it.next()).b();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementPendingJSCalls() {
        int decrementAndGet = this.mPendingJSCalls.decrementAndGet();
        boolean z = decrementAndGet == 0;
        com.facebook.m.a.c(0L, this.mJsPendingCallsTitleForTrace, decrementAndGet);
        if (!z || this.mBridgeIdleListeners.isEmpty()) {
            return;
        }
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                while (it.hasNext()) {
                    ((ad) it.next()).a();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNativeException(Exception exc) {
        this.mNativeModuleCallExceptionHandler.a(exc);
        this.mReactQueueConfiguration.a().runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.CatalystInstanceImpl.5
            @Override // java.lang.Runnable
            public void run() {
                CatalystInstanceImpl.this.destroy();
            }
        });
    }

    /* loaded from: classes.dex */
    private class d implements com.facebook.react.bridge.queue.c {
        private d() {
        }

        @Override // com.facebook.react.bridge.queue.c
        public void a(Exception exc) {
            CatalystInstanceImpl.this.onNativeException(exc);
        }
    }

    /* loaded from: classes.dex */
    private static class c implements com.facebook.m.c {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<CatalystInstanceImpl> f3196a;

        public c(CatalystInstanceImpl catalystInstanceImpl) {
            this.f3196a = new WeakReference<>(catalystInstanceImpl);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.react.bridge.queue.f f3192a;

        /* renamed from: b  reason: collision with root package name */
        private o f3193b;

        /* renamed from: c  reason: collision with root package name */
        private ac f3194c;

        /* renamed from: d  reason: collision with root package name */
        private JavaScriptExecutor f3195d;
        private ab e;

        public b a(com.facebook.react.bridge.queue.f fVar) {
            this.f3192a = fVar;
            return this;
        }

        public b a(ac acVar) {
            this.f3194c = acVar;
            return this;
        }

        public b a(o oVar) {
            this.f3193b = oVar;
            return this;
        }

        public b a(JavaScriptExecutor javaScriptExecutor) {
            this.f3195d = javaScriptExecutor;
            return this;
        }

        public b a(ab abVar) {
            this.e = abVar;
            return this;
        }

        public CatalystInstanceImpl a() {
            return new CatalystInstanceImpl((com.facebook.react.bridge.queue.f) com.facebook.j.a.a.b(this.f3192a), (JavaScriptExecutor) com.facebook.j.a.a.b(this.f3195d), (ac) com.facebook.j.a.a.b(this.f3194c), (o) com.facebook.j.a.a.b(this.f3193b), (ab) com.facebook.j.a.a.b(this.e));
        }
    }
}
