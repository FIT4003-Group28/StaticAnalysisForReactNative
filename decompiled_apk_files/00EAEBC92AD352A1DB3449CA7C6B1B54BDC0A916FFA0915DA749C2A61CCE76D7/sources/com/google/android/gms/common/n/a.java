package com.google.android.gms.common.n;

import android.content.Context;
import com.google.android.gms.common.util.l;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f7075a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f7076b;

    public static synchronized boolean a(Context context) {
        boolean z;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f7075a != null && f7076b != null && f7075a == applicationContext) {
                return f7076b.booleanValue();
            }
            f7076b = null;
            if (!l.i()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f7076b = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                f7075a = applicationContext;
                return f7076b.booleanValue();
            }
            z = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            f7076b = z;
            f7075a = applicationContext;
            return f7076b.booleanValue();
        }
    }
}
