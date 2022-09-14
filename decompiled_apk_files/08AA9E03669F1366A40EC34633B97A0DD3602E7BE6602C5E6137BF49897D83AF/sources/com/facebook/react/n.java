package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
/* compiled from: ReactPackage.java */
/* loaded from: classes.dex */
public interface n {
    List<NativeModule> createNativeModules(ah ahVar);

    List<ViewManager> createViewManagers(ah ahVar);
}
