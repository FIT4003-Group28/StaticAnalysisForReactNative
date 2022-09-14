package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: ciw  reason: default package */
/* loaded from: classes4.dex */
public final class ciw {
    private static final ConcurrentMap<String, btw> a = new ConcurrentHashMap();

    public static btw a(Context context) {
        String uuid;
        String packageName = context.getPackageName();
        btw btwVar = a.get(packageName);
        if (btwVar == null) {
            PackageInfo packageInfo = null;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                if (String.valueOf(context.getPackageName()).length() == 0) {
                    new String("Cannot resolve info for");
                }
            }
            if (packageInfo != null) {
                uuid = String.valueOf(packageInfo.versionCode);
            } else {
                uuid = UUID.randomUUID().toString();
            }
            ciy ciyVar = new ciy(uuid);
            btw putIfAbsent = a.putIfAbsent(packageName, ciyVar);
            return putIfAbsent == null ? ciyVar : putIfAbsent;
        }
        return btwVar;
    }
}
