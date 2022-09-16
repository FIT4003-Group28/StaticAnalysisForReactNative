package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: qxd  reason: default package */
/* loaded from: classes4.dex */
public final class qxd {
    private static final Object f = new Object();
    private static qxd g;
    public final HashMap a;
    public final Context b;
    public final Handler c;
    public final qyf d;
    public final long e;
    private final long h;

    public qxd() {
    }

    public static qxd a(Context context) {
        synchronized (f) {
            if (g == null) {
                g = new qxd(context.getApplicationContext());
            }
        }
        return g;
    }

    public final boolean b(qxc qxcVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        qnm.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            qxe qxeVar = (qxe) this.a.get(qxcVar);
            if (qxeVar == null) {
                qxeVar = new qxe(this, qxcVar);
                qxeVar.d(serviceConnection, serviceConnection);
                qxeVar.a(str);
                this.a.put(qxcVar, qxeVar);
            } else {
                this.c.removeMessages(0, qxcVar);
                if (qxeVar.b(serviceConnection)) {
                    String valueOf = String.valueOf(qxcVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                qxeVar.d(serviceConnection, serviceConnection);
                int i = qxeVar.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(qxeVar.f, qxeVar.d);
                } else if (i == 2) {
                    qxeVar.a(str);
                }
            }
            z = qxeVar.c;
        }
        return z;
    }

    public final void c(ComponentName componentName, ServiceConnection serviceConnection) {
        d(new qxc(componentName), serviceConnection);
    }

    protected final void d(qxc qxcVar, ServiceConnection serviceConnection) {
        qnm.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            qxe qxeVar = (qxe) this.a.get(qxcVar);
            if (qxeVar == null) {
                String valueOf = String.valueOf(qxcVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (qxeVar.b(serviceConnection)) {
                qxeVar.a.remove(serviceConnection);
                if (qxeVar.c()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, qxcVar), this.h);
                }
            } else {
                String valueOf2 = String.valueOf(qxcVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final void e(String str, ServiceConnection serviceConnection, boolean z) {
        d(new qxc(str, z), serviceConnection);
    }

    public qxd(Context context) {
        this.a = new HashMap();
        this.b = context.getApplicationContext();
        this.c = new rfm(context.getMainLooper(), new qxf(this));
        this.d = qyf.a();
        this.h = 5000L;
        this.e = 300000L;
    }
}
