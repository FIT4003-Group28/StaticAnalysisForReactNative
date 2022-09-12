package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: arnf  reason: default package */
/* loaded from: classes2.dex */
public final class arnf implements ServiceConnection {
    final /* synthetic */ arng a;
    final /* synthetic */ arne b;

    public arnf(arng arngVar, arne arneVar) {
        this.a = arngVar;
        this.b = arneVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        clar clarVar;
        arng arngVar = this.a;
        if (iBinder == null) {
            clarVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.staticplugins.opa.morris2.btlatency.IBtLatencyService");
            if (queryLocalInterface instanceof clar) {
                clarVar = (clar) queryLocalInterface;
            } else {
                clarVar = new clar(iBinder);
            }
        }
        arngVar.c = clarVar;
        arne arneVar = this.b;
        if (!arneVar.a()) {
            return;
        }
        arneVar.a.c(1, arneVar);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        arng arngVar = this.a;
        arngVar.c = null;
        arngVar.b = null;
    }
}
