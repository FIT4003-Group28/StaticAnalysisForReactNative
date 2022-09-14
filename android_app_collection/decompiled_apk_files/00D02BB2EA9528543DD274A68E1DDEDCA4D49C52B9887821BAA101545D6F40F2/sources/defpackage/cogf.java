package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: cogf  reason: default package */
/* loaded from: classes5.dex */
public abstract class cogf extends Service {
    private final coho a = new coge(this);
    private final Object b = new Object();
    private cohp c;

    private final cohp b() {
        cohp cohpVar;
        synchronized (this.b) {
            cohpVar = this.c;
        }
        return cohpVar;
    }

    public abstract void a(String str, byte[] bArr, byte[] bArr2, cohi cohiVar);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        cohp cohpVar;
        if (!"com.google.android.gms.learning.EXAMPLE_STORE_V2".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            return new cohq(valueOf.length() != 0 ? "Received connection with unexpected action ".concat(valueOf) : new String("Received connection with unexpected action "));
        }
        synchronized (this.b) {
            cohpVar = this.c;
            if (cohpVar == null) {
                try {
                    cohpVar = (cohp) cohu.a(this, "com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl", cogd.a);
                    try {
                        cohpVar.e(cobb.b(this), this.a);
                        this.c = cohpVar;
                    } catch (RemoteException unused) {
                        return new cohq("No IInAppExampleStoreProxy implementation found");
                    }
                } catch (cohs unused2) {
                    return new cohq("No IInAppExampleStoreProxy implementation found");
                }
            }
        }
        try {
            return cohpVar.g(intent);
        } catch (RemoteException unused3) {
            return new cohq("No IInAppExampleStoreProxy implementation found");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        cohp b = b();
        if (b != null) {
            try {
                b.f();
            } catch (RemoteException unused) {
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        cohp b = b();
        if (b != null) {
            try {
                b.j(intent);
                return;
            } catch (RemoteException unused) {
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        cohp b = b();
        if (b != null) {
            try {
                b.h(i);
            } catch (RemoteException unused) {
            }
        }
        super.onTrimMemory(i);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        cohp b = b();
        if (b != null) {
            try {
                return b.i(intent);
            } catch (RemoteException unused) {
            }
        }
        return super.onUnbind(intent);
    }
}
