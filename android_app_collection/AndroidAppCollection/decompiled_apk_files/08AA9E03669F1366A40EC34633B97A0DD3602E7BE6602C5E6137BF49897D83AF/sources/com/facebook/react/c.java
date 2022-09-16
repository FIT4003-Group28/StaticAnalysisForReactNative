package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.ak;
import com.facebook.react.bridge.z;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: LazyReactPackage.java */
/* loaded from: classes.dex */
public abstract class c implements n {
    public abstract com.facebook.react.d.a.b a();

    public abstract List<z> a(ah ahVar);

    public static com.facebook.react.d.a.b a(c cVar) {
        try {
            Class<?> cls = Class.forName(cVar.getClass().getCanonicalName() + "$$ReactModuleInfoProvider");
            if (cls == null) {
                throw new RuntimeException("ReactModuleInfoProvider class for " + cVar.getClass().getCanonicalName() + " not found.");
            }
            try {
                return (com.facebook.react.d.a.b) cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + cVar.getClass(), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + cVar.getClass(), e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // com.facebook.react.n
    public final List<NativeModule> createNativeModules(ah ahVar) {
        ArrayList arrayList = new ArrayList();
        for (z zVar : a(ahVar)) {
            com.facebook.m.b.a(0L, "createNativeModule").a("module", zVar.a()).a();
            ReactMarker.logMarker(ak.CREATE_MODULE_START, zVar.a().getSimpleName());
            try {
                NativeModule b2 = zVar.b().b();
                ReactMarker.logMarker(ak.CREATE_MODULE_END);
                com.facebook.m.b.a(0L).a();
                arrayList.add(b2);
            } catch (Throwable th) {
                ReactMarker.logMarker(ak.CREATE_MODULE_END);
                com.facebook.m.b.a(0L).a();
                throw th;
            }
        }
        return arrayList;
    }

    public List<z> b(ah ahVar) {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.n
    public List<ViewManager> createViewManagers(ah ahVar) {
        List<z> b2 = b(ahVar);
        if (b2 == null || b2.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (z zVar : b2) {
            arrayList.add((ViewManager) zVar.b().b());
        }
        return arrayList;
    }
}
