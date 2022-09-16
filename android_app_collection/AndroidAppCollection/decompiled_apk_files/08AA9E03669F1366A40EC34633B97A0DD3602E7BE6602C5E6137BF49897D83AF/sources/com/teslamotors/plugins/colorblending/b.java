package com.teslamotors.plugins.colorblending;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.n;
import com.facebook.react.uimanager.ViewManager;
import com.teslamotors.plugins.client.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ColorBlendingImageViewPackage.java */
/* loaded from: classes.dex */
public class b implements n {
    @Override // com.facebook.react.n
    public List<NativeModule> createNativeModules(ah ahVar) {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.n
    public List<ViewManager> createViewManagers(ah ahVar) {
        c.f5360a = e.a(ahVar).a();
        return Arrays.asList(new ColorBlendingImageViewManager());
    }
}
