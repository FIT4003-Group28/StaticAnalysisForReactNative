package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qlq  reason: default package */
/* loaded from: classes4.dex */
public final class qlq extends Service {
    private qlf a;

    static {
        new qpu("ReconnectionService");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        qlf qlfVar = this.a;
        if (qlfVar != null) {
            try {
                return qlfVar.f(intent);
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        rad radVar;
        qkp b = qkp.b(this);
        rad radVar2 = null;
        try {
            radVar = b.d().b.f();
        } catch (RemoteException unused) {
            radVar = null;
        }
        qnm.g("Must be called from the main thread.");
        try {
            radVar2 = b.g.a.a();
        } catch (RemoteException unused2) {
        }
        qlf b2 = qmd.b(this, radVar, radVar2);
        this.a = b2;
        if (b2 != null) {
            try {
                b2.g();
            } catch (RemoteException unused3) {
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        qlf qlfVar = this.a;
        if (qlfVar != null) {
            try {
                qlfVar.h();
            } catch (RemoteException unused) {
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        qlf qlfVar = this.a;
        if (qlfVar != null) {
            try {
                return qlfVar.a(intent, i, i2);
            } catch (RemoteException unused) {
            }
        }
        return 2;
    }
}
