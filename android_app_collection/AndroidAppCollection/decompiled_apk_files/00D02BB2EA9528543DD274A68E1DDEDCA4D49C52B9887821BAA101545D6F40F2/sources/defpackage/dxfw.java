package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: dxfw  reason: default package */
/* loaded from: classes6.dex */
public final class dxfw implements ServiceConnection, dxgj {
    public final String a;
    public final Context b;
    public dxgi c;
    public Messenger d;
    public dxft e;
    public dxey g;
    private final Messenger h = new Messenger(new dxfv(this));
    public int f = 1;

    public dxfw(String str, Context context) {
        this.a = str;
        this.b = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        dxgt.a();
        Messenger messenger = new Messenger(iBinder);
        Message obtain = Message.obtain();
        obtain.replyTo = this.h;
        try {
            messenger.send(obtain);
        } catch (RemoteException unused) {
            dxgt.b();
        }
        this.f = 3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        dxgt.b();
        this.d = null;
        this.f = 4;
        dxey dxeyVar = this.g;
        if (dxeyVar != null) {
            dxeyVar.a();
        }
    }
}
