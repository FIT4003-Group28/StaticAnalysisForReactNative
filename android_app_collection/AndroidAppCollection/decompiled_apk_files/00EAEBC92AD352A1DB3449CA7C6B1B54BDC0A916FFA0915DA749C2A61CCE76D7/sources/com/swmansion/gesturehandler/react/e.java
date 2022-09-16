package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.v;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class e implements v {
    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNGestureHandlerModule(reactApplicationContext));
    }

    @Override // com.facebook.react.v
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
    }
}
