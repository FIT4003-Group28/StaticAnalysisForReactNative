package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
/* renamed from: daqr  reason: default package */
/* loaded from: classes5.dex */
public final class daqr {
    static {
        Uri.parse("https://play.google.com/store/apps/details");
    }

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e);
        }
    }

    public static String b() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("1.10.0");
        return sb.toString();
    }
}
