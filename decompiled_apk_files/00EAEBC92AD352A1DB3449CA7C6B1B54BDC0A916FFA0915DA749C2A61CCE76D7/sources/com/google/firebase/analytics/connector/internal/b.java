package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.c6;
import com.google.android.gms.measurement.internal.e6;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f8272a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f8273b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f8274c = Arrays.asList("auto", "app", "am");

    /* renamed from: d  reason: collision with root package name */
    private static final List<String> f8275d = Arrays.asList("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    private static final List<String> f8276e = Arrays.asList((String[]) com.google.android.gms.common.util.b.a(e6.f7272a, e6.f7273b));

    /* renamed from: f  reason: collision with root package name */
    private static final List<String> f8277f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean a(String str) {
        return !f8274c.contains(str);
    }

    public static boolean a(String str, Bundle bundle) {
        if (f8273b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String str2 : f8275d) {
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        } else if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        } else if (f8276e.contains(str2)) {
            return false;
        } else {
            for (String str3 : f8277f) {
                if (str2.matches(str3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean a(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        for (String str4 : f8275d) {
            if (bundle.containsKey(str4)) {
                return false;
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c2 = 2;
                }
            } else if (str.equals("fdl")) {
                c2 = 1;
            }
        } else if (str.equals("fcm")) {
            c2 = 0;
        }
        if (c2 == 0) {
            str3 = "fcm_integration";
        } else if (c2 == 1) {
            str3 = "fdl_integration";
        } else if (c2 != 2) {
            return false;
        } else {
            str3 = "fiam_integration";
        }
        bundle.putString("_cis", str3);
        return true;
    }

    public static void b(String str, String str2, Bundle bundle) {
        if (!"clx".equals(str) || !"_ae".equals(str2)) {
            return;
        }
        bundle.putLong("_r", 1L);
    }

    public static boolean b(String str) {
        return !f8272a.contains(str);
    }

    public static String c(String str) {
        String a2 = c6.a(str);
        return a2 != null ? a2 : str;
    }
}
