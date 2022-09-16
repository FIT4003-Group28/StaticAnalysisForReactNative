package c.b.a.a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import com.android.billingclient.api.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f2714a = Runtime.getRuntime().availableProcessors();

    public static Bundle a(com.android.billingclient.api.a aVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        String a2 = aVar.a();
        if (!TextUtils.isEmpty(a2)) {
            bundle.putString("developerPayload", a2);
        }
        return bundle;
    }

    public static Bundle a(g gVar, boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (gVar.d() != 0) {
            bundle.putInt("prorationMode", gVar.d());
        }
        if (!TextUtils.isEmpty(gVar.a())) {
            bundle.putString("accountId", gVar.a());
        }
        if (gVar.h()) {
            bundle.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty(gVar.c())) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(gVar.c())));
        }
        if (!TextUtils.isEmpty(gVar.b())) {
            bundle.putString("developerId", gVar.b());
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static Bundle a(j jVar, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        String a2 = jVar.a();
        if (z && !TextUtils.isEmpty(a2)) {
            bundle.putString("developerPayload", a2);
        }
        return bundle;
    }

    public static Bundle a(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    private static Purchase a(String str, String str2) {
        if (str == null || str2 == null) {
            c("BillingHelper", "Received a bad purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e2) {
            c("BillingHelper", "Got JSONException while parsing purchase data: " + e2);
            return null;
        }
    }

    public static h a(Intent intent, String str) {
        if (intent != null) {
            h.b c2 = h.c();
            c2.a(b(intent.getExtras(), str));
            c2.a(a(intent.getExtras(), str));
            return c2.a();
        }
        c("BillingHelper", "Got null intent!");
        h.b c3 = h.c();
        c3.a(6);
        c3.a("An internal error occurred.");
        return c3.a();
    }

    public static String a(Bundle bundle, String str) {
        if (bundle == null) {
            c(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            b(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            c(str, "Unexpected type for debug message: " + obj.getClass().getName());
            return "";
        }
    }

    public static List<Purchase> a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            c("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            Purchase a2 = a(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (a2 == null) {
                c("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(a2);
        } else {
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase a3 = a(stringArrayList.get(i), stringArrayList2.get(i));
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
        }
        return arrayList;
    }

    public static int b(Intent intent, String str) {
        return a(intent, str).b();
    }

    public static int b(Bundle bundle, String str) {
        String str2;
        if (bundle == null) {
            str2 = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                b(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            } else if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            } else {
                str2 = "Unexpected type for bundle response code: " + obj.getClass().getName();
            }
        }
        c(str, str2);
        return 6;
    }

    public static Bundle b(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static void b(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }
}
