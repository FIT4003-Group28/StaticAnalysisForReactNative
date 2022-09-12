package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnvd  reason: default package */
/* loaded from: classes.dex */
public final class cnvd extends cnva {
    public final Context b;
    public final Handler c;
    public final HashMap<cnuz, cnvb> a = new HashMap<>();
    public final cnxg d = cnxg.a();
    private final long f = 5000;
    public final long e = 300000;

    public cnvd(Context context) {
        this.b = context.getApplicationContext();
        this.c = new cojb(context.getMainLooper(), new cnvc(this));
    }

    @Override // defpackage.cnva
    public final boolean b(cnuz cnuzVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        cnwc.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            cnvb cnvbVar = this.a.get(cnuzVar);
            if (cnvbVar == null) {
                cnvbVar = new cnvb(this, cnuzVar);
                cnvbVar.c(serviceConnection, serviceConnection);
                cnvbVar.d();
                this.a.put(cnuzVar, cnvbVar);
            } else {
                this.c.removeMessages(0, cnuzVar);
                if (cnvbVar.a(serviceConnection)) {
                    String valueOf = String.valueOf(cnuzVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                cnvbVar.c(serviceConnection, serviceConnection);
                int i = cnvbVar.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(cnvbVar.f, cnvbVar.d);
                } else if (i == 2) {
                    cnvbVar.d();
                }
            }
            z = cnvbVar.c;
        }
        return z;
    }

    @Override // defpackage.cnva
    protected final void d(cnuz cnuzVar, ServiceConnection serviceConnection) {
        cnwc.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            cnvb cnvbVar = this.a.get(cnuzVar);
            if (cnvbVar == null) {
                String valueOf = String.valueOf(cnuzVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (cnvbVar.a(serviceConnection)) {
                cnvbVar.a.remove(serviceConnection);
                if (cnvbVar.b()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, cnuzVar), this.f);
                }
            } else {
                String valueOf2 = String.valueOf(cnuzVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
