package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.p0;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static volatile o0 f7080a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f7081b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Context f7082c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a0 a(String str, s sVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return b(str, sVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ String a(boolean z, String str, s sVar) {
        boolean z2 = true;
        if (z || !b(str, sVar, true, false).f6792a) {
            z2 = false;
        }
        return a0.a(str, sVar, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(Context context) {
        synchronized (q.class) {
            if (f7082c != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f7082c = context.getApplicationContext();
            }
        }
    }

    private static a0 b(final String str, final s sVar, final boolean z, boolean z2) {
        try {
            if (f7080a == null) {
                com.google.android.gms.common.internal.s.a(f7082c);
                synchronized (f7081b) {
                    if (f7080a == null) {
                        f7080a = p0.a(DynamiteModule.a(f7082c, DynamiteModule.j, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            com.google.android.gms.common.internal.s.a(f7082c);
            try {
                return f7080a.a(new y(str, sVar, z, z2), c.e.a.b.c.b.a(f7082c.getPackageManager())) ? a0.c() : a0.a(new Callable(z, str, sVar) { // from class: com.google.android.gms.common.r

                    /* renamed from: a  reason: collision with root package name */
                    private final boolean f7083a;

                    /* renamed from: b  reason: collision with root package name */
                    private final String f7084b;

                    /* renamed from: c  reason: collision with root package name */
                    private final s f7085c;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f7083a = z;
                        this.f7084b = str;
                        this.f7085c = sVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return q.a(this.f7083a, this.f7084b, this.f7085c);
                    }
                });
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return a0.a("module call", e2);
            }
        } catch (DynamiteModule.a e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            String valueOf = String.valueOf(e3.getMessage());
            return a0.a(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e3);
        }
    }
}
