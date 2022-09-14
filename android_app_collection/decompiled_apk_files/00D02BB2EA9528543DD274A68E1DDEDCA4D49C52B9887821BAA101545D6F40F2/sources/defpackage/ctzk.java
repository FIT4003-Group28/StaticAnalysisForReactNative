package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: ctzk  reason: default package */
/* loaded from: classes5.dex */
public abstract class ctzk {
    public static ctzj c() {
        return new cucl();
    }

    public static dbsg<ctzk> e(JSONObject jSONObject) {
        if (!jSONObject.has("TEXT") || !jSONObject.has("MESSAGE_CALLBACK_PAYLOAD")) {
            cstl.a("Action");
            return dbpy.a;
        }
        ctzj c = c();
        try {
            c.c((String) jSONObject.get("TEXT"));
            c.b((String) jSONObject.get("MESSAGE_CALLBACK_PAYLOAD"));
            return dbsg.i(c.a());
        } catch (JSONException unused) {
            cstl.a("Action");
            return dbpy.a;
        }
    }

    public abstract String a();

    public abstract String b();

    public final dbsg<JSONObject> d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("TEXT", a());
            jSONObject.put("MESSAGE_CALLBACK_PAYLOAD", b());
            return dbsg.i(jSONObject);
        } catch (JSONException unused) {
            cstl.a("Action");
            return dbpy.a;
        }
    }
}
