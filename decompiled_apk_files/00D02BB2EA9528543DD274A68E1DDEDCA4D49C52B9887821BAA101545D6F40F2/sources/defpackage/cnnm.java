package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* renamed from: cnnm  reason: default package */
/* loaded from: classes.dex */
public final class cnnm {
    @dzsi
    private static cnnm b;
    public final Context a;
    private volatile String c;

    public cnnm(Context context) {
        this.a = context.getApplicationContext();
    }

    public static cnnm a(Context context) {
        cnwc.a(context);
        synchronized (cnnm.class) {
            if (b == null) {
                cnnb.a(context);
                b = new cnnm(context);
            }
        }
        return b;
    }

    @dzsi
    static final cnmx f(PackageInfo packageInfo, cnmx... cnmxVarArr) {
        if (packageInfo.signatures != null && packageInfo.signatures.length == 1) {
            cnmy cnmyVar = new cnmy(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < cnmxVarArr.length; i++) {
                if (cnmxVarArr[i].equals(cnmyVar)) {
                    return cnmxVarArr[i];
                }
            }
            return null;
        }
        return null;
    }

    public static final boolean g(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? f(packageInfo, cnna.a) : f(packageInfo, cnna.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(String str) {
        return d(str).b;
    }

    public final boolean c(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (g(packageInfo, false)) {
            return true;
        }
        return g(packageInfo, true) && cnnl.e(this.a);
    }

    public final cnnh d(String str) {
        cnnh e;
        if (str == null) {
            return cnnh.b("null pkg");
        }
        if (str.equals(this.c)) {
            return cnnh.a;
        }
        if (cnnb.c()) {
            e = cnnb.e(str, cnnl.e(this.a));
        } else {
            try {
                e = e(this.a.getPackageManager().getPackageInfo(str, 64));
            } catch (PackageManager.NameNotFoundException unused) {
                return cnnh.d(str.length() != 0 ? "no pkg ".concat(str) : new String("no pkg "));
            }
        }
        if (!e.b) {
            return e;
        }
        this.c = str;
        return e;
    }

    public final cnnh e(PackageInfo packageInfo) {
        boolean e = cnnl.e(this.a);
        if (packageInfo == null) {
            return cnnh.b("null pkg");
        }
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return cnnh.b("single cert required");
        }
        cnmy cnmyVar = new cnmy(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        cnnh b2 = cnnb.b(str, cnmyVar, e, false);
        return (!b2.b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !cnnb.b(str, cnmyVar, false, true).b) ? b2 : cnnh.b("debuggable release cert app rejected");
    }
}
