package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final a.e.g<String, String> f7006a = new a.e.g<>();

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return com.google.android.gms.common.n.c.a(context).b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String a(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : c.e.a.b.b.b.common_google_play_services_enable_button : c.e.a.b.b.b.common_google_play_services_update_button : c.e.a.b.b.b.common_google_play_services_install_button);
    }

    private static String a(Context context, String str) {
        synchronized (f7006a) {
            String str2 = f7006a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources c2 = com.google.android.gms.common.h.c(context);
            if (c2 == null) {
                return null;
            }
            int identifier = c2.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = c2.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                f7006a.put(str, string);
                return string;
            }
            String valueOf2 = String.valueOf(str);
            Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
            return null;
        }
    }

    private static String a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a2 = a(context, str);
        if (a2 == null) {
            a2 = resources.getString(com.google.android.gms.common.k.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a2, str2);
    }

    public static String b(Context context) {
        return context.getResources().getString(c.e.a.b.b.b.common_google_play_services_notification_channel_name);
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i != 1) {
            if (i == 2) {
                return com.google.android.gms.common.util.i.c(context) ? resources.getString(c.e.a.b.b.b.common_google_play_services_wear_update_text) : resources.getString(c.e.a.b.b.b.common_google_play_services_update_text, a2);
            } else if (i == 3) {
                return resources.getString(c.e.a.b.b.b.common_google_play_services_enable_text, a2);
            } else {
                if (i == 5) {
                    return a(context, "common_google_play_services_invalid_account_text", a2);
                }
                if (i == 7) {
                    return a(context, "common_google_play_services_network_error_text", a2);
                }
                if (i == 9) {
                    return resources.getString(c.e.a.b.b.b.common_google_play_services_unsupported_text, a2);
                }
                if (i == 20) {
                    return a(context, "common_google_play_services_restricted_profile_text", a2);
                }
                switch (i) {
                    case 16:
                        return a(context, "common_google_play_services_api_unavailable_text", a2);
                    case 17:
                        return a(context, "common_google_play_services_sign_in_failed_text", a2);
                    case 18:
                        return resources.getString(c.e.a.b.b.b.common_google_play_services_updating_text, a2);
                    default:
                        return resources.getString(com.google.android.gms.common.k.common_google_play_services_unknown_issue, a2);
                }
            }
        }
        return resources.getString(c.e.a.b.b.b.common_google_play_services_install_text, a2);
    }

    public static String c(Context context, int i) {
        return (i == 6 || i == 19) ? a(context, "common_google_play_services_resolution_required_text", a(context)) : b(context, i);
    }

    public static String d(Context context, int i) {
        String a2 = i == 6 ? a(context, "common_google_play_services_resolution_required_title") : e(context, i);
        return a2 == null ? context.getResources().getString(c.e.a.b.b.b.common_google_play_services_notification_ticker) : a2;
    }

    public static String e(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(c.e.a.b.b.b.common_google_play_services_install_title);
            case 2:
                return resources.getString(c.e.a.b.b.b.common_google_play_services_update_title);
            case 3:
                return resources.getString(c.e.a.b.b.b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return a(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                str = sb.toString();
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return a(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }
}
