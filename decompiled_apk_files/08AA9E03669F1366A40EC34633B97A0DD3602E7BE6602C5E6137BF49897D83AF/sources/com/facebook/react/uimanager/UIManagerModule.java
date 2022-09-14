package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.uimanager.ad;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class UIManagerModule extends ReactContextBaseJavaModule implements com.facebook.react.bridge.ae, com.facebook.react.bridge.x {
    private static final boolean DEBUG = com.facebook.d.b.c.a().a(com.facebook.d.c.a.f);
    protected static final String NAME = "UIManager";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final com.facebook.react.uimanager.events.c mEventDispatcher;
    private final List<an> mListeners;
    private final b mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final aj mUIImplementation;

    /* loaded from: classes.dex */
    public interface a {
        String a(String str);
    }

    /* loaded from: classes.dex */
    public interface c {
        ViewManager a(String str);

        List<String> a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public UIManagerModule(com.facebook.react.bridge.ah ahVar, c cVar, ak akVar, int i) {
        super(ahVar);
        this.mMemoryTrimCallback = new b();
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        com.facebook.react.uimanager.b.a(ahVar);
        this.mEventDispatcher = new com.facebook.react.uimanager.events.c(ahVar);
        this.mModuleConstants = createConstants(cVar);
        this.mCustomDirectEvents = al.b();
        this.mUIImplementation = akVar.a(ahVar, cVar, this.mEventDispatcher, i);
        ahVar.a(this);
    }

    public UIManagerModule(com.facebook.react.bridge.ah ahVar, List<ViewManager> list, ak akVar, int i) {
        super(ahVar);
        this.mMemoryTrimCallback = new b();
        this.mListeners = new ArrayList();
        this.mBatchId = 0;
        com.facebook.react.uimanager.b.a(ahVar);
        this.mEventDispatcher = new com.facebook.react.uimanager.events.c(ahVar);
        this.mCustomDirectEvents = com.facebook.react.b.f.a();
        this.mModuleConstants = createConstants(list, null, this.mCustomDirectEvents);
        this.mUIImplementation = akVar.a(ahVar, list, this.mEventDispatcher, i);
        ahVar.a(this);
    }

    public aj getUIImplementation() {
        return this.mUIImplementation;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
        this.mUIImplementation.e();
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
        this.mUIImplementation.f();
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
        this.mUIImplementation.g();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.a();
        getReactApplicationContext().unregisterComponentCallbacks(this.mMemoryTrimCallback);
        av.a().b();
        ar.a();
    }

    private static Map<String, Object> createConstants(c cVar) {
        ReactMarker.logMarker(com.facebook.react.bridge.ak.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        com.facebook.m.a.a(0L, "CreateUIManagerConstants");
        try {
            return am.a(cVar);
        } finally {
            com.facebook.m.a.b(0L);
            ReactMarker.logMarker(com.facebook.react.bridge.ak.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    private static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(com.facebook.react.bridge.ak.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        com.facebook.m.a.a(0L, "CreateUIManagerConstants");
        try {
            return am.a(list, map, map2);
        } finally {
            com.facebook.m.a.b(0L);
            ReactMarker.logMarker(com.facebook.react.bridge.ak.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    @com.facebook.react.bridge.al(a = true)
    public com.facebook.react.bridge.ar getConstantsForViewManager(String str) {
        ViewManager b2 = str != null ? this.mUIImplementation.b(str) : null;
        if (b2 == null) {
            return null;
        }
        com.facebook.m.b.a(0L, "UIManagerModule.getConstantsForViewManager").a("ViewManager", b2.getName()).a("Lazy", (Object) true).a();
        try {
            Map<String, Object> a2 = am.a(b2, null, null, null, this.mCustomDirectEvents);
            if (a2 == null) {
                return null;
            }
            return com.facebook.react.bridge.b.a(a2);
        } finally {
            com.facebook.m.b.a(0L).a();
        }
    }

    @com.facebook.react.bridge.al(a = true)
    public com.facebook.react.bridge.ar getDefaultEventTypes() {
        return com.facebook.react.bridge.b.a(am.a());
    }

    public a getDirectEventNamesResolver() {
        return new a() { // from class: com.facebook.react.uimanager.UIManagerModule.1
            @Override // com.facebook.react.uimanager.UIManagerModule.a
            public String a(String str) {
                Map map = (Map) UIManagerModule.this.mCustomDirectEvents.get(str);
                return map != null ? (String) map.get("registrationName") : str;
            }
        };
    }

    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.b();
    }

    public <T extends ad & j> int addRootView(T t) {
        com.facebook.m.a.a(0L, "UIManagerModule.addRootView");
        final int a2 = v.a();
        final com.facebook.react.bridge.ah reactApplicationContext = getReactApplicationContext();
        this.mUIImplementation.a((aj) t, a2, new af(reactApplicationContext, t.getContext()));
        t.setOnSizeChangedListener(new ad.a() { // from class: com.facebook.react.uimanager.UIManagerModule.2
            @Override // com.facebook.react.uimanager.ad.a
            public void a(final int i, final int i2, int i3, int i4) {
                reactApplicationContext.b(new com.facebook.react.bridge.l(reactApplicationContext) { // from class: com.facebook.react.uimanager.UIManagerModule.2.1
                    @Override // com.facebook.react.bridge.l
                    public void a() {
                        UIManagerModule.this.updateNodeSize(a2, i, i2);
                    }
                });
            }
        });
        com.facebook.m.a.b(0L);
        return a2;
    }

    @com.facebook.react.bridge.al
    public void removeRootView(int i) {
        this.mUIImplementation.b(i);
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().h();
        this.mUIImplementation.b(i, i2, i3);
    }

    public void setViewLocalData(final int i, final Object obj) {
        com.facebook.react.bridge.ah reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.f();
        reactApplicationContext.b(new com.facebook.react.bridge.l(reactApplicationContext) { // from class: com.facebook.react.uimanager.UIManagerModule.3
            @Override // com.facebook.react.bridge.l
            public void a() {
                UIManagerModule.this.mUIImplementation.a(i, obj);
            }
        });
    }

    @com.facebook.react.bridge.al
    public void createView(int i, String str, int i2, com.facebook.react.bridge.an anVar) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i + ", class: " + str + ", props: " + anVar;
            com.facebook.common.e.a.a("ReactNative", str2);
            com.facebook.d.b.c.a().a(com.facebook.d.c.a.f, str2);
        }
        this.mUIImplementation.a(i, str, i2, anVar);
    }

    @com.facebook.react.bridge.al
    public void updateView(int i, String str, com.facebook.react.bridge.an anVar) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i + ", class: " + str + ", props: " + anVar;
            com.facebook.common.e.a.a("ReactNative", str2);
            com.facebook.d.b.c.a().a(com.facebook.d.c.a.f, str2);
        }
        this.mUIImplementation.a(i, str, anVar);
    }

    @com.facebook.react.bridge.al
    public void manageChildren(int i, com.facebook.react.bridge.am amVar, com.facebook.react.bridge.am amVar2, com.facebook.react.bridge.am amVar3, com.facebook.react.bridge.am amVar4, com.facebook.react.bridge.am amVar5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i + ", moveFrom: " + amVar + ", moveTo: " + amVar2 + ", addTags: " + amVar3 + ", atIndices: " + amVar4 + ", removeFrom: " + amVar5;
            com.facebook.common.e.a.a("ReactNative", str);
            com.facebook.d.b.c.a().a(com.facebook.d.c.a.f, str);
        }
        this.mUIImplementation.a(i, amVar, amVar2, amVar3, amVar4, amVar5);
    }

    @com.facebook.react.bridge.al
    public void setChildren(int i, com.facebook.react.bridge.am amVar) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i + ", children: " + amVar;
            com.facebook.common.e.a.a("ReactNative", str);
            com.facebook.d.b.c.a().a(com.facebook.d.c.a.f, str);
        }
        this.mUIImplementation.a(i, amVar);
    }

    @com.facebook.react.bridge.al
    public void replaceExistingNonRootView(int i, int i2) {
        this.mUIImplementation.a(i, i2);
    }

    @com.facebook.react.bridge.al
    public void removeSubviewsFromContainerWithID(int i) {
        this.mUIImplementation.d(i);
    }

    @com.facebook.react.bridge.al
    public void measure(int i, com.facebook.react.bridge.d dVar) {
        this.mUIImplementation.a(i, dVar);
    }

    @com.facebook.react.bridge.al
    public void measureInWindow(int i, com.facebook.react.bridge.d dVar) {
        this.mUIImplementation.b(i, dVar);
    }

    @com.facebook.react.bridge.al
    public void measureLayout(int i, int i2, com.facebook.react.bridge.d dVar, com.facebook.react.bridge.d dVar2) {
        this.mUIImplementation.a(i, i2, dVar, dVar2);
    }

    @com.facebook.react.bridge.al
    public void measureLayoutRelativeToParent(int i, com.facebook.react.bridge.d dVar, com.facebook.react.bridge.d dVar2) {
        this.mUIImplementation.a(i, dVar, dVar2);
    }

    @com.facebook.react.bridge.al
    public void findSubviewIn(int i, com.facebook.react.bridge.am amVar, com.facebook.react.bridge.d dVar) {
        this.mUIImplementation.a(i, Math.round(o.a(amVar.getDouble(0))), Math.round(o.a(amVar.getDouble(1))), dVar);
    }

    @com.facebook.react.bridge.al
    public void viewIsDescendantOf(int i, int i2, com.facebook.react.bridge.d dVar) {
        this.mUIImplementation.a(i, i2, dVar);
    }

    public void registerAnimation(com.facebook.react.a.a aVar) {
        this.mUIImplementation.a(aVar);
    }

    public void addAnimation(int i, int i2, com.facebook.react.bridge.d dVar) {
        this.mUIImplementation.b(i, i2, dVar);
    }

    public void removeAnimation(int i, int i2) {
        this.mUIImplementation.b(i, i2);
    }

    @com.facebook.react.bridge.al
    public void setJSResponder(int i, boolean z) {
        this.mUIImplementation.a(i, z);
    }

    @com.facebook.react.bridge.al
    public void clearJSResponder() {
        this.mUIImplementation.d();
    }

    @com.facebook.react.bridge.al
    public void dispatchViewManagerCommand(int i, int i2, com.facebook.react.bridge.am amVar) {
        this.mUIImplementation.a(i, i2, amVar);
    }

    @com.facebook.react.bridge.al
    public void showPopupMenu(int i, com.facebook.react.bridge.am amVar, com.facebook.react.bridge.d dVar, com.facebook.react.bridge.d dVar2) {
        this.mUIImplementation.a(i, amVar, dVar, dVar2);
    }

    @com.facebook.react.bridge.al
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mUIImplementation.a(z);
    }

    @com.facebook.react.bridge.al
    public void configureNextLayoutAnimation(com.facebook.react.bridge.an anVar, com.facebook.react.bridge.d dVar, com.facebook.react.bridge.d dVar2) {
        this.mUIImplementation.a(anVar, dVar, dVar2);
    }

    @Override // com.facebook.react.bridge.ae
    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId++;
        com.facebook.m.b.a(0L, "onBatchCompleteUI").a("BatchId", i).a();
        for (an anVar : this.mListeners) {
            anVar.willDispatchViewUpdates(this);
        }
        try {
            this.mUIImplementation.e(i);
        } finally {
            com.facebook.m.a.b(0L);
        }
    }

    public void setViewHierarchyUpdateDebugListener(com.facebook.react.uimanager.b.a aVar) {
        this.mUIImplementation.a(aVar);
    }

    public com.facebook.react.uimanager.events.c getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @com.facebook.react.bridge.al
    public void sendAccessibilityEvent(int i, int i2) {
        this.mUIImplementation.c(i, i2);
    }

    public void addUIBlock(ai aiVar) {
        this.mUIImplementation.a(aiVar);
    }

    public void prependUIBlock(ai aiVar) {
        this.mUIImplementation.b(aiVar);
    }

    public void addUIManagerListener(an anVar) {
        this.mListeners.add(anVar);
    }

    public void removeUIManagerListener(an anVar) {
        this.mListeners.remove(anVar);
    }

    public int resolveRootTagFromReactTag(int i) {
        return this.mUIImplementation.f(i);
    }

    public void invalidateNodeLayout(int i) {
        w a2 = this.mUIImplementation.a(i);
        if (a2 == null) {
            com.facebook.common.e.a.c("ReactNative", "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i);
            return;
        }
        a2.dirty();
    }

    public void updateRootLayoutSpecs(int i, int i2, int i3) {
        this.mUIImplementation.a(i, i2, i3);
        this.mUIImplementation.e(-1);
    }

    /* loaded from: classes.dex */
    private class b implements ComponentCallbacks2 {
        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        private b() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i >= 60) {
                av.a().b();
            }
        }
    }
}
