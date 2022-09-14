package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cnuy  reason: default package */
/* loaded from: classes.dex */
public final class cnuy implements Handler.Callback {
    public final cnux a;
    public final Handler h;
    public final ArrayList<GoogleApiClient.ConnectionCallbacks> b = new ArrayList<>();
    public final ArrayList<GoogleApiClient.ConnectionCallbacks> c = new ArrayList<>();
    public final ArrayList<GoogleApiClient.OnConnectionFailedListener> d = new ArrayList<>();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g = false;
    public final Object i = new Object();

    public cnuy(Looper looper, cnux cnuxVar) {
        this.a = cnuxVar;
        this.h = new cojb(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void b() {
        this.e = true;
    }

    public final void c(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        cnwc.a(connectionCallbacks);
        synchronized (this.i) {
            if (this.b.contains(connectionCallbacks)) {
                String valueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                sb.toString();
            } else {
                this.b.add(connectionCallbacks);
            }
        }
        if (this.a.r()) {
            Handler handler = this.h;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    public final void d(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        cnwc.a(onConnectionFailedListener);
        synchronized (this.i) {
            if (this.d.contains(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                sb.toString();
            } else {
                this.d.add(onConnectionFailedListener);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.i) {
                if (this.e && this.a.r() && this.b.contains(connectionCallbacks)) {
                    connectionCallbacks.Ph(null);
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        sb.toString();
        new Exception();
        return false;
    }
}
