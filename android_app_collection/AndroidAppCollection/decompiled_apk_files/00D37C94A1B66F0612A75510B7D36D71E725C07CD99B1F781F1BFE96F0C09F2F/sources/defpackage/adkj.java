package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: adkj  reason: default package */
/* loaded from: classes.dex */
public final class adkj implements adkm {
    public static final String a;
    private final yqh b;
    private final adkh c;

    static {
        String valueOf = String.valueOf(adkj.class.getCanonicalName());
        a = zep.a(valueOf.length() != 0 ? "MDX.".concat(valueOf) : new String("MDX."));
    }

    public adkj(yqh yqhVar, adkh adkhVar) {
        this.b = yqhVar;
        this.c = adkhVar;
    }

    @Override // defpackage.adkm
    public final Map a(Collection collection) {
        yqv a2;
        String str;
        if (collection == null || collection.isEmpty()) {
            return amyc.b;
        }
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            adib adibVar = (adib) it.next();
            adhy adhyVar = adibVar.a;
            if (adhyVar != null) {
                hashMap.put(adhyVar, adibVar);
            }
            if (adibVar.b.h()) {
                hashMap.put((adhy) adibVar.b.c(), adibVar);
            }
        }
        ylr.b();
        adkh adkhVar = this.c;
        if (adkhVar.c.ai) {
            yqu c = yqv.c(String.valueOf(adkhVar.a()).concat("get_screen_availability"));
            try {
                JSONArray jSONArray = new JSONArray();
                for (adhy adhyVar2 : hashMap.keySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("loungeToken", adhyVar2.c);
                    String str2 = ((adib) hashMap.get(adhyVar2)).c;
                    if (str2 != null) {
                        jSONObject.put("deviceModel", str2);
                    }
                    switch (adhyVar2.a) {
                        case 1:
                            str = "UNKNOWN";
                            break;
                        case 2:
                            str = "CAST_SCREEN_ID";
                            break;
                        case 3:
                            str = "CAST_LOUNGE_TOKEN";
                            break;
                        case 4:
                            str = "DIAL_PAIRING_CODE";
                            break;
                        case 5:
                            str = "DIAL_LOCAL_STORAGE";
                            break;
                        case 6:
                            str = "DIAL_ADDITIONAL_DATA_SCREEN_ID";
                            break;
                        case 7:
                            str = "DIAL_ADDITIONAL_DATA_LOUNGE_TOKEN";
                            break;
                        case 8:
                            str = "MANUAL_PAIRING_CODE";
                            break;
                        default:
                            str = "MANUAL_PAIRING_LOCAL_STORAGE";
                            break;
                    }
                    jSONObject.put("loungeTokenSource", str);
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("screens", jSONArray);
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) adkhVar.b.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.getState() != null) {
                    jSONObject2.put("networkStatus", activeNetworkInfo.getState().toString());
                }
                jSONObject2.put("appName", aeik.i(zew.v(adkhVar.b), zfm.c(adkhVar.b), adkhVar.a));
                c.b = yqt.e(jSONObject2.toString().getBytes(StandardCharsets.UTF_8), "application/json");
            } catch (JSONException unused) {
            }
            a2 = c.a();
        } else {
            Set keySet = hashMap.keySet();
            yqu c2 = yqv.c(String.valueOf(adkhVar.a()).concat("get_screen_availability"));
            try {
                c2.b = yqt.d(Collections.singletonMap("lounge_token", TextUtils.join(",", keySet)), "ISO-8859-1");
            } catch (UnsupportedEncodingException unused2) {
            }
            a2 = c2.a();
        }
        adki adkiVar = new adki(a2.a, hashMap.keySet());
        adyf.d(this.b, a2, adkiVar);
        Set set = adkiVar.a;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            adib adibVar2 = (adib) it2.next();
            HashSet hashSet = new HashSet();
            adhy adhyVar3 = adibVar2.a;
            if (adhyVar3 != null && set.contains(adhyVar3)) {
                hashSet.add(adibVar2.a);
            }
            if (adibVar2.b.h() && set.contains(adibVar2.b.c())) {
                hashSet.add((adhy) adibVar2.b.c());
            }
            hashMap2.put(adibVar2, hashSet);
        }
        return hashMap2;
    }
}
