package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: adki  reason: default package */
/* loaded from: classes.dex */
final class adki implements adwb {
    public Set a = amyg.a;
    private final String b;
    private final Set c;

    public adki(String str, Set set) {
        this.b = str;
        this.c = set;
    }

    @Override // defpackage.adwb
    public final void a(IOException iOException) {
        String str = adkj.a;
        String str2 = this.b;
        zep.f(str, str2.length() != 0 ? "Error loading screen status from ".concat(str2) : new String("Error loading screen status from "), iOException);
    }

    @Override // defpackage.adwb
    public final void i(yrb yrbVar) {
        Set set;
        int i = yrbVar.a;
        yqz yqzVar = yrbVar.d;
        if (i != 200) {
            String str = adkj.a;
            String str2 = this.b;
            StringBuilder sb = new StringBuilder(str2.length() + 41);
            sb.append("POST ");
            sb.append(str2);
            sb.append(" failed. Status code is: ");
            sb.append(i);
            zep.m(str, sb.toString());
        } else if (yqzVar != null) {
            try {
                String c = yqzVar.c();
                Map map = (Map) Collection.EL.stream(this.c).collect(Collectors.toMap(adgi.d, adgi.e));
                try {
                    JSONArray optJSONArray = new JSONObject(c).optJSONArray("screens");
                    if (optJSONArray == null) {
                        set = amyg.a;
                    } else {
                        Set hashSet = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            try {
                                JSONObject jSONObject = optJSONArray.getJSONObject(i2);
                                String optString = jSONObject.optString("status", "");
                                String optString2 = jSONObject.optString("loungeToken", "");
                                if ("online".equals(optString) && !TextUtils.isEmpty(optString2) && map.containsKey(optString2)) {
                                    hashSet.add((adhy) map.get(optString2));
                                }
                            } catch (JSONException unused) {
                                String str3 = adkj.a;
                                StringBuilder sb2 = new StringBuilder(32);
                                sb2.append("Error parsing screen ");
                                sb2.append(i2);
                                zep.m(str3, sb2.toString());
                            }
                        }
                        set = hashSet;
                    }
                } catch (JSONException e) {
                    zep.f(adkj.a, "Error parsing screen status ", e);
                    set = amyg.a;
                }
                this.a = set;
            } catch (IOException e2) {
                String str4 = adkj.a;
                String str5 = this.b;
                zep.f(str4, str5.length() != 0 ? "Error loading screen status from ".concat(str5) : new String("Error loading screen status from "), e2);
            }
        } else {
            String str6 = adkj.a;
            String str7 = this.b;
            StringBuilder sb3 = new StringBuilder(str7.length() + 27);
            sb3.append("Response body from ");
            sb3.append(str7);
            sb3.append(" is null");
            zep.c(str6, sb3.toString());
        }
    }
}
