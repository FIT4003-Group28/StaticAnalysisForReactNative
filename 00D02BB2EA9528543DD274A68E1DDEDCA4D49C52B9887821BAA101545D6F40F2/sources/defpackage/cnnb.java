package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnnb  reason: default package */
/* loaded from: classes.dex */
public final class cnnb {
    static final cnmz a;
    static final cnmz b;
    private static final Object c;
    private static Context d;
    private static volatile cnvr e;

    static {
        new cnmt(cnmx.f("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new cnmu(cnmx.f("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new cnmv(cnmx.f("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new cnmw(cnmx.f("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        c = new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(Context context) {
        synchronized (cnnb.class) {
            if (d != null || context == null) {
                return;
            }
            d = context.getApplicationContext();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cnnh b(String str, cnmx cnmxVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(str, cnmxVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f();
            boolean g = e.g();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return g;
        } catch (RemoteException | cobl unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static cnnh d(final String str, final cnmx cnmxVar, final boolean z, boolean z2) {
        try {
            f();
            cnwc.a(d);
            try {
                return e.e(new GoogleCertificatesQuery(str, cnmxVar, z, z2), cobb.b(d.getPackageManager())) ? cnnh.a : cnnh.a(new Callable(z, str, cnmxVar) { // from class: cnms
                    private final boolean a;
                    private final String b;
                    private final cnmx c;

                    {
                        this.a = z;
                        this.b = str;
                        this.c = cnmxVar;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3 = this.a;
                        String str2 = this.b;
                        cnmx cnmxVar2 = this.c;
                        boolean z4 = true;
                        if (z3 || !cnnb.d(str2, cnmxVar2, true, false).b) {
                            z4 = false;
                        }
                        return cnnh.c(str2, cnmxVar2, z3, z4);
                    }
                });
            } catch (RemoteException unused) {
                return cnnh.d("module call");
            }
        } catch (cobl e2) {
            String valueOf = String.valueOf(e2.getMessage());
            return cnnh.d(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r6v0, types: [coba, android.os.IBinder] */
    public static cnnh e(String str, boolean z) {
        String concat;
        cnnh d2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            cnwc.a(d);
            try {
                f();
                try {
                    GoogleCertificatesLookupResponse f = e.f(new GoogleCertificatesLookupQuery(str, z, false, cobb.b(d), false));
                    if (f.a) {
                        d2 = cnnh.a;
                    } else {
                        String str2 = f.b;
                        if (str2 == null) {
                            str2 = "error checking package certificate";
                        }
                        if (cnnd.a(f.c) == 4) {
                            new PackageManager.NameNotFoundException();
                            d2 = cnnh.d(str2);
                        } else {
                            d2 = cnnh.b(str2);
                        }
                    }
                } catch (RemoteException unused) {
                    concat = "module call";
                    d2 = cnnh.d(concat);
                    return d2;
                }
            } catch (cobl e2) {
                String valueOf = String.valueOf(e2.getMessage());
                concat = valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: ");
            }
            return d2;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static void f() {
        cnvr cnvrVar;
        if (e != null) {
            return;
        }
        cnwc.a(d);
        synchronized (c) {
            if (e == null) {
                IBinder e2 = cobp.a(d, cobp.c, "com.google.android.gms.googlecertificates").e("com.google.android.gms.common.GoogleCertificatesImpl");
                if (e2 == null) {
                    cnvrVar = null;
                } else {
                    IInterface queryLocalInterface = e2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    if (queryLocalInterface instanceof cnvr) {
                        cnvrVar = (cnvr) queryLocalInterface;
                    } else {
                        cnvrVar = new cnvr(e2);
                    }
                }
                e = cnvrVar;
            }
        }
    }
}
