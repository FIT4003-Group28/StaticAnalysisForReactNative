package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: arng  reason: default package */
/* loaded from: classes2.dex */
public final class arng {
    public final Context a;
    @dzsi
    public ServiceConnection b;
    @dzsi
    public clar c;

    public arng(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        ServiceConnection serviceConnection = this.b;
        if (serviceConnection == null) {
            return;
        }
        this.a.unbindService(serviceConnection);
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        clar clarVar = this.c;
        if (clarVar != null) {
            try {
                return clarVar.f();
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
        throw new IllegalStateException("Bluetooth latency service not bound");
    }

    public final void c(int i, arne arneVar) {
        clar clarVar = this.c;
        if (clarVar != null) {
            try {
                clarVar.e(i, new arnh(arneVar));
                return;
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            }
        }
        throw new IllegalStateException("Bluetooth latency service not bound");
    }
}
