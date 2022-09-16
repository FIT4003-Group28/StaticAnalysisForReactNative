package com.google.android.libraries.youtube.offline.transfer.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class OfflineKeepAliveService extends Service {
    public azqb a;
    public agro b;

    private final void a() {
        Notification a;
        if (Build.VERSION.SDK_INT < 26 || getApplicationInfo().targetSdkVersion < 26 || (a = ((agrn) this.a.get()).a()) == null) {
            return;
        }
        try {
            startForeground(17, a);
            this.b.d(null, 17, a);
        } catch (RuntimeException unused) {
            zep.b("[Offline] OfflineKeepAliveService: Cannot start foreground notification.");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        zep.g("[Offline] OfflineKeepAliveService: injecting offline transfer service...");
        dyo dyoVar = ((agzi) zew.E(getApplication(), agzi.class)).iS().a;
        this.a = dyoVar.lv;
        this.b = (agro) dyoVar.kN.get();
        super.onCreate();
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zep.g("[Offline] OfflineKeepAliveService: destroying OfflineKeepAliveService...");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        zep.g("[Offline] OfflineKeepAliveService: direct offline transfer service starts.");
        a();
        return 1;
    }
}
