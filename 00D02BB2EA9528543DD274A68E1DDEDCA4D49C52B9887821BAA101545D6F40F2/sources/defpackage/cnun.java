package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cnun  reason: default package */
/* loaded from: classes.dex */
public final class cnun {
    private static final aim<String, String> a = new aim<>();
    private static Locale b;

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                return i(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                sb.toString();
                return null;
            case 17:
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i) {
        String a2;
        if (i == 6) {
            a2 = i(context, "common_google_play_services_resolution_required_title");
        } else {
            a2 = a(context, i);
        }
        return a2 == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : a2;
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String f = f(context);
        if (i != 1) {
            if (i == 2) {
                if (cnxo.b(context)) {
                    return resources.getString(R.string.common_google_play_services_wear_update_text);
                }
                return resources.getString(R.string.common_google_play_services_update_text, f);
            } else if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, f);
            } else {
                if (i == 5) {
                    return h(context, "common_google_play_services_invalid_account_text", f);
                }
                if (i == 7) {
                    return h(context, "common_google_play_services_network_error_text", f);
                }
                if (i == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, f);
                }
                if (i == 20) {
                    return h(context, "common_google_play_services_restricted_profile_text", f);
                }
                switch (i) {
                    case 16:
                        return h(context, "common_google_play_services_api_unavailable_text", f);
                    case 17:
                        return h(context, "common_google_play_services_sign_in_failed_text", f);
                    case 18:
                        return resources.getString(R.string.common_google_play_services_updating_text, f);
                    default:
                        return resources.getString(R.string.common_google_play_services_unknown_issue, f);
                }
            }
        }
        return resources.getString(R.string.common_google_play_services_install_text, f);
    }

    public static String e(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i == 2) {
                return resources.getString(R.string.common_google_play_services_update_button);
            }
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_button);
            }
            return resources.getString(17039370);
        }
        return resources.getString(R.string.common_google_play_services_install_button);
    }

    public static String f(Context context) {
        String packageName = context.getPackageName();
        try {
            cnya b2 = cnyb.b(context);
            return b2.a.getPackageManager().getApplicationLabel(b2.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String g(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = i(context, str);
        if (i == null) {
            i = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i, str2);
    }

    private static String i(Context context, String str) {
        Resources resources;
        aim<String, String> aimVar = a;
        synchronized (aimVar) {
            Locale d = akr.a(context.getResources().getConfiguration()).d();
            if (!d.equals(b)) {
                aimVar.clear();
                b = d;
            }
            String str2 = aimVar.get(str);
            if (str2 != null) {
                return str2;
            }
            int i = cnnk.a;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() == 0) {
                    new String("Missing resource: ");
                }
                return null;
            }
            String string = resources.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                a.put(str, string);
                return string;
            }
            if (str.length() == 0) {
                new String("Got empty resource: ");
            }
            return null;
        }
    }

    public static String d(Context context, int i) {
        if (i == 6 || i == 19) {
            return h(context, "common_google_play_services_resolution_required_text", f(context));
        }
        return c(context, i);
    }
}
