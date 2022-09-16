package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abxb  reason: default package */
/* loaded from: classes.dex */
public final class abxb {
    private static abxb a;

    private abxb() {
    }

    public static String a(Context context, String str, long j, Map map) {
        String str2;
        String str3;
        String packageName = context.getPackageName();
        try {
            str2 = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "unknown";
        }
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("manufacturer", Build.MANUFACTURER).appendQueryParameter("model", Build.MODEL).appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("protocol", str).appendQueryParameter("speedTestBitsPerSecond", Long.toString(j));
        for (Map.Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        SparseBooleanArray sparseBooleanArray = abwv.a;
        context.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        String valueOf = String.valueOf(builder.build().getQuery());
        String concat = valueOf.length() != 0 ? "extras?".concat(valueOf) : new String("extras?");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                str3 = activeNetworkInfo.getTypeName();
            } else if (type == 0) {
                str3 = activeNetworkInfo.getSubtypeName();
            }
            return TextUtils.join(":", Arrays.asList(packageName, str2, str3, concat));
        }
        str3 = "UNKNOWN";
        return TextUtils.join(":", Arrays.asList(packageName, str2, str3, concat));
    }

    public static boolean b(MediaFormat mediaFormat) {
        String string;
        return (mediaFormat == null || (string = mediaFormat.getString("mime")) == null || !string.startsWith("audio/")) ? false : true;
    }

    public static boolean c(int i) {
        switch (i) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return false;
            default:
                switch (i) {
                    case 28:
                    case 29:
                    case 30:
                        return false;
                    default:
                        return true;
                }
        }
    }

    public static boolean d(MediaFormat mediaFormat) {
        String string;
        return (mediaFormat == null || (string = mediaFormat.getString("mime")) == null || !string.startsWith("video/")) ? false : true;
    }

    public static final acbw e(Context context, Uri uri, String str, acbq acbqVar, boolean z, boolean z2, int i, long j) {
        String scheme = uri.getScheme();
        try {
            if ("file".equals(scheme)) {
                return new acbm(uri.getPath(), z2);
            }
            if ("rtmp".equals(scheme)) {
                return new acdj(context, uri, str, acbqVar, z, z2, i, j);
            }
            String valueOf = String.valueOf(scheme);
            Log.e("MediaMuxFactory", valueOf.length() != 0 ? "Unknown capture scheme: ".concat(valueOf) : new String("Unknown capture scheme: "));
            return null;
        } catch (Exception e) {
            Log.e("MediaMuxFactory", "Could not create media mux", e);
            return null;
        }
    }

    public static abxb f() {
        if (a == null) {
            a = new abxb();
        }
        return a;
    }
}
