package com.teslamotors.plugins.notifications;

import android.content.Intent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.n;
import com.facebook.react.uimanager.ViewManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PushNotificationPackage.java */
/* loaded from: classes.dex */
public class c implements n {

    /* renamed from: b  reason: collision with root package name */
    private static c f5407b;

    /* renamed from: a  reason: collision with root package name */
    WeakReference<PushNotificationModule> f5408a;

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f5407b == null) {
                f5407b = new c();
            }
            cVar = f5407b;
        }
        return cVar;
    }

    private c() {
    }

    @Override // com.facebook.react.n
    public List<NativeModule> createNativeModules(ah ahVar) {
        PushNotificationModule pushNotificationModule = new PushNotificationModule(ahVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pushNotificationModule);
        this.f5408a = new WeakReference<>(pushNotificationModule);
        return arrayList;
    }

    @Override // com.facebook.react.n
    public List<ViewManager> createViewManagers(ah ahVar) {
        return Arrays.asList(new ViewManager[0]);
    }

    public boolean a(Intent intent) {
        PushNotificationModule pushNotificationModule;
        if (this.f5408a == null || (pushNotificationModule = this.f5408a.get()) == null) {
            return false;
        }
        return pushNotificationModule.onNewIntent(intent);
    }
}
