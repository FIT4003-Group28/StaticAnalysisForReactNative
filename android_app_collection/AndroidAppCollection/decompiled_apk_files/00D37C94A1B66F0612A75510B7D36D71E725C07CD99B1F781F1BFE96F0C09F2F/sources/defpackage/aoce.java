package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: PG */
/* renamed from: aoce  reason: default package */
/* loaded from: classes.dex */
public final class aoce {
    public final Bundle a;

    public aoce() {
        this.a = new Bundle();
    }

    public static String f(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean i(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(n("gcm.n.e")));
    }

    private static String n(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    public final Bundle a() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final Integer b(String str) {
        String e = e(str);
        if (!TextUtils.isEmpty(e)) {
            try {
                return Integer.valueOf(Integer.parseInt(e));
            } catch (NumberFormatException unused) {
                String f = f(str);
                StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 38 + String.valueOf(e).length());
                sb.append("Couldn't parse value of ");
                sb.append(f);
                sb.append("(");
                sb.append(e);
                sb.append(") into an int");
                Log.w("NotificationParams", sb.toString());
                return null;
            }
        }
        return null;
    }

    public final String c(Resources resources, String str, String str2) {
        String[] strArr;
        String e = e(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        int identifier = resources.getIdentifier(e, "string", str);
        if (identifier != 0) {
            JSONArray g = g(str2.concat("_loc_args"));
            if (g == null) {
                strArr = null;
            } else {
                int length = g.length();
                strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = g.optString(i);
                }
            }
            if (strArr == null) {
                return resources.getString(identifier);
            }
            try {
                return resources.getString(identifier, strArr);
            } catch (MissingFormatArgumentException e2) {
                String f = f(str2);
                String arrays = Arrays.toString(strArr);
                StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 58 + String.valueOf(arrays).length());
                sb.append("Missing format argument for ");
                sb.append(f);
                sb.append(": ");
                sb.append(arrays);
                sb.append(" Default value will be used.");
                Log.w("NotificationParams", sb.toString(), e2);
                return null;
            }
        }
        String f2 = f(str2.concat("_loc_key"));
        StringBuilder sb2 = new StringBuilder(String.valueOf(f2).length() + 49 + str2.length());
        sb2.append(f2);
        sb2.append(" resource not found: ");
        sb2.append(str2);
        sb2.append(" Default value will be used.");
        Log.w("NotificationParams", sb2.toString());
        return null;
    }

    public final String d(Resources resources, String str, String str2) {
        String e = e(str2);
        return !TextUtils.isEmpty(e) ? e : c(resources, str, str2);
    }

    public final String e(String str) {
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String n = n(str);
            if (this.a.containsKey(n)) {
                str = n;
            }
        }
        return bundle.getString(str);
    }

    public final JSONArray g(String str) {
        String e = e(str);
        if (!TextUtils.isEmpty(e)) {
            try {
                return new JSONArray(e);
            } catch (JSONException unused) {
                String f = f(str);
                StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 50 + String.valueOf(e).length());
                sb.append("Malformed JSON for key ");
                sb.append(f);
                sb.append(": ");
                sb.append(e);
                sb.append(", falling back to default");
                Log.w("NotificationParams", sb.toString());
                return null;
            }
        }
        return null;
    }

    public final boolean h(String str) {
        String e = e(str);
        return "1".equals(e) || Boolean.parseBoolean(e);
    }

    public final MediaMetadataCompat j() {
        return new MediaMetadataCompat(this.a);
    }

    public final void k(String str, Bitmap bitmap) {
        if (!MediaMetadataCompat.a.containsKey(str) || ((Integer) MediaMetadataCompat.a.get(str)).intValue() == 2) {
            this.a.putParcelable(str, bitmap);
            return;
        }
        throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
    }

    public final void l(String str, long j) {
        if (!MediaMetadataCompat.a.containsKey(str) || ((Integer) MediaMetadataCompat.a.get(str)).intValue() == 0) {
            this.a.putLong(str, j);
            return;
        }
        throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
    }

    public final void m(String str, String str2) {
        if (!MediaMetadataCompat.a.containsKey(str) || ((Integer) MediaMetadataCompat.a.get(str)).intValue() == 1) {
            this.a.putCharSequence(str, str2);
            return;
        }
        throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
    }

    public aoce(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.b);
        this.a = bundle;
        iz.c(bundle);
    }

    public aoce(f fVar, boolean z, String str) {
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putString("package_name", fVar.a);
        bundle.putString("version_name", fVar.b);
        bundle.putString("developer_key", fVar.c);
        bundle.putString("client_library_version_name", str);
        bundle.putBoolean("is_internal_application_with_sign_in", z);
    }

    public aoce(Bundle bundle) {
        this.a = new Bundle(bundle);
    }
}
