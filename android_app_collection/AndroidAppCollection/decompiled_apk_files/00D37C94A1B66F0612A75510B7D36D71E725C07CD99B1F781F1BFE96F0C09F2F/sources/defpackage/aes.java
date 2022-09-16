package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: aes  reason: default package */
/* loaded from: classes.dex */
public final class aes implements ServiceConnection {
    public Context a;
    final /* synthetic */ ajgq b;

    public aes() {
    }

    public aes(ajgq ajgqVar) {
        this.b = ajgqVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cl clVar;
        if (this.a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        if (iBinder == null) {
            clVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof cl)) {
                clVar = new cl(iBinder);
            } else {
                clVar = (cl) queryLocalInterface;
            }
        }
        snb snbVar = new snb(componentName, new aep(clVar, componentName));
        if (this.b.c == null) {
            return;
        }
        this.b.c.c(snbVar);
        apes apesVar = this.b.b.a().B;
        if (apesVar == null) {
            apesVar = apes.a;
        }
        if (!apesVar.b) {
            apes apesVar2 = this.b.b.a().B;
            if (apesVar2 == null) {
                apesVar2 = apes.a;
            }
            if (!apesVar2.c) {
                return;
            }
        }
        try {
            try {
                cl clVar2 = snbVar.b.b;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(0L);
                    clVar2.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            } catch (RemoteException unused) {
            }
        } catch (NullPointerException | SecurityException e) {
            afus.c(1, 1, "Unable to prewarm CCT", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ajgq ajgqVar = this.b;
        if (ajgqVar.d.compareAndSet(true, false)) {
            ajgqVar.a.unbindService(ajgqVar.e);
        }
        if (ajgqVar.c != null) {
            ajgqVar.c.b();
            ajgqVar.c = null;
        }
    }
}
