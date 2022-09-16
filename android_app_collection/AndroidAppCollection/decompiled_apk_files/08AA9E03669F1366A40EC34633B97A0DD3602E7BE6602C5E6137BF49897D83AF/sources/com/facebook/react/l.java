package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import java.util.List;
/* compiled from: ReactInstancePackage.java */
/* loaded from: classes.dex */
public abstract class l implements n {
    public abstract List<NativeModule> a(ah ahVar, j jVar);

    @Override // com.facebook.react.n
    public List<NativeModule> createNativeModules(ah ahVar) {
        throw new RuntimeException("ReactInstancePackage must be passed in the ReactInstanceManager.");
    }
}
