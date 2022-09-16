package com.google.android.youtube.api.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.HashSet;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class YouTubeService extends Service {
    public oqi a;

    public static void a(alyc alycVar, int i) {
        try {
            alycVar.a(aqvb.n(i), null);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.youtube.api.service.START".equals(intent.getAction())) {
            return new alxv(this, new ord(), null, null);
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.a = new oqi();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        for (oqh oqhVar : new HashSet(this.a.a)) {
            oqhVar.c();
        }
        super.onDestroy();
    }
}
