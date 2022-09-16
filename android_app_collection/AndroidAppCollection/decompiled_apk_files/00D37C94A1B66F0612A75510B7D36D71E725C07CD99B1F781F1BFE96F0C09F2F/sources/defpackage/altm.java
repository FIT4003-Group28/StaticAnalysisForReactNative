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
import java.util.Set;
/* compiled from: PG */
/* renamed from: altm  reason: default package */
/* loaded from: classes.dex */
public final class altm {
    private static final alrz a = new alrz("SplitInstallInfoProvider");
    private final Context b;
    private final String c;

    public altm(Context context) {
        this.b = context;
        this.c = context.getPackageName();
    }

    private final Bundle d() {
        try {
            ApplicationInfo applicationInfo = this.b.getPackageManager().getApplicationInfo(this.c, 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            a.c("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    public final altf a() {
        Bundle d = d();
        if (d == null) {
            a.c("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = d.getInt("com.android.vending.splits");
        if (i == 0) {
            a.c("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            altf k = anqx.k(this.b.getResources().getXml(i), new alte());
            if (k == null) {
                a.c("Can't parse languages metadata.", new Object[0]);
            }
            return k;
        } catch (Resources.NotFoundException unused) {
            a.c("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final Set b() {
        HashSet hashSet = new HashSet();
        for (String str : c()) {
            if (!str.startsWith("config.") && !str.contains(".config.")) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final Set c() {
        String string;
        HashSet hashSet = new HashSet();
        Bundle d = d();
        if (d != null && (string = d.getString("com.android.dynamic.apk.fused.modules")) != null && !string.isEmpty()) {
            Collections.addAll(hashSet, string.split(",", -1));
            hashSet.remove("");
            hashSet.remove("base");
        }
        String[] strArr = null;
        try {
            PackageInfo packageInfo = this.b.getPackageManager().getPackageInfo(this.c, 0);
            if (packageInfo != null) {
                strArr = packageInfo.splitNames;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            a.c("App is not found in PackageManager", new Object[0]);
        }
        if (strArr != null) {
            Arrays.toString(strArr);
            Collections.addAll(hashSet, strArr);
        }
        altj altjVar = (altj) altk.a.get();
        if (altjVar != null) {
            hashSet.addAll(altjVar.a());
        }
        return hashSet;
    }
}
