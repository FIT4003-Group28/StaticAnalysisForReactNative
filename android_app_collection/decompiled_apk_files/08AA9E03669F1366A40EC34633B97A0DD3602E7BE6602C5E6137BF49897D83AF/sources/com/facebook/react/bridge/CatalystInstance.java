package com.facebook.react.bridge;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public interface CatalystInstance extends q, y {
    void addBridgeIdleDebugListener(ad adVar);

    @com.facebook.k.a.a
    void callFunction(String str, String str2, NativeArray nativeArray);

    void destroy();

    <T extends JavaScriptModule> T getJSModule(Class<T> cls);

    <T extends NativeModule> T getNativeModule(Class<T> cls);

    com.facebook.react.bridge.queue.d getReactQueueConfiguration();

    String getSourceURL();

    void initialize();

    @Override // com.facebook.react.bridge.q
    @com.facebook.k.a.a
    void invokeCallback(int i, NativeArray nativeArray);

    boolean isDestroyed();

    void removeBridgeIdleDebugListener(ad adVar);

    void runJSBundle();

    void setGlobalVariable(String str, String str2);
}
