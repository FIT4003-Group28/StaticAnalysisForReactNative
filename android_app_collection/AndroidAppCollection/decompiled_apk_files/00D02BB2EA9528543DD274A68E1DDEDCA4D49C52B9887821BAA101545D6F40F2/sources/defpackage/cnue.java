package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: cnue  reason: default package */
/* loaded from: classes.dex */
public final class cnue implements ServiceConnection {
    final /* synthetic */ cnui a;
    private final int b;

    public cnue(cnui cnuiVar, int i) {
        this.a = cnuiVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cnvq cnvqVar;
        int i;
        int i2;
        if (iBinder == null) {
            cnui cnuiVar = this.a;
            synchronized (cnuiVar.f) {
                i = cnuiVar.j;
            }
            if (i == 3) {
                cnuiVar.m = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            Handler handler = cnuiVar.e;
            handler.sendMessage(handler.obtainMessage(i2, cnuiVar.o.get(), 16));
            return;
        }
        synchronized (this.a.g) {
            cnui cnuiVar2 = this.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof cnvq)) {
                cnvqVar = new cnvq(iBinder);
            } else {
                cnvqVar = (cnvq) queryLocalInterface;
            }
            cnuiVar2.r = cnvqVar;
        }
        this.a.P(0, this.b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.g) {
            this.a.r = null;
        }
        Handler handler = this.a.e;
        handler.sendMessage(handler.obtainMessage(6, this.b, 1));
    }
}
