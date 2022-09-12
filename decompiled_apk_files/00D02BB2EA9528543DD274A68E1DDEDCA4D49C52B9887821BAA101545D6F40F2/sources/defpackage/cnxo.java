package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
/* compiled from: PG */
/* renamed from: cnxo  reason: default package */
/* loaded from: classes.dex */
public final class cnxo {
    public static Boolean a;
    public static Boolean b;
    private static Boolean c;
    private static Boolean d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (c == null) {
            c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return c.booleanValue();
    }

    public static boolean b(Context context) {
        if (a(context)) {
            if (Build.VERSION.SDK_INT < 24) {
                return true;
            }
            if (d == null) {
                d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (d.booleanValue() && !cnxs.a()) {
                return true;
            }
        }
        return false;
    }
}
