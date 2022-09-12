package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
/* compiled from: PG */
/* renamed from: cnya  reason: default package */
/* loaded from: classes.dex */
public final class cnya {
    public final Context a;

    public cnya(Context context) {
        this.a = context;
    }

    public final ApplicationInfo a(String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public final PackageInfo b(String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public final int c(String str, String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }
}
