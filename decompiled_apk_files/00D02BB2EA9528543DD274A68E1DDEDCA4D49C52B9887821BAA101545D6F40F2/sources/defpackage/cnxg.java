package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: cnxg  reason: default package */
/* loaded from: classes.dex */
public final class cnxg {
    private static final Object b = new Object();
    @dzsi
    private static volatile cnxg c;
    public final ConcurrentHashMap<ServiceConnection, ServiceConnection> a = new ConcurrentHashMap<>();

    private cnxg() {
    }

    public static cnxg a() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new cnxg();
                }
            }
        }
        cnxg cnxgVar = c;
        cnwc.a(cnxgVar);
        return cnxgVar;
    }

    private static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof cnve);
    }

    private static void g(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public final boolean b(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        context.getClass();
        return e(context, intent, serviceConnection, i);
    }

    public final void c(Context context, ServiceConnection serviceConnection) {
        if (!f(serviceConnection) || !this.a.containsKey(serviceConnection)) {
            g(context, serviceConnection);
            return;
        }
        try {
            g(context, this.a.get(serviceConnection));
        } finally {
            this.a.remove(serviceConnection);
        }
    }

    public final void d(Context context, ServiceConnection serviceConnection) {
        try {
            c(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean e(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((cnyb.b(context).a(component.getPackageName(), 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (f(serviceConnection)) {
            ServiceConnection putIfAbsent = this.a.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                intent.getAction();
            }
            try {
                boolean bindService = context.bindService(intent, serviceConnection, i);
                if (bindService) {
                    return bindService;
                }
                return false;
            } finally {
                this.a.remove(serviceConnection, serviceConnection);
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
