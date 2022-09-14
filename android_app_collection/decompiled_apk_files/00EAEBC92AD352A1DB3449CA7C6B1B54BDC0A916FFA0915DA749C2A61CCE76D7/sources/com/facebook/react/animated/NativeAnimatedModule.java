package com.facebook.react.animated;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.t0;
import java.util.ArrayList;
import java.util.Iterator;
@com.facebook.react.d0.a.a(name = NativeAnimatedModule.NAME)
/* loaded from: classes.dex */
public class NativeAnimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, t0 {
    public static final String NAME = "NativeAnimatedModule";
    private final com.facebook.react.uimanager.e mAnimatedFrameCallback;
    private com.facebook.react.animated.l mNodesManager;
    private ArrayList<v> mOperations;
    private ArrayList<v> mPreOperations;
    private final com.facebook.react.modules.core.g mReactChoreographer;

    /* loaded from: classes.dex */
    class a implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5318a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double f5319b;

        a(NativeAnimatedModule nativeAnimatedModule, int i, double d2) {
            this.f5318a = i;
            this.f5319b = d2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.a(this.f5318a, this.f5319b);
        }
    }

    /* loaded from: classes.dex */
    class b implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5320a;

        b(NativeAnimatedModule nativeAnimatedModule, int i) {
            this.f5320a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.c(this.f5320a);
        }
    }

    /* loaded from: classes.dex */
    class c implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5321a;

        c(NativeAnimatedModule nativeAnimatedModule, int i) {
            this.f5321a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.b(this.f5321a);
        }
    }

    /* loaded from: classes.dex */
    class d implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5323b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReadableMap f5324c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Callback f5325d;

        d(NativeAnimatedModule nativeAnimatedModule, int i, int i2, ReadableMap readableMap, Callback callback) {
            this.f5322a = i;
            this.f5323b = i2;
            this.f5324c = readableMap;
            this.f5325d = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.a(this.f5322a, this.f5323b, this.f5324c, this.f5325d);
        }
    }

    /* loaded from: classes.dex */
    class e implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5326a;

        e(NativeAnimatedModule nativeAnimatedModule, int i) {
            this.f5326a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.f(this.f5326a);
        }
    }

    /* loaded from: classes.dex */
    class f implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5328b;

        f(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
            this.f5327a = i;
            this.f5328b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.b(this.f5327a, this.f5328b);
        }
    }

    /* loaded from: classes.dex */
    class g implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5329a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5330b;

        g(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
            this.f5329a = i;
            this.f5330b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.d(this.f5329a, this.f5330b);
        }
    }

    /* loaded from: classes.dex */
    class h implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5331a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5332b;

        h(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
            this.f5331a = i;
            this.f5332b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.a(this.f5331a, this.f5332b);
        }
    }

    /* loaded from: classes.dex */
    class i implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5334b;

        i(NativeAnimatedModule nativeAnimatedModule, int i, int i2) {
            this.f5333a = i;
            this.f5334b = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.c(this.f5333a, this.f5334b);
        }
    }

    /* loaded from: classes.dex */
    class j implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5335a;

        j(NativeAnimatedModule nativeAnimatedModule, int i) {
            this.f5335a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.e(this.f5335a);
        }
    }

    /* loaded from: classes.dex */
    class k extends com.facebook.react.uimanager.e {
        k(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.uimanager.e
        protected void b(long j) {
            try {
                com.facebook.react.animated.l nodesManager = NativeAnimatedModule.this.getNodesManager();
                if (nodesManager.a()) {
                    nodesManager.a(j);
                }
                com.facebook.react.modules.core.g gVar = NativeAnimatedModule.this.mReactChoreographer;
                c.d.k.a.a.a(gVar);
                gVar.a(g.c.NATIVE_ANIMATED_MODULE, NativeAnimatedModule.this.mAnimatedFrameCallback);
            } catch (Exception e2) {
                c.d.d.e.a.b("ReactNative", "Exception while executing animated frame callback.", e2);
                throw new RuntimeException(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    class l implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5338b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReadableMap f5339c;

        l(NativeAnimatedModule nativeAnimatedModule, int i, String str, ReadableMap readableMap) {
            this.f5337a = i;
            this.f5338b = str;
            this.f5339c = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.a(this.f5337a, this.f5338b, this.f5339c);
        }
    }

    /* loaded from: classes.dex */
    class m implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5340a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5341b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5342c;

        m(NativeAnimatedModule nativeAnimatedModule, int i, String str, int i2) {
            this.f5340a = i;
            this.f5341b = str;
            this.f5342c = i2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.a(this.f5340a, this.f5341b, this.f5342c);
        }
    }

    /* loaded from: classes.dex */
    class n implements n0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f5343a;

        n(ArrayList arrayList) {
            this.f5343a = arrayList;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            com.facebook.react.animated.l nodesManager = NativeAnimatedModule.this.getNodesManager();
            Iterator it = this.f5343a.iterator();
            while (it.hasNext()) {
                ((v) it.next()).a(nodesManager);
            }
        }
    }

    /* loaded from: classes.dex */
    class o implements n0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f5345a;

        o(ArrayList arrayList) {
            this.f5345a = arrayList;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            com.facebook.react.animated.l nodesManager = NativeAnimatedModule.this.getNodesManager();
            Iterator it = this.f5345a.iterator();
            while (it.hasNext()) {
                ((v) it.next()).a(nodesManager);
            }
        }
    }

    /* loaded from: classes.dex */
    class p implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5347a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f5348b;

        p(NativeAnimatedModule nativeAnimatedModule, int i, ReadableMap readableMap) {
            this.f5347a = i;
            this.f5348b = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.a(this.f5347a, this.f5348b);
        }
    }

    /* loaded from: classes.dex */
    class q implements com.facebook.react.animated.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5349a;

        q(int i) {
            this.f5349a = i;
        }

        @Override // com.facebook.react.animated.c
        public void a(double d2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("tag", this.f5349a);
            createMap.putDouble("value", d2);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onAnimatedValueUpdate", createMap);
            }
        }
    }

    /* loaded from: classes.dex */
    class r implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5351a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.animated.c f5352b;

        r(NativeAnimatedModule nativeAnimatedModule, int i, com.facebook.react.animated.c cVar) {
            this.f5351a = i;
            this.f5352b = cVar;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.a(this.f5351a, this.f5352b);
        }
    }

    /* loaded from: classes.dex */
    class s implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5353a;

        s(NativeAnimatedModule nativeAnimatedModule, int i) {
            this.f5353a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.g(this.f5353a);
        }
    }

    /* loaded from: classes.dex */
    class t implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5354a;

        t(NativeAnimatedModule nativeAnimatedModule, int i) {
            this.f5354a = i;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.a(this.f5354a);
        }
    }

    /* loaded from: classes.dex */
    class u implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5355a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double f5356b;

        u(NativeAnimatedModule nativeAnimatedModule, int i, double d2) {
            this.f5355a = i;
            this.f5356b = d2;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.v
        public void a(com.facebook.react.animated.l lVar) {
            lVar.b(this.f5355a, this.f5356b);
        }
    }

    /* loaded from: classes.dex */
    private interface v {
        void a(com.facebook.react.animated.l lVar);
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ArrayList<>();
        this.mPreOperations = new ArrayList<>();
        this.mReactChoreographer = com.facebook.react.modules.core.g.a();
        this.mAnimatedFrameCallback = new k(reactApplicationContext);
    }

    private void clearFrameCallback() {
        com.facebook.react.modules.core.g gVar = this.mReactChoreographer;
        c.d.k.a.a.a(gVar);
        gVar.b(g.c.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    private void enqueueFrameCallback() {
        com.facebook.react.modules.core.g gVar = this.mReactChoreographer;
        c.d.k.a.a.a(gVar);
        gVar.a(g.c.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.react.animated.l getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            this.mNodesManager = new com.facebook.react.animated.l((UIManagerModule) reactApplicationContextIfActiveOrWarn.getNativeModule(UIManagerModule.class));
        }
        return this.mNodesManager;
    }

    @ReactMethod
    public void addAnimatedEventToView(int i2, String str, ReadableMap readableMap) {
        this.mOperations.add(new l(this, i2, str, readableMap));
    }

    @ReactMethod
    public void connectAnimatedNodeToView(int i2, int i3) {
        this.mOperations.add(new h(this, i2, i3));
    }

    @ReactMethod
    public void connectAnimatedNodes(int i2, int i3) {
        this.mOperations.add(new f(this, i2, i3));
    }

    @ReactMethod
    public void createAnimatedNode(int i2, ReadableMap readableMap) {
        this.mOperations.add(new p(this, i2, readableMap));
    }

    @ReactMethod
    public void disconnectAnimatedNodeFromView(int i2, int i3) {
        this.mOperations.add(new i(this, i2, i3));
    }

    @ReactMethod
    public void disconnectAnimatedNodes(int i2, int i3) {
        this.mOperations.add(new g(this, i2, i3));
    }

    @ReactMethod
    public void dropAnimatedNode(int i2) {
        this.mOperations.add(new t(this, i2));
    }

    @ReactMethod
    public void extractAnimatedNodeOffset(int i2) {
        this.mOperations.add(new c(this, i2));
    }

    @ReactMethod
    public void flattenAnimatedNodeOffset(int i2) {
        this.mOperations.add(new b(this, i2));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.addLifecycleEventListener(this);
            ((UIManagerModule) reactApplicationContextIfActiveOrWarn.getNativeModule(UIManagerModule.class)).addUIManagerListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @ReactMethod
    public void removeAnimatedEventFromView(int i2, String str, int i3) {
        this.mOperations.add(new m(this, i2, str, i3));
    }

    @ReactMethod
    public void restoreDefaultValues(int i2) {
        this.mPreOperations.add(new j(this, i2));
    }

    @ReactMethod
    public void setAnimatedNodeOffset(int i2, double d2) {
        this.mOperations.add(new a(this, i2, d2));
    }

    @ReactMethod
    public void setAnimatedNodeValue(int i2, double d2) {
        this.mOperations.add(new u(this, i2, d2));
    }

    public void setNodesManager(com.facebook.react.animated.l lVar) {
        this.mNodesManager = lVar;
    }

    @ReactMethod
    public void startAnimatingNode(int i2, int i3, ReadableMap readableMap, Callback callback) {
        this.mOperations.add(new d(this, i2, i3, readableMap, callback));
    }

    @ReactMethod
    public void startListeningToAnimatedNodeValue(int i2) {
        this.mOperations.add(new r(this, i2, new q(i2)));
    }

    @ReactMethod
    public void stopAnimation(int i2) {
        this.mOperations.add(new e(this, i2));
    }

    @ReactMethod
    public void stopListeningToAnimatedNodeValue(int i2) {
        this.mOperations.add(new s(this, i2));
    }

    @Override // com.facebook.react.uimanager.t0
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (!this.mOperations.isEmpty() || !this.mPreOperations.isEmpty()) {
            ArrayList<v> arrayList = this.mPreOperations;
            ArrayList<v> arrayList2 = this.mOperations;
            this.mPreOperations = new ArrayList<>();
            this.mOperations = new ArrayList<>();
            uIManagerModule.prependUIBlock(new n(arrayList));
            uIManagerModule.addUIBlock(new o(arrayList2));
        }
    }
}
