package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.w;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class ViewManager<T extends View, C extends w> extends BaseJavaModule {
    protected void addEventEmitters(af afVar, T t) {
    }

    /* renamed from: createViewInstance */
    protected abstract T mo170createViewInstance(af afVar);

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public abstract Class<? extends C> getShadowNodeClass();

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAfterUpdateTransaction(T t) {
    }

    public void onDropViewInstance(T t) {
    }

    public void receiveCommand(T t, int i, com.facebook.react.bridge.am amVar) {
    }

    public abstract void updateExtraData(T t, Object obj);

    public final void updateProperties(T t, y yVar) {
        ar.a(this, t, yVar);
        onAfterUpdateTransaction(t);
    }

    public final T createView(af afVar, com.facebook.react.g.a aVar) {
        T mo170createViewInstance = mo170createViewInstance(afVar);
        addEventEmitters(afVar, mo170createViewInstance);
        if (mo170createViewInstance instanceof com.facebook.react.g.d) {
            ((com.facebook.react.g.d) mo170createViewInstance).setOnInterceptTouchEventListener(aVar);
        }
        return mo170createViewInstance;
    }

    /* renamed from: createShadowNodeInstance */
    public C mo168createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public C createShadowNodeInstance(com.facebook.react.bridge.ah ahVar) {
        return mo168createShadowNodeInstance();
    }

    public Map<String, String> getNativeProps() {
        return ar.a((Class<? extends ViewManager>) getClass(), (Class<? extends w>) getShadowNodeClass());
    }
}
