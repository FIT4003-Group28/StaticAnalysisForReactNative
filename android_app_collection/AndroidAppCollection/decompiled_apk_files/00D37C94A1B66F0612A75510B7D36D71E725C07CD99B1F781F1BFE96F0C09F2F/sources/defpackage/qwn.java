package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: qwn  reason: default package */
/* loaded from: classes4.dex */
public final class qwn implements ServiceConnection {
    final /* synthetic */ qwr a;
    private final int b;

    public qwn(qwr qwrVar, int i) {
        this.a = qwrVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qxq qxqVar;
        int i;
        int i2;
        if (iBinder == null) {
            qwr qwrVar = this.a;
            synchronized (qwrVar.t) {
                i = qwrVar.x;
            }
            if (i == 3) {
                qwrVar.D = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = qwrVar.s;
            handler.sendMessage(handler.obtainMessage(i2, qwrVar.F.get(), 16));
            return;
        }
        synchronized (this.a.u) {
            qwr qwrVar2 = this.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof qxq)) {
                qxqVar = new qxq(iBinder);
            } else {
                qxqVar = (qxq) queryLocalInterface;
            }
            qwrVar2.G = qxqVar;
        }
        this.a.O(0, this.b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.u) {
            this.a.G = null;
        }
        Handler handler = this.a.s;
        handler.sendMessage(handler.obtainMessage(6, this.b, 1));
    }
}
