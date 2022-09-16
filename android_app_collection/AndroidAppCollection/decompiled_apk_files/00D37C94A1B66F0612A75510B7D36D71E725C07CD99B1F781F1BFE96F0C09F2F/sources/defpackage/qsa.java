package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qsa  reason: default package */
/* loaded from: classes4.dex */
public final class qsa {
    static final qry a;
    static final qry b;
    private static final Object c;
    private static Context d;
    private static volatile qxr e;

    static {
        new qrt(qxn.b("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new qru(qxn.b("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new qrv(qxn.b("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new qrw(qxn.b("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        c = new Object();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(Context context) {
        synchronized (qsa.class) {
            if (d != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context == null) {
            } else {
                d = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                f();
                qxr qxrVar = e;
                Parcel pw = qxrVar.pw(7, qxrVar.pv());
                boolean j = dve.j(pw);
                pw.recycle();
                return j;
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | rao e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qsb c(String str, qxn qxnVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(str, qxnVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static qsb d(final String str, final qxn qxnVar, final boolean z, boolean z2) {
        try {
            f();
            qnm.b(d);
            GoogleCertificatesQuery googleCertificatesQuery = new GoogleCertificatesQuery(str, qxnVar, z, z2);
            try {
                qxr qxrVar = e;
                rad a2 = rac.a(d.getPackageManager());
                Parcel pv = qxrVar.pv();
                dve.g(pv, googleCertificatesQuery);
                dve.i(pv, a2);
                Parcel pw = qxrVar.pw(5, pv);
                boolean j = dve.j(pw);
                pw.recycle();
                if (j) {
                    return qsb.a;
                }
                new Callable() { // from class: qrs
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3 = z;
                        String str2 = str;
                        qxn qxnVar2 = qxnVar;
                        boolean z4 = true;
                        if (z3 || !qsa.d(str2, qxnVar2, true, false).b) {
                            z4 = false;
                        }
                        return qsb.a(str2, qxnVar2, z3, z4);
                    }
                };
                return new qsb(false);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return qsb.c();
            }
        } catch (rao e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            String valueOf = String.valueOf(e3.getMessage());
            if (valueOf.length() != 0) {
                "module init: ".concat(valueOf);
            }
            return qsb.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r8v0, types: [rad, android.os.IBinder] */
    public static qsb e(String str, boolean z) {
        qsb c2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            qnm.b(d);
            try {
                f();
                GoogleCertificatesLookupQuery googleCertificatesLookupQuery = new GoogleCertificatesLookupQuery(str, z, false, rac.a(d), false);
                try {
                    qxr qxrVar = e;
                    Parcel pv = qxrVar.pv();
                    dve.g(pv, googleCertificatesLookupQuery);
                    Parcel pw = qxrVar.pw(6, pv);
                    GoogleCertificatesLookupResponse googleCertificatesLookupResponse = (GoogleCertificatesLookupResponse) dve.a(pw, GoogleCertificatesLookupResponse.CREATOR);
                    pw.recycle();
                    if (googleCertificatesLookupResponse.a) {
                        c2 = qsb.a;
                    } else {
                        String str2 = googleCertificatesLookupResponse.b;
                        if (twx.j(googleCertificatesLookupResponse.c) == 4) {
                            new PackageManager.NameNotFoundException();
                            c2 = qsb.c();
                        } else {
                            c2 = qsb.b();
                        }
                    }
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    c2 = qsb.c();
                }
            } catch (rao e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                String valueOf = String.valueOf(e3.getMessage());
                if (valueOf.length() != 0) {
                    "module init: ".concat(valueOf);
                }
                c2 = qsb.c();
            }
            return c2;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static void f() {
        qxr qxrVar;
        if (e != null) {
            return;
        }
        qnm.b(d);
        synchronized (c) {
            if (e == null) {
                IBinder d2 = ras.e(d, ras.b, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl");
                if (d2 == null) {
                    qxrVar = null;
                } else {
                    IInterface queryLocalInterface = d2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    if (queryLocalInterface instanceof qxr) {
                        qxrVar = (qxr) queryLocalInterface;
                    } else {
                        qxrVar = new qxr(d2);
                    }
                }
                e = qxrVar;
            }
        }
    }
}
