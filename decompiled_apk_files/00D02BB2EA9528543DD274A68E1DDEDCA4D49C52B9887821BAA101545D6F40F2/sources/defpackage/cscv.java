package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cscv  reason: default package */
/* loaded from: classes.dex */
public final class cscv implements ServiceConnection {
    final /* synthetic */ cscw a;

    public cscv(cscw cscwVar) {
        this.a = cscwVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.e = false;
        cscw cscwVar = this.a;
        if (cscwVar.f == null) {
            return;
        }
        cscwVar.a = new Messenger(iBinder);
        try {
            Message obtain = Message.obtain((Handler) null, 2);
            obtain.replyTo = this.a.b;
            cscw cscwVar2 = this.a;
            obtain.getData().putString("ssb_service:ssb_package_name", cscwVar2.d.getPackageName());
            cscwVar2.a.send(obtain);
        } catch (RemoteException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        cscw cscwVar = this.a;
        cscwVar.a = null;
        cscwVar.e = false;
    }
}
