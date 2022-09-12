package com.google.android.apps.gmm.util.systemhealth.impl;

import android.content.Intent;
import android.os.IBinder;
/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemHealthService extends affo {
    private boolean a = false;

    @Override // android.app.Service
    @dzsi
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        this.a = true;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((iqz) btsr.a(iqz.class)).e().a();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!this.a) {
            stopSelf();
            return 2;
        }
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        ((btri) btsr.a(btri.class)).rz().b(new ckot());
        this.a = false;
        stopSelf();
    }
}
