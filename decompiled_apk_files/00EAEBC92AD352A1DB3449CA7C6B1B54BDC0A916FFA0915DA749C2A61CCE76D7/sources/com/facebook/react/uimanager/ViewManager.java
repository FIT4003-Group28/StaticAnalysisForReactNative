package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.a0;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class ViewManager<T extends View, C extends a0> extends BaseJavaModule {
    private final T createView(k0 k0Var, com.facebook.react.g0.a aVar) {
        return createView(k0Var, null, null, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addEventEmitters(k0 k0Var, T t) {
    }

    /* renamed from: createShadowNodeInstance */
    public C mo328createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return mo328createShadowNodeInstance();
    }

    public T createView(k0 k0Var, c0 c0Var, j0 j0Var, com.facebook.react.g0.a aVar) {
        T createViewInstance = createViewInstance(k0Var, c0Var, j0Var);
        if (createViewInstance instanceof com.facebook.react.g0.d) {
            ((com.facebook.react.g0.d) createViewInstance).setOnInterceptTouchEventListener(aVar);
        }
        return createViewInstance;
    }

    /* renamed from: createViewInstance */
    protected abstract T mo345createViewInstance(k0 k0Var);

    protected T createViewInstance(k0 k0Var, c0 c0Var, j0 j0Var) {
        Object updateState;
        T mo345createViewInstance = mo345createViewInstance(k0Var);
        addEventEmitters(k0Var, mo345createViewInstance);
        if (c0Var != null) {
            updateProperties(mo345createViewInstance, c0Var);
        }
        if (j0Var != null && (updateState = updateState(mo345createViewInstance, c0Var, j0Var)) != null) {
            updateExtraData(mo345createViewInstance, updateState);
        }
        return mo345createViewInstance;
    }

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    protected y0<T> getDelegate() {
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

    public Map<String, String> getNativeProps() {
        return z0.a((Class<? extends ViewManager>) getClass(), (Class<? extends a0>) getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f2, com.facebook.yoga.n nVar, float f3, com.facebook.yoga.n nVar2) {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onAfterUpdateTransaction(T t) {
    }

    public void onDropViewInstance(T t) {
    }

    @Deprecated
    public void receiveCommand(T t, int i, ReadableArray readableArray) {
    }

    public void receiveCommand(T t, String str, ReadableArray readableArray) {
    }

    public void setPadding(T t, int i, int i2, int i3, int i4) {
    }

    public abstract void updateExtraData(T t, Object obj);

    public Object updateLocalData(T t, c0 c0Var, c0 c0Var2) {
        return null;
    }

    public void updateProperties(T t, c0 c0Var) {
        y0<T> delegate;
        if (!com.facebook.react.b0.a.f5413e || (delegate = getDelegate()) == null) {
            z0.a(this, t, c0Var);
        } else {
            z0.a(delegate, t, c0Var);
        }
        onAfterUpdateTransaction(t);
    }

    public Object updateState(T t, c0 c0Var, j0 j0Var) {
        return null;
    }
}
