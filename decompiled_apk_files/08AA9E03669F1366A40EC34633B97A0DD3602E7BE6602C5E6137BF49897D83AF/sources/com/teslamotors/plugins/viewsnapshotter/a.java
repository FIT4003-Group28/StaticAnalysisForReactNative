package com.teslamotors.plugins.viewsnapshotter;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.n;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ViewSnapshotterPackage.java */
/* loaded from: classes.dex */
public class a implements n {
    @Override // com.facebook.react.n
    public List<NativeModule> createNativeModules(ah ahVar) {
        return Arrays.asList(new ViewSnapshotterModule(ahVar));
    }

    @Override // com.facebook.react.n
    public List<ViewManager> createViewManagers(ah ahVar) {
        return Collections.emptyList();
    }
}
