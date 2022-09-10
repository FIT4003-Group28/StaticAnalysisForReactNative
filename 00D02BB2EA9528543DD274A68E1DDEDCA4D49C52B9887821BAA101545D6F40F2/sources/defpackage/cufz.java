package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cufz  reason: default package */
/* loaded from: classes5.dex */
public abstract class cufz {
    public static cufy c() {
        return new cudi();
    }

    public static dbsg<JSONObject> d(cufz cufzVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            dbsg<JSONObject> l = cufzVar.a().l();
            if (!l.a()) {
                return dbpy.a;
            }
            jSONObject.put("URL", cufzVar.b());
            jSONObject.put("WEB_VIEW_HEADER", l.b());
            return dbsg.i(jSONObject);
        } catch (JSONException unused) {
            cstl.a("CustomizedWebView");
            return dbpy.a;
        }
    }

    public static dbsg<cufz> e(JSONObject jSONObject) {
        cufy c = c();
        try {
            c.b(jSONObject.getString("URL"));
            dbsg<cugq> m = cugq.m(jSONObject.getJSONObject("WEB_VIEW_HEADER"));
            if (!m.a()) {
                return dbpy.a;
            }
            c.c(m.b());
            return dbsg.i(c.a());
        } catch (JSONException unused) {
            cstl.a("CustomizedWebView");
            return dbpy.a;
        }
    }

    public abstract cugq a();

    public abstract String b();
}
