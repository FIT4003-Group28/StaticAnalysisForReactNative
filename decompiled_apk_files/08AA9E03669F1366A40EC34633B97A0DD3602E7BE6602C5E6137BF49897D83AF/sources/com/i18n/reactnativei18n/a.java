package com.i18n.reactnativei18n;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.n;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ReactNativeI18n.java */
/* loaded from: classes.dex */
public class a implements n {
    @Override // com.facebook.react.n
    public List<NativeModule> createNativeModules(ah ahVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactNativeI18nLocale(ahVar));
        return arrayList;
    }

    @Override // com.facebook.react.n
    public List<ViewManager> createViewManagers(ah ahVar) {
        return Collections.emptyList();
    }
}
