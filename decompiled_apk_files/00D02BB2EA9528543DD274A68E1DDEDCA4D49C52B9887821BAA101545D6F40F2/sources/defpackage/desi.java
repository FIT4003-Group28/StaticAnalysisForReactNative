package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: desi  reason: default package */
/* loaded from: classes6.dex */
public final class desi {
    private static final long a = TimeUnit.MINUTES.toMillis(1);
    private static final Object b = new Object();
    private static cozq c;

    static boolean a(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void acquireWakeLock(Intent intent, long j) {
        synchronized (b) {
            if (c != null) {
                c(intent, true);
                c.a(j);
            }
        }
    }

    private static void b(Context context) {
        if (c == null) {
            cozq cozqVar = new cozq(context);
            c = cozqVar;
            synchronized (cozqVar.a) {
                cozqVar.c = true;
            }
        }
    }

    private static void c(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static void completeWakefulIntent(Intent intent) {
        cozo cozoVar;
        synchronized (b) {
            if (c != null && a(intent)) {
                c(intent, false);
                cozq cozqVar = c;
                cozqVar.f.decrementAndGet();
                synchronized (cozqVar.a) {
                    cozqVar.e();
                    if (cozqVar.e.containsKey(null) && (cozoVar = cozqVar.e.get(null)) != null) {
                        int i = cozoVar.a - 1;
                        cozoVar.a = i;
                        if (i == 0) {
                            cozqVar.e.remove(null);
                        }
                    }
                    cozqVar.d();
                }
            }
        }
    }

    public static void initWakeLock(Context context) {
        synchronized (b) {
            b(context);
        }
    }

    public static void reset() {
        synchronized (b) {
            c = null;
        }
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        synchronized (b) {
            b(context);
            boolean a2 = a(intent);
            c(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!a2) {
                c.a(a);
            }
            return startService;
        }
    }
}
