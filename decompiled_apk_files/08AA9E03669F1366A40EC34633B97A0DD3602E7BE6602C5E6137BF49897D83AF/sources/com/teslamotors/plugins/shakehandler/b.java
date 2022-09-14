package com.teslamotors.plugins.shakehandler;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.n;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ShakeHandlerPackage.java */
/* loaded from: classes.dex */
public class b implements n {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5417a = "b";

    @Override // com.facebook.react.n
    public List<NativeModule> createNativeModules(ah ahVar) {
        return Arrays.asList(new ShakeHandlerModule(ahVar));
    }

    @Override // com.facebook.react.n
    public List<ViewManager> createViewManagers(ah ahVar) {
        return Collections.emptyList();
    }
}
