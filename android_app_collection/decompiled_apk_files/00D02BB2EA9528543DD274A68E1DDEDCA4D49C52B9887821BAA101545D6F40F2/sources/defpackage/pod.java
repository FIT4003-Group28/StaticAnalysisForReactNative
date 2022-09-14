package defpackage;

import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: pod  reason: default package */
/* loaded from: classes7.dex */
public final class pod {
    public static dbsg<Integer> a(JSONObject jSONObject, String str) {
        return b(jSONObject, str, 0);
    }

    public static dbsg<Integer> b(JSONObject jSONObject, String str, int i) {
        int optInt = jSONObject.optInt(str, i);
        return optInt == i ? dbpy.a : dbsg.i(Integer.valueOf(optInt));
    }

    public static dbsg<String> c(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str);
        return optString.isEmpty() ? dbpy.a : dbsg.i(optString);
    }

    public static dbsg<Float> d(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str);
        if (!optString.isEmpty()) {
            try {
                return dbsg.i(Float.valueOf(Float.parseFloat(optString)));
            } catch (NumberFormatException unused) {
            }
        }
        return dbpy.a;
    }
}
