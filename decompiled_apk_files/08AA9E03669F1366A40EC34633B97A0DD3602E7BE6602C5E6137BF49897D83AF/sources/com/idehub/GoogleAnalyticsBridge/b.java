package com.idehub.GoogleAnalyticsBridge;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.n;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: GoogleAnalyticsBridgePackage.java */
/* loaded from: classes.dex */
public class b implements n {

    /* renamed from: a  reason: collision with root package name */
    private String f4940a;

    public b(String str) {
        this.f4940a = str;
    }

    public b() {
        this(null);
    }

    @Override // com.facebook.react.n
    public List<NativeModule> createNativeModules(ah ahVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GoogleAnalyticsBridge(ahVar, this.f4940a));
        arrayList.add(new GoogleTagManagerBridge(ahVar));
        return arrayList;
    }

    @Override // com.facebook.react.n
    public List<ViewManager> createViewManagers(ah ahVar) {
        return Arrays.asList(new ViewManager[0]);
    }
}
