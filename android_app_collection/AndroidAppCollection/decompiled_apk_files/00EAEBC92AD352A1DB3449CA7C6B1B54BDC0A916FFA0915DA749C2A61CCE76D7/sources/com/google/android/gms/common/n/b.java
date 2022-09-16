package com.google.android.gms.common.n;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.l;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7077a;

    public b(Context context) {
        this.f7077a = context;
    }

    public int a(String str) {
        return this.f7077a.checkCallingOrSelfPermission(str);
    }

    public int a(String str, String str2) {
        return this.f7077a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo a(String str, int i) {
        return this.f7077a.getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo a(String str, int i, int i2) {
        return this.f7077a.getPackageManager().getPackageInfo(str, 64);
    }

    public boolean a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f7077a);
        }
        if (l.i() && (nameForUid = this.f7077a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            return this.f7077a.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    @TargetApi(19)
    public final boolean a(int i, String str) {
        if (l.e()) {
            try {
                ((AppOpsManager) this.f7077a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f7077a.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String[] a(int i) {
        return this.f7077a.getPackageManager().getPackagesForUid(i);
    }

    public PackageInfo b(String str, int i) {
        return this.f7077a.getPackageManager().getPackageInfo(str, i);
    }

    public CharSequence b(String str) {
        return this.f7077a.getPackageManager().getApplicationLabel(this.f7077a.getPackageManager().getApplicationInfo(str, 0));
    }
}
