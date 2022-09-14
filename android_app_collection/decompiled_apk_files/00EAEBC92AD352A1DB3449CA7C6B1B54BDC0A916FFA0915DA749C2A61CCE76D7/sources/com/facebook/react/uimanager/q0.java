package com.facebook.react.uimanager;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.UIManager;
/* loaded from: classes.dex */
public class q0 {
    public static UIManager a(ReactContext reactContext, int i) {
        if (!reactContext.hasActiveCatalystInstance()) {
            ReactSoftException.logSoftException("UIManagerHelper", new RuntimeException("Cannot get UIManager: no active Catalyst instance"));
            return null;
        }
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        return (UIManager) (i == 2 ? catalystInstance.getJSIModule(JSIModuleType.UIManager) : catalystInstance.getNativeModule(UIManagerModule.class));
    }
}
