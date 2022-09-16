package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
/* compiled from: PG */
/* renamed from: ceh  reason: default package */
/* loaded from: classes2.dex */
public final class ceh {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            e(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        String valueOf = String.valueOf(obj.getClass().getName());
        e(str, valueOf.length() != 0 ? "Unexpected type for bundle response code: ".concat(valueOf) : new String("Unexpected type for bundle response code: "));
        return 6;
    }

    public static Bundle b(ceb cebVar, boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("obfuscatedProfileId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("oldSkuPurchaseToken", null);
        }
        if (!TextUtils.isEmpty(cebVar.b)) {
            bundle.putString("oldSkuPurchaseId", cebVar.b);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static ced c(Intent intent, String str) {
        if (intent == null) {
            e("BillingHelper", "Got null intent!");
            cec a2 = ced.a();
            a2.a = 6;
            a2.b = "An internal error occurred.";
            return a2.a();
        }
        cec a3 = ced.a();
        a3.a = a(intent.getExtras(), str);
        a3.b = d(intent.getExtras(), str);
        return a3.a();
    }

    public static String d(Bundle bundle, String str) {
        if (bundle == null) {
            e(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String valueOf = String.valueOf(obj.getClass().getName());
        e(str, valueOf.length() != 0 ? "Unexpected type for debug message: ".concat(valueOf) : new String("Unexpected type for debug message: "));
        return "";
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void f(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase h = h(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (h == null) {
                e("BillingHelper", "Couldn't find single purchase data as well.");
                return;
            } else {
                arrayList.add(h);
                return;
            }
        }
        stringArrayList.size();
        for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
            Purchase h2 = h(stringArrayList.get(i), stringArrayList2.get(i));
            if (h2 != null) {
                arrayList.add(h2);
            }
        }
    }

    public static void g(String str, Throwable th) {
        if (Log.isLoggable("BillingClient", 5)) {
            Log.w("BillingClient", str, th);
        }
    }

    private static Purchase h(String str, String str2) {
        if (str == null || str2 == null) {
            e("BillingHelper", "Received a bad purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("Got JSONException while parsing purchase data: ");
            sb.append(valueOf);
            e("BillingHelper", sb.toString());
            return null;
        }
    }
}
