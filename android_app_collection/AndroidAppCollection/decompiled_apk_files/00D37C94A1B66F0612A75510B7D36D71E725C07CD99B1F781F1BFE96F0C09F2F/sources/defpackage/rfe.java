package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.util.Log;
/* compiled from: PG */
/* renamed from: rfe  reason: default package */
/* loaded from: classes4.dex */
public final class rfe {
    private static rfe b;
    public final Context a;

    private rfe(Context context) {
        this.a = context;
    }

    public static synchronized rfe a(Context context) {
        rfe rfeVar;
        synchronized (rfe.class) {
            Context o = qnm.o(context);
            rfe rfeVar2 = b;
            if (rfeVar2 == null || rfeVar2.a != o) {
                rfe rfeVar3 = null;
                try {
                    PackageInfo packageInfo = o.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                    if (!qsf.b(o).c(packageInfo)) {
                        String valueOf = String.valueOf(packageInfo.packageName);
                        Log.e("InstantAppsApi", valueOf.length() != 0 ? "Incorrect signature for package ".concat(valueOf) : new String("Incorrect signature for package "));
                    } else {
                        PackageManager packageManager = o.getPackageManager();
                        String authority = rff.a.getAuthority();
                        qnm.b(authority);
                        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(authority, 0);
                        if (resolveContentProvider != null) {
                            if (!resolveContentProvider.packageName.equals("com.google.android.gms")) {
                                String str = resolveContentProvider.packageName;
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 85);
                                sb.append("Package ");
                                sb.append(str);
                                sb.append(" is invalid for instant apps content provider; instant apps will be disabled.");
                                Log.e("IAMetadataClient", sb.toString());
                            } else {
                                rfeVar3 = new rfe(o);
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                b = rfeVar3;
            }
            rfeVar = b;
        }
        return rfeVar;
    }

    public static synchronized void b() {
        synchronized (rfe.class) {
            b = null;
        }
    }
}
