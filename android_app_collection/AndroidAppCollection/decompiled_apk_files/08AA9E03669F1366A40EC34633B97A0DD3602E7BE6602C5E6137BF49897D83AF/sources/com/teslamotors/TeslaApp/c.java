package com.teslamotors.TeslaApp;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.z;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.appstate.TMAppStateModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.network.d;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TeslaMainReactPackage.java */
/* loaded from: classes.dex */
public class c extends com.facebook.react.f.b {
    @Override // com.facebook.react.f.b, com.facebook.react.c
    public List<z> a(ah ahVar) {
        return a(ahVar, super.a(ahVar));
    }

    private List<z> a(ah ahVar, List<z> list) {
        ArrayList arrayList = new ArrayList(list);
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            z zVar = (z) arrayList.get(i);
            if (zVar.a().equals(NetworkingModule.class)) {
                arrayList.set(i, c(ahVar));
                break;
            }
            if (zVar.a().equals(AppStateModule.class)) {
                arrayList.set(i, d(ahVar));
            }
            i++;
        }
        return arrayList;
    }

    private z c(final ah ahVar) {
        return z.a(NetworkingModule.class, new javax.a.a<NativeModule>() { // from class: com.teslamotors.TeslaApp.c.1
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return d.a(ahVar);
            }
        });
    }

    private z d(final ah ahVar) {
        return z.a(AppStateModule.class, new javax.a.a<NativeModule>() { // from class: com.teslamotors.TeslaApp.c.2
            @Override // javax.a.a
            /* renamed from: a */
            public NativeModule b() {
                return new TMAppStateModule(ahVar);
            }
        });
    }
}
