package com.swmansion.reanimated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.t0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
@com.facebook.react.d0.a.a(name = ReanimatedModule.NAME)
/* loaded from: classes.dex */
public class ReanimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, t0 {
    public static final String NAME = "ReanimatedModule";
    private com.swmansion.reanimated.b mNodesManager;
    private ArrayList<m> mOperations;
    private com.swmansion.reanimated.f.c mTransitionManager;

    /* loaded from: classes.dex */
    class a implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Set f9937a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f9938b;

        a(ReanimatedModule reanimatedModule, Set set, Set set2) {
            this.f9937a = set;
            this.f9938b = set2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(com.swmansion.reanimated.b bVar) {
            bVar.a(this.f9937a, this.f9938b);
        }
    }

    /* loaded from: classes.dex */
    class b implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9939a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callback f9940b;

        b(ReanimatedModule reanimatedModule, int i, Callback callback) {
            this.f9939a = i;
            this.f9940b = callback;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(com.swmansion.reanimated.b bVar) {
            bVar.a(this.f9939a, this.f9940b);
        }
    }

    /* loaded from: classes.dex */
    class c implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9941a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Double f9942b;

        c(ReanimatedModule reanimatedModule, int i, Double d2) {
            this.f9941a = i;
            this.f9942b = d2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(com.swmansion.reanimated.b bVar) {
            bVar.a(this.f9941a, this.f9942b);
        }
    }

    /* loaded from: classes.dex */
    class d implements n0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f9943a;

        d(ArrayList arrayList) {
            this.f9943a = arrayList;
        }

        @Override // com.facebook.react.uimanager.n0
        public void a(com.facebook.react.uimanager.m mVar) {
            com.swmansion.reanimated.b nodesManager = ReanimatedModule.this.getNodesManager();
            Iterator it = this.f9943a.iterator();
            while (it.hasNext()) {
                ((m) it.next()).a(nodesManager);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f9946b;

        e(ReanimatedModule reanimatedModule, int i, ReadableMap readableMap) {
            this.f9945a = i;
            this.f9946b = readableMap;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(com.swmansion.reanimated.b bVar) {
            bVar.a(this.f9945a, this.f9946b);
        }
    }

    /* loaded from: classes.dex */
    class f implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9947a;

        f(ReanimatedModule reanimatedModule, int i) {
            this.f9947a = i;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(com.swmansion.reanimated.b bVar) {
            bVar.a(this.f9947a);
        }
    }

    /* loaded from: classes.dex */
    class g implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9948a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9949b;

        g(ReanimatedModule reanimatedModule, int i, int i2) {
            this.f9948a = i;
            this.f9949b = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(com.swmansion.reanimated.b bVar) {
            bVar.b(this.f9948a, this.f9949b);
        }
    }

    /* loaded from: classes.dex */
    class h implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9951b;

        h(ReanimatedModule reanimatedModule, int i, int i2) {
            this.f9950a = i;
            this.f9951b = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(com.swmansion.reanimated.b bVar) {
            bVar.d(this.f9950a, this.f9951b);
        }
    }

    /* loaded from: classes.dex */
    class i implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9953b;

        i(ReanimatedModule reanimatedModule, int i, int i2) {
            this.f9952a = i;
            this.f9953b = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(com.swmansion.reanimated.b bVar) {
            bVar.a(this.f9952a, this.f9953b);
        }
    }

    /* loaded from: classes.dex */
    class j implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9954a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9955b;

        j(ReanimatedModule reanimatedModule, int i, int i2) {
            this.f9954a = i;
            this.f9955b = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(com.swmansion.reanimated.b bVar) {
            bVar.c(this.f9954a, this.f9955b);
        }
    }

    /* loaded from: classes.dex */
    class k implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9956a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9957b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9958c;

        k(ReanimatedModule reanimatedModule, int i, String str, int i2) {
            this.f9956a = i;
            this.f9957b = str;
            this.f9958c = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(com.swmansion.reanimated.b bVar) {
            bVar.a(this.f9956a, this.f9957b, this.f9958c);
        }
    }

    /* loaded from: classes.dex */
    class l implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9959a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9960b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9961c;

        l(ReanimatedModule reanimatedModule, int i, String str, int i2) {
            this.f9959a = i;
            this.f9960b = str;
            this.f9961c = i2;
        }

        @Override // com.swmansion.reanimated.ReanimatedModule.m
        public void a(com.swmansion.reanimated.b bVar) {
            bVar.b(this.f9959a, this.f9960b, this.f9961c);
        }
    }

    /* loaded from: classes.dex */
    private interface m {
        void a(com.swmansion.reanimated.b bVar);
    }

    public ReanimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.swmansion.reanimated.b getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new com.swmansion.reanimated.b(getReactApplicationContext());
        }
        return this.mNodesManager;
    }

    @ReactMethod
    public void animateNextTransition(int i2, ReadableMap readableMap) {
        this.mTransitionManager.a(i2, readableMap);
    }

    @ReactMethod
    public void attachEvent(int i2, String str, int i3) {
        this.mOperations.add(new k(this, i2, str, i3));
    }

    @ReactMethod
    public void configureProps(ReadableArray readableArray, ReadableArray readableArray2) {
        int size = readableArray.size();
        HashSet hashSet = new HashSet(size);
        for (int i2 = 0; i2 < size; i2++) {
            hashSet.add(readableArray.getString(i2));
        }
        int size2 = readableArray2.size();
        HashSet hashSet2 = new HashSet(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            hashSet2.add(readableArray2.getString(i3));
        }
        this.mOperations.add(new a(this, hashSet, hashSet2));
    }

    @ReactMethod
    public void connectNodeToView(int i2, int i3) {
        this.mOperations.add(new i(this, i2, i3));
    }

    @ReactMethod
    public void connectNodes(int i2, int i3) {
        this.mOperations.add(new g(this, i2, i3));
    }

    @ReactMethod
    public void createNode(int i2, ReadableMap readableMap) {
        this.mOperations.add(new e(this, i2, readableMap));
    }

    @ReactMethod
    public void detachEvent(int i2, String str, int i3) {
        this.mOperations.add(new l(this, i2, str, i3));
    }

    @ReactMethod
    public void disconnectNodeFromView(int i2, int i3) {
        this.mOperations.add(new j(this, i2, i3));
    }

    @ReactMethod
    public void disconnectNodes(int i2, int i3) {
        this.mOperations.add(new h(this, i2, i3));
    }

    @ReactMethod
    public void dropNode(int i2) {
        this.mOperations.add(new f(this, i2));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getValue(int i2, Callback callback) {
        this.mOperations.add(new b(this, i2, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        UIManagerModule uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class);
        reactApplicationContext.addLifecycleEventListener(this);
        uIManagerModule.addUIManagerListener(this);
        this.mTransitionManager = new com.swmansion.reanimated.f.c(uIManagerModule);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        com.swmansion.reanimated.b bVar = this.mNodesManager;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        com.swmansion.reanimated.b bVar = this.mNodesManager;
        if (bVar != null) {
            bVar.b();
        }
    }

    @ReactMethod
    public void setValue(int i2, Double d2) {
        this.mOperations.add(new c(this, i2, d2));
    }

    @Override // com.facebook.react.uimanager.t0
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (this.mOperations.isEmpty()) {
            return;
        }
        ArrayList<m> arrayList = this.mOperations;
        this.mOperations = new ArrayList<>();
        uIManagerModule.addUIBlock(new d(arrayList));
    }
}
