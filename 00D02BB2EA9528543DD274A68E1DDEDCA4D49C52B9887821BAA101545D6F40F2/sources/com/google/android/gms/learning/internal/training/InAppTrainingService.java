package com.google.android.gms.learning.internal.training;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class InAppTrainingService extends Service {
    private static final String TAG = "brella.InAppTrngSvc";
    @dzsi
    coii dynamiteImpl;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        coii coiiVar = this.dynamiteImpl;
        if (coiiVar != null) {
            try {
                return coiiVar.g(intent);
            } catch (RemoteException unused) {
            }
        }
        return new cohq("No IInAppTrainingService implementation found");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            coii coiiVar = (coii) cohu.a(this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", coiv.a);
            this.dynamiteImpl = coiiVar;
            coiiVar.e(cobb.b(this));
            this.dynamiteImpl.l(new cohz());
        } catch (RemoteException | cohs unused) {
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        coii coiiVar = this.dynamiteImpl;
        if (coiiVar != null) {
            try {
                coiiVar.f();
            } catch (RemoteException unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        coii coiiVar = this.dynamiteImpl;
        if (coiiVar != null) {
            try {
                coiiVar.k(intent);
                return;
            } catch (RemoteException unused) {
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        coii coiiVar = this.dynamiteImpl;
        if (coiiVar != null) {
            try {
                return coiiVar.i(intent, i, i2);
            } catch (RemoteException unused) {
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        coii coiiVar = this.dynamiteImpl;
        if (coiiVar != null) {
            try {
                coiiVar.h(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        coii coiiVar = this.dynamiteImpl;
        if (coiiVar != null) {
            try {
                return coiiVar.j(intent);
            } catch (RemoteException unused) {
            }
        }
        return super.onUnbind(intent);
    }
}
