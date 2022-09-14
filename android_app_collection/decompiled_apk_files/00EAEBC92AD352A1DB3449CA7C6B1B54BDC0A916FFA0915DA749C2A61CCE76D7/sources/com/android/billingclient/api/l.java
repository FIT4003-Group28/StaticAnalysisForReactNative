package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.h;
import java.util.ArrayList;
/* loaded from: classes.dex */
final class l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static h a(Bundle bundle, String str, String str2) {
        String format;
        h hVar = i.j;
        if (bundle == null) {
            format = String.format("%s got null owned items list", str2);
        } else {
            int b2 = c.b.a.a.a.b(bundle, str);
            String a2 = c.b.a.a.a.a(bundle, str);
            h.b c2 = h.c();
            c2.a(b2);
            c2.a(a2);
            h a3 = c2.a();
            if (b2 != 0) {
                c.b.a.a.a.c(str, String.format("%s failed. Response code: %s", str2, Integer.valueOf(b2)));
                return a3;
            } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                format = String.format("Bundle returned from %s doesn't contain required fields.", str2);
            } else {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    format = String.format("Bundle returned from %s contains null SKUs list.", str2);
                } else if (stringArrayList2 == null) {
                    format = String.format("Bundle returned from %s contains null purchases list.", str2);
                } else if (stringArrayList3 != null) {
                    return i.m;
                } else {
                    format = String.format("Bundle returned from %s contains null signatures list.", str2);
                }
            }
        }
        c.b.a.a.a.c(str, format);
        return hVar;
    }
}
