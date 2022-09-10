package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cnvb  reason: default package */
/* loaded from: classes.dex */
final class cnvb implements ServiceConnection, cnve {
    public final Map<ServiceConnection, ServiceConnection> a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final cnuz e;
    public ComponentName f;
    final /* synthetic */ cnvd g;

    public cnvb(cnvd cnvdVar, cnuz cnuzVar) {
        this.g = cnvdVar;
        this.e = cnuzVar;
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final void c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    public final void d() {
        Intent component;
        Bundle bundle;
        this.b = 3;
        cnvd cnvdVar = this.g;
        cnxg cnxgVar = cnvdVar.d;
        Context context = cnvdVar.b;
        cnuz cnuzVar = this.e;
        if (cnuzVar.a != null) {
            component = null;
            if (cnuzVar.e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", cnuzVar.a);
                try {
                    bundle = context.getContentResolver().call(cnuz.f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("Dynamic intent resolution failed: ");
                    sb.append(valueOf);
                    sb.toString();
                    bundle = null;
                }
                Intent intent = bundle == null ? null : (Intent) bundle.getParcelable("serviceResponseIntentKey");
                if (intent == null && String.valueOf(cnuzVar.a).length() == 0) {
                    new String("Dynamic lookup for intent failed for action: ");
                } else {
                    component = intent;
                }
            }
            if (component == null) {
                component = new Intent(cnuzVar.a).setPackage(cnuzVar.b);
            }
        } else {
            component = new Intent().setComponent(cnuzVar.c);
        }
        boolean e2 = cnxgVar.e(context, component, this, this.e.d);
        this.c = e2;
        if (e2) {
            Message obtainMessage = this.g.c.obtainMessage(1, this.e);
            cnvd cnvdVar2 = this.g;
            cnvdVar2.c.sendMessageDelayed(obtainMessage, cnvdVar2.e);
            return;
        }
        this.b = 2;
        try {
            cnvd cnvdVar3 = this.g;
            cnvdVar3.d.c(cnvdVar3.b, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection serviceConnection : this.a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
