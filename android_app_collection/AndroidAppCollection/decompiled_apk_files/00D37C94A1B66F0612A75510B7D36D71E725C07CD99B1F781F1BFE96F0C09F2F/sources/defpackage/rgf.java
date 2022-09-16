package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: rgf  reason: default package */
/* loaded from: classes4.dex */
public class rgf {
    public static String f(String str, String[] strArr, String[] strArr2) {
        qnm.b(strArr);
        qnm.b(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static Object g(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (!cls.isAssignableFrom(obj2.getClass())) {
            throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
        }
        return obj2;
    }

    public static void h(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static String n(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static String o(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return resources.getString(identifier);
    }

    public static String p(Context context, String str) {
        qnm.b(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = n(context);
        }
        return o("google_app_id", resources, str);
    }

    public void a(LocationAvailability locationAvailability) {
    }

    public void b(LocationResult locationResult) {
        throw null;
    }
}
