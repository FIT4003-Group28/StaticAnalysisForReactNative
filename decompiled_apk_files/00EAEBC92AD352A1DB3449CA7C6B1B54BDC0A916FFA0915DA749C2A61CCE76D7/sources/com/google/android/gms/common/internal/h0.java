package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.j;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h0 extends j implements Handler.Callback {

    /* renamed from: d  reason: collision with root package name */
    private final Context f7017d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f7018e;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<j.a, i0> f7016c = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final com.google.android.gms.common.stats.a f7019f = com.google.android.gms.common.stats.a.a();

    /* renamed from: g  reason: collision with root package name */
    private final long f7020g = 5000;

    /* renamed from: h  reason: collision with root package name */
    private final long f7021h = 300000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Context context) {
        this.f7017d = context.getApplicationContext();
        this.f7018e = new c.e.a.b.d.c.d(context.getMainLooper(), this);
    }

    @Override // com.google.android.gms.common.internal.j
    protected final boolean a(j.a aVar, ServiceConnection serviceConnection, String str) {
        boolean d2;
        s.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f7016c) {
            i0 i0Var = this.f7016c.get(aVar);
            if (i0Var == null) {
                i0Var = new i0(this, aVar);
                i0Var.a(serviceConnection, str);
                i0Var.a(str);
                this.f7016c.put(aVar, i0Var);
            } else {
                this.f7018e.removeMessages(0, aVar);
                if (i0Var.a(serviceConnection)) {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                i0Var.a(serviceConnection, str);
                int c2 = i0Var.c();
                if (c2 == 1) {
                    serviceConnection.onServiceConnected(i0Var.b(), i0Var.a());
                } else if (c2 == 2) {
                    i0Var.a(str);
                }
            }
            d2 = i0Var.d();
        }
        return d2;
    }

    @Override // com.google.android.gms.common.internal.j
    protected final void b(j.a aVar, ServiceConnection serviceConnection, String str) {
        s.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f7016c) {
            i0 i0Var = this.f7016c.get(aVar);
            if (i0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (!i0Var.a(serviceConnection)) {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            } else {
                i0Var.b(serviceConnection, str);
                if (i0Var.e()) {
                    this.f7018e.sendMessageDelayed(this.f7018e.obtainMessage(0, aVar), this.f7020g);
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f7016c) {
                j.a aVar = (j.a) message.obj;
                i0 i0Var = this.f7016c.get(aVar);
                if (i0Var != null && i0Var.e()) {
                    if (i0Var.d()) {
                        i0Var.b("GmsClientSupervisor");
                    }
                    this.f7016c.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f7016c) {
                j.a aVar2 = (j.a) message.obj;
                i0 i0Var2 = this.f7016c.get(aVar2);
                if (i0Var2 != null && i0Var2.c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b2 = i0Var2.b();
                    if (b2 == null) {
                        b2 = aVar2.a();
                    }
                    if (b2 == null) {
                        b2 = new ComponentName(aVar2.b(), "unknown");
                    }
                    i0Var2.onServiceDisconnected(b2);
                }
            }
            return true;
        }
    }
}
