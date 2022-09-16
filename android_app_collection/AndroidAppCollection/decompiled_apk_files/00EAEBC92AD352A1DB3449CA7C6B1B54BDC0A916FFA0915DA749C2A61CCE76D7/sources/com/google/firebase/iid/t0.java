package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f9296a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f9297b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static c.e.a.b.f.a f9298c;

    public static ComponentName a(Context context, Intent intent) {
        synchronized (f9297b) {
            a(context);
            boolean b2 = b(intent);
            a(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!b2) {
                f9298c.a(f9296a);
            }
            return startService;
        }
    }

    private static void a(Context context) {
        if (f9298c == null) {
            c.e.a.b.f.a aVar = new c.e.a.b.f.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f9298c = aVar;
            aVar.a(true);
        }
    }

    public static void a(Intent intent) {
        synchronized (f9297b) {
            if (f9298c != null && b(intent)) {
                a(intent, false);
                f9298c.a();
            }
        }
    }

    private static void a(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    static boolean b(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }
}
