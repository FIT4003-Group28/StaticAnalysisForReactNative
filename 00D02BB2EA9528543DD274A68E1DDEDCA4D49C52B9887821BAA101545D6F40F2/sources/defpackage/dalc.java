package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dalc  reason: default package */
/* loaded from: classes5.dex */
public final class dalc {
    private static final daii a = new daii("SplitInstallInfoProvider");
    private final Context b;
    private final String c;

    public dalc(Context context) {
        this.b = context;
        this.c = context.getPackageName();
    }

    public static boolean d(String str) {
        return str.startsWith("config.");
    }

    public static boolean e(String str) {
        return d(str) || str.contains(".config.");
    }

    private final Set<String> f() {
        HashSet hashSet = new HashSet();
        Bundle g = g();
        if (g != null) {
            String string = g.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                a.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = null;
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.c, 0);
            if (packageInfo != null) {
                strArr = packageInfo.splitNames;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            a.d("App is not found in PackageManager", new Object[0]);
        }
        if (strArr != null) {
            a.a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            a.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        dajg dajgVar = dala.a.get();
        if (dajgVar != null) {
            dajk dajkVar = dajgVar.a;
            AtomicReference<dajk> atomicReference = dajk.a;
            hashSet.addAll(dajkVar.a());
        }
        return hashSet;
    }

    private final Bundle g() {
        try {
            ApplicationInfo applicationInfo = this.b.getPackageManager().getApplicationInfo(this.c, 128);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                a.a("App has no applicationInfo or metaData", new Object[0]);
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            a.d("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    public final Set<String> a() {
        HashSet hashSet = new HashSet();
        for (String str : f()) {
            if (!e(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final Set<String> b() {
        daku c = c();
        if (c == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set<String> f = f();
        f.add("");
        Set<String> a2 = a();
        a2.add("");
        for (Map.Entry<String, Set<String>> entry : c.a(a2).entrySet()) {
            if (f.containsAll(entry.getValue())) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }

    public final daku c() {
        Bundle g = g();
        if (g == null) {
            a.d("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = g.getInt("com.android.vending.splits");
        if (i == 0) {
            a.d("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            daku a2 = damh.a(this.b.getResources().getXml(i), new dakt());
            if (a2 == null) {
                a.d("Can't parse languages metadata.", new Object[0]);
            }
            return a2;
        } catch (Resources.NotFoundException unused) {
            a.d("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }
}
