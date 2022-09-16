package com.th3rdwave.safeareacontext;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.th3rdwave.safeareacontext.e;
import java.util.Map;
/* loaded from: classes.dex */
public class SafeAreaProviderManager extends ViewGroupManager<e> {
    private final ReactApplicationContext mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f10085a;

        a(SafeAreaProviderManager safeAreaProviderManager, com.facebook.react.uimanager.events.d dVar) {
            this.f10085a = dVar;
        }

        @Override // com.th3rdwave.safeareacontext.e.a
        public void a(e eVar, com.th3rdwave.safeareacontext.a aVar, c cVar) {
            this.f10085a.a(new b(eVar.getId(), aVar, cVar));
        }
    }

    public SafeAreaProviderManager(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
    }

    private Map<String, Object> getInitialWindowMetrics() {
        ViewGroup viewGroup;
        Activity currentActivity = this.mContext.getCurrentActivity();
        if (currentActivity == null || (viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView()) == null) {
            return null;
        }
        View findViewById = viewGroup.findViewById(16908290);
        com.th3rdwave.safeareacontext.a b2 = f.b(viewGroup);
        c a2 = f.a(viewGroup, findViewById);
        if (b2 != null && a2 != null) {
            return com.facebook.react.common.f.a("insets", l.a(b2), "frame", l.a(a2));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(k0 k0Var, e eVar) {
        eVar.setOnInsetsChangeListener(new a(this, ((UIManagerModule) k0Var.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public e mo345createViewInstance(k0 k0Var) {
        return new e(k0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        f.b a2 = com.facebook.react.common.f.a();
        a2.a("topInsetsChange", com.facebook.react.common.f.a("registrationName", "onInsetsChange"));
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return com.facebook.react.common.f.a("initialWindowMetrics", getInitialWindowMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSafeAreaProvider";
    }
}
