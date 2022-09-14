package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f9477a;

    public r(Bundle bundle) {
        if (bundle != null) {
            this.f9477a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public static boolean a(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(k("gcm.n.e")));
    }

    private static int h(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    private static boolean i(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    private static boolean j(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    private static String k(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    private String l(String str) {
        if (!this.f9477a.containsKey(str) && str.startsWith("gcm.n.")) {
            String k = k(str);
            if (this.f9477a.containsKey(k)) {
                return k;
            }
        }
        return str;
    }

    private static String m(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public String a(Resources resources, String str, String str2) {
        String e2 = e(str2);
        if (TextUtils.isEmpty(e2)) {
            return null;
        }
        int identifier = resources.getIdentifier(e2, "string", str);
        if (identifier == 0) {
            String valueOf = String.valueOf(str2);
            String m = m("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
            StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 49 + String.valueOf(str2).length());
            sb.append(m);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        Object[] d2 = d(str2);
        if (d2 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, d2);
        } catch (MissingFormatArgumentException e3) {
            String m2 = m(str2);
            String arrays = Arrays.toString(d2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m2).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(m2);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e3);
            return null;
        }
    }

    public boolean a(String str) {
        String g2 = g(str);
        return "1".equals(g2) || Boolean.parseBoolean(g2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] a() {
        String sb;
        JSONArray c2 = c("gcm.n.light_settings");
        if (c2 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c2.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = h(c2.optString(0));
            iArr[1] = c2.optInt(1);
            iArr[2] = c2.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e2) {
            String valueOf = String.valueOf(c2);
            String message = e2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 60 + String.valueOf(message).length());
            sb2.append("LightSettings is invalid: ");
            sb2.append(valueOf);
            sb2.append(". ");
            sb2.append(message);
            sb2.append(". Skipping setting LightSettings");
            sb = sb2.toString();
            Log.w("NotificationParams", sb);
            return null;
        } catch (JSONException unused) {
            String valueOf2 = String.valueOf(c2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 58);
            sb3.append("LightSettings is invalid: ");
            sb3.append(valueOf2);
            sb3.append(". Skipping setting LightSettings");
            sb = sb3.toString();
            Log.w("NotificationParams", sb);
            return null;
        }
    }

    public Uri b() {
        String g2 = g("gcm.n.link_android");
        if (TextUtils.isEmpty(g2)) {
            g2 = g("gcm.n.link");
        }
        if (!TextUtils.isEmpty(g2)) {
            return Uri.parse(g2);
        }
        return null;
    }

    public Integer b(String str) {
        String g2 = g(str);
        if (!TextUtils.isEmpty(g2)) {
            try {
                return Integer.valueOf(Integer.parseInt(g2));
            } catch (NumberFormatException unused) {
                String m = m(str);
                StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 38 + String.valueOf(g2).length());
                sb.append("Couldn't parse value of ");
                sb.append(m);
                sb.append("(");
                sb.append(g2);
                sb.append(") into an int");
                Log.w("NotificationParams", sb.toString());
                return null;
            }
        }
        return null;
    }

    public String b(Resources resources, String str, String str2) {
        String g2 = g(str2);
        return !TextUtils.isEmpty(g2) ? g2 : a(resources, str, str2);
    }

    public String c() {
        return g("gcm.n.android_channel_id");
    }

    public JSONArray c(String str) {
        String g2 = g(str);
        if (!TextUtils.isEmpty(g2)) {
            try {
                return new JSONArray(g2);
            } catch (JSONException unused) {
                String m = m(str);
                StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 50 + String.valueOf(g2).length());
                sb.append("Malformed JSON for key ");
                sb.append(m);
                sb.append(": ");
                sb.append(g2);
                sb.append(", falling back to default");
                Log.w("NotificationParams", sb.toString());
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer d() {
        Integer b2 = b("gcm.n.notification_count");
        if (b2 == null) {
            return null;
        }
        if (b2.intValue() >= 0) {
            return b2;
        }
        String valueOf = String.valueOf(b2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
        sb.append("notificationCount is invalid: ");
        sb.append(valueOf);
        sb.append(". Skipping setting notificationCount.");
        Log.w("FirebaseMessaging", sb.toString());
        return null;
    }

    public Object[] d(String str) {
        String valueOf = String.valueOf(str);
        JSONArray c2 = c("_loc_args".length() != 0 ? valueOf.concat("_loc_args") : new String(valueOf));
        if (c2 == null) {
            return null;
        }
        String[] strArr = new String[c2.length()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = c2.optString(i);
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer e() {
        Integer b2 = b("gcm.n.notification_priority");
        if (b2 == null) {
            return null;
        }
        if (b2.intValue() >= -2 && b2.intValue() <= 2) {
            return b2;
        }
        String valueOf = String.valueOf(b2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
        sb.append("notificationPriority is invalid ");
        sb.append(valueOf);
        sb.append(". Skipping setting notificationPriority.");
        Log.w("FirebaseMessaging", sb.toString());
        return null;
    }

    public String e(String str) {
        String valueOf = String.valueOf(str);
        return g("_loc_key".length() != 0 ? valueOf.concat("_loc_key") : new String(valueOf));
    }

    public Long f(String str) {
        String g2 = g(str);
        if (!TextUtils.isEmpty(g2)) {
            try {
                return Long.valueOf(Long.parseLong(g2));
            } catch (NumberFormatException unused) {
                String m = m(str);
                StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 38 + String.valueOf(g2).length());
                sb.append("Couldn't parse value of ");
                sb.append(m);
                sb.append("(");
                sb.append(g2);
                sb.append(") into a long");
                Log.w("NotificationParams", sb.toString());
                return null;
            }
        }
        return null;
    }

    public String f() {
        String g2 = g("gcm.n.sound2");
        return TextUtils.isEmpty(g2) ? g("gcm.n.sound") : g2;
    }

    public String g(String str) {
        return this.f9477a.getString(l(str));
    }

    public long[] g() {
        JSONArray c2 = c("gcm.n.vibrate_timings");
        if (c2 == null) {
            return null;
        }
        try {
            if (c2.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            long[] jArr = new long[c2.length()];
            for (int i = 0; i < jArr.length; i++) {
                jArr[i] = c2.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(c2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer h() {
        Integer b2 = b("gcm.n.visibility");
        if (b2 == null) {
            return null;
        }
        if (b2.intValue() >= -1 && b2.intValue() <= 1) {
            return b2;
        }
        String valueOf = String.valueOf(b2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("visibility is invalid: ");
        sb.append(valueOf);
        sb.append(". Skipping setting visibility.");
        Log.w("NotificationParams", sb.toString());
        return null;
    }

    public Bundle i() {
        Bundle bundle = new Bundle(this.f9477a);
        for (String str : this.f9477a.keySet()) {
            if (!i(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle j() {
        Bundle bundle = new Bundle(this.f9477a);
        for (String str : this.f9477a.keySet()) {
            if (j(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
