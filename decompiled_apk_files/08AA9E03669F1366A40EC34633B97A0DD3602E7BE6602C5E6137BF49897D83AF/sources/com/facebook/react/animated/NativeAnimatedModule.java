package com.facebook.react.animated;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.x;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.e;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ai;
import com.facebook.react.uimanager.an;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class NativeAnimatedModule extends ReactContextBaseJavaModule implements x, an {
    protected static final String NAME = "NativeAnimatedModule";
    private final com.facebook.react.uimanager.d mAnimatedFrameCallback;
    private l mNodesManager;
    private ArrayList<a> mOperations;
    private ArrayList<a> mPreOperations;
    private final com.facebook.react.modules.core.e mReactChoreographer;

    /* loaded from: classes.dex */
    private interface a {
        void a(l lVar);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
    }

    public NativeAnimatedModule(ah ahVar) {
        super(ahVar);
        this.mOperations = new ArrayList<>();
        this.mPreOperations = new ArrayList<>();
        this.mReactChoreographer = com.facebook.react.modules.core.e.b();
        this.mAnimatedFrameCallback = new com.facebook.react.uimanager.d(ahVar) { // from class: com.facebook.react.animated.NativeAnimatedModule.1
            @Override // com.facebook.react.uimanager.d
            protected void a(long j) {
                l nodesManager = NativeAnimatedModule.this.getNodesManager();
                if (nodesManager.a()) {
                    nodesManager.a(j);
                }
                ((com.facebook.react.modules.core.e) com.facebook.j.a.a.b(NativeAnimatedModule.this.mReactChoreographer)).a(e.a.NATIVE_ANIMATED_MODULE, NativeAnimatedModule.this.mAnimatedFrameCallback);
            }
        };
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        ah reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.a(this);
        ((UIManagerModule) reactApplicationContext.b(UIManagerModule.class)).addUIManagerListener(this);
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.react.uimanager.an
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (!this.mOperations.isEmpty() || !this.mPreOperations.isEmpty()) {
            final ArrayList<a> arrayList = this.mPreOperations;
            final ArrayList<a> arrayList2 = this.mOperations;
            this.mPreOperations = new ArrayList<>();
            this.mOperations = new ArrayList<>();
            uIManagerModule.prependUIBlock(new ai() { // from class: com.facebook.react.animated.NativeAnimatedModule.12
                @Override // com.facebook.react.uimanager.ai
                public void a(com.facebook.react.uimanager.k kVar) {
                    l nodesManager = NativeAnimatedModule.this.getNodesManager();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a(nodesManager);
                    }
                }
            });
            uIManagerModule.addUIBlock(new ai() { // from class: com.facebook.react.animated.NativeAnimatedModule.15
                @Override // com.facebook.react.uimanager.ai
                public void a(com.facebook.react.uimanager.k kVar) {
                    l nodesManager = NativeAnimatedModule.this.getNodesManager();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a(nodesManager);
                    }
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
        clearFrameCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new l((UIManagerModule) getReactApplicationContext().b(UIManagerModule.class));
        }
        return this.mNodesManager;
    }

    private void clearFrameCallback() {
        ((com.facebook.react.modules.core.e) com.facebook.j.a.a.b(this.mReactChoreographer)).b(e.a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    private void enqueueFrameCallback() {
        ((com.facebook.react.modules.core.e) com.facebook.j.a.a.b(this.mReactChoreographer)).a(e.a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    public void setNodesManager(l lVar) {
        this.mNodesManager = lVar;
    }

    @al
    public void createAnimatedNode(final int i, final com.facebook.react.bridge.an anVar) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.16
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.a(i, anVar);
            }
        });
    }

    @al
    public void startListeningToAnimatedNodeValue(final int i) {
        final c cVar = new c() { // from class: com.facebook.react.animated.NativeAnimatedModule.17
            @Override // com.facebook.react.animated.c
            public void a(double d2) {
                ar b2 = com.facebook.react.bridge.b.b();
                b2.putInt("tag", i);
                b2.putDouble("value", d2);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) NativeAnimatedModule.this.getReactApplicationContext().a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onAnimatedValueUpdate", b2);
            }
        };
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.18
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.a(i, cVar);
            }
        });
    }

    @al
    public void stopListeningToAnimatedNodeValue(final int i) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.19
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.c(i);
            }
        });
    }

    @al
    public void dropAnimatedNode(final int i) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.20
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.b(i);
            }
        });
    }

    @al
    public void setAnimatedNodeValue(final int i, final double d2) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.21
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.a(i, d2);
            }
        });
    }

    @al
    public void setAnimatedNodeOffset(final int i, final double d2) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.2
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.b(i, d2);
            }
        });
    }

    @al
    public void flattenAnimatedNodeOffset(final int i) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.3
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.d(i);
            }
        });
    }

    @al
    public void extractAnimatedNodeOffset(final int i) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.4
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.e(i);
            }
        });
    }

    @al
    public void startAnimatingNode(final int i, final int i2, final com.facebook.react.bridge.an anVar, final com.facebook.react.bridge.d dVar) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.5
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.a(i, i2, anVar, dVar);
            }
        });
    }

    @al
    public void stopAnimation(final int i) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.6
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.f(i);
            }
        });
    }

    @al
    public void connectAnimatedNodes(final int i, final int i2) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.7
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.a(i, i2);
            }
        });
    }

    @al
    public void disconnectAnimatedNodes(final int i, final int i2) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.8
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.b(i, i2);
            }
        });
    }

    @al
    public void connectAnimatedNodeToView(final int i, final int i2) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.9
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.c(i, i2);
            }
        });
    }

    @al
    public void disconnectAnimatedNodeFromView(final int i, final int i2) {
        this.mPreOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.10
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.e(i, i2);
            }
        });
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.11
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.d(i, i2);
            }
        });
    }

    @al
    public void addAnimatedEventToView(final int i, final String str, final com.facebook.react.bridge.an anVar) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.13
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.a(i, str, anVar);
            }
        });
    }

    @al
    public void removeAnimatedEventFromView(final int i, final String str, final int i2) {
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.14
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public void a(l lVar) {
                lVar.a(i, str, i2);
            }
        });
    }
}
