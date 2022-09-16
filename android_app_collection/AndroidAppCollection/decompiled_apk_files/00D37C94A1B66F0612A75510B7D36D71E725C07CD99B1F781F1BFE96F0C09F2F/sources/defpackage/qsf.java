package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
/* compiled from: PG */
/* renamed from: qsf  reason: default package */
/* loaded from: classes4.dex */
public final class qsf {
    private static qsf a;
    private final Context b;
    private volatile String c;

    public qsf(Context context) {
        this.b = context.getApplicationContext();
    }

    public static qsf b(Context context) {
        qnm.b(context);
        synchronized (qsf.class) {
            if (a == null) {
                qsa.a(context);
                a = new qsf(context);
            }
        }
        return a;
    }

    static final qxn f(PackageInfo packageInfo, qxn... qxnVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        qrx qrxVar = new qrx(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < qxnVarArr.length; i++) {
            if (qxnVarArr[i].equals(qrxVar)) {
                return qxnVarArr[i];
            }
        }
        return null;
    }

    public static final boolean g(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? f(packageInfo, qrz.a) : f(packageInfo, qrz.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public final qsb a(String str) {
        qsb e;
        if (str == null) {
            return qsb.b();
        }
        if (str.equals(this.c)) {
            return qsb.a;
        }
        if (qsa.b()) {
            e = qsa.e(str, qse.e(this.b));
        } else {
            try {
                e = e(this.b.getPackageManager().getPackageInfo(str, 64));
            } catch (PackageManager.NameNotFoundException unused) {
                if (str.length() != 0) {
                    "no pkg ".concat(str);
                }
                return qsb.c();
            }
        }
        if (!e.b) {
            return e;
        }
        this.c = str;
        return e;
    }

    public final boolean c(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (g(packageInfo, false)) {
            return true;
        }
        if (g(packageInfo, true)) {
            if (qse.e(this.b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public final boolean d(int i) {
        qsb b;
        int length;
        String[] packagesForUid = this.b.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            b = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    b = a(packagesForUid[i2]);
                    if (b.b) {
                        break;
                    }
                    i2++;
                } else {
                    qnm.b(b);
                    break;
                }
            }
        } else {
            b = qsb.b();
        }
        return b.b;
    }

    public final qsb e(PackageInfo packageInfo) {
        boolean e = qse.e(this.b);
        if (packageInfo == null) {
            return qsb.b();
        }
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return qsb.b();
        }
        qrx qrxVar = new qrx(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        qsb c = qsa.c(str, qrxVar, e, false);
        return (!c.b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !qsa.c(str, qrxVar, false, true).b) ? c : qsb.b();
    }
}
