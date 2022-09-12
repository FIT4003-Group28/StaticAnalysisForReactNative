package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* renamed from: cwjk  reason: default package */
/* loaded from: classes5.dex */
final class cwjk {
    private static volatile Boolean a;

    private cwjk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(Context context, nc<T> ncVar, T t) {
        if (a == null) {
            synchronized (cwjk.class) {
                if (a == null) {
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
                        a = Boolean.valueOf((packageInfo == null || packageInfo.applicationInfo == null || packageInfo.applicationInfo.metaData == null || !packageInfo.applicationInfo.metaData.getBoolean("com.google.android.libraries.onegoogle.flags.disabled", false)) ? false : true);
                    } catch (PackageManager.NameNotFoundException unused) {
                        a = false;
                    }
                }
            }
        }
        return a.booleanValue() ? t : ncVar.a();
    }
}
