package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: coyv  reason: default package */
/* loaded from: classes.dex */
public final class coyv {
    private static final Object a;
    private static Method b;
    private static Method c;

    static {
        int i = cnmr.c;
        a = new Object();
        b = null;
        c = null;
    }

    public static void a(Context context) {
        Context context2;
        cnwc.n(context, "Context must not be null");
        cnnl.d(context, 11925000);
        synchronized (a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = cobp.a(context, cobp.c, "com.google.android.gms.providerinstaller.dynamite").e;
            } catch (cobl e) {
                if (String.valueOf(e.getMessage()).length() == 0) {
                    new String("Failed to load providerinstaller module: ");
                }
                context2 = null;
            }
            if (context2 == null) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                Context h = cnnl.h(context);
                if (h != null) {
                    try {
                        if (c == null) {
                            c = b(h, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, Long.TYPE, Long.TYPE});
                        }
                        c.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                    } catch (Exception e2) {
                        if (String.valueOf(e2.getMessage()).length() == 0) {
                            new String("Failed to report request stats: ");
                        }
                    }
                }
                if (h == null) {
                    throw new cnni();
                }
                c(h, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            }
            c(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
        }
    }

    private static Method b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void c(Context context, String str) {
        try {
            if (b == null) {
                b = b(context, str, "insertProvider", new Class[]{Context.class});
            }
            b.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (String.valueOf(cause == null ? e.getMessage() : cause.getMessage()).length() == 0) {
                    new String("Failed to install provider: ");
                }
            }
            throw new cnni();
        }
    }
}
