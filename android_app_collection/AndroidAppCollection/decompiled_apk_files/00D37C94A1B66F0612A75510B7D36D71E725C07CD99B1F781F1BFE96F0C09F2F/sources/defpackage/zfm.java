package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: zfm  reason: default package */
/* loaded from: classes4.dex */
public final class zfm {
    public static final zfm a = new zfm();
    public volatile Boolean b;
    public volatile zgu c;
    private volatile Boolean d;
    private volatile Boolean e;
    private volatile String f;
    private volatile Integer g;

    private zfm() {
    }

    public static int a(Context context) {
        context.getClass();
        zfm zfmVar = a;
        if (zfmVar.g == null) {
            try {
                zfmVar.g = Integer.valueOf(b(context, 0).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                zep.n("could not retrieve application version code", e);
                a.g = 0;
            }
        }
        return a.g.intValue();
    }

    public static PackageInfo b(Context context, int i) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), i);
    }

    public static String c(Context context) {
        context.getClass();
        zfm zfmVar = a;
        String str = zfmVar.f;
        if (str == null) {
            synchronized (zfmVar) {
                str = zfmVar.f;
                if (str == null) {
                    try {
                        str = g(context, "pref_override_build_version_name");
                        if (TextUtils.isEmpty(str)) {
                            PackageInfo b = b(context, 0);
                            str = b.versionName != null ? b.versionName : "Unset";
                        }
                        String g = g(context, "pref_override_build_type");
                        if (!TextUtils.isEmpty(g)) {
                            if (str.lastIndexOf("-") > 0) {
                                str = str.substring(0, str.lastIndexOf(45) - 1);
                            }
                            if (!"RELEASE".equals(g)) {
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(g).length());
                                sb.append(str);
                                sb.append("-");
                                sb.append(g);
                                str = sb.toString();
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = "Unknown";
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        zep.n("could not retrieve application version name", e);
                        str = "Unknown";
                    }
                    a.f = str;
                }
            }
        }
        return str;
    }

    public static boolean e(Context context) {
        context.getClass();
        zfm zfmVar = a;
        if (zfmVar.d == null) {
            zfmVar.d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"));
        }
        return zfmVar.d.booleanValue();
    }

    public static boolean f(Context context) {
        context.getClass();
        zfm zfmVar = a;
        if (zfmVar.e == null) {
            zfmVar.e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return zfmVar.e.booleanValue();
    }

    private static String g(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences != null) {
            return defaultSharedPreferences.getString(str, "");
        }
        return null;
    }
}
