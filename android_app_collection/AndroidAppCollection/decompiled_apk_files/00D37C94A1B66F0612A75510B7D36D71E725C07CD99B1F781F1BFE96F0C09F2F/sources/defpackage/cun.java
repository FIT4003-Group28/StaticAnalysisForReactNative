package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: cun  reason: default package */
/* loaded from: classes3.dex */
public final class cun {
    private static final ConcurrentMap a = new ConcurrentHashMap();

    public static chy a(Context context) {
        PackageInfo packageInfo;
        String uuid;
        String packageName = context.getPackageName();
        chy chyVar = (chy) a.get(packageName);
        if (chyVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(context.getPackageName());
                Log.e("AppVersionSignature", valueOf.length() != 0 ? "Cannot resolve info for".concat(valueOf) : new String("Cannot resolve info for"), e);
                packageInfo = null;
            }
            if (packageInfo != null) {
                uuid = String.valueOf(packageInfo.versionCode);
            } else {
                uuid = UUID.randomUUID().toString();
            }
            cup cupVar = new cup(uuid);
            chy chyVar2 = (chy) a.putIfAbsent(packageName, cupVar);
            return chyVar2 == null ? cupVar : chyVar2;
        }
        return chyVar;
    }
}
