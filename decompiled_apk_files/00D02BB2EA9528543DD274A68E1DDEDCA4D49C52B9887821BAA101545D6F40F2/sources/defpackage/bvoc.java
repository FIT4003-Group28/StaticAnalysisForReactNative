package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* renamed from: bvoc  reason: default package */
/* loaded from: classes.dex */
public final class bvoc {
    public static String a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionName == null ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @Deprecated
    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
            return 0;
        }
    }

    public static long c(Context context) {
        try {
            return je.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 0));
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
            return 0L;
        }
    }
}
