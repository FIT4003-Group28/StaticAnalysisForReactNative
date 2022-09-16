package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: awwd  reason: default package */
/* loaded from: classes2.dex */
public final class awwd {
    private awwd() {
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static final awyv b(awxz awxzVar) {
        return new awyv(awxzVar);
    }

    public static Uri c(String str, String str2) {
        return new Uri.Builder().scheme("content").authority(str).path(str2).build();
    }

    public static axfg d(Context context) {
        axfh e = e(context);
        if (e != null) {
            return new axdw(e.a, e.b);
        }
        return new axej(context);
    }

    public static axfh e(Context context) {
        List<String> f = f(context);
        if (f != null) {
            for (String str : f) {
                ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(str);
                if (acquireContentProviderClient != null) {
                    return new axfh(acquireContentProviderClient, str);
                }
            }
            return null;
        }
        return null;
    }

    public static List f(Context context) {
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("com.google.vr.vrcore.settings");
            return arrayList;
        }
        List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("android.content.action.VR_SETTINGS_PROVIDER"), 0);
        if (queryIntentContentProviders == null || queryIntentContentProviders.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentContentProviders) {
            ProviderInfo providerInfo = resolveInfo.providerInfo;
            if (g(providerInfo.packageName)) {
                arrayList2.add(providerInfo.authority);
            }
        }
        return arrayList2;
    }

    public static boolean g(String str) {
        return str != null && str.startsWith("com.google.");
    }

    public static boolean h() {
        return "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
    }
}
