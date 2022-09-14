package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
/* loaded from: classes.dex */
public class j {

    /* renamed from: b  reason: collision with root package name */
    private static j f7069b;

    /* renamed from: a  reason: collision with root package name */
    private final Context f7070a;

    private j(Context context) {
        this.f7070a = context.getApplicationContext();
    }

    private final a0 a(String str, int i) {
        try {
            PackageInfo a2 = com.google.android.gms.common.n.c.a(this.f7070a).a(str, 64, i);
            boolean d2 = i.d(this.f7070a);
            if (a2 == null) {
                return a0.a("null pkg");
            }
            if (a2.signatures.length != 1) {
                return a0.a("single cert required");
            }
            t tVar = new t(a2.signatures[0].toByteArray());
            String str2 = a2.packageName;
            a0 a3 = q.a(str2, tVar, d2, false);
            return (!a3.f6792a || a2.applicationInfo == null || (a2.applicationInfo.flags & 2) == 0 || !q.a(str2, tVar, false, true).f6792a) ? a3 : a0.a("debuggable release cert app rejected");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return a0.a(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    public static j a(Context context) {
        com.google.android.gms.common.internal.s.a(context);
        synchronized (j.class) {
            if (f7069b == null) {
                q.a(context);
                f7069b = new j(context);
            }
        }
        return f7069b;
    }

    private static s a(PackageInfo packageInfo, s... sVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        t tVar = new t(signatureArr[0].toByteArray());
        for (int i = 0; i < sVarArr.length; i++) {
            if (sVarArr[i].equals(tVar)) {
                return sVarArr[i];
            }
        }
        return null;
    }

    public static boolean a(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? a(packageInfo, v.f7121a) : a(packageInfo, v.f7121a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int i) {
        a0 a2;
        String[] a3 = com.google.android.gms.common.n.c.a(this.f7070a).a(i);
        if (a3 == null || a3.length == 0) {
            a2 = a0.a("no pkgs");
        } else {
            a2 = null;
            for (String str : a3) {
                a2 = a(str, i);
                if (a2.f6792a) {
                    break;
                }
            }
        }
        a2.b();
        return a2.f6792a;
    }

    public boolean a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (a(packageInfo, false)) {
            return true;
        }
        if (a(packageInfo, true)) {
            if (i.d(this.f7070a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
}
