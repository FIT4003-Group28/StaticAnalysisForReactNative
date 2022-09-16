package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: PG */
/* renamed from: deva  reason: default package */
/* loaded from: classes6.dex */
public final class deva {
    public final Bundle a;

    public deva(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public static String e(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    private static String i(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    public static boolean isNotification(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(i("gcm.n.e")));
    }

    public final String a(String str) {
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String i = i(str);
            if (this.a.containsKey(i)) {
                str = i;
            }
        }
        return bundle.getString(str);
    }

    public final boolean b(String str) {
        String a = a(str);
        return "1".equals(a) || Boolean.parseBoolean(a);
    }

    public final Integer c(String str) {
        String a = a(str);
        if (!TextUtils.isEmpty(a)) {
            try {
                return Integer.valueOf(Integer.parseInt(a));
            } catch (NumberFormatException unused) {
                String e = e(str);
                StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 38 + String.valueOf(a).length());
                sb.append("Couldn't parse value of ");
                sb.append(e);
                sb.append("(");
                sb.append(a);
                sb.append(") into an int");
                sb.toString();
                return null;
            }
        }
        return null;
    }

    public final JSONArray d(String str) {
        String a = a(str);
        if (!TextUtils.isEmpty(a)) {
            try {
                return new JSONArray(a);
            } catch (JSONException unused) {
                String e = e(str);
                StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 50 + String.valueOf(a).length());
                sb.append("Malformed JSON for key ");
                sb.append(e);
                sb.append(": ");
                sb.append(a);
                sb.append(", falling back to default");
                sb.toString();
                return null;
            }
        }
        return null;
    }

    public final Bundle f() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final String g(Resources resources, String str, String str2) {
        String[] strArr;
        String a = a(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        int identifier = resources.getIdentifier(a, "string", str);
        if (identifier != 0) {
            JSONArray d = d(str2.concat("_loc_args"));
            if (d == null) {
                strArr = null;
            } else {
                int length = d.length();
                strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = d.optString(i);
                }
            }
            if (strArr == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, strArr);
            } catch (MissingFormatArgumentException unused) {
                String e = e(str2);
                String arrays = Arrays.toString(strArr);
                StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 58 + String.valueOf(arrays).length());
                sb.append("Missing format argument for ");
                sb.append(e);
                sb.append(": ");
                sb.append(arrays);
                sb.append(" Default value will be used.");
                sb.toString();
                return null;
            }
        }
        String e2 = e(str2.concat("_loc_key"));
        StringBuilder sb2 = new StringBuilder(String.valueOf(e2).length() + 49 + str2.length());
        sb2.append(e2);
        sb2.append(" resource not found: ");
        sb2.append(str2);
        sb2.append(" Default value will be used.");
        sb2.toString();
        return null;
    }

    public final String h(Resources resources, String str, String str2) {
        String a = a(str2);
        return !TextUtils.isEmpty(a) ? a : g(resources, str, str2);
    }
}
